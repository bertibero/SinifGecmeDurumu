import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int dersSayisi=0,total=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz :");
        mat = input.nextInt();
        if ((mat>0) && (mat<=100)){
            total = total + mat;
            dersSayisi++;
        }

        System.out.print("Fizik notunu giriniz :");
        fizik = input.nextInt();
        if ((fizik>0) && (fizik<100)){
            total = total + fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunu giriniz :");
        turkce = input.nextInt();
        if ((turkce>0) && (turkce<100)){
            total = total + turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunu giriniz :");
        kimya = input.nextInt();
        if ((kimya>0) && (kimya<100)){
            total = total + kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunu giriniz :");
        muzik = input.nextInt();
        if ((muzik>0) && (muzik<100)){
            total = total + muzik;
            dersSayisi++;
        }

        double average = (total / dersSayisi);
        if (average >= 55){
            System.out.println("Tebrikler sınıfı geçtiniz !");

        }else{
            System.out.println("Sınıfta kaldınız !");
        }
        System.out.println("Not Ortalamanız : "+ average);


    }
}