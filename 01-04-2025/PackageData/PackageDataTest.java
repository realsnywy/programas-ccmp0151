package PackageData;

public class PackageDataTest {
    public static void main(String args[]) {
        PackageData packageData = new PackageData();
        System.out.printf("Depois de instanciado:\n%s\n", packageData);
        packageData.number = 77;
        packageData.string = "Goodbye";
        System.out.printf("\nDepois de alterar os valores:\n%s\n", packageData);
    }
}