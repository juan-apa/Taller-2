package logica;

import logica.Boleto.*;

public class Boletos{
	/*Atributos*/
	Boleto[] arreglo;
	int tope;
	
	/*Constructores*/
	public Boletos(int cantidadAsientos) {
		super();
		this.tope = 0;
		this.arreglo = new Boleto[cantidadAsientos];
	}
	
	/*Getters y Setters*/
	public Boleto[] getArreglo() {
		return arreglo;
	}
	
	public void setArreglo(Boleto[] arreglo) {
		this.arreglo = arreglo;
	}
	
	public int getTope() {
		return tope;
	}
	
	public void setTope(int tope) {
		this.tope = tope;
	}
	
	/*Funciones propias*/
	/*Devuelve true si el arreglo se encuentra vacio, false de lo contrario*/
	public boolean empty(){ 
		return (this.tope == 0);
	}
	
	/*Devuelve true si el arreglo esta lleno, false de lo contrario.*/
	public boolean full(){
		return (this.tope == this.arreglo.length);
	}
	
	/*Inserta un boleto al final en la siguiente posicion disponible.*/
	public void insert(Boleto insertar){
		this.arreglo[this.tope] = (Boleto)insertar;
		this.arreglo[this.tope].nroBoleto = this.tope;
		this.tope = this.tope + 1;
	}
	
	/*Sobreescritura de metodos*/
	@Override
	/*Pasa el arreglo a String*/
	public String toString() {
		String devolver = new String();
		devolver = "[";
		
		for(int i = 0; i < this.tope; i++){
			devolver = devolver + this.arreglo[i].toString();
			devolver = devolver + ", ";
		}
		
		devolver = devolver + "[tope=" + tope + "]]";
		return devolver;
	}

	
}