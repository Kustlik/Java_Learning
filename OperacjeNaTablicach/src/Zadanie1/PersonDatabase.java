package Zadanie1;

import java.util.Arrays;

public class PersonDatabase {
    private Person[] persons = new Person[1];
    private int counter = 0;

    public void add(Person p){
        if(p == null)
            throw new NullPointerException("Próba dodania nulla do tablicy");
        if (counter >= persons.length) {
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
        persons[counter] = p;
        counter++;
    }

    public void remove(Person p){
        boolean objectRemoved = false;
        if(p == null)
            throw new NullPointerException("Próba dodania nulla do tablicy");
        for (int i = 0; i < counter; i++){
            if (persons[i] == null)
                continue;
            if (persons[i].equals(p) && !objectRemoved){
                persons[i] = null;
                objectRemoved = true;
                continue;
            }
            if (objectRemoved)
                persons[i - 1] = persons[i];
        }
        if (objectRemoved)
            counter--;
    }

    public Person get(int index){
        if (index >= persons.length)
            throw new ArrayIndexOutOfBoundsException();
        else if (persons[index] != null)
            return persons[index];
        else
            return null;
    }

    public int size(){
        return counter;
    }
}
