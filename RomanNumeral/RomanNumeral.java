package RomanNumeral;

public class RomanNumeral {
		//Parámetro: s es un número romano
		//Devuelve: el número s en base 10
		//Eleva la excepción InvalidParameter si s no es número rumano

		public static int convierte(String s){
			char Rom[]= {' ', 'I', 'V', 'X', 'L', 'C', 'D', 'M'};
			int val[]= {0, 1, 5, 10, 50, 100, 500, 1000};
			// charAt(int index) -> devuelve el carácter situado en la posición index pasada por parámetro
			char letra=' ';
			int value = 0;
			int suma = 0;
			int ant = 0;

			for(int y=0; y<s.length();y++) {
				letra = s.charAt(y);
				if(letra!='I' && letra!='V' && letra!='X' && letra!='L' && letra!='C' && letra!='D' && letra!='M') {
					throw new InvalidParameter();
				}else {
					for(int j=0;j<Rom.length;j++) {
						if(letra==Rom[j]) {
							value = val[j];
							if(ant < val[j]){                     //si anterior menor al actual, resto el actual menos el ant
		                    				  suma = value - ant ;
		                        			ant = val[j];                	 // ant apunta al actual
		                   			}else {
		                        			ant = val[j];                    // si ant NO es menor al actual, todo normal
		                        			suma = suma + value;
		                   			}
						}
					}
				}
			}
			return suma;
		}

		public static void main(String[] args) {
			//System.out.println(convierte("V"));
			//System.out.println(convierte("D"));
			//System.out.println(convierte("XV"));
			//System.out.println(convierte("MMXV"));
			//System.out.println(convierte("IV"));
			//System.out.println(convierte("IX"));
			;

		}
	}
