package atvd2;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Home {
   private String color;
   protected int qtdyPort; 
   protected int qtdyPortOpen = 0;
   private int total;
  ArrayList<Port>port = new ArrayList<>();

  	
   void toPaint(String color)
   {
   		this.color = color;
   		JOptionPane.showMessageDialog(null,"A casa foi pintada com a cor:"+color,
        "Casa", 
        JOptionPane.INFORMATION_MESSAGE);
   }

   int HowManyDoorsAreOpen(ArrayList<Port> ports)
   {
   		for(Port p : ports)
   		{
   			if (p.isOpen()==true)
   			{
   				qtdyPortOpen++;
   			}
   		}
  		return qtdyPortOpen;
   }
   int totalDoors()
   {
   		return this.total;
   }
   void registerPort(Port myPort)
   {
   		port.add(myPort);
   }

   int totalPorts()
   {
   		return this.port.size();
   }


   
}
