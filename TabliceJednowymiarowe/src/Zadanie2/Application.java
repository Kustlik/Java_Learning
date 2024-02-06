package Zadanie2;

public class Application
{
    public static void main(String[] args)
    {
        Elevator elevator = new Elevator();

        Person person1 = new Person(0, 77);
        Person person2 = new Person(1, 177);
        Person person3 = new Person(2, 43);
        Person person4 = new Person(3, 72);
        Person person5 = new Person(4, 74);
        Person person6 = new Person(5, 177);
        Person person7 = new Person(6, 77);
        Person person8 = new Person(7, 177);
        Person person9 = new Person(8, 27);
        Person person10 = new Person(9, 75);
        Person person11 = new Person(10, 127);
        Person person12 = new Person(11, 177);
        Person person13 = new Person(12, 47);
        Person person14 = new Person(13, 78);
        Person person15 = new Person(14, 173);
        Person person16 = new Person(15, 77);
        Person person17 = new Person(16, 177);
        Person person18 = new Person(17, 77);
        Person person19 = new Person(18, 77);
        Person person20 = new Person(19, 177);

        elevator.AddPerson(person1);
        elevator.AddPerson(person2);
        elevator.AddPerson(person3);
        elevator.AddPerson(person4);
        elevator.AddPerson(person5);
        elevator.Start();
        elevator.ClearPassengers();
        elevator.AddPerson(person6);
        elevator.AddPerson(person7);
        elevator.AddPerson(person8);
        elevator.AddPerson(person9);
        elevator.AddPerson(person10);
        elevator.Start();
        elevator.ClearPassengers();
        elevator.AddPerson(person11);
        elevator.AddPerson(person12);
        elevator.AddPerson(person13);
        elevator.AddPerson(person14);
        elevator.AddPerson(person15);
        elevator.Start();
        elevator.ClearPassengers();
        elevator.AddPerson(person16);
        elevator.AddPerson(person17);
        elevator.AddPerson(person18);
        elevator.AddPerson(person19);
        elevator.AddPerson(person20);
        elevator.Start();
        elevator.ClearPassengers();
    }
}
