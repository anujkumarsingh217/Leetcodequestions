class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        for(int num:nums){
            minheap.offer(num);

            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna