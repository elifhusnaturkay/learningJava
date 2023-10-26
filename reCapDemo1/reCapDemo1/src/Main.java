public class Main {
    public static void main(String[] args) {
        double[] myList = {1.0, 1.1, 1.2, 1.3};
        double total = 0;
        double max = myList[0];

        for (double number:myList) {

            if (max < number) {
                max = number;
            }
                total = total + number;
            System.out.print("/ " + number);
        }
        System.out.println();
        System.out.println("en büyük sayı:" + max);
        System.out.println("toplam:" + total);
        //değişken üzerinden dolaşılır ve her bir değişken adı ekrana yazdırılır.
    }
}