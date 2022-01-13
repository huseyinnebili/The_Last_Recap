package recap;

public class Registration_of_Email_Encapsulation{

	private String email, username, password;

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {

		if (email.contains("gmail")) {
			if (email.contains("@")) {
				this.email = email;
			} else {
				System.out.println("Email should contain @ character.");
			}
		} else {

			System.out.println("Email should contain gmail.");
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {

		if (!username.isEmpty()) {

			if (username.length() >= 6) {

				this.username = username;
			} else {

				System.out.println("Username should not shorter than 6 characters.");
			}
		} else {

			System.out.println("Username can not be kept empty.");
		}

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		if (!password.isEmpty()) {

			if (password.length() >= 8) {

				if (!password.contains(username)) {

					this.password = password;
				} else {

					System.out.println("Password can not contain username.");
				}

			} else {

				System.out.println("Password should be longer than 8 characters. ");
			}
		} else {

			System.out.println("Password can not be kept empty.");
		}
	}

}
