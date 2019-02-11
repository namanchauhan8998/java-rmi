package bankrmi;

import java.awt.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Bank extends Remote{
	public java.util.List<Customer> getCustomers() throws RemoteException;

}
