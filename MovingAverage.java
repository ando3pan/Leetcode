class MovingAverage{
  private Queue<Integer> queue;
  private int maxSize;
  private double sum;
//make framework for properties the object class has
//set objects to private so it cannot be changed outside the program after ini
  public MovingAverage(int size){
    queue = new LinkedList<Integer>();
    maxSize = size;
    sum = 0.0;
  }
//when making a new MA object, we initialize everything here w/ the args
  public double next(int val){
    if(queue.size() = maxSize){
      sum -= queue.remove();
//does 2 things --> removes the 1st object in queue & decrements the sum by that value
    }
    queue.add(val)
//adds new value to sum
    sum += val;
    return sum / queue.size();
  }
}
