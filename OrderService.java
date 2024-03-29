package sak.com.service;

import java.util.List;

import sak.com.DaoImp.Order;

public interface OrderService {
	Order createOrder(Order order);
	List<Order> getAllOrder();
	Order getOrder(int id);
	Order getaddress(String address);
	Order getOrderDescription (String OrderDescription);
	Order updateOrder(int id,Order order);
	String deleteOrder(int id);


}
