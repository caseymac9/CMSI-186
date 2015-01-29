public class ChangeMaker{
    public static void main(String args[]){
    	try{
            int argument = Integer.parseInt(args[0]);
            if (argument < 0){
                System.out.println("Cannot make change for a negative amount.");
            } else {
                int[] changeArray = getChange(argument);
                System.out.println("Quarters: "+ changeArray[0]+ ", Dimes: "+ changeArray[1]+ ", Nickels: "+ changeArray[2]+ ", Pennies: "+ changeArray[3]);
            }
    	} catch (ArrayIndexOutOfBoundsException e){
    		System.out.println("Usage: java ChangeMaker <amount in cents>");
    	} catch (NumberFormatException e2){
    		System.out.println("Please only insert integers.");
    	}
    }
    public static int getQuarters (int cents){
        return cents / 25;
    }
    public static int getDimes (int cents){
        return cents / 10;
    }
    public static int getNickels (int cents){
        return cents / 5;
    }
    public static int getPennies (int cents){
        return cents / 1;
    }
    public static int[] getChange (int cents){
        int leftover = cents - (25 * getQuarters(cents));
        int leftover2 = leftover - (10 * getDimes(leftover));
        int leftover3 = leftover2 - (5 * getNickels(leftover2));
        int[] changeArray = new int[4];
        changeArray[0] = getQuarters(cents);
        changeArray[1] = getDimes(leftover);
        changeArray[2] = getNickels(leftover2);
        changeArray[3] = getPennies(leftover3);
        return changeArray;
    }
}
