class Solution{
  class List<String> FizzBuzz(int n){
    List<String> result = new Arraylist<String>();
    for(i = 1; i <= n; i++){
      if(i%3 ==0 && i%5 == 0){
        result.add("Fizzbuzz")
      }else if(i%3 == 0){
        result.add("Fizz");
      }else if(i%5 == 0){
        results.add("Buzz")
      }else{
        result.add(Integer.toString(i));
      }
    }
    return result;
  }
}
