package princeton;

public class TrieST {

    private static final int R = 26;

    private Node root;


    private static class Node {
        private Integer val;

        private Node[] next;

        public Node() {
            this.next = new Node[R];
        }

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

        public Node[] getNext() {
            return next;
        }

        public void setNext(Node[] next) {
            this.next = next;
        }
        
    }

    


    public TrieST() {
        this.root = new Node();
    }


    public Integer get(String s) {
        return 1;
    }


    public void put(String key, Integer val) {
        put(root, key, val, 0);
    }


    private void put(Node node, String key, Integer val, int index) {
        int arrayIndex = (int) key.charAt(index);
        Node cur = node.getNext()[arrayIndex];
        if (cur == null) {
            cur = new Node();
        }
        if (index == key.length() - 1) {
            cur.setVal(val);
        } else {
            put(cur, key, val, index+1);
        }
    }
}
