package Embotelladora;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest{
  
	Embotelladora Embotelladora = new Embotelladora();
	public int pequenas, grandes, total;
	
   @Test (expected=NoSolution.class) 
   public void c1b3() // Test b1 -> resto > pequenas -> lo que tengo que embotellar es mayor a mi capacidad 
   { // resto = 8, pequenas = 2
      pequenas = 2;
      grandes = 5;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test 
   public void c1b2() // Test b2 -> resto = pequenas -> lo que tengo que embotellar es igual a mi capacidad
   { // resto = 8, pequenas = 8
      pequenas = 8;
      grandes = 5;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }
   
   @Test 
   public void c1b1() // Test b3-> resto < pequenas -> lo que tengo que embotellar es menor a la capacidad que tengo
   { // resto = 8, pequenas = 12
      pequenas = 12;
      grandes = 5;
      total = 10;
      Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
   }

}