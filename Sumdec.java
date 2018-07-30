package janani;
import java.util.Scanner;
public class Sumdec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0,n,i;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
for(i=0;i<=n;i++){
	sum=sum+i;
}
System.out.println(sum);
	}

}
