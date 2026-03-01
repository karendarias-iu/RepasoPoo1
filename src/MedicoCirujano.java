public class MedicoCirujano extends Medico implements ICirujano {

    private int numeroQuirofano;

    public MedicoCirujano(String nombre, String dni, int edad, String genero,
                          String especialidad, String registro, int numeroQuirofano) {
        super(nombre, dni, edad, genero, especialidad, registro);
        this.numeroQuirofano = numeroQuirofano;
    }

    @Override
    public void operar(boolean quirofanoDisponible) {
        if (quirofanoDisponible) {
            System.out.println("El cirujano " + nombre +
                    " está operando en el quirófano " + numeroQuirofano);
        } else {
            System.out.println("El cirujano " + nombre +
                    " no pudo operar: quirófano no disponible");
        }
    }
}
