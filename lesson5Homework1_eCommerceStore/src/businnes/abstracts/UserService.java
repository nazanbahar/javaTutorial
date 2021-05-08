package businnes.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User userId);
	User getByEmail(String email);
	List<User>getAll();
}
