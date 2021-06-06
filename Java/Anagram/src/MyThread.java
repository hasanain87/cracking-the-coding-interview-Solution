import java.util.concurrent.*;

class MyThread implements Runnable

{

    String command;

    public MyThread(String s)

    {

        this.command=s;

    }

    public void run()

    {

        System.out.println(Thread.currentThread().getName()+" Begin. Command = " + command);

        processCommand();

        System.out.println(Thread.currentThread().getName()+" End.");

    }

    private void processCommand()

    {

        try

        {

            Thread.sleep(5000);

        } catch (Exception e) {  }

    }

}

