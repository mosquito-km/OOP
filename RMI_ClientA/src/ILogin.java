import java.rmi.Remote;

public interface ILogin extends Remote {
	public final static int PORT_NUM = 2732;
	public final static String OBJECT_NAME = "login";	
	public VResult login(VLogin vLogin);
	
}
