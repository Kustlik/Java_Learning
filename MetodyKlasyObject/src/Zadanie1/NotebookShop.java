package Zadanie1;

public class NotebookShop {
    public static void main(String[] args) {
        Computer computer1 = new Computer("AAAAA", 3244);
        Computer computer2 = new Computer("BBBBB", 2574);
        Computer computer3 = new Computer("CCCCC", 2574);
        Computer computer4 = new Computer("BBBBB", 2574);
        Computer computer5 = new Computer("BBBBB", 2795);

        DataStore.add(computer1);
        DataStore.add(computer2);
        DataStore.add(computer3);
        DataStore.add(computer4);
        DataStore.add(computer5);

        DataStore.checkAvailability(computer4);
        DataStore.print();
    }
}
