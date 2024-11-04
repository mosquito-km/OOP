import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Skeleton {

	

	private Registry registry;
	
	private ILogin cLogin;
	
	public Skeleton() {
		try {
    	   this.registry = LocateRegistry.createRegistry(ILogin.PORT_NUM);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public void initialize() {
		
		try {
			this.cLogin = new CLogin();
			Remote session = UnicastRemoteObject.exportObject(cLogin, 0);
			this.registry.bind(ILogin.OBJECT_NAME, session);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
