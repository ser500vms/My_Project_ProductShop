import java.util.ArrayList;
import java.util.List;

public abstract class Shell {
    private List<Product> productOnTheShell= new ArrayList<Product>();
    private int shellId;
    private int shellSectionVolume;
    private int shellVolume;
    private String shellClassifier;
    private boolean shellDemensionTedecter;

    private double takeDemension;

    public List<Product> getProductOnTheShell() {
        return productOnTheShell;
    }

    public void setProductOnTheShell(List<Product> productOnTheShell) {
        this.productOnTheShell = productOnTheShell;
    }

    public int getShellId() {
        return shellId;
    }

    public void setShellId(int shellId) {
        this.shellId = shellId;
    }

    public int getShellSectionVolume() {
        return shellSectionVolume;
    }

    public void setShellSectionVolume(int shellSectionVolume) {
        this.shellSectionVolume = shellSectionVolume;
    }

    public String getShellClassifier() {
        return shellClassifier;
    }

    public void setShellClassifier(String shellClassifier) {
        this.shellClassifier = shellClassifier;
    }

    public Shell(int shellId, int shellSectionVolume, int shellVolume, String shellClassifier) {
        this.shellId = shellId;
        this.shellSectionVolume = shellSectionVolume;
        this.shellVolume = shellVolume;
        this.shellClassifier = shellClassifier;
    }

    public void addProductToShell(Product product){
        while (productOnTheShell.size()!= shellSectionVolume){
            productOnTheShell.add(product);
        }
    }

    public void removeProductFromShell(Product product, VolumeDetector volumeDetector) {
        double startDemension = product.getProductWeight() * productOnTheShell.size();
        double endDemension = 0;
        double count = 0;
        if (volumeDetector.isVolumeSignal()){
            volumeDetector.setVolume(3120);
            endDemension = startDemension - volumeDetector.getVolume(); // take demension we take from detectrs by getVolume
            count = (startDemension - endDemension) / product.getProductWeight();
            while (count>0) {
                productOnTheShell.remove(product);
                count--;
            }
        }
        if (signalToTakeNewProducts(product)){
            System.out.println("Need to add new product");
            addProductToShell(product);
        }
    }

    public boolean signalToTakeNewProducts(Product product){
        boolean signal;
        int volume = getShellSectionVolume();
        signal = productOnTheShell.size() <= (volume / 2);
        return signal;
    }

    @Override
    public String toString() {
        return "Shell{" +
                "productOnTheShell=" + productOnTheShell.size() +
                ", shellId=" + shellId +
                ", shellVolume=" + shellSectionVolume +
                ", shellClassifier='" + shellClassifier + '\'' +
                '}';
    }

}
