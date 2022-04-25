package fr.maximob.ecommerce.model;

public class OrderProduct {

    protected Integer quantity;
    protected Product Product;
    protected Order Order;

    public OrderProduct() {
        super();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public fr.maximob.ecommerce.model.Product getProduct() {
        return Product;
    }

    public fr.maximob.ecommerce.model.Order getOrder() {
        return Order;
    }

    // todo add setters

    /**
     * calcule le prix de cette ligne de commande
     * @return Double
     */
    public Double getTotalPrice() {
        return (Double) this.Product.price * this.quantity;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "quantity=" + quantity +
                ", Product=" + Product +
                ", Order=" + Order +
                '}';
    }
}
