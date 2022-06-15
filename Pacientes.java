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
class Pacientes
{
	//Atributos
	private String nombre;
	private String alergias;
	private	int	   edad;
	private	String	dia;//------\
	private	String	mes;// variables para fechas
 	private	String	año;//------/
	private char   sexo; // H o M 
	private double peso;
	private double talla;
	private String hclinico;
	
	
	public String getDia()//Retornamos por medio del metodo getDia el valor de dia para utilizarlo en otro metodo
	{
		return dia;
	}
	
	public String getMes()//Retornamos por medio del metodo getMes el valor del mes para utilizarlo en otro metodo
	{
		return mes;
	}
	
	public String getAño()//Retornamos por medio del metodo getAño el valor de año para utilizarlo en otro metodo
	{
		return año;
	}
	
	
	public String getNombre()//Retornamos por medio del metodo getNombre el valor del nombre para utilizarlo en otro metodo
	{
		return nombre;
	}
	
	public Pacientes()
	{	
	//	JOptionPane.showMessageDialog(null, "Ingresar Fecha de Consulta Medica");//-----------------------------------\\
		dia		= JOptionPane.showInputDialog("Dia");									//							   \\
		mes		= JOptionPane.showInputDialog("Mes");									//								\\
		año		= JOptionPane.showInputDialog("Año");									//								 \\
		nombre	= JOptionPane.showInputDialog("Nombre del paciente");					//									-- Constructor que utilizaremos para generar las preguntas al cliente
		edad	= Integer.parseInt(JOptionPane.showInputDialog("Edad del paciente"));	//									-- que usara el programa en general es donde llenaremos los atributos que utilizaremos
		sexo	= JOptionPane.showInputDialog("Sexo del paciente \nEspecifique: (H)hombre/(M)Mujer").charAt(0);//			-- para cada objeto del vector
		peso	= Double.parseDouble(JOptionPane.showInputDialog("Peso del paciente"));	//								 //
		talla	= Double.parseDouble(JOptionPane.showInputDialog("Talla del paciente"));//								//
		alergias= JOptionPane.showInputDialog("Qué alergias presenta.");		        //							   //
		hclinico= JOptionPane.showInputDialog("Historial clinico");				 //-----------------------------------//
	}


	
	public String mostrarDatos()//Por medio de este metodo retornaremos un string en el cual contiene todos los valores de los atributos
	{
		return "--EXPEDIENTE CLINICO--\n"+"Paciente: "+nombre+"\nSexo:"+sexo+"\nEdad :"+edad+" Años.\nPeso :"+peso+" Kg.\n"+"Talla :"+talla+"cm.\n"+"Alergias : "+alergias+". \n"+"Historial clinico : "+hclinico+". \nFecha de ultima consulta : "+dia+"/"+mes+"/"+año; //
	}
	
	
}