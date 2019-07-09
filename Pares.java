public class Pares{
	
	private int num;

		public Pares(int num){
			this.num=num;
		
     }
		public void setNum(int num){
			num=num;
     }
		public float getNum(){
			return num;
     }
		public void Calculo(){
			if(num%2==0){

		System.out.println("Par.");
     }
		else{

		System.out.println("Impar.");
     }
     }
}