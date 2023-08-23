package chapter09;

public class Exercise02 {

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        double changePercent = stock.getChangePercent();
        System.out.println("The change percent is: " + changePercent);
    }
}
