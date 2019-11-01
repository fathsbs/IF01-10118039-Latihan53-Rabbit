/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang memberikan informasi tentang seekor kelinci    
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Rabbit extends Animal {

    private final String color;
    private final String name;

    public Rabbit(String name, boolean vegetarian, String eats, int noOfLegs, String color) {

        super(vegetarian, eats, noOfLegs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
