import java.util.Scanner;
public class Etkinlik {
    public static void main (String[] args) {

        int heat ;
        Scanner input= new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();
        if (heat<25){
             if (heat<=15 && heat>=10) {
                 System.out.print("Piknik veya sinemaya gidebilirsiniz !!");
             }
             if (heat<5){
                 System.out.print("Kayak yapınız !!");
                              }
             if (heat>15 ) {
                 System.out.print("ne duruyorsun ? PİKNİK YAPSANA PİKNİK YAPSANA !!!");
             }
            }else if (heat<=15 && heat>=10){
            System.out.print("Piknik veya sinemaya gidebilirsiniz !!");
        }
        else {
            System.out.print("Çiimmege git. Kroca yüz demek !!!");
        }
    }
}
