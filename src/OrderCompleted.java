import java.util.Collections;
import java.util.List;

class OrderCompleted {

    static void getOrderStatus(List<Order> orders, Order order) {
        orders.add(new Order(orders.size() + 1, order.getName(), order.getPrice(), order.getOrderStatus()));

    }
    static boolean changeOrderStatus(int id, List<Order> orders) {
        if (!changeOrderStatus(id, orders)) {
            System.out.println(";");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getId() == id) {
                    switch (orders.get(i).getOrderStatus()) {
                        case ORDER:
                            orders.get(i).setOrderStatus(OrderStatus.PREPARED_FOR_SHIPPING);
                            System.out.println("stan zamówienia " + (i + 1) + "Gotowe do wysyłki");
                            break;
                        case PREPARED_FOR_SHIPPING:
                            orders.get(i).setOrderStatus(OrderStatus.ON_THE_WAY);
                            System.out.println("stan zamówienia" + (i + 1) + "W drodze");
                            break;
                        case ON_THE_WAY:
                            orders.get(i).setOrderStatus(OrderStatus.COMPLETED);
                            System.out.println("Stan zamówienia" + (i + 1) + "zakończone");
                            break;
                        case Canceled:
                            System.out.println("Zamówienie zostało anulowane");
                            break;

                    }
                }

            }

        }
        static void sortByName(List<Order> orders){
            Collections.sort(Order,new PriceComparator());
        }




    }
}