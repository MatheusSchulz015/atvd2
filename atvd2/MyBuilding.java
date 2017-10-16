package atvd2;
import javax.swing.JOptionPane;
public class MyBuilding
{
	
	public static void main(String[] args)
	{
	    Building myBuilding = new Building();
	    Port mp1  = new Port();
	    Port mp2  = new Port();
	    Port mp3  = new Port();
	    Port mp4  = new Port();
	    Port mp5  = new Port();
	    Port mp6  = new Port();
	    //adicionando andares
	    int qtyFloors = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos andares deseja cadastrar?"));
	    for (int i =0;i<qtyFloors;i++)
		{
			myBuilding.addFloors(JOptionPane.showInputDialog(null,"Digite o nome do % andar"+i));		
		}

		//adicionando portas
		mp1.setDimensionX(13);
		mp1.setDimensionY(13);
		mp1.setDimensionZ(13);
		mp1.toPaint("vermelhor");
		mp1.open();

		mp2.setDimensionX(13);
		mp2.setDimensionY(13);
		mp2.setDimensionZ(13);
		mp2.toPaint("vermelhor");
		mp2.open();

		mp3.setDimensionX(13);
		mp3.setDimensionY(13);
		mp3.setDimensionZ(13);
		mp3.toPaint("vermelhor");
		mp3.open();

		mp4.setDimensionX(13);
		mp4.setDimensionY(13);
		mp4.setDimensionZ(13);
		mp4.toPaint("BLACK");
		mp4.close();

		mp5.setDimensionX(13);
		mp5.setDimensionY(13);
		mp5.setDimensionZ(13);
		mp5.toPaint("vermelhor");
		mp5.close();

		mp6.setDimensionX(13);
		mp6.setDimensionY(13);
		mp6.setDimensionZ(13);
		mp6.toPaint("vermelhor");
		mp6.close();

		myBuilding.registerPort(mp1);
		myBuilding.registerPort(mp2);
		myBuilding.registerPort(mp3);
		myBuilding.registerPort(mp4);
		myBuilding.registerPort(mp5);
		myBuilding.registerPort(mp6);
	    

	    //verificando quantas portas estaoo fechadas

	    JOptionPane.showMessageDialog(null,"Quantidade de portas abertas " + myBuilding.howManyDoorsAreOpen());
	    JOptionPane.showMessageDialog(null,"Quantidade total de portas " + myBuilding.totalPorts());
	    //System.out.println(myBuilding.howManyDoorsAreOpen());


	}    
}
