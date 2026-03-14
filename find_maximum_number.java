// Higher diploma in Information Technology - Questions
// Problem:
// Write another program to get 2 values as command line arguments and find the Maximum 
// of those 2 using conditional operator.



public class find_maximum_number {
    public static void main(String[] args){
        if(args.length<2){
            System.out.println("Please enter two values");
            return;
        }

        int no1=Integer.parseInt(args[0]);
        int no2=Integer.parseInt(args[1]);

        int max;

        if(no1>no2){
            max=no1;
        }
        else{
            max=no2;
        }

        System.out.println("The maximum number is: "+max);

    }
}

// sample output:
// The maximum number is: 20
