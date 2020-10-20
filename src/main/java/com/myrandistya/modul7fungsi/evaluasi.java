/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrandistya.modul7fungsi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class evaluasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    terbesar(100);
    }
    
    public static void terbesar(int bilangan) {
    Scanner scanner = new Scanner (System.in);
    
    int Bilangan[] = new int[100];
        int max=0, A=0, B=0, Tertinggi=0;
        
        System.out.println("Masukkan Jumlah Bilangan : ");
        int in = scanner.nextInt();
        
        for(int x=1; x<=in; x++){
            System.out.println("Masukkan Bilangan ke "+x+": ");
            Bilangan[x] = scanner.nextInt();
          
        }
        
        for(int x=1; x<=in; x++) {
            if(Bilangan[x]>Tertinggi){
                Tertinggi = Bilangan[x];
            }
        }
        System.out.println("Bilangan terbesar adalah : "+Tertinggi);
        
    
        
}
    
}
