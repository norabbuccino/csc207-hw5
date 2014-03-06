import java.util.Arrays;


public class DutchNationalFlagExpt
{
  public static void main(String[] args)
  {
    //first test using SimpleStringSizeClassifier
    String[] array1 = new String[] {"1", "Nora", "Buccino", "6", "USA", "Random", "Hello World"};
    DutchNationalFlag.dutchNationalFlag(array1, new SimpleStringSizeClassifier());
    System.out.println(Arrays.toString(array1));

    //second test using ClassifyStringsByFirstCharacter
    String[] array2 = new String[] {"Nora", "nora", "1", "2", "no", "rara", "nora", "Buccino"};
    DutchNationalFlag.dutchNationalFlag(array2, new ClassifyStringsByFirstCharacter());
    System.out.println(Arrays.toString(array2));
  }

}
