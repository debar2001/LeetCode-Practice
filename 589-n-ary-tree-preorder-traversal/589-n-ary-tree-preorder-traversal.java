/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {

	List<Integer> preorder = new LinkedList<>();

	if (root == null) {
		return preorder;
	}

	Deque<Node> stack = new LinkedList<>(); // stack impl using linkedlist as its faster
	stack.offerFirst(root);

	while (stack.size() > 0) {
		Node node = stack.pollFirst();
		preorder.add(node.val);

		List<Node> children = node.children;
		// iterate from rightmost child to leftmost child
		ListIterator<Node> it = children.listIterator(children.size());
		while (it.hasPrevious()) {
			stack.offerFirst(it.previous());
		}
	}

	return preorder;
}
}