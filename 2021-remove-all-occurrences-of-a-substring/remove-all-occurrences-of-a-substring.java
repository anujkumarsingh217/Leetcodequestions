class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int index=s.indexOf(part);

            s=s.substring(0,index)+s.substring(index+part.length());
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna