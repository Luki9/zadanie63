public enum OrderStatus {

    ORDERED("Zamówione"),
    PREPARED_FOR_SHIPPING("Przygotowanie do wysyłki"),
    ON_THE_WAY ("W TRANSPORCIE"),
    COMPLETED("Zrealizowane");
    Cancelled("Anulowane");

    int id;
    String orderStatus;

    OrderStatus(int id, String orderStatus) {
        this.id = id;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
