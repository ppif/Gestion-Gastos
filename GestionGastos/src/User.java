import java.util.ArrayList;



public class User {

	
	private static ArrayList<User> listOfUsers = new ArrayList<>();
	
	private String username;
	private String password;
	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public static ArrayList<User> getListOfUsers() {
		return listOfUsers;
	}


	public static void registerNewUser(User newUser) {
		User.listOfUsers.add(newUser);
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public static boolean checkIfUserExist(String user) {
		for (int i = 0; i < listOfUsers.size(); i++) {
			if (listOfUsers.get(i).getUsername().equals(user)) {
				return true;
			}
		}
		return false;
	}
	
	public static User getUserFromList(String user) {
		for (int i = 0; i < listOfUsers.size(); i++) {
			if (listOfUsers.get(i).getUsername().equals(user)) {
				return listOfUsers.get(i);
			}
		}
		return null;
	}
	
	
}
