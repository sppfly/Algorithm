package leetcode.model;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/12 12:50
 */
public class ListNode implements LinearList{

    public Integer val;
    public ListNode next;


    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }



    /**
     * @Description: 在第i个元素后面插入一个值value
     * @author liuyi
     * @date 2021/2/14 13:14
     */
    public boolean add(int value, int i) {
        ListNode p = this;
        while (i > 1 && p.next != null) {
            p = p.next;
            i--;
        }
        if (i > 1) {
            throw new IllegalArgumentException("the length of linkedlist is shorter than i");
        }
        ListNode newNode = new ListNode(value);
        newNode.next = p.next;
        p.next = newNode;
        return true;
    }


    /**
     * @Description: 在链表最后附上元素
     * @author liuyi
     * @date 2021/2/14 13:39
     */
    public void append(int value) {
        ListNode p = this;
        while (p.next != null) {
            p = p.next;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = null;
        p.next = newNode;
    }


    public void remove(int i) {
        ListNode p = this;
        while (i > 1 && p.next != null) {
            p = p.next;
            i--;
        }
        if (i > 1) {
            throw new IllegalArgumentException("the length of linkedlist is shorter than i");
        }
        ListNode t =  p.next;
        p.next =  t.next;
    }

    @Override
    public LinearList empty() {
        return new ListNode();
    }

    /**
     * @Description: 尾插法生成链表
     * @author liuyi
     * @date 2021/2/14 13:41
     */
    public static ListNode initByTail(int[] nums) {
        return null;
    }

    /**
     * @Description: 头插法生成链表
     * @author liuyi
     * @date 2021/2/14 13:42
     */
    public static ListNode initByHead(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("the length of array must larger than 0");
        }
        ListNode head = new ListNode();
        for (int e : nums) {
            ListNode p = new ListNode(e);
            p.next = head.next;
            head.next = p;
        }
        return head;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int findIndex(int value) {
        return 0;
    }

    @Override
    public boolean insert(int index, int value) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    /**
     * @Description: 翻转链表
     * @author liuyi
     * @date 2021/2/14 13:42
     */
//    public ListNode reverse() {
//
//    }


}