package module4.task4_10;

public class ClothingProduct extends Product3 {

    public ClothingProduct(String name) {
        super(name);
    }

    @Override
    public void process()
    {
        System.out.println("Processing clothing: " + name);
    }
}

