public class Paciente extends Persona {

    private int numeroHistorial;
    private String eps;
    private double saldo;
    private String sintoma;

    public Paciente(String nombre, String dni, int edad, String genero,
                    int numeroHistorial, String eps, double saldo, String sintoma) {
        super(nombre, dni, edad, genero);
        this.numeroHistorial = numeroHistorial;
        this.eps = eps;
        this.saldo = saldo;
        this.sintoma = sintoma;
    }

    public String getEps() {
        return eps;
    }

    public String getSintoma() {
        return sintoma;
    }

    @Override
    public void presentar() {
        System.out.println("[Paciente] " + nombre + " - EPS: " + eps + " - Sintoma: " + sintoma);
    }

    public void pagarConsulta(double costo) {
        System.out.print("El paciente " + nombre + " intenta pagar $" + costo +
                ". Saldo actual: $" + saldo + " -> Resultado: ");

        if (saldo >= costo) {
            saldo -= costo;
            System.out.println("Éxito");
        } else {
            System.out.println("Rechazado (Fondos insuficientes)");
        }
    }
}
