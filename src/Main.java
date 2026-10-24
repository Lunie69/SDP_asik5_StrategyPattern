public class Main {

    public static void main(String[] args) {

        CookingStrategy strategy = new FreshCheremshaStrategy();
        CheremshaCooker cooker = new CheremshaCooker(strategy);

        System.out.println("First cooking:");
        cooker.cookCheremsha();

        System.out.println();

        System.out.println("Switching to boiled cheremsha:");
        cooker.setStrategy(new BoiledCheremshaStrategy());
        cooker.cookCheremsha();

        System.out.println();

        System.out.println("Switching to fried cheremsha:");
        cooker.setStrategy(new FriedCheremshaStrategy());
        cooker.cookCheremsha();
    }
}
