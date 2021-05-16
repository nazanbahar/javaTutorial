package lecture4Homework3GameStore.abstracts;

import lecture4Homework3GameStore.entities.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
