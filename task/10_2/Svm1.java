package task_10_2;

	public class Svm1 
{
		
			int id;
			String name;
			static String college="MU";
			
			
			public Svm1(int id,String name) 
			{
				this.id=id;
				this.name=name;
			}
			void display()
			{
				System.out.println(id+" "+name+" "+college);
			}
			 static void change()
			{
				college="RK";
			}
			
			public static void main(String[] args)
			{
					
				change();
			
				Svm1 a1 =new Svm1(1,"a");
				Svm1 a2 =new Svm1(2,"v");
				Svm1 a3 =new Svm1(3,"d");
				
			
				a1.display();
				a2.display();
				a3.display();
				
		}
}
