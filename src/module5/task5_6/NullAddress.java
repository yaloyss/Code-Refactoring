package module5.task5_6;

public class NullAddress extends Address
{
    public NullAddress() {
        super("No street", "No city");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}

