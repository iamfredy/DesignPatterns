package patterns.creational.builder;

public class User {
	private String name;
	private Long id;
	private int age;
	private Long phoneNumber;
	
	private User() {
		
	}
	public String getName() {
		return name;
	}
	public Long getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void printUserDetails() {
		System.out.println("ID:= "+this.getId()+" Name:= "+this.getName()+" Age:= "+this.getAge()+" Phone:="+this.getPhoneNumber());
	}

	public static class Builder{
		User user=null;
		public Builder() {
			this.user=new User();
		}
		public Builder setPhoneNumber(Long phoneNumber) {
			this.user.phoneNumber = phoneNumber;
			return this;
		}
		public Builder setAge(int age) {
			this.user.age = age;
			return this;
		}
		public Builder setName(String name) {
			this.user.name = name;
			return this;
		}

		public Builder setId(Long id) {
			this.user.id = id;
			return this;
		}
		public User build() {
			return user;
		}
	}
	 
}
