package Zadanie2;

import java.io.IOException;
import java.util.Scanner;

public class App {
    final static private String CLIENTS_PATH = "clients.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client[] clients = createClients();

        mostValuableClient(clients);
        if (clients != null)
            sortByCountry(scanner, clients);

    }

    private static Client[] createClients() {
        Client[] clients = null;
        try{
            clients = ClientDataReader.readFile(CLIENTS_PATH);
        } catch (IOException e){
            e.printStackTrace();
        }
        return clients;
    }

    private static void sortByCountry(Scanner scanner, Client[] clients) {
        System.out.println("Podaj nazwę kraju, z którego klienci Cię interesują:");
        String country = scanner.nextLine();
        System.out.println("Klienci z kraju " + country);

        int amount = 0;
        for (Client client: clients){
            if (client.getCountry().equals(country)) {
                System.out.println(client);
                amount++;
            }
        }
        if (amount == 0)
            System.out.println("Nie znaleziono żadnych klientów z kraju " + country);
    }

    private static void mostValuableClient(Client[] clients) {
        Client mostValuable = null;
        if(clients != null)
            mostValuable = findMostValuable(clients);
        if(mostValuable == null)
            System.out.println("Nie znaleziono najbardziej wartościowego klienta");
        else
            System.out.println("Najbardziej wartościowy klient to " + mostValuable);
    }

    static Client findMostValuable(Client[] clients){
        Client valuableClient = null;
        for(Client client:clients) {
            if (valuableClient == null)
                valuableClient = client;
            else if (valuableClient.getValue() < client.getValue())
                valuableClient = client;
        }
        return valuableClient;
    }
}
