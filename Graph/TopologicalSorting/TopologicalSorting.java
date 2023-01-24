package Graph.TopologicalSorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class TopologicalSorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of vertex");
        int size= sc.nextInt();
        int[] nodeIndegree =  new int[size];
        HashMap<Integer, LinkedList<Integer>> graph  = createGraph(sc, size,nodeIndegree);

        printTopologicalOrder(nodeIndegree,graph);

    }

    private static void printTopologicalOrder(int[] nodeIndegree,HashMap<Integer, LinkedList<Integer>>graph){
        for(int i=0;i<nodeIndegree.length;i++){
            if(nodeIndegree[i] == 0){
                System.out.println(i);
                LinkedList<Integer> list= graph.get(i);
                for(Integer element : list){
                    nodeIndegree[element]--;
                }
                nodeIndegree[i]=999;
                printTopologicalOrder(nodeIndegree,graph);
                return;
            }
        }
    }


    private static HashMap<Integer, LinkedList<Integer>> createGraph(Scanner sc, int size,int[] node ){
        HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();


        System.out.println("Enter connectivity for following node ");
        for(int i=0;i<size;i++){
            System.out.println("Vertex"+(i)+" connected to how many other vertex: ");
            int edges= sc.nextInt();
            LinkedList<Integer> list= new LinkedList<>();
            System.out.println("Enter edges");
            for(int j=0;j<edges;j++){
                int pointsToNode= sc.nextInt();
                node[pointsToNode]++;
                list.add(pointsToNode);
            }
            graph.put(i,list);
        }
        return graph;
    }
}
