import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        Random generate = new Random();      //ramdom gera um número aleatório


       // int i = 0;
        //while (i < 10) {         // while = (true),   loop infinity
          //  i++;
           // int number =generate.nextInt(60);
            //System.out.println(number);                       //com while

       // }
        for(int i = 0; i < 8; i++){
            int number =generate.nextInt(60);
            System.out.println(number);                        //com for
        }
    }
}
