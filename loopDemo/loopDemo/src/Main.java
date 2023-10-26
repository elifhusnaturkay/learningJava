public class Main {
    public static void main(String[] args) {
        //FOR DÖNGÜSÜ
        //for (başlangıç değeri(sayaç tanımı); koşul; artırma/değişiklik)
        for (int i = 1; i<=10; i++){
            //i++, bir arttır demek, i=i+1 de denebilir.
            System.out.println(i);
        }
        System.out.println("sistem kapatılıyor.");

        //for döngüsü, belirli bir aralıkta veya belirli bir sayıda tekrarlanması gereken işlemlerde
        //while döngüsü ise bir koşul doğru olduğu sürece işlemleri tekrarlar.

        double k = 100;

        for (k=10; k<=1000; k=k*2){
            System.out.print("/" + k + "for");
        }

        //WHILE DÖNGÜSÜ
        while (k > 1){
            k = k / 2;
            System.out.println(k + "while");
        }

        /*
        while döngüsü
        while (koşul) {
            -Döngü içeriği-
        }
        do-while döngüsü
        do {
            -Döngü içeriği-
        } while (koşul);
         */

        //DO-WHILE DÖNGÜSÜ
        do {
            k = k / 2;
            System.out.println(k + "do-while");
        } while (k>1);

        //do-while döngüsü, döngü içeriğini en az bir kez çalıştırır ve sonra koşulu kontrol eder,
        //while döngüsü ise koşulu önce kontrol eder ve eğer koşul sağlanmazsa hiç çalışmaz.
    }
}