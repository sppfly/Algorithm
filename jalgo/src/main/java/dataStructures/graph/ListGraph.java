package dataStructures.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shuxiahua
 * @Description: 图的邻接表表示方法,邻接表长得和HashMap一模一样
 * 本实现的缺陷在于初始化后的图无法对节点的个数进行修改，只能只能插入边
 * @date 2021/4/5 14:03
 */
public class ListGraph implements Graph{


    private Head[] array;

    private int V;

    private int E;

    private class Node{

        int number;

        int weight;

        @Override
        public String toString() {
            return "Node{" +
                    "number=" + number +
                    ", weight=" + weight +
                    '}';
        }
    }

    private class Head{

        int number;

        List<Node> relateNode;

        public Head(int number, List<Node> relateNode) {
            this.number = number;
            this.relateNode = relateNode;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "number=" + number +
                    ", relateNode=" + relateNode +
                    '}';
        }
    }


    public ListGraph(int v) {
        this.V = v;
        this.E = 0;
        this.array = new Head[v];
        for (int i = 0; i < v; i++) {
            array[i] = new Head(i, new LinkedList<>());
        }
    }

    @Override
    public int V() {
        return V;
    }

    @Override
    public int E() {
        return E;
    }

    @Override
    public boolean addEdge(int v, int w) {
        if (v > V-1 || w > V-1) {
            throw new IllegalArgumentException("too large");
        }
        if (v == w) {
            throw new IllegalArgumentException("can not add an edge to two same vertexes");
        }
        if (array[v].relateNode.stream().noneMatch(e -> e.number == w)) {
            Node n = new Node();
            n.number = w;
            array[v].relateNode.add(n);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Node> adj(int v) {
        return array[v].relateNode;
    }

    @Override
    public String toString() {
        return "ListGraph{" +
                "headArray=" + Arrays.toString(array) +
                ", V=" + V +
                ", E=" + E +
                '}';
    }
}
