/*Write a program to check the day number(1-7) and print the corresponding day of week.
Input : 1
Output: Monday
Input : 7
Output: Sunday
Input : 8
Output: day number must be between 1 to 7!!!!*/
class Code9{
	public static void main(String[] args){
		int Day=1;
		switch(Day){
			case 1:
				System.out.println(Day + "Monday");
				break;
			case 2:
                                System.out.println(Day + "Tuesday");
                                break;
			case 3:
                                System.out.println(Day + "Wednesday");
                                break;
			case 4:
                                System.out.println(Day + "Thursday");
                                break;
			case 5:
                                System.out.println(Day + "Friday");
                                break;
			case 6:
                                System.out.println(Day + "Saturday");
                                break;
			case 7:
                                System.out.println(Day + "Sunday");
                                break;	
			default:
				System.out.println("days must be between 1 to 7!!!! ");
		}
		int Day2=7;
                switch(Day2){
                        case 1:
				System.out.println(Day2 + "Monday");                                                                           break;                                                                                                case 2:                                                                                                               System.out.println(Day2 + "Tuesday");                                                                          break;                                                                                                case 3:                                                                                                               System.out.println(Day2 + "Wednesday");                                                                        break;                                                                                                case 4:                                                                                                               System.out.println(Day2 + "Thursday");                                                                         break;                                                                                                case 5:                                                                                                               System.out.println(Day2 + "Friday");                                                                           break;                                                                                                case 6:                                                                                                               System.out.println(Day2 + "Saturday");                                                                         break;                                                                                                case 7:                                                                                                               System.out.println(Day2 + "Sunday");                                                                           break;                                                                                                default:                                                                                                              System.out.println("days must be between 1 to 7!!!! ");                                       }
	}


}
