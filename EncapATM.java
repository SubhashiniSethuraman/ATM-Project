public class EncapATM extends Options{
    private String name;
    private int pin;

    public void setName(String n)
    {
        name=n;
    }
    public void setPin(int p)
    {
        pin=p;
    }
    public String getName()
    {
        return name;
    }
    public int getPin()
    {
        return pin;
    }
}
