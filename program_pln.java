import java.util.Scanner;  
public class program_pln {  
    public static void main(String[] args) {  
        System.out.println("Program penghitung pemakaian listrik sederhana");  
        Scanner input = new Scanner(System.in);  
        String nama ;  
        System.out.print("nama\t\t\t:");  
        nama = input.nextLine(); 
        int a, b, c ;  
        System.out.print("Masukkan tipe rumah\t:");  
        a = input.nextInt();  
        System.out.print("Masukkan meteran pemakaian\t:");  
        b = input.nextInt();  
        System.out.print("Masukkan pembayaran\t:");  
        c = input.nextInt();   
        int pemakaian, tarif, bayar, total, kembalian ;  
        pemakaian = a - b;  
        total = pemakaian + c;   
        bayar = total + a + b; 
        kembalian = total - c; 
        System.out.println("===================PLN Java===================");  
        System.out.println("Nama\t\t\t:" + nama);  
        System.out.println("Pemakaian bulan ini\t:" + pemakaian + " Kwh meter");  
        System.out.println("Total harga\t\t:Rp " + total + ",-");  
        System.out.println("Total bayar\t\t:Rp " + bayar + ",-");  
        System.out.println("kembalian\t\t:Rp " + kembalian + ",-");
        System.out.println("==============================================");  
    }  
}