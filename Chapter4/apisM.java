package Chapter4;

//SAMPLE OF SET

import java.util.Set;
import java.util.HashSet;
import java.util.Map;



/*public class apisM {}
  public static void main(String args[]) {
 * Set<Integer> set = new HashSet<>();
 * System.out.println(set.add(66)); // true
 * System. out.println(set.add(66)); // false
 * System. out.println(set.size()); // 1
 * set. remove(66) ;
 * System.out.println(set.isEmpty()); // true
 }
**/

//EXAMPLE OF MAP

import java.util.Map;
import java.util.HashMap;

public class apisM {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<>();  // Fixed: Added missing (
        map.put("koala", "bamboo");
        String food = map.get("koala"); // bamboo  // Fixed: Added missing .
        String other = map.getOrDefault("ant", "leaf"); // leaf  // Fixed: Added missing (
        for (String key : map.keySet())  // Fixed: Added missing ()
            System.out.println(key + " " + map.get(key)); // koala bamboo  // Fixed: Corrected System.out.println and map.get
    }
}

