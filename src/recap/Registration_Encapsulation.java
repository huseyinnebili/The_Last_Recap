package recap;

public class Registration_Encapsulation {

	private String email;
	private String userName;
	private String password;

	// setter for email
	public void setEmail(String email) {

		if (email.endsWith("yahoo.com")) {

			this.email = email;
		} else {

			System.out.println("Please use a yahoo account!..");
		}
	}

	// getter for email
	public String getEmail() {

		return email;
	}

	// setter for userName

	public void setUserName(String userName) {

		if (!userName.isEmpty()){
			
			if(userName.length() > 6){

			this.userName = userName;

		}

		else {

			System.out.println("Username should be longer than six characters!..");
		}
	}else {
		
		System.out.println("Username should not kept empty!...");
	}
	}
	public String getUserName() {

		return userName;
	}

	// setter password

	public void setPassword(String password) {

		if (!password.isEmpty()) {

			if (password.length() > 6) {

				if (!password.contains(userName))

				{

					this.password = password;

				} else {

					System.out.println("Password can not contain username!...");
				}

			} else {

				System.out.println("Username sholud be longer than siz characters!..");
			}

		} else {

			System.out.println("Password can not be kept empty!...");
		}

	}

	// getter password

	public String getPassword() {

		return password;
	}

}
