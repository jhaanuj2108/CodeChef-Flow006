/*Solution: 15887948
CodeChef submission 15887948 (JAVA) plaintext list. Status: AC, problem FLOW006, contest CODECHEF. By jhaanuj2108 (jhaanuj2108), 2017-10-18*/ 00:04:44.
import java.util.Scanner;
class FLOW006 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,sum;
		for(int i=0;i<t;i++){
			sum=0;
			n = sc.nextInt();
		    while(n!=0){
				sum = sum+n%10;
				n = n/10 ; 
			}
 
		System.out.println(sum);
		}
	}
} 
