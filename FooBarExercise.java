package Retry;


public class FooBarExercise {
	public static void main(String[] args) {
		
		FooBar(200);

		}

		public static void FooBar(int a){
		   for(int i=1; i<=a; i++){
		       
		       if(i%5==0){
		          System.out.println(" Foo ");
		       }
		       
		       if(i%3==0){
		          System.out.println(" Bar ");
		       }
		       
		       if((i%5==0)&&(i%3==0)){
		          System.out.println(" FooBar ");
		       }
		       
		       if( (i%5!=0) & (i%3!=0) )    
		       System.out.println(i);
		   }
		}
}
