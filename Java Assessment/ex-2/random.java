import java.util.Random;
public class Random {
   public static void main(String[] args) {
      Random rd = new Random();
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt();
         System.out.println(arr[i]);
      }
   }
}