public class Bisiestos {
	// 	@return: 	Devuelve True si año es bisiesto, false en caso contrario
	// 	@throws:	Excepción InvalidParameter si año no es un parámetro válido

	public static boolean esBisiesto(int año) throws InvalidParameter{
		if(año==0 || año<0) {
				throw new InvalidParameter();
		}else {
			if(año%4 == 0)
				if(año%100 == 0)
					if(año%400 == 0)
						return true;
					else return false;
				else return true;
			else return false;
		}
	}

	public static void main(String[] args)
	{
		;
	}

}
