import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TesteTomada {

	@Test
	void testeTomadaEuropeia() {
		TomadaEuropeia tomadaEuropeia = new TomadaEuropeia();
		assertEquals("Conectando ao dispositivo europeu.", tomadaEuropeia.conectar());
	}

	@Test
	void testeTomadaAmericana() {
		TomadaAmericana tomadaAmericana = new TomadaAmericana();
		assertEquals("Conectando ao dispositivo americano.", tomadaAmericana.conectar());
	}

	@Test
	void testeAdapterTomadaBritanica() {
		TomadaBritanica tomadaBritanica = new TomadaBritanica();
		Tomada adaptador = new AdapterTomadaBritanica(tomadaBritanica);
		assertEquals("Conectando na tomada do Reino Unido. (Via adaptador)", adaptador.conectar());
	}
}