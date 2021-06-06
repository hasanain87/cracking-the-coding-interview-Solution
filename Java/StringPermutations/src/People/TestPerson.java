package People;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person  objArray[] = {
				new Teacher("Abbas","smc",8765)
				,new Student("Kim","smc",3233)
				};
		
		
		for(int i=0; i<objArray.length;i++){
			System.out.println("Print Objs"+i);
			
			System.out.println(objArray[i].toString());
			//System.out.println(objArray[i].GetId());
			
			if (objArray[i] instanceof Teacher){
		      System.out.println( "Id is for Teacher" +  (  ((Teacher) objArray[i]).GetId())         );
			}
			
		}
		
		

	}

}
