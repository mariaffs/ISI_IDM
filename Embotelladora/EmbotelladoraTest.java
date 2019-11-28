import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest{
  
	Embotelladora Embotelladora = new Embotelladora();
	public int pequenas, grandes, total;
	
   @Test (expected=NoSolution.class) 
   public void c1b3() // Test b1 -> resto > pequenas -> lo que tengo que embotellar es mayor a mi capacidad 
   { // resto = 2, pequenas = 1
      pequenas = 1;
      grandes = 5;
      total = 12;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test 
   public void c1b2() // Test b2 -> resto = pequenas -> lo que tengo que embotellar es igual a mi capacidad
   { // resto = 2, pequenas = 2
      pequenas = 2;
      grandes = 5;
      total = 12;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test 
   public void c1b1() // Test b3-> resto < pequenas -> lo que tengo que embotellar es menor a la capacidad que tengo
   { // resto = 1, pequenas = 12
      pequenas = 12;
      grandes = 5;
      total = 11;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test 
   public void pequenascero() // si pequenas = 0 y he embotellado todo en las de 5L: 
   { // resto <= pequenas -> c1.b1
      pequenas = 0;
      grandes = 2;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }

   @Test 
   public void pequenascero2() // pequenas = 0 y he embotellado en las de 5L y además me sobran grandes
   { // resto <= pequenas -> c1.b1
      pequenas = 0;
      grandes = 3;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test 
   public void nmayoragrandes() // si número de botellas grandes que necesito es mayor al que tengo y tengo suficientes pequenas: 
   { // resto <= pequenas -> c1.b1
      pequenas = 6;
      grandes = 1;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test 
   public void notengograndes() // si no tengo botellas grandes y tengo suficientes pequenas 
   { // resto <= pequenas -> c1.b1
      pequenas = 14;
      grandes = 0;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test (expected=NoSolution.class) 
   public void nograndesnopequenas() // NO tengo botellas grandes y no tengo suficientes pequenas
   { // resto > pequenas -> c1.b3 
      pequenas = 3;
      grandes = 0;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
}
