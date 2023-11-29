
public class Main {
    public static void main(String[] args) {
        Wordrobe wordrobe1 = new Wordrobe(1, "For eating products", 30);

        Coocies nestle1 = new Coocies(1, "Nestle -> Dark Fantasy","Cookies",
                0.25, 300, 120);
        Coocies nestle2 = new Coocies(2, "Nestle -> White Fantasy","Cookies",
                0.25, 300, 120);
        Coocies nestle3 = new Coocies(3, "Nestle -> Big Bananza","Cookies",
                0.5, 500, 320);

        KendyShell CokiesShell1 = new KendyShell(1, 20, 5, "Shell for cookies");

        wordrobe1.addShellToWordrobe(CokiesShell1);
        System.out.println(wordrobe1);

        CokiesShell1.addProductToShell(nestle1);
        System.out.println(CokiesShell1);

        VolumeDetector volumeDetector1 = new VolumeDetector(1);
        volumeDetector1.setVolumeSignal(true);
        CokiesShell1.removeProductFromShell(nestle1, volumeDetector1);
        System.out.println(CokiesShell1);



    }
}