import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class DuplicateElements {
 
    public static void main(String[] args) {
 
                String[] strArrays = {
                "Cabbage", 
                "Kale",
                "Radish",
                "Kale",
                "Garlic",
                "Beetroot",
                "Garlic",
                "Carrot",
                "Kale"
        };
 
        // First convert to List
        List<String> list = Arrays.asList(strArrays);
 
        // just empty HashSet object
        Set<String> set = new HashSet<String>();
 
        // iterate through List
        for(String str : list) {
            // add element to Set/HashSet
            boolean flagForDuplicate = set.add(str);
 
            if(!flagForDuplicate) {
                System.out.println(str + " is duplicate element");
            }
        }
    }
}