package advance.dev;

public class Teacher extends Person {
	  private String magiaovien;
	    private double hesoluong;
	    
	    public Teacher(String name, int age, String PhoneNumber, String magiaovien, double hesoluong) {
	    	super(name, age, PhoneNumber);
	    	this.magiaovien = magiaovien;
	    	this.hesoluong = hesoluong;
	    }
	    public double tinhluong() {
	    	double 	luongcoban = 1000;
	    	return luongcoban * hesoluong;
	    }
}
