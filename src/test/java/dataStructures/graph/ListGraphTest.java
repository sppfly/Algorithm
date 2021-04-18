package dataStructures.graph;

import edu.princeton.cs.algs4.DepthFirstSearch;
import edu.princeton.cs.algs4.Graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/15 21:01
 */
class ListGraphTest {


    @Test
    void test() {
        ListGraph graph = new ListGraph(10);
        for (int i = 0; i< 9; i++) {
            graph.addEdge(i, i+1);
        }
        System.out.println(graph);
    }
}