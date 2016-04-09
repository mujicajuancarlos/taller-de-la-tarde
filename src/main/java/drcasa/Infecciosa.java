package drcasa;

public class Infecciosa {

	private int cantidadCelulasAmenazadas;

	public void setCantidadDeCelulasAmenazadas(int cantidadDeCelulasAmenazadas) {
		// TODO Auto-generated method stub
		this.cantidadCelulasAmenazadas = cantidadDeCelulasAmenazadas;
	}

	public Boolean esAgresiva(Persona unaPersona) {
		// TODO Auto-generated method stub
		return unaPersona.getCantidadDeCelulasTotales() * 0.1 < this.cantidadCelulasAmenazadas;
	}

}
