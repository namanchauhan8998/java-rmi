package rmi;

import java.rmi.Naming;
import java.rmi.registry.Registry;

public class server {
	public static void main(String arg[])
	{
	try {
		
		Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099);
		r.rebind("calc", new AddC());
		System.out.println("server is connected");
		
		r.unbind("calc");	
	}catch(Exception e)
	{
		System.out.println("server not connected"+e);
	}

}
}
