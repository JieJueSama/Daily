package com.zjx.java1;

public class Customer {

	String name;
	int age;

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

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Customer() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//自动生成的equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	//自动实现
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
	//手动实现equals()重写
	//重写原则：比较两个对象的实体内容是否相同
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(this == obj) {
//			return true;
//		}
//		if(obj instanceof Customer) {
//			Customer cust = (Customer) obj;
//			//比较两个对象的每个属性是否相同
//			if(this.age == cust.age && this.name.equals(cust.name)) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		return false;
//	}
	
	//手动实现
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "[Customer name = "+this.name+" age = "+this.age+"]";
//	}
	
	

}
