import java.util.Scanner;

public class Soal4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan bilangan bulat positif
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Memanggil metode untuk melakukan faktorisasi
        faktorisasi(bilangan);

        scanner.close();
    }

    public static void faktorisasi(int bilangan) {
        System.out.print("Faktorisasi " + bilangan + ": ");

        // Faktorisasi bilangan
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;
                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            }
        }

        System.out.println();
    }
}

