package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex04_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n1= scn.nextLong();
		long sum=0;
		while(n1>0){
			sum= sum+n1%10;
			n1=n1/10;
						
		}System.out.print(sum);

	}

}
