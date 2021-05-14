package lesson4Homework1Part43_interfaceAndPolymorphism;

public class MySqlCustomerDal implements CustomerDal, Repository {

	@Override
	public void add() {
		System.out.println("My sql eklendi");
	}

}
