package Graph.StrongleConnected;

import java.util.*;

public class StronglyConnected {

    public static void main(String[] args) {

        HashMap<Integer, LinkedList<Integer>> graph  = createGraph();
        if(checkGraphConnectivity(graph)){
            System.out.println("Strongly connected ");
        };
        boolean[] visits= new boolean[graph.size()];
        if(!checkCyclicity(0,visits,graph)){
            System.out.println("Not cyclic ");
        }

    }

    private static boolean checkGraphConnectivity(HashMap<Integer, LinkedList<Integer>> graph) {
        Set<Integer> keys= graph.keySet();
        for(Integer node : keys){
            boolean[] visits= new boolean[graph.size()];
            DFS(node,visits,graph);
            for(boolean visited: visits){
                if(!visited){
                    System.out.println("Not Strongly connected; cannot reach all nodes from:"+node+1);
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkCyclicity(int node, boolean[] visits,HashMap<Integer, LinkedList<Integer>> graph) {
        LinkedList<Integer> adjacent=graph.get(node);
        for(Integer neigbour : adjacent) {
            if (!visits[neigbour]) {
                if(checkCyclicity(neigbour, visits, graph)){
                    return true;
                };
            }
        }
        return false;
    }

    private static void DFS(int node, boolean[] visits,HashMap<Integer, LinkedList<Integer>> graph){
        visits[node]=true;
        LinkedList<Integer> adjacent= graph.get(node);
        for(Integer val: adjacent){
            if(!visits[val]) {
                DFS(val, visits, graph);
            }
        }
    }

    private static HashMap<Integer, LinkedList<Integer>> createGraph(){
        HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter graph size");
        int size= sc.nextInt();
        System.out.println("Enter connectivity for following node ");
        for(int i=0;i<size;i++){
            System.out.println("Vertex"+(i+1)+" connected to how many other vertex: ");
            int nodePoints= sc.nextInt();
            LinkedList<Integer> list= new LinkedList<>();
            System.out.println("Enter edges");
            for(int j=0;j<nodePoints;j++){
                list.add(sc.nextInt()-1);
            }
            graph.put(i,list);
        }
        return graph;
    }
}
