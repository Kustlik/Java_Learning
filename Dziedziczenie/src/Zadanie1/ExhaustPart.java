package Zadanie1;

public class ExhaustPart extends Part
{
    private boolean europeanStandard;

    public ExhaustPart(int id, String producentName, String model, String productSerial, boolean europeanStandard)
    {
        this.setId(id);
        this.setProducentName(producentName);
        this.setModel(model);
        this.setProductSerial(productSerial);
        this.europeanStandard = europeanStandard;
    }

    public boolean isEuropeanStandard() {return europeanStandard;}

    public void setEuropeanStandard(boolean europeanStandard) {this.europeanStandard = europeanStandard;}
}
