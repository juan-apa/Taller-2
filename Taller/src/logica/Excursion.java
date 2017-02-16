package logica;

import java.text.SimpleDateFormat;

public class Excursion {
	String codigo;
	String destino;
	SimpleDateFormat hPartida;
	SimpleDateFormat hLlegada;
	double precioBase;
	// bus : Bus (revisar)

public Excursion(String codigo, String destino, SimpleDateFormat hPartida, SimpleDateFormat hLlegada, double precioBase){
	this.codigo = codigo;
	this.destino = destino;
	this.hLlegada = hLlegada;
	this.hPartida = hPartida;
	this.precioBase = precioBase;
}

public String getCodigo(){
	return this.codigo;
}

public String getDestino(){
	return this.destino;
}

public SimpleDateFormat gethPartida(){
	return this.hPartida;
}

public SimpleDateFormat gethLlegada(){
	return this.hLlegada;
}

public double getPrecioBase(){
	return this.precioBase;
}

public void setCodigo(String cod){
	this.codigo = cod;
}

public void setDestino(String des){
	this.destino = des;
}

public void sethPartida(SimpleDateFormat hora){
	this.hPartida = hora;
}

public void sethLlegada(SimpleDateFormat hora){
	this.hLlegada = hora;
}

public void setPrecioBase(double precio){
	this.precioBase = precio;
}
}