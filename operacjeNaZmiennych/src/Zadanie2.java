public class Zadanie2
{
    public static void main(String[] args)
    {
        double netto = 4000;
        double vat = 0.23;
        double vatAmount = netto * vat;
        double brutto = netto + vatAmount;

        System.out.println("Cena produktu netto: " + netto);
        System.out.println("Wysokość podatku: " + vat);
        System.out.println("Cena produktu brutto " + brutto);
    }
}
