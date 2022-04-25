package fr.maximob.ecommerce.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import fr.maximob.ecommerce.exception.ResourceNotFoundException;
import fr.maximob.ecommerce.exception.StockException;
import fr.maximob.ecommerce.model.Product;

public class ProductServiceImpl {

    private final List<Product> allProducts = new ArrayList<>();


    public List<Product> getAllProducts() {
        return this.allProducts;
    }

    public Product getProductById(Long id) throws ResourceNotFoundException {
        for (Product product : allProducts) {
            if (Objects.equals(product.getId(), id)) return product;
        }
        throw new ResourceNotFoundException();
    }

    public Product save(Product product) {
        this.allProducts.add(product);
        return product;
    }

    public boolean isProductAvailable(Product product, int quantity) {
        return (this.getProductById(product.getId()).getQuantity() >= quantity);
    }

    public void removeProduct(Product product, int quantity) throws StockException {
        this.allProducts.remove(product);
    }


}
