import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CLogin extends Stub implements ILogin {

	private Registry registry;
	public CLogin() {
        try {
			this.registry = LocateRegistry.getRegistry(ILogin.PORT_NUM);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void initialie() {
		try {
			ILogin login = (ILogin) this.registry.lookup(ILogin.OBJECT_NAME);
	        VResult response = login.login(null);
	        
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public VResult login(VLogin vLogin) {
		System.out.println("*Client: "+this.getClass().getSimpleName()+"login started");
		return null;
	}
}
