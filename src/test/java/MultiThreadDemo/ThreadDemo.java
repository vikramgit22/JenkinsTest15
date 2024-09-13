package MultiThreadDemo;



/*
     Thread is smallest unit of process that can be schduled for execution.
     Main Thread - When JVM starts JVM creates a main thread that executes main method.
     Thread lifecycle :
          New,runnable,blocked/waiting,timed wait,terminated
     Creating a thread -- runnable interface, extending Thread class


 */

public class ThreadDemo implements Runnable   {

    @Override
    public void run() {
        System.out.println("Thread Started...");
    }

   /* public void run()
    {
        System.out.println("Thread Started...");
    }*/

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();
        Thread thread = new Thread(td);
        thread.start();
    }



}
