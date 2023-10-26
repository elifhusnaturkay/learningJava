import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean devam = true;

        // Girilen karakteri büyük harfe dönüştür
        //char uppercaseCharacter = grade.toUpperCase(grade);

        while (devam) {
            System.out.println("not girişi yapınız");
            System.out.println("çıkmak için 'x' basınız.");
            //toUpperCase sayesinde küçük harf girilse dahi büyük harf sayacak.
            String input = keyboard.next().toUpperCase();


            if (input.equals("X")) {
                devam = false;
                System.out.println("sistem kapatılıyor.");
            } else {
                char grade = input.charAt(0);
                switch (grade) {
                    case 'A':
                        System.out.println("harika! geçtiniz.");
                        break;
                    case 'B':
                        System.out.println("çok iyi! geçtiniz.");
                        break;
                    case 'C':
                        System.out.println("iyi! geçtiniz.");
                        break;
                    case 'D':
                        System.out.println("fena değil! geçtiniz.");
                        break;
                    case 'F':
                        System.out.println("kaldınız pü.");
                        break;
                    default:
                        System.out.println("geçersiz giriş.");

                }
            }
        }
    }
}
