package DescuentoBlackFriday;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest{
  
	DescuentoBlackFriday DescuentoBlackFriday = new DescuentoBlackFriday();
	public double precioOriginal, porcentajeDescuento;
	public double precioEsperado;
	
   @Test
   public void c1b2() // Precio original NO es < 0 
   { 
      precioOriginal = 100;
      porcentajeDescuento = 0.85;
      
      DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
      
   }
   
   @Test (expected=InvalidParameter.class) 
   public void c1b1() // precio original < 0 
   { 
      precioOriginal = -100; // si precioOriginal < 0 -> exception
      porcentajeDescuento = 0.85;
      
      DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
   
   }
   
   @Test
   public void c2b1() // Caso : Hoy es BlackFriday -> descuento (lo pruebo como BlackFriday es el día actual, para ver si aplica descuento)
   { 				 // precio esperado -> con descuento; precio obtenido -> con descuento
      precioOriginal = 100;
      porcentajeDescuento = 0.85;
      precioEsperado = 15; // expected 100 but was 15
      double Waiting = DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
      
      assertEquals(precioEsperado, Waiting, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento));
      
   }
   
   @Test
   public void c2b2() // Caso : Hoy NO es BlackFriday
   { 				 // precio esperado -> sin descuento; precio obtenido -> con descuento (lo pruebo como BlackFriday es el día actual para ver si funciona)
      precioOriginal = 100;
      porcentajeDescuento = 0.85;
      precioEsperado = 100;
      double Waiting = DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento);
      
      assertEquals(precioEsperado, Waiting, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento));
      // 'expected 100 but was 15'
   }
 
}