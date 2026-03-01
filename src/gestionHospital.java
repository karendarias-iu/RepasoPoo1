import java.util.ArrayList;

public class gestionHospital {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        Medico m1 = new Medico("Carlos Pérez", "123", 45, "M", "Cardiología", "REG01");
        Medico m2 = new Medico("Ana Ríos", "124", 39, "F", "Pediatría", "REG02");
        Medico m3 = new Medico("Luis Mora", "125", 50, "M", "Medicina General", "REG03");
        Medico m4 = new Medico("Elena Sanz", "126", 42, "F", "Ginecología", "REG04");

        MedicoCirujano c1 = new MedicoCirujano("Marta Casas", "200", 48, "F",
                "Neurocirugía", "CIR01", 5);

        Paciente p1 = new Paciente("Juan Gómez", "900", 60, "M",
                1, "Sanitas", 200.0, "Infarto");
        Paciente p2 = new Paciente("Lucía Lara", "901", 25, "F",
                2, "Sura", 30.0, "Fiebre");

        m1.asignarPaciente(p1);
        m1.asignarPaciente(p2);

        personas.add(m1);
        personas.add(m2);
        personas.add(m3);
        personas.add(m4);
        personas.add(c1);
        personas.add(p1);
        personas.add(p2);

        System.out.println("\n--- 1. POLIMORFISMO: PRESENTACIÓN DE DATOS ---\n");
        for (Persona p : personas) {
            p.presentar();
        }

        System.out.println("\n--- 2. ACCIÓN DEL MÉDICO ---\n");
        m1.revisarPacientes();
        m1.evaluarSintoma(p1.getSintoma());

        System.out.println("\n--- 3. ACCIÓN DEL PACIENTE ---\n");
        p1.pagarConsulta(50.0);
        p2.pagarConsulta(50.0);

        System.out.println("\n--- 4. ACCIÓN DEL CIRUJANO ---\n");
        c1.operar(true);

        System.out.println("\n--- 5. DEPENDENCIA: CLASE ATENCIÓN ---\n");
        Atencion atencion = new Atencion();
        atencion.procesarIngreso(p1);
    }
}

