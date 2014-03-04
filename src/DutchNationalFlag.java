//FINISH WRITING AND TEST THIS STUFF!
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
  public void dnf(String[] vals, StringClassifier classifier)
  {
    int r = 0;
    int i = 0;
    int b = vals.length;
    int length = vals.length;
    
    while(i<b)
      {
        String selection = vals[i];
        if(classifier.classify(vals[i])<0)
          {
            for(int x=i; x>r; x--)
              {
                vals[x] = vals[x-1];
              }
            vals[r] = selection;
            r = r + 1;
          }
        else if(classifier.classify(vals[i])>0)
          {
            for(int x = i; x<length-1; x++)
              {
                vals[x] = vals[x+1];
              }
            vals[length-1] = selection;
            b = b - 1;
            i = i - 1;
          }
        i = i + 1;
      }
    
    
  } // dnf(String[], StringClassifier) 
}
