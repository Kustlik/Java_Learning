package Zadanie2;

public class App {
    public static void main(String[] args) {
        Order order1 = new Order("Telefon", 3000, Status.SHIPPED);
        Order order2 = new Order("Odkurzacz", 2000, Status.NEW);
        Order order3 = new Order("Telewizor", 5500, Status.PAID);
        Order order4 = new Order("Czajnik", 300, Status.SHIPPED);
        Order order5 = new Order("Pufa", 150, Status.SHIPPED);

        Order[] orders = {order1, order2, order3, order4, order5};

        printOrders(orders);

        Order[] newOrders = changesStatuses(orders, Status.DELIVERED);
        printOrders(newOrders);
    }

    static Order[] changesStatuses(Order[] orders, Status targetStatus)
    {
        for (Order order : orders) order.setStatus(targetStatus);
        return orders;
    }

    static void printOrders(Order[] orders)
    {
        for (Order order : orders) System.out.println(order);
    }
}
