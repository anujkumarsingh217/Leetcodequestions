class Solution {
    static boolean compareFreq(int[] count1,int[] count2){
         for(int i=0;i<26;i++){
            if(count1[i]!=count2[i]){ // Fixed: count[i] was undefined, changed to count1[i]
                return false;
            }
           
         }
          return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        /* 
        COACH REVIEW:
        1. Your logic uses the Sliding Window approach, which is optimal (O(N)).
        2. Current Time Complexity: O(s2.length() * 26) -> O(N)
        3. Current Space Complexity: O(1) since the array size is fixed at 26.
        
        BUGS FOUND:
        - Variable 's' is used instead of 's1'.
        - 'count2' is initialized as new int[2] instead of new int[26].
        - 'comparefreq' is called as an array/variable instead of a method.
        - 'newIndex' is used but not defined (should be newcharindex).
        - 'oldchar' is derived from 's' instead of 's2'.
        - The while loop index 'i' starts at 0, but the first window is already processed.
        - Missing return statement at the end of the function.
        */
        if(s1.length()>s2.length()){ // Fixed: s -> s1
            return false;
        }

        int count1[] =new int[26];
        for(int i=0;i<s1.length();i++){ // Fixed: s -> s1
            char ch=s1.charAt(i);
            int index=ch-'a';
            count1[index]++;
        }

        int i=0;

        int windowlength=s1.length();

        int count2[]=new int[26]; // Fixed: size 2 -> 26

        for(int j=0;j<windowlength;j++){ // Fixed: changed loop variable to j to avoid conflict with i
            char ch=s2.charAt(j);
            int index=ch-'a';
            count2[index]++;
        }


        if(compareFreq(count1,count2)==true){ // Fixed: comparefreq[] -> compareFreq()
            return true;
        }
        else{
           i = windowlength; // Fixed: Start i from the end of the first window
           while(i<s2.length()){
               char newchar=s2.charAt(i);
               int newcharindex=newchar-'a';
               count2[newcharindex]++; // Fixed: newIndex -> newcharindex

               int oldcharindex=i-windowlength;

               char oldchar=s2.charAt(oldcharindex); // Fixed: s -> s2

               int freqtableindexoldchar=oldchar-'a';
               count2[freqtableindexoldchar]--;

               if(compareFreq(count1,count2)==true) // Fixed: comparefreq -> compareFreq
                   return true;

                i++;
           }
        }
        return false; // Fixed: Added missing return
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna