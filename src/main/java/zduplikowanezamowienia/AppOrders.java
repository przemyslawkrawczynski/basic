package zduplikowanezamowienia;

import java.util.ArrayList;
import java.util.HashSet;

public class AppOrders {

    public static void main(String[] args) {

        Order order1 = new Order("id100");
        Order order2 = new Order("id100");
        Order order3 = new Order("id100");
        Order order4 = new Order("id103");
        Order order5 = new Order("id104");

        HashSet<Order> orders = new HashSet<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        for (Order x : orders){
            System.out.println(x.getOrderID());
        }
    }
}

//faktycznie tutaj to dziala i nie duplikuje zamowien,
//zmienilem HashSet na ArrayList i zaczelo pokazywac duplikaty
//zastanawiam sie z czego to technicznie wynika i czy w to wnikac teraz?
