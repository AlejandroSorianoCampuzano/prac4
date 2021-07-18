package ejercicioherencia;

public class TestHerencia2 {

	public static void main(String[] args) {
		ProductoFresco fresco = new ProductoFresco();
		ProductoRefrigerado refrigerado = new ProductoRefrigerado();
		ProductoCongelado congelado = new ProductoCongelado();
		
		fresco.setFechaCaducidad("23/11/2016");
		fresco.setFechaEnvasado("16/11/2016");
		fresco.setNumLote(1);
		fresco.setPaisOrigen("España");
		
		System.out.println("----Fresco---- \nFechaCaducidad: "+fresco.getFechaCaducidad().toString());
		System.out.println("FechaEnvasado: "+fresco.getFechaEnvasado().toString());
		System.out.println("NumLote: "+fresco.getNumLote());
		
		refrigerado.setCodigoOrganismo(123);
		refrigerado.setFechaCaducidad("24/11/2016");
		refrigerado.setNumLote(2);
		
		System.out.println("\n----Refrigerado---- \nFechaCaducidad: "+refrigerado.getFechaCaducidad().toString());
		System.out.println("CodigoOrganismo: "+refrigerado.getCodigoOrganismo());
		System.out.println("NumLote: "+refrigerado.getNumLote());
		
		congelado.setTempRecomendada(-4.5);
		congelado.setFechaCaducidad("01/01/2030");
		congelado.setNumLote(3);
		
		System.out.println("\n----Congelado---- \nFechaCaducidad: "+congelado.getFechaCaducidad().toString());
		System.out.println("TempRecomendada: "+congelado.getTempRecomendada());
		System.out.println("NumLote: "+congelado.getNumLote());
	}

}
