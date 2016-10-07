package hw;
/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/03
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw01_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1;
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一非0正整數");
		n1 =scn.next();
		int a= Integer.parseInt(n1);
		int b=0;
		System.out.print(digits(a,b)+"位數");
		
	}
	public static int digits(int m,int n)
	{
    if(m!=0)
    {
    n++;
	return digits(m/10,n);		
		
    
    }
    else
	
	return n ;
}

}
