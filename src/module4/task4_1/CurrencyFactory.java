package module4.task4_1;

public class CurrencyFactory {
    private static final Currency UAH = new Currency ("UAH");
    private static final Currency USD = new Currency ("USD");
    private static final Currency EUR = new Currency ("EUR");

    public static Currency getCurrency(String code)
    {
        if (code.equals("UAH"))
            return UAH;
        if (code.equals("USD"))
            return USD;
        if (code.equals("EUR"))
            return EUR;
        else
            return new Currency(code);
    }
}
