/*Write a program to check whether the given Character is in UPPERCASE (Capital) or
in lowercase. (take hardcoded values)
Input: ch = ‘a’;
Output: a is a lowercase character
Input: ch = ‘A’;
Output: A is an UPPERCASE character*/
class Code4{
	public static void main(String[] args){
		char ch1='a';
		if(97<=ch1 || ch1>=122){
			System.out.println("character entered is lowercase");
		}
		else if(65<=ch1 || ch1>=95){
			System.out.println("character entered is uppercase");
		}
		else{
			System.out.println("character is of special type");
		}
		 char ch2='A';
                if(97<=ch2 || ch2>=122){
                        System.out.println("character entered is lowercase");
                }
                else if(65<=ch2 || ch2>=95){
                        System.out.println("character entered is uppercase");
                }
                else{
                        System.out.println("character is of special type");
                }
	}
}

