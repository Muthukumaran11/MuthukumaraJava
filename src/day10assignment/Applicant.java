// Question 2) When we compare 2 accounts it has to check the account number for equality and print the result.

package day10assignment;


public class Applicant {

	private int id;
	private String name;
	private String type;
	
	Applicant(){
		
	}
	Applicant(int id,String name,String type){
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	
	@Override
	public String toString() {
	String data = "Id : "+id+"\nName : "+name+"\nType : "+type;
	return data;
	}
	
	@Override
	public boolean equals(Object obj) {
				Applicant other = (Applicant)obj;
		if(this.id == other.id)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Applicant app1 = new Applicant(001,"Somu","Savingaccount");
		Applicant app2= new Applicant(001,"Somu","Currentacount");
		System.out.println(app1);
		System.out.println(app2);
			
		if(app1.equals(app2))
			System.out.println("Both have same details");
		else
			System.out.println("Both have different details");
	}

}
