package model;

public class PilhaLista implements Pilha {

	private NoLista topo;
	
	public PilhaLista() {
		this.topo = null;
	}

	@Override
	public void push(float v) throws Exception {
		NoLista novo;
		NoLista penultimo;
		float infoPenultimo, infoTopo;
		if (topo == null) {
			topo = new NoLista(v, null);
		} else {
			if (topo.getProx() == null) {
				infoPenultimo = topo.getInfo();
				novo = new NoLista(infoPenultimo, null);
				
			} else if (topo.getProx().getProx() == null) {
				infoTopo = topo.getInfo();
				novo = new NoLista(infoTopo, topo.getProx());
				
			} else {
				infoPenultimo = topo.getProx().getInfo();
				penultimo = new NoLista(infoPenultimo, topo.getProx().getProx());
				infoTopo = topo.getInfo();
				novo = new NoLista(infoTopo, penultimo);
			}
			topo.setInfo(v);
			topo.setProx(novo);
		}
	}

	@Override
	public float pop() throws Exception {
		float pop;
		NoLista listaAux;
		
		if (topo != null) {
			pop = topo.getInfo();
			if (topo.getProx() == null) {
				topo = null;
			} else {
				listaAux = topo.getProx();
				topo = listaAux;
			}
			return pop;
		}
		throw new Exception("Empty list");
	}

	@Override
	public float top() throws Exception {
		if (topo != null) {
			return topo.getInfo();
		}
		throw new Exception("Empty list");
	}

	@Override
	public boolean vazia() {
		if (topo == null) {
			return true;
		}
		return false;
	}

	@Override
	public void libera() {
		topo = null;
	}

	@Override
	public String toString() {
		NoLista listaAux = topo;
		String result = "[";
		while (listaAux != null) {
			result += listaAux.toString();
			listaAux = listaAux.getProx();
		}
		return result + "]";
	}
	
}
