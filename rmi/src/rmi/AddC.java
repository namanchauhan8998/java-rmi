package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements AddI{

	public AddC()throws RemoteException{
		super();
	}
	
	public int add(int a, int b) throws RemoteException {
		
		// TODO Auto-generated method stub
		return a+b;
	}
	@Override
	public int sub(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		return a-b;
	}
	@Override
	public int mul(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public int div(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		return a/b;
	}
	

}
