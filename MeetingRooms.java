/**
definition for an interval
public class Interval(){
int start;
int end;
Interval(){start = 0; end = 0;}
Interval(int s, int e){start = s, end = e}

}
*/
class Solution{
  public boolean canAttendMettings(Interval[] intervals){;
//interval object
    int[] starts = new int[intervals.length];
    int[] ends = new int[intervals.length];
//make holder arrays so we can read inputs from the Interval arrays
    for(int i = 0; i < intervals.length; i++){
      starts[i] = intervals[i]].start;
//starts holds the (int start) from the interval object
      ends[i] = intervals[i].end;
//ends holds the (int end) from the interval object
    }
    Arrays.sort(starts);
    Arrays.sort(ends);
//interval arrays may not be in order, for our check to work re-reorganize
    for(int i = 0; i < starts.length - 1; i++){
      if(starts[i + 1] < ends[i]){
//if the next start starts before the current meeting ends
        return false;
      }
    }
    return true;
  }
}
