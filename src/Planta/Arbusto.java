package Planta;

public class Arbusto extends Planta {
	
	
	private double anchoArbusto;
	private boolean esDomestico;
	private String variedad;
	private boolean sePodaONo;
	private String colorHojas;

	
	public Arbusto() {
		super();
	}


	public Arbusto(double anchoArbusto, boolean esDomestico, String variedad, boolean sePodaONo, String colorHojas) {
		super();
		this.anchoArbusto = anchoArbusto;
		this.esDomestico = esDomestico;
		this.variedad = variedad;
		this.sePodaONo = sePodaONo;
		this.colorHojas = colorHojas;
	}

	public double getAnchoArbusto() {
		return anchoArbusto;
	}


	public void setAnchoArbusto(double anchoArbusto) {
		this.anchoArbusto = anchoArbusto;
	}


	public boolean isEsDomestico() {
		return esDomestico;
	}


	public void setEsDomestico(boolean esDomestico) {
		this.esDomestico = esDomestico;
	}


	public String getVariedad() {
		return variedad;
	}


	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}


	public boolean isSePodaONo() {
		return sePodaONo;
	}


	public void setSePodaONo(boolean sePodaONo) {
		this.sePodaONo = sePodaONo;
	}


	public String getColorHojas() {
		return colorHojas;
	}


	public void setColorHojas(String colorHojas) {
		this.colorHojas = colorHojas;
	}


	@Override
	protected void decir() {
		System.out.println("Hola,soy un arbusto");
		
	}
	
	
	
	
	
	
	
	

}
