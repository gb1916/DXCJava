import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class DuplicateElements {
 
    public static void main(String[] args) {
 
                String[] strArrays = {
                "cycle", 
                "car",
                "Bus",
                "car",
               "scooty",
                "Bike",
                "Scooty",
                "Cycle",
                "car"
        };
 
          List<String> list = Arrays.asList(strArrays);
 
         Set<String> set = new HashSet<String>();
 
        
        for(String str : list) {
        
            boolean flagForDuplicate = set.add(str);
 
            if(!flagForDuplicate) {
                System.out.println(str + " is duplicate element");
            }
        }
    }
}