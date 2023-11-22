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
public class nakayam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String ayam = "Anak ayam turun ";
        String mati = ", mati satu tinggal ";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(ayam + i + mati + (i - 1));
        }

        System.out.println("Mati satu tinggal induknya.");
    }   
}