package lesson4Homework1Part42_interfaces;

public class Main {

	public static void main(String[] args) {

		CustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();
	}

}

/* EXAMPLE: ERROR CODE
 KURAL1: "abstract Class ve interface new lenemez"
 CustomerDal customerDal = new CustomerDal() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
		};
  KURAL2: Onu implemente eden classın referansını tutabilir.
  Onun yerine alternatifleri new lemeliyiz.
  example: CustomerDal customerDal = new OracleCustomerDal(); 
 
 * */
 