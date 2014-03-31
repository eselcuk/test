package net.javavideotutorials.assignment1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumberGenerator 
{

  public Set<Integer> generateLotteryNumbers ()
  {
    Set<Integer> numbers = new HashSet<Integer>(6);
    Random random = new Random();
    
    for (int i=0; i<6; i++)
      while (!numbers.add(random.nextInt(49) + 1));
    
    return numbers;
  }
}
