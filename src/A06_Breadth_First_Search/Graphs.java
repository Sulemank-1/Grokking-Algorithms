package A06_Breadth_First_Search;

import java.util.*;

public class Graphs {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("you", new ArrayList<>(Arrays.asList("alice", "bob", "claire")));
        graph.put("bob", new ArrayList<>(Arrays.asList("anuj", "peggy")));
        graph.put("alice", new ArrayList<>(Arrays.asList("peggy")));
        graph.put("claire", new ArrayList<>(Arrays.asList("thom", "jonny")));

        graph.put("anuj", new ArrayList<>());
        graph.put("peggy", new ArrayList<>());
        graph.put("thom", new ArrayList<>());
        graph.put("jonny", new ArrayList<>());

        System.out.println(graph.get("you"));


        Queue<String> queue = new LinkedList<>();

        queue.addAll(graph.get("you"));
    }
}
