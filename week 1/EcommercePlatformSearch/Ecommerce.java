import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class Main {

    // Linear Search by productId
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search by productId
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Sample products
        Product[] products = {
            new Product(103, "Keyboard", "Electronics"),
            new Product(101, "Laptop", "Electronics"),
            new Product(104, "Notebook", "Stationery"),
            new Product(102, "Pen", "Stationery")
        };

        // 🔍 Linear Search (no sorting needed)
        int searchId = 104;
        Product result1 = linearSearch(products, searchId);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // 🧹 Sort the array by productId before binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // 🔎 Binary Search
        Product result2 = binarySearch(products, searchId);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
