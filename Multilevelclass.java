package CoreJava;

class Subject1
{
	void ProgrammeJ()
  {
		System.out.println("Java");
  }  
}  

class Subject2  extends Subject1 
{ 
	void ProgrammeP()
  {
		System.out.println("Python");
  }  
}

class Subject3 extends Subject2{
 

	public static void main(String args[])
  {  

		Subject3 S=new Subject3();  
		
		
      S.ProgrammeJ();
      S.programmeP();
  }   
}
