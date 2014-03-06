import static org.junit.Assert.*;

import org.junit.Test;


/*
 * 
 * For each s from 1 to 32
    Create an array of size s, containing the values 0, 2, 4, ... 2*(s-1)
    For all i from 0 to s-1, inclusive
        // Make sure that value 2*i is in position i
        assert(binarySearch(2*i, array) == i)
        // Make sure that odd values are not in the array
        assertException(binarySearch(2*i+1, array))
    assertException(-1, array)
 */


// got help from http://www.vogella.com/tutorials/JUnit/article.html#usingjunit_asserts to figure out how to test for the exceptions. 


public class BinarySearchTest
{

  @Test
  public void testBinarySeach() throws Exception
  {
    for(int i = 1; i<33; i++)
      {
        int[] testArray = new int[i];
        for(int j = 1; j<i; j++)
          {
            testArray[j] = 2*j;
          }
        assert(BinarySearch.binarySearch(2*i, testArray) == 1);
      }
  }
  
  @Test(expected = Exception.class)
  public void testBinarySearchException() throws Exception
  {
    for(int i = 1; i<33; i++)
      {
        int[] testArray = new int[i];
        for(int j = 1; j<i; j++)
          {
            testArray[j] = 2*j;
          }
        BinarySearch.binarySearch(2*i + 1, testArray);
      }
  }
  
  @Test(expected = Exception.class)
  public void testBinarySearchException2() throws Exception
  {
    for(int i = 1; i<33; i++)
      {
        int[] testArray = new int[i];
        for(int j = 1; j<i; j++)
          {
            testArray[j] = 2*j;
          }
        BinarySearch.binarySearch(-1, testArray);
      }
  }
  

}
