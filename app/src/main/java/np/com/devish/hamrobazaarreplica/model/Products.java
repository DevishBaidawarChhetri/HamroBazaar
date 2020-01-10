package np.com.devish.hamrobazaarreplica.model;

public class Products {
    private int id;
    private String productName;
    private String productImage;
    private String productPrice;
    private String productUseOrNot;


    public Products(int id, String productName, String productImage, String productPrice, String productUseOrNot) {
        this.id = id;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productUseOrNot = productUseOrNot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductUseOrNot() {
        return productUseOrNot;
    }

    public void setProductUseOrNot(String productUseOrNot) {
        this.productUseOrNot = productUseOrNot;
    }
}
