package Zadanie1;

public class Student
{
    private String firstName;
    private String lastName;
    private int index;
    static int count = 0;

    public Student(String firstName, String lastName, int index)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        count++;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getIndex() {return index;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setIndex(int index) {this.index = index;}
}
