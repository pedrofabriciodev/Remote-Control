package controleRemoto;


public class ControleRemoto implements Controlador{

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	public ControleRemoto() {
		volume=50;
		ligado=false;
		tocando=false;
	}
	
//	SUBSCREVENDO METODOS
	@Override
	public void ligar() {
		setLigado(true);
		
	}
	@Override
	public void desligar() {
		setLigado(false);
		
	}
	@Override
	public void abrirMenu() {
		System.out.println("-----------MENU-----------");
		System.out.println("Ligado: " + isLigado());
		System.out.print("Volume: " + getVolume());
		for (int i=0; i <= getVolume(); i += 10) {
			System.out.print("|");
		}
		System.out.println("");
		System.out.println("Esta tocando: " + isTocando());
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu!!!");
		
	}
	@Override
	public void maisVolume() {
		if (isLigado()){
			setVolume(getVolume()+5);
		}
		
	}
	@Override
	public void menosVolume() {
		if(isLigado()) {
			setVolume(getVolume()-5);
		}
		
	}
	@Override
	public void ligarMudo() {
		if(isLigado()& getVolume()>0) {
			setVolume(0);
		}
		
	}
	@Override
	public void desligarMudo() {
		if(isLigado() & getVolume()==0) {
			setVolume(50);
		}
		
	}
	@Override
	public void play() {
		if(isLigado() & !(isTocando())) {
			setTocando(true);
			
		}
	}
	@Override
	public void pause() {
		if(isLigado() & isTocando()) {
			setTocando(false);
		}
		
	}


	
//	GETTERS E SETTERS
	private int getVolume() {
		return volume;
	}


	private void setVolume(int volume) {
		this.volume = volume;
	}


	private boolean isLigado() {
		return ligado;
	}


	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	private boolean isTocando() {
		return tocando;
	}


	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

}
