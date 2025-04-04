/********************************************
*	AUTHOR:	Blake Luna-Beltran
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	04/04/2025
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
      int[] values = {12,6,26,42,53,77,84};

      ArrayMethods.swap(values, 0, 6);

      System.out.println("TEST" + ArrayMethods.arrayString(values));

      int[] numbers = {42, 16, 84, 12, 77, 26, 53};
      int minIndex1 = ArrayMethods.indexOfMin(numbers, 0);
      int minIndex2 = ArrayMethods.indexOfMin(numbers, 4);

      System.out.println("TEST: " + ArrayMethods.arrayString(numbers));
      System.out.println("Test: Min value arrays: " + minIndex1 + " and " + minIndex2);

      System.out.println("TEST: array before reversal = " + ArrayMethods.arrayString(numbers));
     
      ArrayMethods.reverse(numbers);

      System.out.println("TEST: array after reversal = " + ArrayMethods.arrayString(numbers));    

      int[] numbers2 = {5,2,3,1,4};

      System.out.println("TEST: array before sorting = " + ArrayMethods.arrayString(numbers2));

      ArrayMethods.selectionSort(numbers2);

      System.out.println("TEST: array after sorting = " + ArrayMethods.arrayString(numbers2));      

  }
}