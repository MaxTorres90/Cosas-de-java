package Planta;

public class Flor extends Planta{
	
	
	private String colorPetalos;
	private int cantPetalos;
	private double rolorPistilo;
	private String variedad;
	private String estacion;
	
	
	

	public Flor() {
		super();
	}




	public Flor(String colorPetalos, int cantPetalos, double rolorPistilo, String variedad, String estacion) {
		super();
		this.colorPetalos = colorPetalos;
		this.cantPetalos = cantPetalos;
		this.rolorPistilo = rolorPistilo;
		this.variedad = variedad;
		this.estacion = estacion;
	}




	public String getColorPetalos() {
		return colorPetalos;
	}




	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}




	public int getCantPetalos() {
		return cantPetalos;
	}




	public void setCantPetalos(int cantPetalos) {
		this.cantPetalos = cantPetalos;
	}




	public double getRolorPistilo() {
		return rolorPistilo;
	}




	public void setRolorPistilo(double rolorPistilo) {
		this.rolorPistilo = rolorPistilo;
	}




	public String getVariedad() {
		return variedad;
	}




	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}




	public String getEstacion() {
		return estacion;
	}




	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}




	@Override
	protected void decir() {
		// TODO Auto-generated method stub
		System.out.println("Hola,soy una Flor");
		
	}
	

	
	
	
}
