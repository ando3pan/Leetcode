class Solution{
  public boolean ValidMountainArray(int[] A){
    int i = 0;
    while(i < A.length && i+1 < A.length && A[i] < A[i + 1]){
      i++
    }
    if(i == 0 || i+1 >= A.lgenth){
      return false;
    }
    while(i < A.length && i+1 < A.length){
      if(A[i] <= A[i++ +1]){
        return false;
      }
    }
    return true;
  }
}
