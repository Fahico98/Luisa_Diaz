
package LuisaDiaz;

public class Ejercicio_1 {
   
   public static void main(String[] args) {
      
      Punto p1 = new Punto(2, 4);
      p1.mostrarCoordenadas();
      
      p1.cambiarX(9);
      p1.mostrarCoordenadas();
      
      p1.cambiarY(8);
      p1.mostrarCoordenadas();
      
      System.out.println("Coordenada x del punto p1: " + p1.devolverX());
      System.out.println("Coordenada y del punto p1: " + p1.devolverY());
      
      Punto3D p2 = new Punto3D(12, 7, 10);
      p2.mostrarCoordenadas();
      
      p2.cambiarX(4);
      p2.mostrarCoordenadas();
      
      p2.cambiarY(55);
      p2.mostrarCoordenadas();
      
      p2.cambiarZ(23);
      p2.mostrarCoordenadas();
      
      System.out.println("Coordenada x del punto p2: " + p2.devolverX());
      System.out.println("Coordenada y del punto p2: " + p2.devolverY());
      System.out.println("Coordenada z del punto p2: " + p2.devolverZ());
   }
}
