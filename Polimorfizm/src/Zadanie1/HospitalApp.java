package Zadanie1;

public class HospitalApp
{
    public static void main(String[] args)
    {
        Doctor doctor = new Doctor("Jan", "Kowalski", 2574, 543);
        Nurse nurse1 = new Nurse("Karol", "Willbak", 1254, 32);
        Nurse nurse2 = new Nurse("Przemek", "Bartoś", 1123, 12);

        Hospital.addWorker(doctor);
        Hospital.addWorker(nurse1);
        Hospital.addWorker(nurse2);

        Hospital.getInfo();
    }
}
