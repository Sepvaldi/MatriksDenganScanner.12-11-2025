import  java.util.Scanner;
public class MatriksScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //untuk menulis baris dan kolom matriks
        System.out.println("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        //Baris dan Kolom Matriks A
        int[][] MatriksA = new int[baris][kolom];
        System.out.println("Masukkan angka di Matriks A: ");
        for (int i = 0; i < MatriksA.length; i++) {
            for (int j= 0; j < MatriksA[i].length; j++) {
                System.out.print("MatriksA [" + i + "][" + j + "]: ");
                MatriksA[i][j] = input.nextInt();
            }
            System.out.println();
        }

        //Baris dan Kolom untuk Matriks B
        int[][] MatriksB = new int[baris][kolom];
        System.out.println("Masukkan angka di Matriks B: ");
        for (int i = 0; i < MatriksB.length; i++) {
            for (int j= 0; j < MatriksB[i].length; j++) {
                System.out.print("MatriksB [" + i + "][" + j + "]: ");
                MatriksB[i][j] = input.nextInt();
            }
            System.out.println();
        }

        //untuk menjumlahkan Matriks A dan B
        int HasilJumlah[][]=new int[baris][kolom];
        for(int i = 0; i< MatriksA.length; i++){
            for(int j= 0; j< MatriksA[i].length; j++){
                HasilJumlah[i][j]=MatriksA[i][j]+MatriksB[i][j];
            }
        }
        System.out.println();

        //untuk menampilkan hasil penjumlahan
        System.out.println("Hasil Penjumlahan Matriks A dan B:");
        for(int i = 0; i< HasilJumlah.length; i++){
            for(int j= 0; j< HasilJumlah[i].length; j++){
                System.out.print(HasilJumlah[i][j] + " ");
            }
            System.out.println();
        }


    }
}
