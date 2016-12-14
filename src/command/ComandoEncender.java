package command;

public class ComandoEncender implements Comando
{
	private IServerVirtual server;
	public ComandoEncender(IServerVirtual server)
	{
		this.server = server;
	}
	@Override
	public void ejecutar()
	{
		server.comprobarConexionInternet();
	}

}
