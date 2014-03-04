
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
    // STUB
  } // dnf(String[], StringClassifier) 
}
