import static org.junit.Assert.*;

import org.junit.Test;


public class DutchNationalFlagTest
{
String[] array1 = new String[] {"red", "blueblue", "white", "white", "pink", "azulisspanish", "blanc", "purple", "12345"};
  String[] array2 = new String[] {"ABCDEFG", "abc", "12345678", "n", "or", "1", "A", "6", "HELLO", "23", "world" };
  @Test
  public void testWithLength()
  {
    DutchNationalFlag.dutchNationalFlag(array1, new SimpleStringSizeClassifier());
    assertArrayEquals(new String[] {"pink", "red", "white", "white", "blanc", "12345", "blueblue", "azulisspanish", "purple"}, array1);
  }

  @Test
  public void testWithFirstCharacter()
  {
    DutchNationalFlag.dutchNationalFlag(array2, new ClassifyStringsByFirstCharacter());
    assertArrayEquals(new String[] {"abc", "n", "or", "world", "ABCDEFG", "A", "HELLO", "12345678", "1", "6", "23"}, array2);
  }
}
