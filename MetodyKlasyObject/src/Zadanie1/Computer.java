package Zadanie1;

public class Computer
{
    private String producer;
    private int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        if (producer == ((Computer) obj).getProducer()&&
            model == ((Computer) obj).getModel())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Producer: " + producer + ", Model: " + model;
    }
}
