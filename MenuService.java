package sak.com.service;

import java.util.List;

import sak.com.model.Menu;

public interface MenuService {
	Menu createMenu(Menu menu);
	List<Menu> getAllMenu();
	Menu getMenu(int id);
	Menu updateMenu(int id,Menu menu);
	String deleteMenu(int id);


}
