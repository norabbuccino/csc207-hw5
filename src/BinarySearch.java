public class BinarySearch
{
  /**
   * Search for val in values, return the index of an instance of val.
   * 
   * @param val
   *          An integer we're searching for
   * @param values
   *          A sorted array of integers
   * @result index, an integer
   * @throws Exception
   *           If there is no i s.t. values[i] == val
   * @pre values is sorted in increasing order. That is, values[i] < values[i+1]
   *      for all reasonable i.
   * @post values[index] == val
   */
  public static int binarySearch(int val, int[] vals)
    throws Exception
  {
    int lower = 0;
    int upper = vals.length;
    
    while(lower <= upper)
      {
        int midpoint = lower + ((upper - lower) / 2);
        if(vals[midpoint] == val)
          {
            return midpoint;
          }
        else if(vals[midpoint]<val)
          {
            lower = midpoint + 1;
          }
        else
          {
            upper = midpoint - 1;
          }
      }
    throw new Exception(val + " was not found in the array");
  } // binarySearch
}
