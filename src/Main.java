import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilo,boy,sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=input.nextDouble();

        sonuc=kilo/Math.pow(boy,2);

        System.out.println("Vücut Kitle İndeksiniz : "+ sonuc);
    }
}
