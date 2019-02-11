package rmi;

import java.rmi.Naming;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtHolder;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		try {
			int x,y;
			
			AddI c=(AddI)Naming.lookup("//localhost/calc");
			
		
			int choice =0;
			System.out.println(" 1 for add \n 2 for sub \n 3 for mul \n 4 for divide");
			choice=scn.nextInt();
			System.out.println("enter a and b");
			x=scn.nextInt();
			y=scn.nextInt();
			int ans=0;
			
			switch (choice) {
			case 1:
					 ans=c.add(x, y);
					System.out.println("sum="+ans);
					
				
				break;
			case 2:
				ans=c.sub(x, y);
				System.out.println("sub="+ans);
				break;
			case 3:
				
				System.out.println("mul="+c.mul(x, y));
				break;
			
			case 4:
				System.out.println("div="+c.div(x, y));
				break;
			default:
				break;
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
