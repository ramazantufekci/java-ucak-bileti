import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double kmUcret=0.10,normalTutar,yasIndirimi=0,biletIndirimi=0,indirimliTutar,toplamTutar;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = girdi.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = girdi.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş)");
        yolculukTipi = girdi.nextInt();

        if (mesafe<0||yolculukTipi<1||yolculukTipi>2){
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            normalTutar = mesafe*kmUcret;
            if(yas>65){
                yasIndirimi = normalTutar*0.30;
            } else if (yas > 12 && yas < 24) {
                yasIndirimi = normalTutar*0.10;
            } else if (yas < 12) {
                yasIndirimi = normalTutar*0.50;
            }else{
                yasIndirimi=0;
            }
            indirimliTutar = normalTutar-yasIndirimi;
            if(yolculukTipi==2){
                biletIndirimi = indirimliTutar*0.20;
                toplamTutar = (indirimliTutar-biletIndirimi)*2;
            }else{
                toplamTutar = indirimliTutar;
            }
            System.out.println("Toplam Tutar : "+toplamTutar);



        }
    }
}
