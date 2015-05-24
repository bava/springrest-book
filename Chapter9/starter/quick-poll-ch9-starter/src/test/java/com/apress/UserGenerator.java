package com.apress;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Generates the user data along with encrypted password.
 */
public class UserGenerator {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		String[][] users = {
								{"1", "mickey", "cheese", "Mickey", "Mouse", "no"},
								{"2", "minnie", "red01", "Minnie", "Mouse", "no"},
								{"3", "donald", "quack", "Donald", "Duck", "no"},
								{"4", "daisy", "quack2", "Daisy", "Duck", "no"},
								{"5", "clarabelle", "moo", "Clarabelle", "Cow", "no"},
								{"6", "admin", "admin", "Super", "Admin", "yes"}
							};
		
		String sql = "insert into users (user_id, username, password, first_name, last_name, admin) values (%s, '%s', '%s', '%s', '%s', '%s');";
		
		for(String[] user : users) {
			
			System.out.println(String.format(sql, user[0], user[1], passwordEncoder.encode(user[2]) , user[3], user[4], user[5]));
			
		}
		
	}
	
}
