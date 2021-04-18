package leetcode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/30 23:42
 */
class FooBar {
    private int n;

    private AtomicInteger foo = new AtomicInteger(0);
    private AtomicInteger bar = new AtomicInteger(0);
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
        }
    }
}