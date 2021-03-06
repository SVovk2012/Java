
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Inro to graphs (discrete mathematics)
*/
public class Node implements Serializable {  // Directed graph
    int nodeName; // Here is the number (name) of the graph
    List<Node> edges = new LinkedList<>(); // Here is the list of another nodes to which given node is connected (basically edges (links) of the given graph).

    public static void main(String[] args) {
        // Determining the number of mutual connections of the given node
        int numberOfMutualConnections = 0;
        Node example = new Node();
        for (Node graph1 : example.edges) { // iteration through all the nodes the original (example) node is linked to
            for (Node graph2 : graph1.edges) { //iteration through all the nodes to which linked the each node the original (example) is linked to
                if (graph2.nodeName == example.nodeName){
                    numberOfMutualConnections++;
                    System.out.println(example.nodeName + " has the mutual link with " + graph1.nodeName);}
            }
 /*"example" has number of nodes it is linked to.
 We go through all of them.
 If one of them has the link to our original node ("example") we print message and increase count (numberOfMutualConnections) by 1.*/
        }

    }
}
