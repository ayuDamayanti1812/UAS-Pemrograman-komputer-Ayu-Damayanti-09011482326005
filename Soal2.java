import java.util.Scanner;
 public class Soal2 {

    private static final String username = "adminAyu";
    private static final String password = "1801021";

    public static void main(String[] args) {
        // Deklarasi variabel
        String inputUsername;
        String inputPassword;

        try (// Membaca input dari pengguna
        Scanner input = new Scanner(System.in)) {
            System.out.print("Username: ");
            inputUsername = input.nextLine();
            System.out.print("Password: ");
            inputPassword = input.nextLine();
        }
        // Melakukan autentikasi
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}
