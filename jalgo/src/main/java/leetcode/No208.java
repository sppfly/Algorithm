package leetcode;

import java.util.Arrays;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

class Trie {



    private static int R = 26;

    @Override
    public String toString() {
        return "Trie [root=" + root + "]";
    }


    private Node root;

    private static class Node {
        boolean val;

        @Override
        public String toString() {
            return "Node [next=" + Arrays.toString(next) + ", val=" + val + "]";
        }

        Node[] next;

        public Node() {
            this.next = new Node[R];

        }
    }


    public Trie() {
        this.root = new Node();
    }
    
    private void put(Node node, String key, int index) {
        int arrayIndex = (int) key.charAt(index) - 'a';
        if (node.next[arrayIndex] == null) {
            node.next[arrayIndex] = new Node();
        }
        Node cur = node.next[arrayIndex];
        if (index == key.length() - 1) {
            cur.val = true;
        } else {
            put(cur, key, index+1);
        }
    }

    public void insert(String word) {
        put(root, word, 0);
    }

    

    private boolean get(Node node, String word, int index) {
        int arrayIndex = (int) word.charAt(index) - 'a';
        Node cur = node.next[arrayIndex];
        if (cur == null) {
            return false;
        } 
        if (index == word.length() - 1) {
            if (cur.val) {
                return true;
            } else {
                return false;
            }
        } else {
            return get(cur, word, index+1);
        }

    }

    public boolean search(String word) {
        return get(root, word, 0);
    }

    

    public boolean startsWith(Node node, String prefix, int index) {
        int arrayIndex = (int) prefix.charAt(index) - 'a';
        Node cur = node.next[arrayIndex];
        if (cur == null) {
            return false;
        } 
        if (index == prefix.length() - 1) {
            return true;
        } else {
            return startsWith(cur, prefix, index+1);
        }
    }

    public boolean startsWith(String prefix) {
        return startsWith(root, prefix, 0);
    }


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie);
        trie.insert("appl");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("app"));
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */