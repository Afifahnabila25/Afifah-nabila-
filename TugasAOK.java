/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugass;

/**
 * Afifah Nabila Devi
 * 235150207111041
 */

import java.util.Scanner;
public class TugasAOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis konversi sistem bilangan:");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Heksadesimal");
        System.out.println("4. Heksadesimal ke Biner");
        System.out.println("5. Desimal ke Heksadesimal");
        System.out.println("6. Heksadesimal ke Desimal");
        System.out.print("Pilihan Anda (1/2/3/4/5/6): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka dalam bentuk biner: ");
                String biner = input.next();
                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil konversi: " + desimal);
                break;

            case 2:
                System.out.print("Masukkan angka dalam bentuk desimal: ");
                int desimalKeBiner = input.nextInt();
                String binerHasil = Integer.toBinaryString(desimalKeBiner);
                System.out.println("Hasil konversi: " + binerHasil);
                break;

            case 3:
                System.out.print("Masukkan angka dalam bentuk biner: ");
                String binerKeHeksadesimal = input.next();
                int desimalHeksadesimal = Integer.parseInt(binerKeHeksadesimal, 2);
                String heksadesimalHasil = Integer.toHexString(desimalHeksadesimal).toUpperCase();
                System.out.println("Hasil konversi: " + heksadesimalHasil);
                break;

            case 4:
                System.out.print("Masukkan angka dalam bentuk heksadesimal: ");
                String heksadesimalKeBiner = input.next();
                int desimalBiner = Integer.parseInt(heksadesimalKeBiner, 16);
                String binerHeksadesimalHasil = Integer.toBinaryString(desimalBiner);
                System.out.println("Hasil konversi: " + binerHeksadesimalHasil);
                break;

            case 5:
                System.out.print("Masukkan angka dalam bentuk desimal: ");
                int desimalKeHeksadesimal = input.nextInt();
                String heksadesimalHasil2 = Integer.toHexString(desimalKeHeksadesimal).toUpperCase();
                System.out.println("Hasil konversi: " + heksadesimalHasil2);
                break;

            case 6:
                System.out.print("Masukkan angka dalam bentuk heksadesimal: ");
                String heksadesimalKeDesimal = input.next();
                int desimalHeksadesimal2 = Integer.parseInt(heksadesimalKeDesimal, 16);
                System.out.println("Hasil konversi: " + desimalHeksadesimal2);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

