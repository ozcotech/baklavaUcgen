import java.util.Scanner;
/**
 * baklava
 */
public class baklava {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Bir Sayı Giriniz: ");
    int basamakSayisi = input.nextInt();
    
    for (int birinciDongu = 1; birinciDongu <= basamakSayisi; birinciDongu++){
      
      for (int birinciBosluk = 1; birinciBosluk <= (basamakSayisi - birinciDongu); birinciBosluk++){
        System.out.print(" ");
      }//1'den başlıyor girilen sayıya kadar dönüyor ve çıktı

      //yukarıdaki döngüden çıktı ve aşağıdaki döngüye girdi ve 1 yıldız basarak başladı
      for (int ikinciYildiz = 1; ikinciYildiz <= (2 * birinciDongu) - 1; ikinciYildiz++){
        System.out.print("*");
      }
      //1 yıldızı bastı ve bir alt satıra geçecek
      System.out.println(); // bir alt satıra geçti

    }

    // Yukarıda "girilen sayı" kadar döngüler çalıştı bundan sonrası tam tersi yani 2. aşama
    for (int ikinciDongu = 1; ikinciDongu < basamakSayisi; ikinciDongu++){
      for (int ikinciBosluk = 1; ikinciBosluk <= ikinciDongu; ikinciBosluk++){
        System.out.print(" ");
      }
      for (int ikinciYildiz = 1; ikinciYildiz <= (2 * (basamakSayisi - ikinciDongu)) - 1; ikinciYildiz++){
        System.out.print("*");
      }
      
      System.out.println();
      
    }
    

    input.close();
  }
  
}