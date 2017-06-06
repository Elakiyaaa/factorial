package factorial;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int i;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
			}
System.out.print("the value"+fact);
	}

}
