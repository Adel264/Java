import java.util.ArrayList;
import java.util.Scanner;
public class Sign_Up {
	private String Name;
	private String Email;
	private String Password;
	private String Phone;
	 private static ArrayList<Player> Player_list;
	 private static ArrayList<Playground_Owner> Owner_list;
	 /**
	  * 
	  */
	public Sign_Up() {};
	/**
	 * 
	 */
	public Sign_Up(String Name, String Email, String Password,String Phone) {
		this.Name=Name;
		this.Email=Email;
		this.Password=Password;
		this.Phone=Phone;}
	
	/**
	 * 
	 */
	public String getName() {
		return Name;
	}
	/**
	 * 
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * 
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * 
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * 
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * 
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * 
	 */

	public String getEmail() {
		return Email;
	}
	/**
	 * 
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * 
	 */
	public static ArrayList<Player> getPlayer_list() {
		return Player_list;
	}
	/**
	 * 
	 */
	public static void setPlayer_list(ArrayList<Player> player_list) {
		Player_list = player_list;
	}
	/**
	 * 
	 */
	public static ArrayList<Playground_Owner> getOwner_list() {
		return Owner_list;
	}
	/**
	 * 
	 */
	public static void setOwner_list(ArrayList<Playground_Owner> owner_list) {
		Owner_list = owner_list;
	}



}