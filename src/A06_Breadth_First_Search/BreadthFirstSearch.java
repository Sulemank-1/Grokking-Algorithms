package A06_Breadth_First_Search;

import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));

        graph.put("anuj", new ArrayList<>());
        graph.put("peggy", new ArrayList<>());
        graph.put("thom", new ArrayList<>());
        graph.put("jonny", new ArrayList<>());

        boolean found = search("you", graph);
        System.out.println("Search successful: " + found);
    }

    public static boolean search(String startNode, Map<String, List<String>> graph) {
        Queue<String> searchQueue = new LinkedList<>();

        if (graph.containsKey(startNode)) {
            searchQueue.addAll(graph.get(startNode));
        }

        Set<String> searched = new HashSet<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();

            // Prevent checking the same person twice
            if (!searched.contains(person)) {

                if (personIsSeller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    if (graph.containsKey(person)) {
                        searchQueue.addAll(graph.get(person));
                    }
                    searched.add(person);
                }
            }
        }

        System.out.println("No mango seller found in the network.");
        return false;
    }

     public static boolean personIsSeller(String name) {
        return name.endsWith("m");
    }
}