/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author naufa
 */
public class prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j;

        System.out.println("Deret bilangan prima dari 0 - 20:");
        for (i = 2; i <= 20; i++) {
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }

            if (j == i) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDeret bilangan bukan prima dari 0 - 20:");
        for (i = 0; i <= 20; i++) {
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }

            if (j != i) {
                System.out.print(i + " ");
            }
        }
    }
}
