import java.util.HashMap;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};
        findFrequency(array);
    }
    public static void findFrequency(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : array) {
            if (frequencyMap.containsKey(element)) 
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else { 
                frequencyMap.put(element, 1);
            }
        }
        System.out.println("Element\tFrequency");
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}

OUTPUT:
Element Frequency
1               4
2               3
3               2
4               1
