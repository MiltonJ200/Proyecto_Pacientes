/*
 *	Programacion Orientada a Objetos
 *	Proyecto final
 *	
 *	Esteban Salvador Marcos Solis
 *	Milton Josue Urbina Morales
 *
 *	Versión 1.16
 *
 *	Fecha de creación 25/05/2019
 *
 *
 **/

package pacientes;
import javax.swing.*;
class VectorPacientes
{
	private Pacientes vecD[];
	
	public VectorPacientes(int tamaño)//constructor en el cual definimos de que tamaño sera nuestro vector de tipo pacientes
	{
		vecD= new Pacientes[tamaño];
	}
	
	public void registroP()//Metodo que utilizaremos para registrar un paciente  o un valor dentro del vector
	{
		for(int i=0; i<vecD.length; i++)
		{
			JOptionPane.showMessageDialog(null, "Registro de Expediente clinico del Paciente No."+(i+1)+"\n         Ingresar Fecha de Consulta Medica");
		vecD[i]= new Pacientes();
		}	
	}
	
	
	public void recorrerV()//Metodo en el cual observaremos lo que esta dentro del vector
	{
		for(int i=0; i<vecD.length; i++)
			JOptionPane.showMessageDialog(null, vecD[i].mostrarDatos());
	}
	
	
	public void  cFecha(String nombre)// recibo el nombre en mayusculas
	{
		int a=0;
		
		for(int i=0; i<vecD.length; i++)
		{
			if(nombre.equals(vecD[i].getNombre()))
			{
				JOptionPane.showMessageDialog(null, vecD[i].getNombre()+"\n"+vecD[i].getDia()+"/"+vecD[i].getMes()+"/"+vecD[i].getAño());
				a++;
			}
			
		}
		if(a==0)
				JOptionPane.showMessageDialog(null,"No hay ningun paciente registrado con ese nombre.");
			a=0;
	
		//if(nombre.equalsIgnoreCase())
		
	}
	
		public void ordena()//metodo en el cual nos ordenara los nombres almacenados en el vector alfabeticamente
	{
		Pacientes aux;
		
		for(int i=0;i<vecD.length-1;i++)
		{
			for(int j=i+1;j<vecD.length;j++)
			{
				if(vecD[i].getNombre().compareTo(vecD[j].getNombre())>0)
				{
					aux=vecD[j];
					vecD[j]=vecD[i];
					vecD[i]=aux;
				}
			}
		}
	}
	
	
}