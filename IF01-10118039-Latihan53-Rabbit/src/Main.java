/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang memberikan informasi tentang seekor kelinci  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rbt = new Rabbit("Peter", false, "Grass", 4, "Grey");
        System.out.printf("Hello, His name is %s%n", rbt.getName());
        System.out.printf("%s is Vegetarian? %b%n", rbt.getName(), rbt.vegetarian);
        System.out.printf("%s eats %s%n", rbt.getName(), rbt.getEats());
        System.out.printf("%s has %d legs%n", rbt.getName(), rbt.getNoOfLegs());
        System.out.printf("%s color is %s%n", rbt.getName(), rbt.getColor());
    }

}
