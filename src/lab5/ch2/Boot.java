package lab5.ch2;

public class Boot implements Shoe{
    private String color;
    private int size;

    public Boot(String color, int size)
    {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}

