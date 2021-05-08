package dataAccess.abstracts;


import java.util.List; //for List

import entities.concretes.User;
/*Soyut Sınıf */
public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByEmail(String email);
	List<User>getAll();
	
}
