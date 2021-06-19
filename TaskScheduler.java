class Solution{
   public int leastInterval(char[] tasks, int n){
     HashMap<Character, Integer> map = new HashMap<Character,Integer>();
     for(char c: tasks){
       map.put(c,map.getOrDefault(c,0)+1);
     }
//reading the tasks into a map
     PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b) -> b -a);
     maxHeap.addAll(map.values());
//throwing all the values in map, into the queue
//the max heap takes the most frequently run things and puts it in order
     int cycles = 0;
     while(!maxHeap.isEmpty()){
       ArrayList<Integer> temp = new ArrayList<Integer>();
       for(int i = 0; i < n + 1;i++){
         if(!maxHeap.isEmpty()){
          temp.add(maxHeap.remove());
         }
       }
       for(int i: temp){
         if(--i > 0){
          maxHeap.add(i);
         }
       }
       cycles += maxHeap.isEmpty() ? temp.size(): n+1;
     }
     return cycles;
   }
}
