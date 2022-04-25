package fr.maximob.ecommerce.model;

public class Product {

    protected Long id;
    protected String name;
    protected String description;
    protected Double price;
    protected String picture;
    protected Integer quantity;

    public Product() {
        super();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getPicture() {
        return picture;
    }

    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter de l’attribut quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
