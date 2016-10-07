package hw;
/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw02_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; char checkChar;
	    Scanner scn=new Scanner(System.in);
	    System.out.println("請輸入數字");
	    int a=0,b=0,c=0;
	    while(true){
	    	n=scn.nextInt();
	    	if(n>0){
	    		a=a+1;
	    	}else if (n==0){
	    		b=b+1;
	    	}else if (n<0){
	    		c=c+1;
	    	}System.out.print("繼續?(y/n)");
	    	checkChar = scn.next().charAt(0);
	    	if(checkChar=='n'){
	    		System.out.println("顯示結果");
	    		break;
	   }
	    		    	
	    }
	    System.out.println("正整數"+a+"個\n"+"負整數"+c+"個\n"+"零"+b+"個");
		

	}

}
