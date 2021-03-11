import java.util.Scanner;//this is the scanner 
class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Andy Sanchez, PP 8.0 alienLang");
    Scanner scan = new Scanner (System.in);//declares the scaner
    Blurbs aliens = new Blurbs();//this declares of blurb
    System.out.println ("Just enter a number: ");//for reader
    int n = scan.nextInt();//variable declared
    for(int i=0;i!=n;i++)//for to print this out
		{
			 System.out.println (aliens.createBlurb());//prints this
		}//end of for
   
  }//end of manin metheid

}//end of Main