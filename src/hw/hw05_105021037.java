package hw;
/*
 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 *
 * Date: 2016/10/03
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw05_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入一正整數");
		int n=scn.nextInt();
		int a=1; int sum=0;
		while(a<=n){
			sum=sum+a*(a+1);
			a++;
			
			
			
		}System.out.print(sum);
	}

}
