import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fizik,kimya,biyoloji,tarih,turkce,matematik,muzik;

        Scanner ders = new Scanner(System.in);
        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = ders.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = ders.nextInt();

        System.out.println("Biyoloji Notunuzu Giriniz:");
        biyoloji = ders.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = ders.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = ders.nextInt();

        System.out.println("Matematik Notunuzu Giriniz:");
        matematik = ders.nextInt();

        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = ders.nextInt();

        int toplam = (fizik + kimya + biyoloji + tarih + turkce + matematik + muzik);
        double sonuc = toplam / 7 ;

        boolean basarili = sonuc >= 50;

        System.out.println("Ortalamanız: " + sonuc);

        System.out.println(basarili ? "Geçti" : "Kaldı");

        }
    }