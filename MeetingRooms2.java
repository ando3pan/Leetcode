/*
class Intervals
int start;
int end;
interval() {start = 0; end = 0;}
interval(int s, int e) {start = s, end = e}
*/

class Solution{
  public int minMeeting(Interval[] intervals){
    if(intervals == null || intervals.length == 0){
      return 0;
    }
//check edge case first: i.e having invalid inputs
    Arrays.sort(intervals, (a,b) -> a.start - b.start);
//have to show how to sort custom objects --> sort these meetings by their start time
//sorting the intervals array based on its start time

    PriorityQueue<Interal> minHeap = new PriorityQueue<>((a,b) -> a.end - b.end);
//minheap stores endtime values for comparison
    for(int i = 1; i < intervals.length; i++){
//traverse the array
      Interval current = intervals[i];
      Interval earliest = minHeap.remove();
//the que has the smallest numbers first, so we get the earliest values in order
//we're fetching the value with remove, so we have to add it back later
      if(current.start >= earliest.end){
        earliest.end = current.end;
//specific process, we don't need another meeting room
      }else{
        minHeap.add(current);
//if we have a conflict, we have to have a new room, so add one
      }
      minHeap.add(earliest);
//add back the value we removed earlier
    }
    return minHeap.size();
  }
}
