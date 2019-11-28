import java.security.InvalidParameterException;

public class RomanNumeral {

		static final char Rom[]= {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		static final int val[]= {1, 5, 10, 50, 100, 500, 1000};
		// 	@param: 	s es un número romano
		//	@return: 	el número s en base 10
		//	@throws:	Eleva la excepción InvalidParameter si s no es número rumano

		public static int convierte(String s){
			// charAt(int index) -> devuelve el carácter situado en la posición index pasada por parámetro
			char letra= ' ';
			int value = 0;
			int suma = 0;
			int ant = 0;

			if(!romanAnalyzer(s)){
				throw new InvalidParameterException("Número romano inexistente");
			}
			for(int y=0; y<s.length();y++) {
				letra = s.charAt(y);
				for(int j=0;j<Rom.length;j++) {
					if(letra==Rom[j]) {
						value = val[j];
						if(ant < value){             //si anterior menor al actual, resto el actual menos el ant
      				suma = suma + (value - 2*ant);
	           }else{												// si ant NO es menor al actual, todo normal
	            suma = suma + value;
	           }
         		 ant = val[j];
					 }
				 }
				}
				return suma;
			}

			private static int posRom(char c){
				for(int j=0;j<Rom.length;j++){
					if(c==Rom[j]){
						return j;
					}
				}
				return -1;
			}

			private static boolean romanAnalyzer(String s){
				char c;
				int pos, prevpos = -1;
				int anterior = -1;
				int count = 0;

				for(int i = 0; i < s.length(); i++){
					c = s.charAt(i);
					pos = posRom(c);
					if(pos == -1){
						return false;
					}
					System.out.print(c);
					if(i > 0){
						if(prevpos%2 == 1 && prevpos<=pos){
									return false;
						}
						if(anterior%2 == 1 && anterior == pos){
									return false;
						}
						if(prevpos == pos){
							if(++count >= 3){
								return false;
							}
							if(anterior != -1 && anterior < pos){
								return false;
							}
							anterior = prevpos;
							prevpos = pos;
							continue;
						}else{
							count = 0;
						}
						if(prevpos<pos && prevpos + 2 < pos){
							return false;
						}
						if(prevpos<pos && anterior < pos && anterior != -1){
							return false;
						}
						if(prevpos>=pos && anterior <= pos && anterior != -1){
							return false;
						}
						if(prevpos>pos && anterior == pos){
							return false;
						}
					}
					anterior = prevpos;
					prevpos = pos;
			}
			System.out.println("");
			return true;
		}
		public static void main(String[] args) {
			;
		}
	}
