package com.business;
import java.util.*;
import com.presentation.Interfaz;
import com.data.Contacto;


public class Agenda {
public static void main(String[] args) {
// TODO Auto-generated method stub
Interfaz i1=new Interfaz();
i1.lectura();
}
//Lista de contactos
LinkedList<Contacto> lista= new LinkedList<Contacto>();

public boolean add(Contacto contacto){
	char[] letras=contacto.getNombre().toCharArray();

	if(letras.length>=0 && letras.length<=10) {
		String enteroString=Long.toString(contacto.getCelular());
		letras=enteroString.toCharArray();

		if(letras.length==8) {

			lista.add(contacto);
			return true;
		}
	}
	return false;
}

@Override
public String toString() {
	return "Agenda [lista=" + lista + "]";
	}
public LinkedList<Contacto> getLista() {	
	return lista;
	}

public void setLista(LinkedList<Contacto> lista) {
	this.lista = lista;
	}

}
