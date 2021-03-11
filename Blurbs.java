import java.util.Random;//this is to randomize
import java.util.Scanner;//this is for the scaneer
public class Blurbs//starts the class
{
  public Random rand = new Random();//declares this 
  public String createBlurb()//creates this method
  {
    String blurb = createWhoozit ();//calls the other method
     int num = rand.nextInt(8) + 1;//this is for the random
     for (int i = 0; i < num; i++)//for loop
        {
            blurb += createWhatzit();//calls this method
        }//end of for
    return blurb;//return this
  }//end of createWhozzit

  public String createWhoozit ()//starts this method
  {
    String whoozit = "x";//makes this the start case
    int num = rand.nextInt(8);//randomizing this
    while(num>0)//conditions it needs to pass
    {
      whoozit += "y";//this is what happens when while passes
      num--;//takes away this
    }//end of while
    return whoozit;//return this 
  }//end of createWhoozit

  public String createWhatzit()//creates this method
  {
    String whatzits = "q";//sets this to this
    int num = rand.nextInt(2);//for the random
    if(num == 0)//test case
    {
      whatzits += "z";//if passes makes it this
    }
    else
    {
      whatzits += "d";//other makes it this
    }
    whatzits += createWhoozit();//when called returns this
    return whatzits;//returns this
  }//end of createWatzit
}//end of Blurbs