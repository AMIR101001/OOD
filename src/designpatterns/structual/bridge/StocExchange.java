package designpatterns.structual.bridge;

public class StocExchange extends Program{
    protected StocExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
