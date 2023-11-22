/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author naufa
 */
public class ganjilgenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;

        System.out.println("Deret bilangan ganjil dari 0 - 20:");
        for (i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nDeret bilangan genap dari 0 - 20:");
        for (i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}
