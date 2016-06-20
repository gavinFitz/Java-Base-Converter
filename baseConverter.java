import java.util.*;
public class baseConverter
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		int base1 = sc1.nextInt();
		int base2 = sc1.nextInt();
		String num = Integer.toString(sc1.nextInt());
		int value = Integer.parseInt(num, base1);
		String output = Integer.toString(value, base2);
		System.out.println(output);
	}
}