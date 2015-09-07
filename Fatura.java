package Questao1;

public class Fatura {
	private String numero;
	private String descri�ao;
	private int qnt;
	private double pre�o;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescri�ao() {
		return descri�ao;
	}
	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}
	public int getItem() {
		return qnt;
	}
	public void setItem(int item) {
		this.qnt = item;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		if(!(pre�o >= 0))
			this.pre�o = pre�o;
		this.pre�o = 0.0;				
	}
	public double getValorFatura(int qnt,double pre�o){
		double fatura=0;
		fatura = qnt*pre�o;
		if (!(fatura >=0)){
			fatura = 0;
		}			
		return fatura;
	}
}