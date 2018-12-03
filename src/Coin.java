public enum Coin {
    Fifty (50),
    OneHundred(100),
    TwoHundred(200),
    FiveHundred(500),
    Thousand(1000);

    private final int value;

    Coin(int value) {
        this.value = value;
    }
}
