public enum OrderStatus {

    ORDER(2,"Zamówione"),
    PREPARED_FOR_SHIPPING(2,"Przygotowanie do wysyłki"),
    ON_THE_WAY (3,"W TRANSPORCIE"),
    COMPLETED(3,"Zrealizowane"),
    Canceled(4,"Anulowane");

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
