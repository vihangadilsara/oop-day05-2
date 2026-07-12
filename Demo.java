import java.util.*;
class Student{
	String id;	
	String name;	
	int prfMarks;
	int dbmsMarks;
	
	Student(){
		
	}
	Student(String id, String name, int prfMarks, int dbmsMarks){
		this.id=id;
		this.name=name;
		this.prfMarks=prfMarks;
		this.dbmsMarks=dbmsMarks;
	}
}
class Demo{
	public static Student[] studentArray=new Student[]{
				new Student("S001","Niroth",76,78),
				new Student("S002","Lakmal",96,28),
				new Student("S003","githmi",100,100),
				new Student("S003","anuradha",100,100),
			};
	
	public static void addStudent(){
		Scanner input=new Scanner(System.in);
		System.out.print("Input Student Id : ");
		String id=input.nextLine(); 
		System.out.print("Input Student Name : ");
		String name=input.nextLine();
		System.out.print("Input PRF  Marks : ");
		int prfMarks=input.nextInt();
		System.out.print("Input DBMS Marks : ");
		int dbmsMarks=input.nextInt();
		
		incrementArrrays();
		Student s1=new Student(id,name,prfMarks,dbmsMarks);
		studentArray[studentArray.length-1]=s1;
	}
	private static void incrementArrrays(){
		Student[] tempStudentArray=new Student[studentArray.length+1];
		
		for(int i=0; i<studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		studentArray=tempStudentArray;
	}
	public static void printStudentsDetail(){
		System.out.println("ID\tName\tPRF\tDBMS");
		System.out.println("===========================");
		for(int i=0; i<studentArray.length; i++){
			System.out.println(studentArray[i].id+"\t"+studentArray[i].name+"\t"+studentArray[i].prfMarks+"\t"+studentArray[i].dbmsMarks);
		}
	}
	public static void removeStudent(){
		
	}
	public static void main(String args[]){
		//addStudent();
		//addStudent();
		printStudentsDetail();
		
		removeStudent();
		printStudentsDetail();
	}	
}
