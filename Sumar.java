public class Sumar{
	private int num;
	private int sumapar=0;
	private int sumaimpar=0;

	public Sumar(int num, int sumapar, int sumaimpar){
		this.num=num;
		this.sumapar=sumapar;
		this.sumaimpar=sumaimpar;
}
	public void setNum(int num){
		num=num;
}
	public int getNum(){
		return num;
}
	public void setSumapar(int sumapar){
		sumapar=sumapar;
}
	public int getSumapar(){
		return sumapar;
}
	public void setSumaimpar(int sumaimpar){
		sumaimpar=sumaimpar;
}
	public int getSumaimpar(){
		return sumaimpar;
}
	public void imprimirDatos(){
	System.out.println(getNum());
	System.out.println(getSumapar());
	System.out.println(getSumaimpar());
}
}