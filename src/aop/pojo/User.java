package aop.pojo;

public class User {
	private int uno;
	private String uname;
	private int age;
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(int uno, String uname, int age) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.age = age;
	}
}
