package lecture4Homework3GameStore.concretes;

import lecture4Homework3GameStore.abstracts.GameService;
import lecture4Homework3GameStore.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getGameCode() + game.getName() + game.getUnitPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: " + game.getGameCode() + game.getName() + game.getUnitPrice());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getGameCode() + game.getName() + game.getUnitPrice());
		
	}

}
