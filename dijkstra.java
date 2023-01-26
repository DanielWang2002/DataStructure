//Java Code
//Dijkstra Algorithm
public class Dijkstra {

    //Define a graph using an adjacency matrix
    public static final int[][] GRAPH = {
        { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
        { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
        { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
        { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
        { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
        { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
        { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
        { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } 
    }; 
  
    // Define a visited array to track visited nodes
    public static final int[] VISITED = new int[GRAPH.length];
  
    // define an distance array to track shortest distances 
    public static final int[] DISTANCE = new int[GRAPH.length];
  
    // define an parent array to store the parents of each node 
    public static final int[] PARENTS = new int[GRAPH.length];
  
  
    // Helper method to reset visited, distance and parent arrays to their default values
    public static void init() {
        for(int i = 0; i < GRAPH.length; i++) {
            VISITED[i] = 0;
            DISTANCE[i] = Integer.MAX_VALUE;
            PARENTS[i] = -1;
        }
    }
  
    // Method to find the path with the shortest distance from the source node to all others nodes
    public static void dijkstra(int source) {
        init();
  
        // Set Distance of source to zero
        DISTANCE[source] = 0;
  
        // Iterate through all nodes in graph
        for (int i = 0; i < GRAPH.length; i++) {
  
            // Get the index of unvisited node which has minimum distance
            int min = getMinDistanceIndex();
  
            // Mark the node at this index as visited
            VISITED[min] = 1;
  
            // Update distances of adjacent nodes
            for (int j = 0; j < GRAPH.length; j++) {
  
                // Check if adjacent node is available and not visited yet
                if ((GRAPH[min][j] != 0 || GRAPH[j][min] != 0) && VISITED[j] == 0) {
  
                    // Update distance if found shortest path
                    if (DISTANCE[min] + GRAPH[min][j] < DISTANCE[j]) {
                        DISTANCE[j] = DISTANCE[min] + GRAPH[min][j];
  
                        // Update the parent of this node to store the shortest path 
                        PARENTS[j] = min;
                    }
                }
            }
        }
    }
  
    // Method to find the index of unvisited node which has minimum distance
    public static int getMinDistanceIndex() {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
  
        for (int i = 0; i < GRAPH.length; i++) {
            if (VISITED[i] == 0 && DISTANCE[i] < min) {
                min = DISTANCE[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
  
    // Method to output the shortest path from given source to destination node
    public static void printShortestPath(int source, int dest) {
        dijkstra(source);
  
        System.out.println("Shortest Path from node " + source + " to node " + dest + " is: ");
  
        // Print the path stored in parent array 
        int lastNode = dest;
        while (lastNode != -1) {
            System.out.print(lastNode + "\t");
            lastNode = PARENTS[lastNode];
        }
    }
  
    // Driver program 
    public static void main(String[] args) {
        int source = 0; 
        int dest = 7;
  
        printShortestPath(source, dest); 
    }
}