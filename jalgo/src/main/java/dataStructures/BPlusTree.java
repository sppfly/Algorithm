// package dataStructures;

// import java.util.ArrayList;
// import java.util.Optional;

// /**
//  * 1. 不考虑重复的key，不考虑删除的B+树
//  */
// public class BPlusTree<K extends Comparable<K>> {

//     private final int DEFAULT_FACTOR = 5;

//     private int factor;

//     private Node root;

//     abstract class Node {

//         abstract boolean isLeaf();




//         ArrayList<K> keys;
//     }

//     /**
//      * 
//      * 1. 当key1小于key时, p1指向key所在的子节点
//      * +-----------------------------------------------
//      * |p1|  key1  |p2|  key2  |
//      * +-------------------------------------------------
//      */
//     class InnerNode extends Node {

//         @Override
//         boolean isLeaf() {
//             return false;
//         }

//         private ArrayList<Node> children;



//         // 找到叶子节点
//         BPlusTree<K>.LeafNode get(K key) {
//             Node node;
//             for (int i=0; i<keys.size(); i++) {
//                 if (key.compareTo(keys.get(i)) < 0) {
//                     node = children.get(i);
//                 }
//             }
//             return null;
//         }


//         BPlusTree<K>.Node put(K key, Integer val) {
//             // TODO Auto-generated method stub
//             return null;
//         }

//     }

//     class LeafNode extends Node {

//         @Override
//         boolean isLeaf() {
//             return true;
//         }

//         private ArrayList<Integer> vals;

//         private LeafNode next;

//         private LeafNode prev;

//         BPlusTree<K>.Node get(K key) {
//             // TODO Auto-generated method stub
//             return null;
//         }

//         BPlusTree<K>.Node put(K key, Integer val) {
//             // TODO Auto-generated method stub
//             return null;
//         }

//     }

//     BPlusTree(int factor) {
//         this.factor = factor;
//         root = new InnerNode();
//     }

//     BPlusTree() {
//         this.factor = DEFAULT_FACTOR;
//         root = new InnerNode();
//     }

//     // public List<Integer> searchRange(K lowerbound, K upperbound) {

//     // }

//     public void insert(K key, Integer val) {
//         Node node = root.get(key);
        
//     }

//     public Optional<Integer> search(K key) {
//         Node node = root.get(key);
//         if (node == null) {
//             return Optional.empty();
//         }
//         while (!node.isLeaf()) {
//             node = node.get(key);
//         }

//         return Optional.empty();
//     }

// }
