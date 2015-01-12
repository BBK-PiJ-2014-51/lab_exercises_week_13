package exercise1_5;

public class LibraryImpl implements Library {

	private String name;
	private int numBooks;
	private int id;
	int arrayCapacity = 20;
	int numUsers = 0;
	private User[] users = new User[arrayCapacity];
	
	public LibraryImpl(String name){
		this.name = name;
		numBooks = 3;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setMaxBooksPerUser(int numBooks) {
		this.numBooks = numBooks;
	}

	@Override
	public int getMaxBooksPerUser() {
		return numBooks;
	}
	
	@Override
	public int registerUser(User newUser){
		users[numUsers++] = newUser;
		return numUsers;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public int getId() {
		return id;
	}

}
