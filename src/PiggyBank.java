import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PiggyBank {
    private List<Coin> coins;

    public PiggyBank() {
        coins = new ArrayList<>();
    }

    public void insertCoin(Coin coin) {
        coins.add(coin);
    }

    public int totalCoins() {
        return coins.size();
    }

    public Map<Coin, Integer> totalCoinsByType() {
        Map<Coin, Integer> response = new HashMap<>();

        for(Coin coin : coins) {
            Integer aux = response.get(coin);
            response.put(coin, (aux == null) ? 1 : aux + 1);
        }

        return response;
    }
}
