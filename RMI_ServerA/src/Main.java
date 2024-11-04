
public class Main {
	
	private Skeleton skeleton;
	
	public Main() {
		this.skeleton = new Skeleton();
	}
	private void initialize() {
		skeleton.initialize();		
	}
	private void run() {
		skeleton.run();		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		main.run();

	}
}
