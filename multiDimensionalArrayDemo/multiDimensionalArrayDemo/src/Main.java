public class Main {
    public static void main(String[] args) {
        String[][] cities =  new String[2][2];

        cities [0][0] = "istanbul";
        cities [0][1] = "balıkesir";
        cities [1][0] = "elazığ";
        cities [1][1] = "malatya";

        for (int i = 0; i<2; i++){
            System.out.println("************");
            for (int j = 0; j<2; j++){
                System.out.println(cities[i][j]);
            }

        }
    }
}