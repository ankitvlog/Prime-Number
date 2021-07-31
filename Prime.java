/* Whether number is prime or not */

import java.util.Scanner;

class Test{
Public static void main(string[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value");
int num = sc.nextInt();
boolean isPrime = true;
for(int i = 2;i<num;i++){
if(num%i==0){
isPrime = false;
break;
}
}
if(isPrime){
System.out.println(num+"is a Prime number");
}else{
System.out.print(num+"is not a Prime number");
}
