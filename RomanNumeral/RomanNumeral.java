package RomanNumeral;

import java.security.InvalidParameterException;

public class RomanNumeral {
	//Parámetro: s es un número romano
	//Devuelve: el número s en base 10
	//Eleva la excepción InvalidParameter si s no es número rumano
	
	public static int convierte(String s){
		char Rom[]= {' ', 'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int val[]= {0, 1, 5, 10, 50, 100, 500, 1000};
		// charAt(int index) -> devuelve el carácter situaso en la posición index pasada por parámetro
		char letra=' ';
		int value = 0;
		int suma = 0;
		
		for(int y=0; y<s.length();y++) {
			letra = s.charAt(y);
			if(letra!='I' && letra!='V' && letra!='X' && letra!='L' && letra!='C' && letra!='D' && letra!='M') {
				throw new InvalidParameterException("Número romano no existente");
			}else {
				for(int j=0;j<Rom.length;j++) {
					if(letra==Rom[j]) {
						value = val[j];
						suma = suma + value;
					}
				} // FALTA LEER NÚMEROS MENORES DELANTE DE NÚMEROS MAYORES. ejemplo: 4 -> IV
			}
		}
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(convierte("V"));
		System.out.println(convierte("D"));
		System.out.println(convierte("XV"));
		System.out.println(convierte("MMXV"));
	}
}
