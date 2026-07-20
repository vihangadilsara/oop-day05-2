class Demo{
	public static void main(String args[]){
		int[] ar=new int[3];
		ar[0]=100;
		ar[1]=200;
		ar[2]=300;
		//-----------------
		System.out.println("ar[0] : "+ar[0]); //prints 100
		System.out.println("ar[1] : "+ar[1]);
		System.out.println("ar[2] : "+ar[2]);
		//-----------------------------------
		
		Student s1=new Student(); //Illegal
		s1.stId="S0001";
		s1.stName="Nimal";
		s1.prfMarks=85;
		s1.dbmsMarks=78;
	}
}
