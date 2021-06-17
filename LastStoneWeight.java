class Solution{
  public int LastStone(int stone){
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    for (int stone: stones){
      maxHeap.add(-stone);
//Java is a minheap by default, so if we want a max heap, just flip the sign
//we have to do inverse calculations a swell, but this is effectively a max maxHeap
    }
    while(maxHeap.size() > 1){
//we loop through the Heap until the size is 1 or less
        int stoneOne = -maxHeap.remove();
        int stoneTwo = -maxHeap.remove();
//each loop we start by removing the first two heap entries
        if (stoneOne != stoneTwo){
          maxHeap.add(-(stoneOne - stoneTwo));
//we then add the difference using the values we just removed
//we have to add the negative value of the difference when doing a max heap
        }
    }
    return maxHeap.isEmpty()? 0: -maxHeap.remove();
//in the case that the heap is empty, we have to have a default 0
//otherwise we return the last value in the heap
  }
}
