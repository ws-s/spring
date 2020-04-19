package day2.pojo;

public class User {
	private String name;
	private int age;
	private String address;
	private Teacher t;// �����ⲿ��Դ
	public Teacher getT() {
		return t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(String name, int age, String address,Teacher t) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.t=t;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address 
				+ ", ��ʦ������=" + t.getTname() + "]";
	}
	
}
