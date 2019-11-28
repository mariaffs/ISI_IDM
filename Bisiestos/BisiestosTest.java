import java.security.InvalidParameterException;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.experimental.runners.Enclosed;

@RunWith(Enclosed.class)
public class BisiestosTest
{
  public static class NotParameterizedPart{
     // Test de Interfaz
   @Test (expected = InvalidParameterException.class) public void YearZero()
   {
      int año = 0;
      Bisiestos.esBisiesto(año);
   }

   @Test (expected = InvalidParameterException.class) public void NegativeYear()
   {
      int año = -1;
      Bisiestos.esBisiesto(año);
    }
  }
  @RunWith (Parameterized.class)
  public static class ParameterizedPart{
   public int año;
   public boolean resultado;
   public ParameterizedPart (int año, boolean resultado)
   {
         this.año = año;
         this.resultado = resultado;
   }
   // Test de Funcionalidad
   //C1
   @Parameters
   public static Collection<Object[]> bisiestoValue()
   {
      return Arrays.asList (new Object [][] {{4,true},{100,false},{400,true}});
   }

   @Test
   public void testrun()
   {
     assertTrue ("Bisiestos Test", resultado == Bisiestos.esBisiesto(año));
   }
 }
}
