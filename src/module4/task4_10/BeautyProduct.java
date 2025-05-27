package module4.task4_10;

public class BeautyProduct extends Product3 {

    public BeautyProduct(String name) {
        super(name);
    }

    @Override
    public void process()
    {
        System.out.println("Processing beauty products: " + name);
    }
}
