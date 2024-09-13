package ExceptionH;

public class ExpDemo {

    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (Exception e) {
            //System.out.println("Array index is out of bounds: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("This block is always executed.");
        }

    }


}
