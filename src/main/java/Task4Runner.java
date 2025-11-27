public class Task4Runner {
    public static void maybeThrow(int code) throws AlphaException, BetaException, GammaException {
        switch (code) {
            case 1:
                throw new AlphaException("Alpha exception for code 1");
            case 2:
                throw new BetaException("Beta exception for code 2");
            case 3:
                throw new GammaException("Gamma exception for code 3");
            default:
                System.out.println("Без исключения: " + code);
        }
    }

    public static void main(String[] args) {
        try {
            maybeThrow(2);
        } catch (AlphaException | BetaException | GammaException e) {
            System.out.println("Поймали наше исключение: " + e.getMessage());
        }
    }
}