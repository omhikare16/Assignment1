/*Write a program to check whether the given number is divisible by 3 or 7.
Input: 15
Output: 15 is divisible by 3

Input: 28
Output: 28 is divisible by 7
Input: 20
Output: 20 is neither divisible by 3 nor by 7.*/
class Code6{
	public static void main(String[] args){
		int num1=15;
		if(num1%3==0){
			System.out.println(num1 + "is  divisible by 3");
		}
		else if(num1%7==0){
			System.out.println(num1+ "is divisible by 7");
		}
		else{
			System.out.println(num1+"is neither divisible by 3 or7");
		}
		int num2=28;
                if(num2%3==0){
                        System.out.println(num2+ "is  divisible by 3");
                }
                else if(num2%7==0){
                        System.out.println(num2+ "is divisible by 7");
                }
                else{
                        System.out.println(num2+"is neither divisible by 3 or7");
                }
		int num3=20;
                if(num3%3==0){
                        System.out.println(num3+ "is  divisible by 3");
                }
                else if(num3%7==0){
                        System.out.println(num3+ "is divisible by 7");
                }
                else{
                        System.out.println(num3+"is neither divisible by 3 or7");
                }
	}
}

