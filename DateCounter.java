public class DateCounter{
	public static void main(String args[]){
        try{
            System.out.println("Second Test.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Usage: java DateCounter <year0> <month0> <day0> <year1> <month1> <day1>");
        } catch (IllegalArgumentException e2){
            System.out.println("One or more of the supplied dates is not valid.");
        }
	}
	public static boolean isLeapYear (int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                return true;
            } else {
                if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
	}
	public static int daysInMonth (int month){
        /*if (month = 2){
        	numberOfDays = 28;
        } else if (month = 4 || month = 6 || month = 9 || month = 11){
        	numberOfDays = 30;
        } else {
        	numberOfDays = 31;
        } */
        return 0;
	}
	public static boolean isValidDate (int year, int month, int day){
        return true;
	}
	public static int daysBetween (int year0, int month0, int day0, int year1, int month1, int day1){
        return 0;
	}
	public static String dayOfTheWeek (int year, int month, int day){
        return "word";
	}
}
