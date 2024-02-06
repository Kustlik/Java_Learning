package Zadanie2;

public class AuctionHouse
{
    public static void main(String[] args)
    {
        Auction auction1 = new Auction();

        auction1.title = "Xbox One";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 999.99;
        auction1.seller = new Seller();

        Seller seller1 = auction1.seller;
        seller1.firstName = "Jan";
        seller1.lastName = "Kowalski";
        seller1.address = new Address();

        Address address1 = seller1.address;
        address1.city = "Wrocław";
        address1.postalCode = "50-500";
        address1.street = "Kościuszki";
        address1.homeNo = "24A";

        Auction auction2 = new Auction();

        auction2.title = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 3999;
        auction2.seller = new Seller();

        Seller seller = auction2.seller;
        seller.firstName = "Justyna";
        seller.lastName = "Adamczyk";
        seller.address = new Address();

        System.out.println("Aukcja 1, wystawiony przedmiot: " + auction1.title);
        System.out.println("Opis: " + auction1.description);
        System.out.println("Cena: " + auction1.price);
        System.out.println("Przedmiot należy do: " + auction1.seller.firstName + " " + auction1.seller.lastName);

        System.out.println("Aukcja 2, wystawiony przedmiot: " + auction2.title);
        System.out.println("Opis: " + auction2.description);
        System.out.println("Cena: " + auction2.price);
        System.out.println("Przedmiot należy do: " + auction2.seller.firstName + " " + auction2.seller.lastName);
    }
}
