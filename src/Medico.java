import java.util.ArrayList;

public class Medico extends Persona {

    protected String especialidad;
    protected String registro;
    protected ArrayList<Paciente> pacientes;

    public Medico(String nombre, String dni, int edad, String genero,
                  String especialidad, String registro) {
        super(nombre, dni, edad, genero);
        this.especialidad = especialidad;
        this.registro = registro;
        this.pacientes = new ArrayList<>();
    }

    public void asignarPaciente(Paciente p) {
        pacientes.add(p);
    }

    @Override
    public void presentar() {
        System.out.println("[Médico] Dr. " + nombre + " - Especialidad: " + especialidad);
    }

    public void revisarPacientes() {
        System.out.println("Dr. " + nombre + " revisando lista de pacientes:");
        for (Paciente p : pacientes) {
            System.out.println(" - Paciente: " + p.nombre);
        }
    }

    public void evaluarSintoma(String sintoma) {
        int prioridad;

        switch (sintoma.toLowerCase()) {
            case "infarto":
                prioridad = 1;
                break;
            case "fiebre":
                prioridad = 3;
                break;
            case "dolor":
                prioridad = 2;
                break;
            default:
                prioridad = 4;
        }

        System.out.println("El Dr. " + nombre + " evaluó el síntoma [" +
                sintoma + "] y asignó Prioridad [" + prioridad + "]");
    }
}

