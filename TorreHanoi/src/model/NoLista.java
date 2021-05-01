package model;

public class NoLista {
	private float info;
	private NoLista prox;
	
	public NoLista(float info, NoLista prox) {
		this.info = info;
		this.prox = prox;
	}

	public NoLista() {}

	public float getInfo() {
		return info;
	}
	
	public void setInfo(float info) {
		this.info = info;
	}
	
	public NoLista getProx() {
		return prox;
	}
	
	public void setProx(NoLista prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return info + ", ";
	}
	
}
