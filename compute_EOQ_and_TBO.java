// problem:
// In inventory management, the Economic Order Quantity for a single item is given by,
//  EOQ = square root of [(2*demand rate*setup cost)/holding cost per unit time]
// and the optional Time Between Orders is given by,
// TBO = square root of [(2*setup cost)/(demand rate* holding cost per item per unit time)]
// Write a program to compute EOQ and TBO, once the demand rate (items per unit time), setup costs (per order), and the holding cost(per item per unit time) are given as command line arguments.

public class compute_EOQ_and_TBO {
    public static void main(String[] args){
        // handle if user does not enter all the inputs
        if(args.length<3){
            System.out.println("Please enter all the inputs");
            return;
        }

        // get user input
        double demandRate=Double.parseDouble(args[0]);
        double setupCost=Double.parseDouble(args[1]);
        double holdingCost=Double.parseDouble(args[2]);

        // calculate EOQ and TBO
        double EOQ=Math.sqrt((2*demandRate*setupCost)/holdingCost);
        double TBO=Math.sqrt((2*setupCost)/(demandRate*holdingCost));


        // show the output
        System.out.println("The Economic order quality is: "+EOQ);
        System.out.println("The Time between orders is: "+TBO);


    }
}

// sample output:

// The Economic order quality is: 365.14
// The Time between orders is: 1.82