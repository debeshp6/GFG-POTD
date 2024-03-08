//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int freq : freqMap.values()) {
            countMap.put(freq, countMap.getOrDefault(freq, 0) + 1);
        }
        
        if (countMap.size() == 1) {
            return true;
        }
        
        if (countMap.size() == 2) {
            int[] counts = countMap.keySet().stream().mapToInt(Integer::intValue).toArray();
            int smallerCount = Math.min(counts[0], counts[1]);
            int largerCount = Math.max(counts[0], counts[1]);
            if (smallerCount == 1 && countMap.get(smallerCount) == 1) {
                return true;
            }
            if (countMap.get(largerCount) == 1 && largerCount - smallerCount == 1) {
                return true;
            }
        }
        
        return false;
    }
}
