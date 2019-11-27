package BlackFriday;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.security.InvalidParameterException;

public class BlackFridayTest{
  
	BlackFriday BlackFriday = new BlackFriday();
	public double precioOriginal, porcentajeDescuento;
	public double precioEsperado;
	
	// Los tests los estudiamos de la siguiente manera: si NO es BlackFriday, aplicamos descuento
	// Hoy no es BlackFriday, se aplica descuento 
	
   @Test
   public void c1b2() // Precio original NO es < 0 
   { 
      precioOriginal = 100;
      porcentajeDescuento = 0.85;
      precioEsperado = 15;
      double Waiting = BlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
      //BlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
      
      assertEquals(precioEsperado, Waiting, BlackFriday.precioFinal(precioOriginal, porcentajeDescuento));
      
      
   }
   
   @Test (expected=InvalidParameterException.class) 
   public void c1b1() // precio original < 0
   { 
      precioOriginal = -100; // si precioOriginal < 0 -> exception
      porcentajeDescuento = 0.85;
      
      BlackFriday.precioFinal(precioOriginal, porcentajeDescuento);

      
   }
   
   @Test
   public void c2b1() 
   { 				 // precio esperado -> con descuento; precio obtenido -> con descuento
      precioOriginal = 100;
      porcentajeDescuento = 0.85;
      precioEsperado = 15; // expected 100 but was 15
      double Waiting = BlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
      
      assertEquals(precioEsperado, Waiting, BlackFriday.precioFinal(precioOriginal, porcentajeDescuento));
      
   }
   
   @Test
   public void c2b2()
   { 				 // precio esperado -> sin descuento; precio obtenido -> CON descuento
      precioOriginal = 100;
      porcentajeDescuento = 0.85;
      precioEsperado = 100; // expected 100 but was 15
      double Waiting = BlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
      
      assertEquals(precioEsperado, Waiting, BlackFriday.precioFinal(precioOriginal, porcentajeDescuento));
      
   }
   
   
}