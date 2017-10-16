package atvd2;
import java.util.ArrayList;
public class Building {
    private  String color;

      
      private String HowManyDoors;
      ArrayList<String> floors = new ArrayList<String>();
   	ArrayList<Port> doors = new ArrayList<Port>();
      private int qtdyPortOpen = 0;

   	void toPaint(String color)
   	{
   		this.color = color;
   	}

   	int howManyDoorsAreOpen()
   	{
   		for(Port p : doors)
         {
            if (p.isOpen()==true)
            {
               this.qtdyPortOpen++;
            }
         }
      return this.qtdyPortOpen;
   	}

   	void registerPort(Port p)
   	{
   		this.doors.add(p);
   	}

      void addFloors(String floor)
      {
         this.floors.add(floor);
      }
      
      int totalPorts()
      {
         return this.doors.size();
      }

      int totalFloors()
      {
         return this.floors.size();
      }


      
}
