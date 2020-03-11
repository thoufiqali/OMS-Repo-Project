package app.spring.DTO;

public class Customer {
	
	String name;
	Integer age;
	Integer id;
	public Customer()
	{}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	public Customer(String name, Integer age, Integer id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
}
