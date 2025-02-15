// Q11.How do you create a deadlock scenario programmatically in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:-  Deadlock is a scenario in a multi-threaded Java environment where two or more threads are blocked forever. 
The deadlock situation arises with at two or more threads. The following example code creates a deadlock scenario:
*/

public class ThreadDeadlock 
{

    public static void main(String[] args) throws InterruptedException 
    {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
    
        Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread(obj2, obj3), "t2");
        Thread t3 = new Thread(new SyncThread(obj3, obj1), "t3");
        
        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();        
    }

}

class SyncThread implements Runnable 
{

    private Object obj1;
    private Object obj2;

    public SyncThread(Object o1, Object o2) {
        this.obj1 = o1;
        this.obj2 = o2;
    }

    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();

        System.out.println(name + " acquiring lock on " + obj1);
        synchronized (obj1) {
            System.out.println(name + " acquired lock on " + obj1);
            work();
            System.out.println(name + " acquiring lock on " + obj2);
            synchronized (obj2) {
                System.out.println(name + " acquired lock on " + obj2);
                work();
            }
            System.out.println(name + " released lock on " + obj2);
        }
        System.out.println(name + " released lock on " + obj1);
        System.out.println(name + " finished execution.");
    }

    private void work() 
    {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


/*
All three threads will be able to acquire a lock on the first object. 
However, they are using shared resources and are started in such a way that they will keep on waiting indefinitely to acquire the lock on the second object. 
You can use the Java thread dump to detect the deadlocks. Learn more about deadlock in Java.
 */