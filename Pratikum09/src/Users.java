public class Users {
	private int id;
	private String NIK;
	private String Fullname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNIK() {
		return NIK;
	}
	public void setNIK(String nIK) {
		NIK = nIK;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getPlacebirth() {
		return Placebirth;
	}
	public void setPlacebirth(String placebirth) {
		Placebirth = placebirth;
	}
	public String getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	private String Placebirth;
	private String Birthdate;
	private String Gender;
	private String Address;
	private String Email;
	private String Password;
}