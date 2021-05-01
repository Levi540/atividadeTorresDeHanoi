package model;

import java.util.Arrays;

public class PilhaVetor implements Pilha {

	private int n;
	private int tam;
	private float vet[];
	
	public PilhaVetor(int tam) {
		this.n = -1;
		this.tam = tam;
		vet = new float[tam];
	}

	@Override
	public void push(float v) throws Exception {
		n++;
		if (n < tam) {
			vet[n] = v;
		} else {
			throw new Exception("Index out of bounds");
		}
	}

	@Override
	public float pop() throws Exception {
		float pop;
		if (n >= 0) {
			pop = vet[n];
			vet[n] = 0;
			n--;
			return pop;
		}
		throw new Exception("Index out of bounds");
	}

	@Override
	public float top() throws Exception {
		if (n >= 0) {
			return vet[n];
		}
		throw new Exception("Index out of bounds");
	}

	@Override
	public boolean vazia() {
		if (n > -1) {
			return false;
		}
		return true;
	}

	@Override
	public void libera() {
		for (int i = n; i >= 0; i--) {
			vet[i] = 0;
		}
		n = -1;
	}

	@Override
	public String toString() {
		return Arrays.toString(vet);
	}
	
	
	
}
