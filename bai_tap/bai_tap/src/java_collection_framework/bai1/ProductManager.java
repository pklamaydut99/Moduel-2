package java_collection_framework.bai1;
import java.util.*;

public class ProductManager {
    public ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void displayProduct() {
        int i=1;
        for (Product product : products) {
            System.out.println(i+". "+product);
            i++;
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int productId, int newPrice,String newName) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setPrice(newPrice);
                product.setName(newName);
            }
        }
    }

    public void removeProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                products.remove(product);
            }
        }
    }

    public Product findByIdProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    public void sortProductByName() {
        products.sort(Comparator.comparing(Product::getName));
    }

    public void sortProductByPrice() {
        Collections.sort(products, Comparator.comparing(Product::getPrice));
    }
}
