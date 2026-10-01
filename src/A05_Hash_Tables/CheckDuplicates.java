package A05_Hash_Tables;

import java.util.*;

public class CheckDuplicates {
    public static void main(String[] args) {
        Map<String, Boolean> voted = new HashMap<>();

        check_voter(voted,"tom");
        check_voter(voted,"mike");
        check_voter(voted,"mike");
    }

    public static void check_voter(Map<String, Boolean> voted, String name){
        if (voted.containsKey(name))
            System.out.println("Kick them out!");
        else{
            voted.put(name, true);
            System.out.println("Let them vote!");
        }
    }
}
