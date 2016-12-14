package factorymethod;

public abstract class Procesador
{
	private double velocidad;
	private int nucleos;
	private int cache;
	public Procesador(double velocidad,int nucleos, int cache)
	{
		this.velocidad = velocidad;
		this.nucleos = nucleos;
		this.cache = cache;
	}
	public abstract String getTipoProcesador();
	
}
