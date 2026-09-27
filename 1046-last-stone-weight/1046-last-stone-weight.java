class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq =new PriorityQueue<>
          (Collections.reverseOrder());
          int s=stones.length;
          for(int i=0;i<s;i++){
            pq.add(stones[i]);
          }
        while(pq.size()>1){
           int y=pq.poll();
            int x=pq.poll();
            if(x != y){
                y=y-x;
                x=0;
                pq.add(y);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        return pq.peek();
    }
}