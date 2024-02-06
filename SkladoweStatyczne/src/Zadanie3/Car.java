package Zadanie3;

public class Car
{
    private double oilLevel;
    boolean isEngineOperative;
    boolean isOilValveClosed;
    boolean isCarTrunkClosed;
    boolean isEngineRunning;

    void status()
    {
        if(oilLevel > 0 &&
        isEngineOperative &&
        isOilValveClosed &&
        isCarTrunkClosed &&
        isEngineRunning)
            System.out.println("Wszystkie systemy sprawne");
    }
}
