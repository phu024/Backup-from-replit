import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print ("Enter n:");
    int num = sc.nextInt ();

    for (int i = 0; i < num; i++)
      {
	for (int j = 0; j < num; j++)
	  {
	    if (i == 0 || j == 0 || i == num - 1 || j == num - 1)
	      {
		System.out.print ("* ");
	      }
	    else if (i == j)
	      {
		System.out.print ("* ");
	      }
	    else if (i + j == num - 1)
	      {
		System.out.print ("* ");
	      }
	   
	    else
	      {
		System.out.print ("  ");
	      }
	  }
	System.out.print ("\n");
      }
  }
}