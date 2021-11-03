package epam_questions.arrays;

import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) {
    int[] myArr = {1, 15, 48, 352};
    int[] arrayCopy = new int[myArr.length];

    //Array copy with System.arraycopy()
    System.arraycopy(myArr,0,arrayCopy, 0, myArr.length);
    System.out.println(Arrays.toString(arrayCopy));
  }

}
