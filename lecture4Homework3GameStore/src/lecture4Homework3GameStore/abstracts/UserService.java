package lecture4Homework3GameStore.abstracts;

import lecture4Homework3GameStore.entities.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
}
