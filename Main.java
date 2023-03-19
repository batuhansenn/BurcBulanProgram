import javax.net.ssl.SSLContextSpi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum gününüzü girin (GG.AA): ");
        String dogumGunu = scanner.nextLine();

        // Doğum günü bilgisini ay ve gün olarak ayırma
        String[] tarih = dogumGunu.split("\\.");
        int gun = Integer.parseInt(tarih[0]);
        int ay = Integer.parseInt(tarih[1]);

        // Burç belirleme işlemi
        String burc = "";
        if (ay == 1) {
            if (gun <= 19) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else if (ay == 2) {
            if (gun <= 18) {
                burc = "Kova";
            } else {
                burc = "Balık";
            }
        } else if (ay == 3) {
            if (gun <= 20) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (ay == 4) {
            if (gun <= 19) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        } else if (ay == 5) {
            if (gun <= 20) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (ay == 6) {
            if (gun <= 21) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }
        } else if (ay == 7) {
            if (gun <= 22) {
                burc = "Yengeç";
            } else {
                burc = "Aslan";
            }
        } else if (ay == 8) {
            if (gun <= 22) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        } else if (ay == 9) {
            if (gun <= 22) {
                burc = "Başak";
            } else {
                burc = "Terazi";
            }
        } else if (ay == 10) {
            if (gun <= 22) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }
        } else if (ay == 11) {
            if (gun <= 21) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }
        } else if (ay == 12) {
            if (gun <= 21) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        }

        System.out.println("Burcunuz: " + burc);
    }
}