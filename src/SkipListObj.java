import java.util.Random;


public class SkipListObj
{
  //Fields
  int level;
  String value;
  SkipListObj[] nextPointers;
  
  //Constructors
  /**
   * Create a new Skip List Object with a given level and a given string
   * @param l
   * @param str
   */
  public SkipListObj(int l, String str)
  {
    this.level = l;
    this.value = str;
    this.nextPointers = new SkipListObj[l];
  }
  
  /**
   * Create a new skip list object from a given string with random level
   * @param str
   */
  public SkipListObj(String str)
  {
    this.level = randomLevel();
    this.value = str;
    this.nextPointers = new SkipListObj[this.level];
  }
  
  /**
   * create a new skip list object with no string and a given level
   * @param l
   */
  public SkipListObj(int l)
  {
    this.level = l;
    this.nextPointers = new SkipListObj[l];
  }
  
  //Helpers
  /**
   * Maximum height is a height of 10
   * @return
   */
  public int randomLevel()
  {
    Random generator = new Random();
    int r = generator.nextInt(10);
    return r;
  }
  
}
