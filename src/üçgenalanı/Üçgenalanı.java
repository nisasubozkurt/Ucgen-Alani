/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package üçgenalanı;
import java.util.Scanner;
public class Üçgenalanı {

    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);
        
        int kenar1,kenar2,kenar3;
        int u;
        int alan;
        
        System.out.print("1. Kenarı giriniz: ");
        kenar1 = giris.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2 = giris.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        kenar3 = giris.nextInt();
        
        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı = " + alan);  
    }
}
