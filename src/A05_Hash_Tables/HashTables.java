package A05_Hash_Tables;

import java.util.*;

public class HashTables {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("jenny", "8675309");
        phoneBook.put("emergency", "911");

        for (String i : phoneBook.keySet()) {
            System.out.println("key: " + i + ", value: " + phoneBook.get(i));
        }
    }
}
