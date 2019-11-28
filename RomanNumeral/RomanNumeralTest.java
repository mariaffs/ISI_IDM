import java.security.InvalidParameterException;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.experimental.runners.Enclosed;

@RunWith(Enclosed.class)
public class RomanNumeralTest
{
  public static class NotParameterizedPart{
     // Test de Interfaz
   @Test (expected = InvalidParameterException.class) public void NotRomanString()
   {
      String str = "abc";
      RomanNumeral.convierte(str);
   }
   @Test (expected = InvalidParameterException.class) public void InvalidRomanNumber()
   {
      String str = "XXXX";
      RomanNumeral.convierte(str);
    }
    @Test (expected = InvalidParameterException.class) public void InvalidRomanNumber2()
    {
       String str = "XXXIXX";
       RomanNumeral.convierte(str);
     }
     @Test (expected = InvalidParameterException.class) public void InvalidRomanNumber3()
     {
        String str = "IXX";
        RomanNumeral.convierte(str);
      }
      @Test (expected = InvalidParameterException.class) public void InvalidRomanNumber4()
      {
         String str = "IIV";
         RomanNumeral.convierte(str);
       }
       @Test (expected = InvalidParameterException.class) public void InvalidRomanNumber5()
       {
          String str = "IVI";
          RomanNumeral.convierte(str);
        }
        @Test (expected = InvalidParameterException.class) public void InvalidRomanNumber6()
        {
           String str = "LXL";
           RomanNumeral.convierte(str);
         }
  }
  @RunWith (Parameterized.class)
  public static class ParameterizedPart{
   public String roman;
   public int resultado;
   public ParameterizedPart (String roman, int resultado)
   {
         this.roman = roman;
         this.resultado = resultado;
   }
   // Test de Funcionalidad
   //C1
   @Parameters
   public static Collection<Object[]> romanValue()
   {
      return Arrays.asList (new Object [][] {{"III",3},{"IV",4},
      {"V",5},{"VIII",8},{"IX",9},{"X",10},{"XXXIX",39},{"XLIX",49},
      {"LIX",59},{"LXXXIX",89},{"XCIX",99},{"CIX",109},{"CCCXCIX",399},
      {"CDXCIX",499},{"DXCIX",599},{"DCCCXCIX",899},{"CMXCIX",999},
      {"MXCIX",1099},{"MMMCDXCIX",3499}});
   }

   @Test
   public void testrun()
   {
     assertTrue ("roman test", resultado == RomanNumeral.convierte(roman));
   }
 }
}
