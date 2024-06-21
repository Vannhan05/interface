package advance.dev;
import java.util.Scanner;

public class MainApp {
			public static void main(String[] args) {
			   	Scanner sc = new Scanner(System.in);
			   	System.out.print("Nhập số lượng sinh viên: ");
			   	int n = sc.nextInt();
			   	Person[] persons = new Person[n];
			   	input(persons);
			   	print(persons);
			   }
			   public static void input(Person[] persons) {
			   	Scanner sc = new Scanner(System.in);
			   	for(int i = 0; i < persons.length; i++) {
			   		if(i < 4) {
			   		System.out.print("giáo viên thứ "+(i + 1)+":");
			   		System.out.print("Nhập name: ");
			   		String name = sc.nextLine();
			   		System.out.print("Nhập age: ");
			   		int age = sc.nextInt();
			   		System.out.print("Nhập PhoneNumber: ");
			   		String PhoneNumber = sc.nextLine();
			   		System.out.print("Nhập mã giáo viên: ");
			   		String magiaovien = sc.nextLine();
			   		System.out.print("Nhập hệ số lương: ");
			   		double hesoluong = sc.nextDouble();
			   		sc.nextLine();
			   		persons[i] = new Teacher(name, age, PhoneNumber, magiaovien, hesoluong);
			   	} else {
			   		System.out.print("Học sinh thứ "+(i - 3) + ":");
			   		System.out.print("Nhập Name: ");
			           String name = sc.nextLine();
			           System.out.print("Nhập Age: ");
			           int age = sc.nextInt();
			           System.out.print("Phone Number: ");
			           String PhoneNumber = sc.nextLine();
			           System.out.print("Nhập điểm toán ");
			           double diemtoan = sc.nextDouble();
			           System.out.print("Nhập điểm lý: ");
			           double diemly = sc.nextDouble();
			           System.out.print("Nhập điểm hoá: ");
			           double diemhoa = sc.nextDouble();
			            System.out.print("Nhập mã sinh viên: ");
			            String masinhvien = sc.nextLine();
			            System.out.print("Nhập lớp: ");
			            String lop = sc.nextLine();
			            sc.nextLine();
			            persons[i] = new Student(name, age, PhoneNumber, diemtoan, diemly, diemhoa, masinhvien, lop);
			   	}
			   	}
			   }
			   	public static void print(Person[] persons) {
			   		System.out.print("Thông tin của persons: ");
			   		for(Person person : persons) {
			   			if(person != null) {
			   				if(person instanceof Teacher) {
			   					Teacher teacher = (Teacher) person;
			   				   System.out.println("Teacher-tinhluong: "+teacher.tinhluong());
			   				}else if(person instanceof Student) {
			   					Student student = (Student) person;
			   					System.out.println("Student-tinhdiemtrungbinh: "+student.tinhdiemtrungbinh());
			   				}
			   			}
			   		}
			   	}

}
