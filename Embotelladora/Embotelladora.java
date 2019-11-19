public class Embotelladora{
	//	@param 	pequenas: número de botellas en almacén de 1L
	//	@param 	grandes: número de botellas en almacén de 5L
	//	@param 	total: número total de litros que hay que embotellar
	// 	@return	número de botellas pequeñas necesarias para embotellar el total de lı́quido, teniendo
	//			en cuenta que hay que minimizar el número de botellas pequeñas: primero
	//			se rellenan las grandes
	// 	@throws	Eleva la excepción NoSolution si no es posible embotellar todo el lı́quido
	
	public int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution{
		int resto;
		resto = total - (total/grandes);
		if(resto <= pequenas){
			return resto;
		}else{
			throw new NoSolution();
		}
	}
}
