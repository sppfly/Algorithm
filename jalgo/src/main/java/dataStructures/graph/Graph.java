package dataStructures.graph;

import java.util.List;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/15 20:04
 */
public interface Graph {

    /**
     * 顶点个数
     * @return
     */
    int V();

    /**
     * 边数
     * @return
     */
    int E();

    /**
     * 在顶点(v,w)之间建立一条边
     * @param v
     * @param w
     */
    boolean addEdge(int v, int w);

    /**
     * 顶点v的所有邻接顶点
     * @param v
     * @return
     */
    List adj(int v);

}
