class Node {
    Map<Character, Node> charMap;
    int wordIndex;
    
    public Node() {
        charMap = new HashMap<>();
        wordIndex = -1;
    }
    
    public boolean isWord() {
        return wordIndex != -1;
    }
    
    public boolean hasChar(Character c) {
        return charMap.containsKey(c);
    }
    
    public Node getChar(Character c) {
        return charMap.get(c);
    }
    
    public Set<Character> getCharacters() {
        return this.charMap.keySet();
    }
    
    public Node putChar(Character c) {
        Node newNode = new Node();
        charMap.put(c, newNode);
        return newNode;
    }
    
    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }
    
    public int getWordIndex() {
        return this.wordIndex;
    }
}

class Trie {
    Node root;
    
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word, int wordIndex, boolean reverse) {
        Node current = root;
        var chars = word.toCharArray();
        
        if (reverse) {
            for (int i = 0; i < chars.length / 2; ++i) {
                char c = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = c;
            }
        }
        
        for (char c : chars) {
            if (!current.hasChar(c))
                current.putChar(c);
            current = current.getChar(c);
        }
        
        current.setWordIndex(wordIndex);
    }
    
    public PriorityQueue<Integer> getAllWordsStartingWith(String word, boolean reverse) {
        Node current = root;
        PriorityQueue<Integer> indices = new PriorityQueue<>((a, b) -> b - a);
        
        var chars = word.toCharArray();
        
        if (reverse) {
            for (int i = 0; i < chars.length / 2; ++i) {
                char c = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = c;
            }
        }
        
        for (char c : chars) {
            if (!current.hasChar(c)) {
                return indices;
            }
            current = current.getChar(c);
        }
        
        getAllWordIndices(indices, current);
        return indices;
    }
    
    private void getAllWordIndices(PriorityQueue<Integer> indices, Node node) {
        if (node.isWord())
            indices.add(node.getWordIndex());
        
        for (char c : node.getCharacters()) {
            getAllWordIndices(indices, node.getChar(c));
        }
    }
}

class WordFilter {
    
    private Trie normalTrie, reverseTrie;
    
    public WordFilter(String[] words) {
        normalTrie = new Trie();
        reverseTrie = new Trie();
        
        for (int index = 0; index < words.length; ++index) {
            normalTrie.insert(words[index], index, false);
            reverseTrie.insert(words[index], index, true);
        }
    }
    
    public int f(String prefix, String suffix) {
        var prefixMatchIndices = normalTrie.getAllWordsStartingWith(prefix, false);
        var suffixMatchIndices = reverseTrie.getAllWordsStartingWith(suffix, true);
        
        while (!prefixMatchIndices.isEmpty() && !suffixMatchIndices.isEmpty()) {
            if (prefixMatchIndices.peek().equals(suffixMatchIndices.peek()))
                return prefixMatchIndices.peek();
            
            if (prefixMatchIndices.peek() > suffixMatchIndices.peek())
                prefixMatchIndices.remove();
            else
                suffixMatchIndices.remove();
        }
        
        return -1;
    }
    
}