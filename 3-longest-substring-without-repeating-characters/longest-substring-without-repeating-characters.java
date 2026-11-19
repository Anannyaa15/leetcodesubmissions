class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0;
        Set<Character> visited = new HashSet <>();
        for(int end = 0; end<s.length(); end++){
        while(visited.contains(s.charAt(end))){
            visited.remove(s.charAt(start));
            start++;
        }
        visited.add(s.charAt(end));
        


        result = Math.max(result, end-start+1);
        }
    
        return result;
        
    }
}