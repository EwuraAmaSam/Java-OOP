public class Lottery{
    public static void main(String[] args){

        int[][] lottery = new int[3][2];
        lottery[0][0] = 1;
        lottery[0][1] = 2;
        lottery[1][0] = 3;
        lottery[1][1] = 4;
        lottery[2][0] = 5;
        lottery[2][1] = 6;

        for (int row = 0; row < 3; row++){
            for (int column = 0; column < 2; column++){
                System.out.println(lottery[row][column] + " ");
            }
        }


        String[][] cars = {{"Kantanka", "BMW"}, {"Lambo", "Kia"}, {"Ferrari", "Innosson"}};

        for (int rw = 0; rw < cars.length; rw++){
            for (int col = 0; col < cars[rw].length; col++){
                System.out.println(cars[rw][col]);
            }
        }






    }

}