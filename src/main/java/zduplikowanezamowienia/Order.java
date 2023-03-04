package zduplikowanezamowienia;

import java.util.Objects;

public class Order {

    String orderID;

    public Order(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderID, order.orderID);
    }


    //    ta metoda też zadziałała:
    //    @Override
    //    public boolean equals(Object o) {
    //        Order e = (Order) o;
    //        return this.orderID.equals(e.getOrderID());
    //
    //    }
    //

    @Override
    public int hashCode() {
        return Objects.hash(orderID);
    }
}


//Tok myslenia:
// - ArrayList nie jest odpowiednia klasa z ktorej nalezy skorzystac w przypadku zamowien, bo
//   ArrayList umozliwia przechowywanie dwoch takich samych (nie tych samych) obiektow jednoczesnie
//   W praktyce nie wystepuje sytuacje, ze wystepuja dwa identyczne zamowienia -
//   nawet jesli sa te same produkty, adres, zamawiajacy, itd, to sie pewnie roznia data, czy np id_zamowienia;
//   dlatego w tym przypadku najlepiej uzyc HashSet,

// Podejscie:
//    stworzyc klase "Order"
//    w klasie pola tylko orderId
//    konstruktor + getter + metoda equals()

// potem klase Aplikacji, a w niej
// stworzyc HashSet
// dodac pare zamowien w tym dwa takie same
// zwrocic liste zamowien i zobaczyc czy takie same tam sa?

//   Pytanie - docelowo nie powinno bycHashMap - zamawiajacy (klucz), zamowienie (wartosc)? Tylko jak wtedy
