package rmi;

import java.rmi.Remote;

public interface AddI extends Remote{
	public int add(int a,int b)throws Exception;
	public int sub(int a,int b)throws Exception;
	public int mul(int a,int b)throws Exception;
	public int div(int a,int b)throws Exception;
	

}


