import java.util.Map;

public class Main {

    public static void main(String[] args) {
        PiggyBank myPiggyBank = new PiggyBank();

        System.out.println("A new piggy bank was created!");
        myPiggyBank.insertCoin(Coin.Fifty);
        myPiggyBank.insertCoin(Coin.Fifty);
        myPiggyBank.insertCoin(Coin.Thousand);
        myPiggyBank.insertCoin(Coin.TwoHundred);
        myPiggyBank.insertCoin(Coin.OneHundred);
        myPiggyBank.insertCoin(Coin.OneHundred);
        myPiggyBank.insertCoin(Coin.FiveHundred);
        myPiggyBank.insertCoin(Coin.Fifty);

        System.out.println("Total coins in piggy bank is: " + myPiggyBank.totalCoins());

        Map<Coin, Integer> coinsByType = myPiggyBank.totalCoinsByType();

        for (Map.Entry<Coin, Integer> entry : coinsByType.entrySet()) {
            System.out.println("There are: " + entry.getValue() + " coins of type: " + entry.getKey());
        }
    }
}
