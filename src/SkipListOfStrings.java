/**
 * Skip lists of strings, stored alphabetically.
 */
public class SkipListOfStrings
  implements SetOfStrings
{
  int size;
  SkipListObj head;
  SkipListObj tail;
  SkipListObj current;
  
  public SkipListOfStrings()
  {
    this.head = new SkipListObj(10,"");
    this.tail = new SkipListObj(10,"");
    this.current = this.head;
    
    for(int i = 0; i < this.head.level; i++)
      {
        this.head.nexts[i] = this.tail;
      }
  }
  
  public int findIndex(String str)
  {
    this.current = this.head;
    int compareVal = 0;
    for(int i = 9; i>=0; i--)
      {
        if(this.current.nexts[i].value != null)
          {
            compareVal = str.compareTo(this.current.nexts[i].value);
          }
        
        if(compareVal == 0)
          {
            return i;
          }
        else if(compareVal < 0)
          {
            current = current.nexts[i];
            i++;
          }
      }
    return -1;
  }
  
  public SkipListObj findObj(String str)
  {
    this.current = this.head;
    int compareVal = 0;
    for(int i = 9; i>=0; i--)
      {
        if(this.current.nexts[i].value != null)
          {
            compareVal = str.compareTo(this.current.nexts[i].value);
          }
        if(compareVal == 0)
          {
            return this.current.nexts[i];
          }
        else if(compareVal < 0)
          {
            current = current.nexts[i];
            i++;
          }
      }
    return new SkipListObj(-1, "-1");
  }
  
  public boolean contains(String str)
  {
    if(this.findIndex(str) != -1)
      {
        return true;
      }
    else
      return false;
  }
  
  public void add(String str)
  {
    this.current = this.head;
    
    SkipListObj obj = new SkipListObj(str);
    for(int i = obj.level -1; i>=0; i--)
      {
        int compareVal = str.compareTo(this.current.nexts[i].value);
        
        if(compareVal < 0)
          {
            this.current = this.current.nexts[i];
            i++;
          }
        else
          {
            obj.nexts[i] = this.current.nexts[i];
            this.current.nexts[i] = obj;
          }
      }
  }
  
  public void remove(String str) throws Exception
  {
    int index = this.findIndex(str);
    if(index == -1)
      {
        throw new Exception("String not found");
      }
    else
      {
        this.current = this.findObj(str);
        this.current.nexts[index] = this.current.nexts[index].nexts[index];
        
      }
    
  }
  
} // class SkipListOfStrings
