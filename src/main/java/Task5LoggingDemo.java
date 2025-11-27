public class Task5LoggingDemo {
    public static void method1() throws MyException1, MyException2 {
        throw new MyException1("Thrown MyException1 from method1");
    }

    public static void method2() throws MyException2 {
        throw new MyException2("Thrown MyException2 from method2");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.err.println("Поймано: " + e);
        }

        try {
            method2();
        } catch (Exception e) {
            System.err.println("Поймано: " + e);
        }
    }
}