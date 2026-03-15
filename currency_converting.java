// Write a program to accept an amount in rupees (LKR) as a command line argument and convert it to US$, Pounds and Euros and display the results as follows:

// 5000 LKR = 38.6817$
// 5000 LKR = 37.6676 Pounds
// 5000 LKR = 24.2295 Euros

// Exchange rates are given bellow:

// Dollar	= 298.26 LKR
//Pound 	= 373.74 LKR
// Euro  	= 309.36 LKR

public class currency_converting {
    public static void main(String[] args){

        // checks whether if the user enters a value or not
        if(args.length<1){
            System.out.println("please enter an amount in ruppees");
            return;
        }

        // get user input
        double ruppees=Integer.parseInt(args[0]);
        
        // convert to currencies
        double dollars=ruppees/298.26;
        double pounds=ruppees/373.74;
        double euro=ruppees/309.36;

        // print the output
        System.out.println(ruppees+" LKR = "+dollars+"$");
        System.out.println(ruppees+" LKR = "+pounds+" Pounds");
        System.out.println(ruppees+" LKR = "+euro+" Euros");

    }
}

// sample output:
// 500
// 5000 LKR = 38.6817$
// 5000 LKR = 37.6676 Pounds
// 5000 LKR = 24.2295 Euros