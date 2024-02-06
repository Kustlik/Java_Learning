package Zadanie2;

public class Elevator
{
    private Person[] elevatorSlots = new Person[4];
    int counter = 0;
    final int maxWeight = 400;

    void AddPerson(Person person)
    {
        if(elevatorSlots[elevatorSlots.length - 1] != null)
            System.out.println("Nie ma już miejsca");
        else
        {
            elevatorSlots[counter++] = person;
        }
    }

    void Start()
    {
        if (CalculateWeight() >= maxWeight)
            System.out.println("Winda jest przeciążona");
        else
            System.out.println("Winda wystartowała");
    }

    private double CalculateWeight()
    {
        double weight = 0;
        if (elevatorSlots[0] != null)
            weight += elevatorSlots[0].weight;
        if (elevatorSlots[1] != null)
            weight += elevatorSlots[1].weight;
        if (elevatorSlots[2] != null)
            weight += elevatorSlots[2].weight;
        if (elevatorSlots[3] != null)
            weight += elevatorSlots[3].weight;
        return weight;
    }

    void ClearPassengers()
    {
        elevatorSlots[0] = null;
        elevatorSlots[1] = null;
        elevatorSlots[2] = null;
        elevatorSlots[3] = null;
        counter = 0;

        System.out.println("Winda jest pusta");
    }
}
