package np.com.devish.hamrobazaarreplica.model;

public class Products {
    private int id;
    private String productName;
    private int productImage;
    private String productPrice;
    private String productUseOrNot;


    public Products(String productName, int productImage, String productPrice, String productUseOrNot) {
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

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
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
