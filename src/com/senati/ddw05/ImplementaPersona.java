package com.senati.ddw05;

import com.senati.ddw05.persona;

public class ImplementaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Obreros
		persona obrero1 = new persona(1,"Pedro","Gomez","M","1998-12-25");
		
		persona obrero2= new persona(2,"JeanPiere","Mattos","M","2000-12-27");
		
		persona obrero3= new persona(3,"Flor","Lopez","F","2002-06-16");
		
		persona obrero4= new persona(4,"Rosali","Nazario","F","2002-05-17");
		
		persona obrero5= new persona(5,"Carla","More","F","2000-09-20");
		
		System.out.println("");
		System.out.println("Datos registrados");
		System.out.println(obrero1.toString());
		System.out.println(obrero2.toString());
		System.out.println(obrero3.toString());
		System.out.println(obrero4.toString());
		System.out.println(obrero5.toString());
		
		
		//Gerente
		persona gerente1= new persona(1,"Alexis","Gomez","M","20002-02-02");
		
		System.out.println("");
		System.out.println("Datos registrados");
		System.out.println(gerente1.toString());
	}

}
