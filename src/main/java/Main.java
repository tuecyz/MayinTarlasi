
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugce
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.println("Mayın Tarlasına Hoş Geldiniz!");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        System.out.println("Satır sayısı: ");
        row=scan.nextInt();
        System.out.println("Sütun sayısı: ");
        column=scan.nextInt();
        
        MayinTarlasi mayin = new MayinTarlasi(row, column);
        mayin.run();
    }
    
            
}
