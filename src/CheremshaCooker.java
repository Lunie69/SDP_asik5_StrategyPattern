public class CheremshaCooker {

    private CookingStrategy strategy;

    public CheremshaCooker(CookingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CookingStrategy strategy) {
        this.strategy = strategy;
    }

    public void cookCheremsha() {
        strategy.cook();
    }
}
