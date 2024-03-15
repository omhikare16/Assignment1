/*Write a program to check if the given number is divisible by 2,5,10 or not, if not then
print a message “Is Not Divisible By 2,5,10”.(take hardcoded values)*/
class Code8{
	public static void main(String[] args){
		int num=10;
		if(num%2==0 && num%5==0 && num%10==0){
			System.out.println(num + " number is divisible by 2,5,10");
		}
		else{
			System.out.println(num + "number is not divisible by 2,5,10");
		}
		int num1=15;
                if(num1%2==0 && num1%5==0 && num1%10==0){
                        System.out.println(num1 + " number is divisible by 2,5,10");
                }
                else{
                        System.out.println(num1 + "number is not divisible by 2,5,10");
                }
	}
}

