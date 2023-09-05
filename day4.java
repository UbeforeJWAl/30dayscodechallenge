import java.util.*;

public class TypeCastingExample {
    public static void main(String[] args) {
     
        double doubleValue = 3.14;
        int intValue = (int) doubleValue;
        System.out.println("Type casting: " + intValue);

     
        int closureValue = 10;
        Runnable closure = () -> System.out.println("Closure value: " + closureValue);
        closure.run();

     
        var variable = "This is a var declaration.";
        final String constant = "This is a const declaration.";

        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

       
        List<String> list = Arrays.asList("A", "B", "C");
        for (String item : list) {
            System.out.println("Foreach loop item: " + item);
        }

       
        list.stream().forEach(item -> System.out.println("For-of loop item: " + item));

      
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        for (int key : map.keySet()) {
            System.out.println("For-in loop key: " + key + ", value: " + map.get(key));
        }

        int outerScope = 5;
        {
            int innerScope = 10;
            System.out.println("Lexical scope inner: " + innerScope);
        }
        System.out.println("Lexical scope outer: " + outerScope);
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Intern", 30);
        ageMap.put("shala", 25);
        System.out.println("Map value for Intern: " + ageMap.get("Intern"));

        String numberString = "42";
        int convertedNumber = Integer.parseInt(numberString);
        System.out.println("Type conversion: " + convertedNumber);
    }
