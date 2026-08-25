package servicioeingreso;

import  java.time.LocalTime; 

public class Servicioingreso {
      
	 private LocalTime horaEntrada;
	 private LocalTime horaSalida;
	 private efectivoPolicial efectivo;
	 private Movil movil;
	 private Recorrido recorrido;
		  
public Servicioingreso(LocalTime horaEntrada,LocalTime horaSalida, efectivoPolicial efectivo,Movil movil, Recorrido recorrido){
	
	this.horaEntrada= horaEntrada;
	this.horaSalida= horaSalida;
	this.efectivo= efectivo;
	this.movil= movil;
	this.recorrido= recorrido;
}
		 
	  }

