package factorymethod;

public class ProcesadorFactory implements ProcesadorFactoryMethod
{

	@Override
	public Procesador crearProcesador(double velocidad, int nucleos, int cache)
	{
		if(velocidad <= 3.40 && nucleos ==2 && cache <3)
			return new ProcesadorI3(velocidad, nucleos, cache);
		else if(velocidad <= 3.40 && (nucleos==2 || nucleos==4) && (cache >=3 ||cache <=8))
			return new ProcesadorI5(velocidad, nucleos, cache);
		else if(velocidad <= 3.50 && (nucleos ==2 || nucleos == 4 || nucleos == 6) && (cache >=8 ||cache <=15))
			return new ProcesadorI7(velocidad, nucleos, cache);
		return null;
	}
}
