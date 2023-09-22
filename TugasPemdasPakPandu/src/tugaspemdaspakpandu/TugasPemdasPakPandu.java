package tugaspemdaspakpandu;
import java.util.Scanner;
public class TugasPemdasPakPandu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Masukkan x : ");
       int x = input.nextInt();
       int hasil = x % 2;
       if (hasil == 0) {
        System.out.print("Hasilnya adalah ");
        System.out.println(x = x + 1);
       } else {
        System.out.print("Hasilnya adalah ");    
        System.out.println(x = x + 2);
       }
    }
    
}
