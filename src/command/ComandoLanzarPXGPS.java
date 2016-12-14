package command;

public class ComandoLanzarPXGPS implements Comando
{

	private IServerVirtual server;
	public ComandoLanzarPXGPS(IServerVirtual server)
	{
		this.server = server;
	}
	@Override
	public void ejecutar()
	{
		server.comprobarConexionInternet();
	}

}
