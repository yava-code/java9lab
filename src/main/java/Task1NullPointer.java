public class Task1NullPointer {
    static void generateNullPointer() {
        String s = null;
        s.length();
    }

    public static void main(String[] args) {
        try {
            generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Произошла NullPointerException.");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}