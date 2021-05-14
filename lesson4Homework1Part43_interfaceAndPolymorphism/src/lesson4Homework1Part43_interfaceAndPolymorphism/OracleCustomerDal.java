package lesson4Homework1Part43_interfaceAndPolymorphism;

public class OracleCustomerDal implements CustomerDal, Repository{

	@Override
	public void add() {
		System.out.println("Oracle eklendi");
		
	}

}
