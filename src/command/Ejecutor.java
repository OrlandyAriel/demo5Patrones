package command;

public class Ejecutor
{
	private Comando comm;
	public Ejecutor(Comando comm)
	{
		this.comm = comm;
	}
	public void run()
	{
		comm.ejecutar();
	}
}
