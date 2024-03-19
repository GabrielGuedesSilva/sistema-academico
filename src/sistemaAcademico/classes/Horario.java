package sistemaAcademico.classes;

public class Horario {
	public int hora_inicio;
	public int hora_fim;
	public String dia;
	
	public Horario (int hora_inicio, int hora_fim, String dia) {
		this.hora_inicio = hora_inicio;
		this.hora_fim = hora_fim;
		this.dia = dia;
	}
	
	@Override
	public String toString() {
		return 
		"(Hora ínicio: " + this.hora_inicio + ":00 | " +
		"Hora fim: " + this.hora_fim + ":00\n | " +
		"Dia: " + this.dia + ")\n";
		
	}
}
