package Bisiestos;

import java.security.InvalidParameterException;

public class Bisiestos {
	// Devuelve True si año es bisiesto, false en caso contrario
	// Excepción InvalidParameter si año no es un parámetro válido
	
	public static boolean esBisiesto(int año) {
		if(año==0 || año<0) {
				throw new InvalidParameterException("invalid parameter");
		}else {
			if(año%4 == 0)
				if(año%100 == 0)
					if(año%400 == 0)
						return true;
					else return false;
				else return false;
			else return false;
		}
	}
	
	public static void main(String[] args)
	{
		;
	}
	
}