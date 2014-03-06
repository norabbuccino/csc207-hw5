import static org.junit.Assert.*;

import org.junit.Test;


public class ExponentiationTest
{

  @Test
  public void testPositive()
  {
    assertEquals("2^3 should be 8: ", 8, Exponentiation.expt(2, 3), .0001);
  }
  
  @Test
  public void testZero()
  {
    assertEquals("anything raised to the zero is 1", 1, Exponentiation.expt(103, 0), .0001);
  }
  
  @Test
  public void testNegative()
  {
    assertEquals("a negative raised to an even power will be even", 4, Exponentiation.expt(-2, 2), .0001);
    assertEquals("a negative raised to an odd power will be odd", -8, Exponentiation.expt(-2, 3), .0001);
  }

}
