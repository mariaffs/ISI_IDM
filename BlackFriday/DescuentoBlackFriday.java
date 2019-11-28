import java.time.LocalDate;

public class DescuentoBlackFriday{
	// 	@param	precioOriginal es el precio de un producto marcado en la etiqueta
	//	@param	porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	//	@return	el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
	//					un descuento de porcentajeDescuento
	// 	@throws	Eleva la excepción InvalidParameter si precioOriginal es negativo

	public double precioFinal (double precioOriginal, double porcentajeDescuento) throws InvalidParameter{
		LocalDate blackFriday = LocalDate.of(2019, 11, 29);
		LocalDate today = LocalDate.now();
		if (precioOriginal < 0){
			throw new InvalidParameter();
		}else{
			if(today.compareTo(blackFriday)!= 0) {
				return precioOriginal * (1-porcentajeDescuento);
			}else {
				return precioOriginal;
			}
		}
	}
}
