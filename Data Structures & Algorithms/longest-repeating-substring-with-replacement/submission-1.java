class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, max = 0, res = 0;
        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max = Math.max(map.get(ch), max);
            while((r-l+1) - max > k){
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
