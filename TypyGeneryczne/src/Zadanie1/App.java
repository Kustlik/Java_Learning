package Zadanie1;

public class App {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Jan", 5);
        Pair<Integer, String> pair2 = new Pair<>(8, "Kowalski");
        Pair<Integer, Double> pair3 = new Pair<>(8, 5.5);

        printResul(pair1);
        printResul(pair2);
        printResul(pair3);
    }

    static <T,J> void printResul(Pair<T, J> pair){
        System.out.println("Object 1 is: " + pair.getObject1() + " and object 2 is: " + pair.getObject2());
    }
}
