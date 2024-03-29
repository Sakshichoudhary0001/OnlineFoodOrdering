package sak.com.Dao;
import  java.util.List;
import sak.com.model.User;


public interface UserDao {
	User createUser(User user);
	List<User> getAllUser1();
	User getUser(int id);
	User updateUser(int id,User user);
	String deleteCustomer(int id);
	sak.com.DaoImpl.User createCustomer(sak.com.DaoImpl.User user);
	sak.com.DaoImpl.User updateCustomer(int id, sak.com.DaoImpl.User user);
	sak.com.DaoImpl.User createCustomer1(sak.com.DaoImpl.User user);
	List<sak.com.DaoImpl.User> getAllUser();
	User getCustomer1(int userId);
	sak.com.DaoImpl.User updateUser(int customerId, sak.com.DaoImpl.User user);
	String deleteUser1(int userId);
	List<User> getAllUsers();
	

}
