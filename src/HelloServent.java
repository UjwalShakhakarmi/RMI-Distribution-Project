import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServent extends UnicastRemoteObject implements HelloService{

    protected HelloServent() throws RemoteException {
        super();
    }

    @Override
    public String printMessage() throws RemoteException {
        return "Hello World";

    }
}
