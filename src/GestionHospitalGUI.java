import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GestionHospitalGUI extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelBotones;
    private JTextArea areaTexto;
    private JButton btnPresentar;
    private JButton btnAccionMedico;
    private JButton btnAccionPaciente;
    private JButton btnAccionCirujano;
    private JButton btnDependencia;
    private JButton btnLimpiar;

    private ArrayList<String> personas;

    public GestionHospitalGUI() {
        this.panelBotones = panelBotones;
        setTitle("Sistema de Gestión Hospitalaria");
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        inicializarDatos();
        inicializarEventos();
    }

    private void inicializarDatos() {
        personas = new ArrayList<>();
        personas.add("Médico: Carlos Pérez - Cardiología");
        personas.add("Cirujano: Marta Casas - Neurocirugía");
        personas.add("Paciente: Juan Gómez - Infarto");
        personas.add("Paciente: Lucía Lara - Fiebre");
    }

    private void inicializarEventos() {
        btnPresentar.addActionListener(this::presentarPersonas);

        btnAccionMedico.addActionListener(e ->
                areaTexto.append("\nEl médico revisa a los pacientes registrados.\n"));

        btnAccionPaciente.addActionListener(e ->
                areaTexto.append("\nEl paciente realiza el pago de su consulta.\n"));

        btnAccionCirujano.addActionListener(e ->
                areaTexto.append("\nEl cirujano realiza una operación exitosa.\n"));

        btnDependencia.addActionListener(e ->
                areaTexto.append("\nIngreso del paciente procesado correctamente.\n"));

        btnLimpiar.addActionListener(e -> areaTexto.setText(""));
    }

    private void presentarPersonas(ActionEvent e) {
        areaTexto.append("\n--- LISTA DE PERSONAS ---\n");
        for (String persona : personas) {
            areaTexto.append(persona + "\n");
        }
    }
}
