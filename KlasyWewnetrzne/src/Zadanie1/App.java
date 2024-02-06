package Zadanie1;

public class App {
    public static void main(String[] args) {
        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                for (int i = 0; i < tab.length - 1; i++)
                {
                    if(tab[i + 1] < tab [i])
                    {
                        int temp = tab[i + 1];
                        tab[i + 1] = tab[i];
                        tab[i] = temp;
                        i = -1;
                    }
                }
                return tab;
            }
        };

        int[] table1 = {3,6,8,4,2,1,5,2,8,5};
        int[] sortedTable = sortable.sort(table1);

        for (int number:sortedTable)
        {
            System.out.print(number + " ");
        }
    }
}
