public class CountDownToArgs{
	public static void main(String args[]){
		try{
			int startNum = Integer.parseInt(args[0]);
			if(startNum < 0){
			    System.out.println("Cannot accept negative numbers.");
			}
	                for(int i = startNum; i >= 0; i--){
	                    System.out.println(i + " ");
	                }
		} catch (ArrayIndexOutOfBoundsException e){
		    System.out.println("No Arguments Provided.");
		} catch (NumberFormatException e2) {
	        System.out.println("Please only insert integers.");
	        }
        }
}
