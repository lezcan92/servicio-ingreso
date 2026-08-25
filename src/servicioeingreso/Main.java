
package servicioeingreso;

import java.time.LocalTime;

public class Main {
	
	public static void main(String[] args) {

efectivoPolicial efectivo= new
efectivoPolicial("Lucas Lezcano", 123456, Jerarquia.Sargento);

System.out.println(efectivo.getNombre());
System.out.println(efectivo.getLegajo());
System.out.println(efectivo.getJerarquia());

Movil movil=new
Movil("23502", "AD460RF" , "Toyota Hilux");

Recorrido recorrido=new
Recorrido(3, "varela-mitre-vergara");

Servicioingreso Servicio= new
Servicioingreso(LocalTime.now(),LocalTime.now(),efectivo,movil,recorrido);

System.out.println("ingreso al servicio creado correctamente");	
	}
}