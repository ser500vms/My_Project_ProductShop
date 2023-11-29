public abstract class Product {
    private int productID;
    private String productName;
    private String productClassifier;
    private double productVolumeOnShell;
    private double productPrice;
    private double productWeight;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductClassifier() {
        return productClassifier;
    }

    public void setProductClassifier(String productClassifier) {
        this.productClassifier = productClassifier;
    }

    public double getProductVolumeOnShell() {
        return productVolumeOnShell;
    }

    public void setProductVolumeOnShell(double productVolumeOnShell) {
        this.productVolumeOnShell = productVolumeOnShell;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public Product(int productID, String productName, String productClassifier, double productVolumeOnShell,
                   double productPrice, double productWeight) {
        this.productID = productID;
        this.productName = productName;
        this.productClassifier = productClassifier;
        this.productVolumeOnShell = productVolumeOnShell;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productClassifier='" + productClassifier + '\'' +
                ", productVolumeOnShell=" + productVolumeOnShell +
                ", productPrice=" + productPrice +
                ", productWeight=" + productWeight +
                '}';
    }
}
