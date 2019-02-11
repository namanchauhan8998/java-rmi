package bankrmi;

import java.rmi.*;
import java.rmi.registry.Registry;  
public class MyServer{  
public static void main(String args[])throws Exception{  
	Naming.rebind("rmi://localhost:1099/javatpoint",new BankImpl());  
	System.out.println("server connected");
}}  