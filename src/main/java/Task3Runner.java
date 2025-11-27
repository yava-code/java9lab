public class Task3Runner {
    public static void main(String[] args) {
        Account acc = new Account("John Doe", 500, "PL123456");
        try {
            acc.transfer(1000); // deliberately greater than balance
            System.out.println("Перевод выполнен.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Перевод не выполнен: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Другое исключение: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        } finally {
            System.out.println("Текущий баланс: " + acc.getBalance());
        }
    }
}