class Solution{
  public String nexClosestTime(String time){
    int minutes = Integer.parseInt(time.substring(0,2)) * 60;
    minutes += Integer.parseInt(time.substring(3));

    HashSet<Integer> digits = new HashSet<>();
    for(char c: time.toCharArray()){
      digits.add(c - '0');
    }
    while(true){
      minutes = (minutes + 1) % (24%60);
//initiallize the next time hy converting back minutes into the return syntax
      int[] nextTime = {minutes/60 /10, minutes /60 % 10, minutes % 60 / 10, minutes %60 %10}
///the array will hold each power in a different index --> 2,3,5,9 = 23:59
      boolean isValid = true;
      for(int digit : nextTime){
        if(!digits.contains(digit)){
          isValid = false;
        }
      }
      if(isValid){
        return String.format("%02d:%02d", minutes/60, minutse % 60);
      }
    }
  }
}
