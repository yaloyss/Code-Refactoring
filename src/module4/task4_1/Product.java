package module4.task4_1;

public class Product {
    private String name;
    private double price;
    public Currency currency;

    public Product(String name, double price, String currencyCode) {
        this.name = name;
        this.price = price;
        this.currency = CurrencyFactory.getCurrency(currencyCode);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrencyCode() {
        return currency.getCode();
    }
}
