package atvd2;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class MyHome {


    public static void main(String[] args) {
    	Home myHome = new Home();
    	Port myPort = new Port();
    	ArrayList<Port> myPorts  = new ArrayList<Port>();
    	myHome.toPaint("Amarelo");

    	//myPort.setDimensionX(1.2);
    	int resposta = 1;

		//cadsatrar porta
	
    	while (resposta!= 0){
    	
    		myPort.setDimensionX(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a dimensao X")));
    		myPort.setDimensionY(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a dimensao Z"))); 

    		resposta = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja Cadastrar mais portas? Digite 1 se sim, ou 0 se nao"));

    		myPorts.add(myPort);
    		JOptionPane.showMessageDialog(null,"A porta foi adicionada",
        "Casa", 
        JOptionPane.INFORMATION_MESSAGE);

    	}


    	//exibindo portas
    	int i =0;
    	for (Port mp : myPorts)
    	{
    	
    		System.out.println("Porta"+ i + " "+mp.getDimensionX());

    		if (i % 2 == 0 || i == 0) {
    			mp.open();
    			System.out.println("PORTA ABERTA? "+mp.open);
    		} else{
    			mp.close();
    			
    		}
    		i++;	

      	 }
   	 System.out.println("POrtas abertas" + myHome.HowManyDoorsAreOpen(myPorts));

    }
}
