public class Main {
    //java case sensitive bir dil, Scanner&scanner farklı!
    public static void main(String[] args) {

        int productCount = 5 ;
        String productRange = "my product is:";
        // solid bir geliştirme için tanımlamalar şart, değiştirilebililik
        //ve kullanılabilirlik sağlar ÖNEMLİ!! REUSABILITY!!
        System.out.println("my product is:" + productCount);
        //+ işareti String +int
        System.out.println(productRange + productCount);
    }
}
