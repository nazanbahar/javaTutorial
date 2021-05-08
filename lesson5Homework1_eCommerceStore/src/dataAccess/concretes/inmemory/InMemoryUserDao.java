package dataAccess.concretes.inmemory;

import java.util.ArrayList;
import java.util.List;


import dataAccess.abstracts.UserDao;
import entities.concretes.User;

/* Amaç: InMemory Simulasyonu(Belleğe ekleme) 
 * Programlamada ki amaçların en temelinde verilerin tutulması, 
 * sağlıklı bir şekilde depolanması, 
 * kaydedilen verilerin tekrar güncellenmesi sorgulanması gelir.
 * UYARI: Soyut Sınıfı implemente ederiz.
 * 
 * Alternatifler:  
 * 1) InMemory(bellek) 
 * 2) Hibernate(Veritabanı)
 * Hibernate, Red Hat şirketi tarafından Java platformunda yazılmış bir ORM (Object/Relational Mapping) aracıdır.
 * UYARI: "Alternatifleri klasörleriz." 
 * 
 * Equels Kullanımı:
 * Equals() methodu sadece içeriği karşılaştırır.
 * 1- Equals() ve == arasında temel fark, birinin metot diğerinin operator olmasıdır.

2- == operatörünü referans karşılaştırması (reference) (address comparison) için ve equals() 
metotunu içerik karşılaştırması için kullanırız. Basitçe söylemek gerekirse,
 == her iki nesnenin aynı bellek konumuna işaret edip etmediğini denetlerken, 
 .equals() nesnelerdeki değerlerin karşılaştırılmasını değerlendirir.
 * */
public class InMemoryUserDao implements UserDao {

	//user-arraylist
	private List<User> users = new ArrayList<User>();
	//InMemory Operation (add-update-delete-get-getall) for UserDao 
	

	//constructor
	public InMemoryUserDao() {
		super();
		
		//data-InMemory
		User can = new User(1, "can", "bahar", "canbahar@gmail.com","123456",true);
		User duru = new User(1, "duru", "can", "durucan@gmail.com","654321",true);
		User firuzan = new User(1, "firuzan", "ay", "firuzanay@gmail.com","987654",true);
		User ezgi = new User(1, "ezgi", "aksu", "ezgiaksu@gmail.com","456789",true);
		
		
		users.add(can);
		users.add(duru);
		users.add(firuzan);
		users.add(ezgi);
	}

	
	
	//add
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Log InMemory: " + user.getEmail());
	}


	
	//using  LINQ → stream() | x: alias | userToUpdate → listede bulduğumuz elemanın referansı
	//update
	@Override
	public void update(User user) {
		//Gönderdiğim ürün id'sine sahip olan listedeki ürünü bul.
		User userToUpdate = users.stream().filter(x-> x.getId()==user.getId()).findFirst().orElse(null);
		//set
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());
	}
	
	//delete 
	@Override
	public void delete(User user) {
		users = this.users.stream().filter((x)-> x.getEmail() != user.getEmail()).toList();
	}
	

	//getByEmail
	@Override
	public User getByEmail(String email) {
		return this.users.stream().filter((x)-> x.getEmail().equals(email)).findFirst().orElse(null);
	}

	//getAll
	@Override
	public List<User> getAll() {
		return users;
	}

}


//Bulk Insert : array[] for users 
//public void addMultiple(User[] users) {
//	for(User user: users) {
//		add(user);
//	}
//}
