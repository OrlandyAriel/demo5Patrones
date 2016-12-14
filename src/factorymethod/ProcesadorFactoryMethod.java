package factorymethod;

public interface ProcesadorFactoryMethod
{
	public Procesador crearProcesador(double velocidad, int nucleos, int cache);
}
