
public class SpringTest {
	// 有一个属性为name
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 显示name的值
	public void print() {
		System.out.println("name的值是："+name);
	}
}
