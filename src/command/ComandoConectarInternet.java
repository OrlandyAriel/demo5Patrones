package command;

public class ComandoConectarInternet implements Comando
{
	private IServerVirtual server;
	public ComandoConectarInternet(IServerVirtual server)
	{
		this.server = server;
	}
	@Override
	public void ejecutar()
	{
		server.comprobarConexionInternet();
	}

}
