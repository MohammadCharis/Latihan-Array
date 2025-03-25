package latihanarray;

import javax.swing.JOptionPane;

public class LatihanArray {

    public static void main(String[] args) {
       int Data [][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        
        System.out.println("========= Array Awal =========");
        for (int a= 0;a < Data.length; a++){
            for (int b = 0; b < Data[a].length; b++){
                System.out.print(Data [a][b] + "   ");
            }
              System.out.println();
        }
       
        double total= 0;
        double ratarata = 0;
        int jumlahelemen = 0;
        
        for (int a = 0; a < Data.length; a++){
            for (int b = 0; b < Data[a].length; b++){
                total += Data [a][b];
                jumlahelemen++;
            }
        }
        ratarata = total/jumlahelemen;
                System.out.println("\nrata rata array : " + ratarata);
            
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris elemen yang ingin diganti (0 atau 1) : "));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kolom elemen yang ingin diganti (0 atau 7) : "));
        int nilaibaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru : "));
        
        
        if (baris >= 0 && baris <Data.length && kolom >= 0 && kolom <Data[0].length){
            System.out.println("\nMengubah Data Array Baris [" + baris + "] Kolom [" + kolom + "] Dari " + Data[baris][kolom] + " Menjadi Nilai Baru  [" + nilaibaru + "]");
            Data [baris][kolom] = nilaibaru;
        }else{
           JOptionPane.showMessageDialog(null,"Perubahan tidak dilakukan, Tolong masukkan perintah dengan benar.");
        return;
        }
        System.out.println("\n=== Array setelah perubahan ===");
        for (int a = 0; a< Data.length; a++){
            for (int b = 0; b< Data [a].length; b++){
                System.out.print(Data[a][b] + "   ");
            }
            System.out.println();
        }
        int totalkolomganjil = 0;
        for (int a = 0; a< Data.length; a++){
            for (int b = 1; b< Data [a].length; b += 2){
                totalkolomganjil += Data[a][b];
            }
        }
        System.out.println("\nJumlah elemen dengan indeks kolom ganjil : " + totalkolomganjil);
    }
}
    
    

