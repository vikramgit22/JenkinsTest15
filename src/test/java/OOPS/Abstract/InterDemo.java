package OOPS.Abstract;

interface Animal1
{
    static void makesound1() {
        System.out.println("Static Animal---");
    }

    default void sleep()
    {
        System.out.println("sleeping");
    }

    void achive();


}

interface Animal2
{
    static void makesound2() {
        System.out.println("Static Animal2---");
    }

    default void sleep()
    {
        System.out.println("sleeping2");
    }

    void achive2();


}

class cat implements Animal1,Animal2
{


    @Override
    public void sleep() {
        Animal1.super.sleep();
    }

    @Override
    public void achive() {
        System.out.println("Do it Vikram");
    }

    @Override
    public void achive2() {
        System.out.println("Achieve everything...");
    }
}


public class InterDemo {

    public static void main(String[] args) {

        cat c = new cat();
        c.achive();
        c.sleep();
        c.achive2();
        Animal2.makesound2();
        Animal1.makesound1();



    }

}
