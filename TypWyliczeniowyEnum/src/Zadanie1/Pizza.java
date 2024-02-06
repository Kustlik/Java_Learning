package Zadanie1;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean champignons;
    private final boolean ham;

    Pizza (boolean tomatoSauce, boolean cheese, boolean champignons, boolean ham)
    {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.champignons = champignons;
        this.ham = ham;
    }

    @Override
    public String toString() {
        String result = name() + " (";
        if (tomatoSauce)
            result += "sos pomidorowy";
        if (cheese)
            result += ", ser";
        if (champignons)
            result += ", pieczarki";
        if (ham)
            result += ", szynka";
        result += ")";
        return result;
    }
}
