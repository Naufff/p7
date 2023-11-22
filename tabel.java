/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author naufa
 */
import java.util.Scanner;
public class tabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int i, j;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.printf("%d x %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }
    } 
}
