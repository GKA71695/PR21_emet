package elTiempo;

public class EstacionMeteolorlogica extends  Dia {
	
	private int temperatura;
	private int humedad;

	public EstacionMeteolorlogica(int numDias) {
		super(numDias);
		
		
	}




	public int getTemperatura() {
		
		int devolver;
		
		devolver = (int)(Math.random()*20);
		
		if(devolver < -10) {
			
			devolver = -10;
		}
		
		
		return devolver;
	}
	
	public int getHumedad() {
		
		int devolver;
		
		devolver = (int)(Math.random()*100);
		
		if(devolver < 30) {
			
			devolver = 30;
		}
		
		return devolver;
	}

	
	public String toString() {
		
		int[] vector = new int [super.numDias];
		
		String devolver = "[";
		
		for(int i=0; i< vector.length; i++) {
			
			devolver += vector[i] + ",";
		}
		devolver += "]";
		
		
		return devolver;
	}
	
	
	
}
