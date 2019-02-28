import java.util.Comparator;

class OrderStatusComparator implements Comparator<Order> {


    @Override
    public int compare(Order o1, Order o2) {

        return Double.compare(o1.getOrderStatus().getId(),o2.getOrderStatus().getId());
    }
}
