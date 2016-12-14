package command;

public class ComandoApagar implements Comando
{
	private IServerVirtual server;
	public ComandoApagar(IServerVirtual server)
	{
		this.server = server;
	}
	@Override
	public void ejecutar()
	{
		server.apagar();
	}

}
