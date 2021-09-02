package encap.obj;

public class Hotel {

	private Chef chef;
	private Employee emp;
	
	public Hotel() {
		this.chef = new Chef();
		this.emp = new Employee();
		
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		
	}
	
	public Chef getChef() {
		return chef;
	}
	
	//emp의 getter, setter
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
		
	}
}
