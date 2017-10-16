package atvd2;

public class MyPort {
    public static void main(String[] args) {
    	Port myPort = new Port();

    	myPort.open();
    	myPort.close();
    	myPort.isOpen();
    }
}
