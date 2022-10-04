import java.util.Scanner;

public class BiletHesap {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Yolculuk Tipini Seçiniz,Seçtiğiniz Numarayı Giriniz: \n1)Tek Yön \n2)Gidiş Dönüş");
        byte sel=scan.nextByte();

        System.out.println("Yolculuğunuzun kaç kilometre olacağınızı yazınız:");
        double km= scan.nextDouble();

        System.out.println("Lütfen Yaşınızı Giriniz:");
        double age= scan.nextDouble();

        double price;

        if (km<0) System.out.println("Hatalı mesafe girişi yaptınız.Lütfen 0'dan büyük değer giriniz. ");
        else {

        switch (sel) {

            case 1:

                if (age < 0 || age > 120)
                    System.out.println("Hatalı yaş verisi girdiniz. 0-120 arasında değer giriniz");

                else if (age >= 0 && age < 12) {

                    price = (km * 0.10) * 0.5;
                    System.out.println("Tek Yön Bilet Fiyatı: " + price + "\nİndirim Uygulanmıştır.");

                } else if (age <= 24) {

                    price = (km * 0.10) * 0.9;
                    System.out.println("Tek Yön Bilet Fiyatı: " + price + "\nİndirim Uygulanmıştır.");

                } else if (age >= 65 && age <= 120) {

                    price = (km * 0.10) * 0.7;
                    System.out.println("Tek Yön Bilet Fiyatı: " + price + "\nİndirim Uygulanmıştır.");

                } else {
                    price = (km * 0.10);
                    System.out.println("Tek Yön Bilet Fiyatı: " + price);
                }
                break;

            case 2:

                if (age < 0 || age > 120)
                    System.out.println("Hatalı yaş verisi girdiniz. 0-120 arasında değer girilebilir");

                else if (age >= 0 && age < 12) {
                    price = (((km * 0.10) * 0.5) * 0.8) * 2;
                    System.out.println("Gidiş Dönüş Bilet Fiyatı: " + price + "\nİndirim Uygulanmıştır.");

                } else if (age <= 24) {
                    price = (((km * 0.10) * 0.9) * 0.8) * 2;
                    System.out.println("Gidiş Dönüş Bilet Fiyatı: " + price + "\nİndirim Uygulanmıştır.");

                } else if (age >= 65 && age <= 120) {
                    price = (((km * 0.10) * 0.7) * 0.8) * 2;
                    System.out.println("Gidiş Dönüş Bilet Fiyatı: " + price + "\nİndirim Uygulanmıştır.");

                } else {
                    price = ((km * 0.10) * 0.8) * 2;
                    System.out.println("Gidiş Dönüş Bilet Fiyatı: " + price + "\nİndirim Uygulanmıştır.");
                }

                break;

            default:
                System.out.println("Hatalı Veri Girişi Yaptınız.");
        }
        }
    }
}
