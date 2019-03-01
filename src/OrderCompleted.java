import java.util.List;

class OrderCompleted {

    static void getOrderStatus(List<Order> orders, Order order) {
        orders.add(new Order(orders.size() + 1, order.getName(), order.getPrice(), order.getOrderStatus()));

    }
    static void changeOrderStatus(int id, List<Order> orders){
        if (!checkID(id, orders))
            System.out.println();


    }
}