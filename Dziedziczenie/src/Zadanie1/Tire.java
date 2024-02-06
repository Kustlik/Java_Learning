package Zadanie1;

public class Tire extends Part
{
    private double width;
    private double height;

    public Tire(int id, String producentName, String model, String productSerial, double width, double height)
    {
        this.setId(id);
        this.setProducentName(producentName);
        this.setModel(model);
        this.setProductSerial(productSerial);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {return width;}
    public double getHeight() {return height;}

    public void setWidth(double width) {this.width = width;}
    public void setHeight(double height) {this.height = height;}
}
