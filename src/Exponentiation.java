public class Exponentiation
{
  /**
   * x^0 = 1. 
   * x^2k = x^k * x^k, for k > 0. 
   * x^k+1 = x * x^k, for even k >= 0.
   * 
   * Compute x^n.
   * 
   * @pre n >= 1.
   */
  //with help from wikipedia article about exponentiation
  
  public static double expt(double x, int n)
  {
    double val = 1;
    
    while(n > 0)
      {
        if(n % 2 == 1)
          {
            val = val * x;
            n = n - 1;
          }
        else
          {
            n = n/2;
            x = x * x;
          }
      }
 return val;
    
  } // expt(double, int)
  
  public static void main (String[] args)
  {
    //test exponentiation
    
    System.out.println(Exponentiation.expt(1, 0));
    System.out.println(Exponentiation.expt(2, 3));
    System.out.println(Exponentiation.expt(4, 1));
    System.out.println(Exponentiation.expt(-2, 3));
  }
}
