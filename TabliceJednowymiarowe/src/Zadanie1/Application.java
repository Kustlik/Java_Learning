package Zadanie1;

public class Application
{
    public static void main(String[] args) {
        int[] numbers1 = {4, 7, 5};
        int[] numbers2 = {9, 3, 2};

        System.out.println(numbers1[0] + numbers1[1] + numbers1[2]);
        System.out.println(numbers2[0] + numbers2[1] + numbers2[2]);

        System.out.println(add(numbers1, numbers2));
    }

    private static int add(int[] tab1, int[] tab2)
    {
        return tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2];
    }
}
