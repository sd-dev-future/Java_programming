// problem:
// Write a program to display the name of the season when the user enters a month of the year in numbers. Eg: 1, 2, 3…12.

// December to February  		Winter
// March to May 			Spring
// June to August  			Summer
// September to November  	Autumn

// (Use if-else and logical operators)


import java.util.Scanner;
public class seasons_of_month {
    public static void main(String[] args){
        // using Scanner objects to get user input
        Scanner s=new Scanner(System.in);

        // get user input
        System.out.print("enter an integer 1-12 : ");
        int month=s.nextInt();

        if(month==12 || month==1 || month==2){
            System.out.println("Winter");
        }
        else if(month>=3 && month<=5){
            System.out.println("Spring");
        }
        else if(month>=6 && month<=8){
            System.out.println("Spring");
        }
        else if(month>=9 && month<=11){
            System.out.println("Spring");
        }
        else{
            System.out.println("Invalid input");
        }

        s.close();
    }
}

// sample output:
// enter an integer 1-12 : 12
// Winter
