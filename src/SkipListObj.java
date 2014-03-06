import java.util.Random;


public class SkipListObj
{
  //Fields
  
  int level;
  String value;
  SkipListObj[] nexts;
  
  //Constructors
  
  public SkipListObj(int l, String str)
  {
    this.level = l;
    this.value = str;
    this.nexts = new SkipListObj[l];
  }
  public SkipListObj(String str)
  {
    Random generator = new Random();
    int r = generator.nextInt(10);
    this.level = r;
    this.value = str;
    this.nexts = new SkipListObj[r];
  }
}
