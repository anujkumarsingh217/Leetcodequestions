class Solution {
    static void getAll(String s,int index,StringBuilder output,List<String> ans){
        if(index>=s.length()){
            String sub=output.toString();
            ans.add(sub);
            return;
        }
        
        
        char ch=s.charAt(index);
        output.append(ch);
        getAll(s,index+1,output,ans);
        output.deleteCharAt(output.length()-1);
        getAll(s,index+1,output,ans);
    }
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans=new ArrayList<>();
        
        StringBuilder output=new StringBuilder();
        int index=0;
        getAll(s,index,output,ans);
        Collections.sort(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna