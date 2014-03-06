public class DutchNationalFlag
{
  /**
   * Rearrange vals so that red values precede white values and white values
   * precede blue values.
   *
   * @post
   *   Exist P and Q, 0 <= P <= Q <= vals.length, s.t.
   *     For all i, 0 <= i < P, classifier.classify(vals[i]) < 0
   *     For all i, P <= w < Q, classifier.classify(vals[i]) == 0
   *     For all i, Q <= i < vals.length, classifier.classify(vals[i]) > 0
   *   Values have neither been added to nor removed from vals; the new
   *     vals is a permutation of the original.
   */
  
  
  //+---------+---------+---------+---------+
  //|   red   |  white  | unknown |   blue  |
  //+---------+---------+---------+---------+
  //|         |         |         |         |
  //0         r         i         b         length
  
  
  
  public static void dutchNationalFlag(String[] vals, StringClassifier classifier)
  {
    
    int r = 0;
    int i = 0;
    int b = vals.length; 
    int length = vals.length;
    String value;
    
    while(i<b)
      {
        value = vals[i];
        if(classifier.classify(vals[i]) == -1)
          {
            //if red shift all of the white section over by 1, and place value at r. 
            for(int x = i; x>r; x--)
              {
                //shift each element over 1
                vals[x] = vals[x-1];
              }
            //set vals at r equal to the selected string
            vals[r] = value;
            r++;
          }
        else if(classifier.classify(vals[i])>0)
          {
            //if blue store value and shift the unknown section over, then decrement both i and b
            for(int x = i; x<length-1; x++)
              {
                //shifting the values in the array over
                vals[x] = vals[x+1];
              }
            //store value in the correct position
            vals[length-1] = value;
            //decrement both i and b
            b--;
            i--;
          }
        //otherwise the value is white so just continue to increment i
        i++;
      }   
  } // dutchNationalFlag(String[], StringClassifier) 
}
