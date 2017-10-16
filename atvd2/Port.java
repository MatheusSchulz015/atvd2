package atvd2;
import javax.swing.JOptionPane;

public class Port {
  protected Boolean open;
  private String color;
  private Double dimensionX;
  private Double dimensionY;
  private Double dimensionZ;

  public void open()
  {
  	 
  	 this.open = true;
  	 JOptionPane.showMessageDialog(null,"Porta aberta com sucesso",
        "Porta", 
        JOptionPane.INFORMATION_MESSAGE);
  }
  public void close()
  {
  	
  	this.open = false;
  	JOptionPane.showMessageDialog(null,"A Portafoi fechada","Porta",
        JOptionPane.INFORMATION_MESSAGE);
  }
  public void toPaint(String color)
  {
  	this.color = color; 
  	JOptionPane.showMessageDialog(null,"A Porta foi pintada com a cor:"+color,"Porta", 
        JOptionPane.INFORMATION_MESSAGE);
  }
  public boolean isOpen()
  {
  	if (this.open==true)
  	{	
  		JOptionPane.showMessageDialog(null,"A Porta esta aberta","Porta",
        0);


  		return true;
  		
  	}

  	JOptionPane.showMessageDialog(null,"A Porta esta fechada","Porta",
        0);
  	return false;
  }

  public void setDimensionX(double dimension)
  {
  	this.dimensionX = dimension;
  }
  public void setDimensionY(double dimension)
  {
  	this.dimensionY = dimension;
  }
  public void setDimensionZ(double dimension)
  {
  	this.dimensionX = dimension;
  }

  public double getDimensionX()
  {
  	return this.dimensionX;
  }

}
