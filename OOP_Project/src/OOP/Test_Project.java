
 package OOP;
 


public class Test_Project {

	public static void main(String[] args) {
		
			Student s1 = new Student( "Ahmed Harres", 22, "30110012433039","Minia" , 3.1, "162020045", "Ahmed.20377270@compit.aun.edu.eg");
			Instructor i1 = new Instructor("Mostafa Kamel", 42, "301269852366969", "Assuit", "168282", 27, 9000, "CS", 18); 
			Technical t1 = new Technical("Mohammed Hassen", 21, "30112102447852", "Assuit", "2182002", 30, 8000, 2, 4);
			Administrator a1 = new Administrator("Mahmoud Mostafa ", 1, "30124487201556", "Minia", "16254850", 29, 10000, 5, "IT");
			Worker w1 = new Worker("Mostafa", 32, "30121458726985", "Minia", "581991", 25, 5000, "IS");
			
			s1.setGpa(3.1);
			System.out.print(s1.toString() + "\n");
			System.out.print("---------------------------------------------\n");
			
			System.out.print(i1.toString() + "\n");
			System.out.print("---------------------------------------------\n");

			System.out.print(t1.toString() + "\n");
			System.out.print("---------------------------------------------\n");

			System.out.print(a1.toString() + "\n");
			System.out.print("---------------------------------------------\n");

			System.out.print(w1.toString() + "\n");

 	}

}
