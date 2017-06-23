package au.com.optus.mcas.sdp.bizservice.larsuid.util;

import java.util.Random;

public class SecureKeyProvider {
    static int START = 4;
    
  public int getRandomInteger(){
    
    Random random = new Random();
    // compute a fraction of the range, 0 <= frac < range
    int randomNumber = (int)(START * random.nextInt());
    return randomNumber;
  }
}