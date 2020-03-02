package entity;

public class Student {
	 private int nid;//Ñ§ºÅ
	 private String name;
	 private int age;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
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
	public Student(int nid, String name, int age) {
		super();
		this.nid = nid;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	 
}
