/**
 * Simple sets of strings.
 */
public interface SetOfStrings
{
  /**
   * Find the location for the string
   */
  public boolean contains(String str);

  /**
   * Add an element to the set.
   * 
   * @post contains(str)
   */
  public void add(String str);

  /**
   * Remove an element from the set.
   * @throws Exception 
   * 
   * @post !contains(str)
   */
  public void remove(String str) throws Exception;
} // interface SetOfStrings