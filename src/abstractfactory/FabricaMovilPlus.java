package abstractfactory;

public class FabricaMovilPlus implements FabricaMovil
{

	@Override
	public Samsungs7 crearSamsungs7()
	{
		
		return new Samsungs7Plus();
	}

	@Override
	public iPhone7 creariPhone7()
	{
		// TODO Auto-generated method stub
		return new iPhone7Plus();
	}

}
