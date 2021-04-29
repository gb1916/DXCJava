import java.util.StringTokenizer;  
public class Tokenizer{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("Hello everyone! how are you?"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  



    