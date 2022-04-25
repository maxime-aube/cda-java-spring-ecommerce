package fr.maximob.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

public class Order {

    protected Long id;
    protected LocalDate dateCreated;
    protected String status;

    protected Client client;

    protected List<OrderProduct> OrderProductList;

    public Order() {
        super();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    /**
     * calcule le prix total de cette commande
     * @return Double
     */
    public Double getTotaOrderPrice() {
        Double total = 0.0;
        for (OrderProduct orderProduct : this.OrderProductList) total += orderProduct.getTotalPrice();
        return total;
    }

    /**
     * calcule le nombre de types de produits
     * @return int
     */
    public int getNumberOfProducts() {
        int total = 0;
        for (OrderProduct orderProduct : this.OrderProductList) total += 1;
        return total;
    }

    /**
     * calcule le nombre total de produits
     * @return int
     */
    public int getTotalNumberOfProducts() {
        int total = 0;
        for (OrderProduct orderProduct : this.OrderProductList) total += orderProduct.getQuantity();
        return total;
    }

    /**
     * ajoute un produit selon une quantité passée en paramètre (créée une instance de OrderProduct et l’ajoute à la liste).
     */
    public void addProduct(Product product, int quantity) {
        OrderProduct newOrderProduct = new OrderProduct();
        // todo set values
        this.OrderProductList.add(newOrderProduct);
    }

    /**
     * Setter de l’attribut status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Setter de l’attribut client.
     */
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", status='" + status + '\'' +
                ", client=" + client +
                ", OrderProductList=" + OrderProductList +
                '}';
    }
}
