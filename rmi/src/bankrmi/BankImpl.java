package bankrmi;

import java.rmi.*;  
import java.rmi.server.*;  
import java.sql.*;  
import java.util.*;  
class BankImpl extends UnicastRemoteObject implements Bank{  
BankImpl()throws RemoteException{
	super();
}  
  
public List<Customer> getCustomers(){  
List<Customer> list=new ArrayList<Customer>();  
try{  
//Class.forName("com.mysql.jdbc.driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bankjava","root","");  
PreparedStatement ps=con.prepareStatement("SELECT * FROM `customer_table`");  
ResultSet rs=ps.executeQuery();  
  
while(rs.next()){  
Customer c=new Customer();  
c.setAcc_no(rs.getInt(1));  
c.setFirstname(rs.getString(2));  
c.setFirstname(rs.getString(3));  
c.setEmail(rs.getString(4));  
c.setAmount(rs.getFloat(5));  
list.add(c);  
}  
  
con.close();  
}catch(Exception e){System.out.println(e);}  
return list;  
}//end of getCustomers()  
}  