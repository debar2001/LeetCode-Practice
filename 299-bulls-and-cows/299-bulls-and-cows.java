class Solution {
    public String getHint(String secret, String guess) {
        int[] hashSecret = new int[10];
        int[] hashGuess = new int[10];
        
        int countA = 0, countB = 0;
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i))
                countA++;
            else{
                hashSecret[secret.charAt(i)-'0']++;
                hashGuess[guess.charAt(i)-'0']++;
            }
        }
        for(int i = 0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s != g){
                if(hashGuess[s-'0'] > 0 && hashSecret[s-'0'] > 0){
                    countB++;
                    hashSecret[s-'0']--;
                    hashGuess[s-'0']--;
                }    
            }
        }
        
        String ans = countA + "A" + countB + "B";
        return ans;
    }
}