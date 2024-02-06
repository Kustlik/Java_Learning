package Zadanie1;

public class PrintService
{
    void printSummary(Client client, double originalPrice, double discountPrice)
    {
        printWelcomeMessage(client);
        printPrices(originalPrice, discountPrice);
    }

    private void printWelcomeMessage(Client client)
    {
        if(client.getFirstName() != null && client.getLastName() == null)
            System.out.println("Witaj " + client.getFirstName());
        else if(client.getFirstName() != null && client.getLastName() != null)
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        else if(client.getFirstName() == null && client.getLastName() != null)
            System.out.println("Dzień dobry panie/pani " + client.getLastName());
        else
            System.out.println("Witaj nieznajomy");
    }

    private void printPrices(double originalPrice, double discountPrice)
    {
        System.out.println("Kwota przed rabatem: " + originalPrice);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);
    }
}
