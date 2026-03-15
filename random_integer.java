// problen:
// Write a java method call genRandom() to generate 5 Random integer numbers 
// between 1 to 100 and print them on to the screen. Invoke genRandom() inside the main().


import java.util.Random;
public class random_integer {

    // method to generate random numbers
    public static void getRandom(){
        Random r=new Random();

        for(int i=0;i<5;i++){
            int num=r.nextInt(100)+1;  // 1-100
            System.out.println(num);
        }

    }
    public static void main(String[] args){
        
        getRandom();   // invoking the method
    }
}
