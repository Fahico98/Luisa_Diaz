
package LuisaDiaz;

import java.util.Random;

public class Robot {
   
   Punto ubicacion;
   private String nombre;
   String[] direcciones;
   
   public Robot(Punto ubicacionInicial, String nombre){
      this.ubicacion = ubicacionInicial;
      this.nombre = nombre;
      this.direcciones = new String[]{"adelante", "atras", "derecha", "izquierda"};
   }
   
   public void mover(int x, int y){
      this.ubicacion = new Punto(x, y);
   }
   
   public void mover(){
      int x = new Random().nextInt(101);
      int y = new Random().nextInt(101);
      this.mover(x, y);
   }
   
   public void mover(int distancia, String direccion){
      switch(direccion){
         case "adelante":
            this.ubicacion.cambiarY(this.ubicacion.devolverY() + distancia);
            break;
         case "atras":
            this.ubicacion.cambiarY(this.ubicacion.devolverY() - distancia);
            break;
         case "derecha":
            this.ubicacion.cambiarX(this.ubicacion.devolverX() + distancia);
            break;
         case "izquierda":
            this.ubicacion.cambiarX(this.ubicacion.devolverX() - distancia);
            break;
      }
   }
   
   public String devolverUbicacion(){
      return "x: " + this.ubicacion.devolverX() + ", y: " + this.ubicacion.devolverY() + ".";
   }

   public String getNombre() {
      return nombre;
   }
}
