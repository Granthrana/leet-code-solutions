class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            freq[tasks[i] - 'A']++;
        }
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.add(freq[i]);
            }
        }
        int time = 0;
        while (!pq.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                if (!pq.isEmpty()) {
                    int f = pq.poll();
                    f--;
                    if (f > 0) {
                        temp.add(f);
                    }
                }
                time++;
                if (pq.isEmpty() && temp.isEmpty()) {
                    break;
                }
            }
            for (int i = 0; i < temp.size(); i++) {
                pq.add(temp.get(i));
            }
        }
        return time;
    }
}