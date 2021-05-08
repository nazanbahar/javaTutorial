package dataAccess.concretes.hibernate;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

/*Amaç: Hybernate Simulasyonu(veritabanına ekleme), InMemory(belleğe) ekleme alternatifidir. */
public class HybernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
