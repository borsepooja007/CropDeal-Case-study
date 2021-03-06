package Admin_Service.Admin_serviceMain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString

@Document(collection = "Admin")
public class Admin {
	@Id
	private String id;
	private String admin_email;
	private String password;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String id, String admin_email, String password) {
		super();
		this.id = id;
		this.admin_email = admin_email;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
