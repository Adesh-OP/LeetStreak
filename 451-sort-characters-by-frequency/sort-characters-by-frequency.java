class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        for(char ch : map.keySet()) {
            pq.add(ch);
        }

        StringBuilder ans = new StringBuilder();

        while(!pq.isEmpty()) {
            char ch = pq.poll();
            int count = map.get(ch);

            for(int i=0;i<count;i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}