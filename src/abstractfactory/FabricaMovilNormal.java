package abstractfactory;

public class FabricaMovilNormal implements FabricaMovil
{

	@Override
	public Samsungs7 crearSamsungs7()
	{
	
		return new Samsungs7Normal();
	}

	@Override
	public iPhone7 creariPhone7()
	{
		return new iPhone7Normal();
	}

}
