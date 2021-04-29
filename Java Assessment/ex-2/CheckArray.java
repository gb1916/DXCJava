public class CheckArray {
  public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int[] my_array1 = {
            19, 20, 21, 22, 23, 
            14, 15, 16, 17, 18,  
            10, 11, 12, 13
};
      System.out.println(contains(my_array1, 2013));
      System.out.println(contains(my_array1, 2015));
   }
}