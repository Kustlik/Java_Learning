package Zadanie1;

public class DataStore {
    static Computer[] computers = new Computer[10];

    static void add(Computer computer){
        for(int i = 0; i < computers.length; i++)
        {
            if(computers[i] == null)
            {
                computers[i] = computer;
                break;
            }
            else if(i == computers.length - 1)
                System.out.println("Brak miejsca");
        }
    }

    static void print(){
        for(Computer computer: computers) {
            if (computer == null)
                break;
            System.out.println(computer);
        }
    }

    static void checkAvailability(Computer orderedComputer){
        int identical = 0;
        for(Computer computer: computers) {
            if (computer == null)
                break;
            if (computer.equals(orderedComputer))
                identical++;
        }
        System.out.println("Amount of identical computers: " + identical);
    }
}
