public class Main {
    public static void main(String[] args) {
        String product1 = "apple";
        String product2 = "pineapple";
        String product3 = "grapes";

        //dizi yazılacağı zaman veri tipinin yanına [] açılır
        String[] products = new String[3];
        //eleman sayısı sondaki arrayın içine yazılır
        products[0] = "apple"; //ilk sayı 0dan başlar
        products[1] = "pineapple";
        products[2] = "grapes";

        for(int k = 0; k < products.length; k++){
            System.out.println(products[k]);
        }

        System.out.println("**************");
        //başka bir çözüm
        for (String product:products) {
            System.out.println(product);
        }

        //BRACEKTS
        /*
        Köşeli parantezler, bir dizi tanımlarken kullanılır.
        exmp.
        int[] numbers = {1, 2, 3, 4, 5};


        Dizi elemanlarına erişmek için, elemanın indeksi köşeli parantez içinde kullanılır.
        exmp.
        int ikinciSayi = numbers[1]; // Dizinin ikinci elemanına (indeks 1) erişmek


        Köşeli parantezler, çok boyutlu dizilerde veya
        dinamik olarak oluşturulan dizilerde boyutları belirlemek için kullanılabilir
        exmp.
        int[][] ikiBoyutluDizi = new int[3][4]; // 3x4 boyutunda iki boyutlu dizi

        */
    }
}