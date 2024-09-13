package ExceptionH;

class InvalidAge extends Exception
{
    public InvalidAge(String message)
    {
        super(message);
    }
}

public class CusExp {

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAge e) {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void checkAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
