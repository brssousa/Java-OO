
public class SistemaInterno {

	private int senha = 222;
	
	public void autenticaSistema(Autenticavel g){
		
		boolean autenticou = g.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("pode entrar");
		} else {
			System.out.println("nao pode entrar");
		}
		
	}
	
}
