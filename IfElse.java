import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double uangdiATM = 1000000;
        double sisaUang = 0;

        System.out.print("Barang Yang Ingin Di beli : ");
        int barang = scanner.nextInt();

        if (barang == 1) {
            sisaUang = uangdiATM - 250000; //barang1 = kebutuhan pokok
            System.out.println("Uang yang tersisa adalah " + sisaUang);
        } else if (barang == 2) {
            sisaUang = uangdiATM - 150000; //barang2 = skincare
            System.out.println("Uang yang tersisa adalah " + sisaUang); 
        } else if (barang == 3) {
            sisaUang = uangdiATM - 200000; //barang3 = haircare
            System.out.println("Uang yang tersisa adalah " + sisaUang); 
        } else if (barang == 4) {
            sisaUang = uangdiATM - 200000; //barang4 = buku atau novel
            System.out.println("Uang yang tersisa adalah " + sisaUang); 
        } else {
            System.out.println("Jangan lupa berhemat :)");
        }
    }


}