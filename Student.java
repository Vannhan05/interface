package advance.dev;

public class Student extends Person {
	   private double diemtoan;
	    private double diemly;
	    private double diemhoa;
	    private String masinhvien;
	    private String lop;
	    
	    public Student(String name, int age, String PhoneNumber, double diemtoan, double diemly, double diemhoa, String masinhvien, String lop) {
	 	   super(name, age, PhoneNumber);
	 	   this.diemtoan = diemtoan;
	 	   this.diemly = diemly;
	 	   this.diemhoa = diemhoa;
	 	   this.masinhvien = masinhvien;
	 	   this.lop = lop;
	    }
	    public double tinhdiemtrungbinh() {
	 	   return (diemtoan + diemhoa + diemly) / 3;
	    }
}
