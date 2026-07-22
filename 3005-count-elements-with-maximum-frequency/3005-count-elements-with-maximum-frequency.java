class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num: nums){   
            frequency.put(num, frequency.getOrDefault(num, 0)+1);

           } 
            int maxFreq=0;
            for(int freq: frequency.values()){
            maxFreq = Math.max(maxFreq, freq);
        }
        int ans =0;
        for(int freq : frequency.values()){
            if(freq == maxFreq){
                ans += freq;
            }
        }
        return ans;
    }
}
