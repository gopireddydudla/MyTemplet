  interface Person3{
	 public  void eat(String food1,String fofood1od2);
  }

public class PersonImplLambda3  {

	public static void main(String[] args) {
		 
		Person3 p3=(food1,food2) ->  {
			
			{
				System.out.println("Rich food" + food1 + food2);
			} 			
		};
		
		p3.eat("Milk" , "Sugar");
	}

}
