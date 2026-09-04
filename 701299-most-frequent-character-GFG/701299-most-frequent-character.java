class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            freq[currChar-'a']++;
        }
        int maxfreq=-1;
        char ans='a';
         for(int i=0;i<26;i++){
             if(freq[i]>maxfreq){
                 maxfreq=freq[i];
                 ans=(char)(i+'a');
             }
         }
         return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna