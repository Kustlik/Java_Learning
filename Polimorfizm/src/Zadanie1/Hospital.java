package Zadanie1;

public class Hospital
{
    final static private int AMOUNT_OF_WORKERS = 100;
    static private Person[] workers = new Person[AMOUNT_OF_WORKERS];

    static void addWorker(Person person)
    {
        for(int i = 0; i < workers.length; i++)
        {
            if(workers[i] == null)
            {
                workers[i] = person;
                break;
            }
            else if(i == workers.length - 1)
                System.out.println("Nie ma miejsca");
        }
    }

    static void getInfo()
    {
        for(Person worker: workers)
        {
            if(worker != null)
            {
                System.out.print("Imię: " + worker.getFirstName() +
                        ", Nazwisko: " + worker.getLastName() +
                        ", Wypłata: " + worker.getSalary());
                if (worker instanceof Doctor)
                    System.out.println(", Premia: " + ((Doctor) worker).getBonus());
                if (worker instanceof Nurse)
                    System.out.println(", Nadgodziny: " + ((Nurse) worker).getOvertime());
            }
        }
    }
}
