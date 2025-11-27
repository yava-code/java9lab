public class Task2Runner {
    public static void evaluate(int value) {
        if (value == 0) {
            int x = 10 / value;
        } else if (value < 0) {
            int[] arr = new int[3];
            int y = arr[5];
        }
    }

    public static void main(String[] args) {
        try {
            evaluate(0);
        } catch (ArithmeticException e) {
            System.out.println("Поймали ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("finally сработал (случай 0)\n");
        }

        try {
            evaluate(-1);
        } catch (ArithmeticException e) {
            System.out.println("Поймали ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("finally сработал (случай -1)\n");
        }

        try {
            evaluate(5);
            System.out.println("Для значения 5 исключений нет.");
        } catch (ArithmeticException e) {
            System.out.println("Поймали ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("finally сработал (случай 5)");
        }
    }
}