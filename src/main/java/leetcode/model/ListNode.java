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
     * @Description: 尾插法生成链表, 顺序与输入顺序相同
     * @author liuyi
     * @date 2021/2/14 13:41
     */
    public static ListNode initByTail(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("the length of array must larger than 0");
        }
        ListNode head = new ListNode();
        ListNode tail = head;
        for (int e : nums) {
            ListNode p = new ListNode(e, null);
            tail.next = p;
            tail = p;
        }
        return head;
    }

    /**
     * @Description: 头插法生成链表,生成的链表顺序和输入的顺序是相反的
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
    public LinearList empty() {
        return new ListNode();
    }

    @Override
    public int get(int index) {
        ListNode p = this;
        while (index > 1 && p.next != null) {
            p = p.next;
            index--;
        }
        if (index > 1) {
            throw new IllegalArgumentException("the length of linkedlist is shorter than i");
        }
        return p.val;
    }

    @Override
    public int findIndex(int value) {
        ListNode p = this;
        int index = 0;
        while (p.next != null) {
            if (p.val == value) {
                return index;
            }
            p = p.next;
            index++;
        }
        throw new IllegalArgumentException("the length of linkedlist is shorter than i");
    }

    @Override
    public boolean insert(int index, int value) {
        ListNode p = this;
        while (index > 1 && p.next != null) {
            p = p.next;
            index--;
        }
        if (index > 1) {
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
    public void insert(int value) {
        ListNode p = this;
        while (p.next != null) {
            p = p.next;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = null;
        p.next = newNode;
    }


    @Override
    public boolean delete(int index) {
        ListNode p = this;
        while (index > 1 && p.next != null) {
            p = p.next;
            index--;
        }
        if (index > 1) {
            throw new IllegalArgumentException("the length of linkedlist is shorter than i");
        }
        ListNode t =  p.next;
        p.next =  t.next;
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
    public static ListNode reverse(ListNode head) {
        ListNode p = head.next;
        head.next = null;
        while (p != null) {
            ListNode q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        return head;
    }


}