
public class Main {
	
	private CLogin cLogin;
	
	public Main() {
		this.cLogin = new CLogin();
	}
	private void inititlaize() {
		cLogin.initialie();		
	}
	private void run() {
		VLogin vLogin = new VLogin();
		cLogin.login(vLogin);		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.inititlaize();
		main.run();

	}
}
