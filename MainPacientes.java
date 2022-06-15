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
class MainPacientes
{
	public static void main(String [] args)
	{
		int tamaño =Integer.parseInt(JOptionPane.showInputDialog("Cuantos pacientes"));//Hacemos la pregunta de que tamaño queremos hacer el vector por medio de una variable
		VectorPacientes v1= new VectorPacientes(tamaño);// definimos un objeto tipo VectorPacientes y definimos el tamaño por medio de la variable vector
		
		int esc;//Variable de opcion
		int romper=0;//variable con la cual daremos la orden de cerrar el programa
		String b1;//Varianle donde almacenamos el nombre que evaluaremos para consultar su fecha de consulta
		int romper2=0;//Variable que hace que inicialize los demas case y previene que el programa no crashee
		int llenar=0;//
			 
			do
			{
				esc=Integer.parseInt(JOptionPane.showInputDialog("---CONSULTORIO MEDICO EL STEVE JOBS Y SU COMPA EL MILTON ---\n"+"\n(1)Registrar Pacientes\n(2)Mostrar Pacientes\n(3)Buscar fecha\n(4)Ordenar pacientes Alfabeticamente \n(0)Salir"));//hacemos la eleccion en nuestro menu de opciones
				switch(esc)
				{
					case 1: 
							if(romper2==0)
							{
								v1.registroP(); // registro de los pacientes
								romper2=1;	
							}
							else
								JOptionPane.showMessageDialog(null, "¡Registro lleno! \n Ya no puede registras más pacientes");	
						break;
					
					case 2: 
						if(romper2==1)
						v1.recorrerV();// Recorre el vector para ver a los pacientes
						else
							JOptionPane.showMessageDialog(null, "Sin pacientes registrados");
						break;
						
					case 3:
						if(romper2==1)
						{
						   b1= JOptionPane.showInputDialog("Ingrese nombre completo del paciente :");	//Almacenamos el nombre que queremos utilizar para consultar su ultima fecha de consulta					
						   v1.cFecha(b1);	  							// mostrar fecha;
						}
						else
							JOptionPane.showMessageDialog(null, "Sin pacientes registrados");
							
						break;
					
					case 4:
						if(romper2==1)
						{
						   v1.ordena();                                                                           //------\\
						   JOptionPane.showMessageDialog(null,"Los pacientes han sido ordenados alfabeticamente");//       \\
						}																						  //		--- Sirve para ordenar alfabeticamente los nombres
						else																					  //		--- de los pacientes.
							JOptionPane.showMessageDialog(null, "Sin pacientes registrados");					  //	   //
							break;																				  //------//
					
					case 0: romper++;
					JOptionPane.showMessageDialog(null, "_-Hasta luego, Gracias por utilizar nuestro sistema.-_");   //Salir
						break;						
						
					default : JOptionPane.showMessageDialog(null, "Error, ingrese un valor Valido.");//Mensaje default al seleccionar una opcion incorrecta
						break;	
					
				}
				
			}while(romper==0);//fin de nuestro programa
		
	}
}