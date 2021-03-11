import java.util.Random;
import java.util.Scanner;
public class Blurbs
{
  public Random rand = new Random();
  public String createBlurb()
  {
    String blurb = createWhoozit ();
     int num = rand.nextInt(8) + 1;
     for (int i = 0; i < num; i++)
        {
            blurb += createWhatzit();
        }
    return blurb;
  }
  public String createWhoozit ()
  {
    String whoozit = "x";
    int num = rand.nextInt(8);
    while(num-->0)
    {
      whoozit += "y";
    }
    return whoozit;
  }
  public String createWhatzit()
  {
    String whatzits = "q";
    int num = rand.nextInt(2);
    if(num == 0)
    {
      whatzits += "z";
    }
    else{
      whatzits += "d";
    }
    whatzits += createWhoozit();
    return whatzits;
  }
}