/*Write a program to check whether the given number is divisible by 7 or not.
Input : 105
Output: Divisible by 7
Input: -31
Output: Not divisible by 7*/
class Code5{
	public static void main(String[] args){
		int num=105;
		if(num%7==0){
			System.out.println("number is divisible");
		}
		else{
			System.out.println("number is not divisible");
		}

		int num2=-31;
		 if(num2%7==0){
                        System.out.println("number is divisible");
                }
                else{
                        System.out.println("number is not divisible");
                }
	}
}
