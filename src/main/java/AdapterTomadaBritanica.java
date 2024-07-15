public class AdapterTomadaBritanica implements Tomada {
	private TomadaBritanica tomadaBritanica;

	public AdapterTomadaBritanica(TomadaBritanica tomadaBritanica) {
		this.tomadaBritanica = tomadaBritanica;
	}

	@Override
	public String conectar() {
		return tomadaBritanica.conectarNaTomadaBritanica() + " (Via adaptador)";
	}
}