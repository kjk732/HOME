package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		//Hotel안에 있는 chef와 emp의 사용
		Hotel h = new Hotel();
	
		Chef chef = h.getChef();
		chef.cooking();
		
		Employee emp = h.getEmp();
		emp.working();
		
		h.getEmp().working();
		
		// setter의 사용
		
	}
}
