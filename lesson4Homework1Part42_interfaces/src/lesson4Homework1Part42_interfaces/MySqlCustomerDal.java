package lesson4Homework1Part42_interfaces;

public class MySqlCustomerDal implements CustomerDal, Repository {

	@Override
	public void add() {
		System.out.println("My sql eklendi");
	}

}
