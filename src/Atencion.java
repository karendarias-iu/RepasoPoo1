public class Atencion {

    public void procesarIngreso(Paciente p) {
        String pabellon;

        switch (p.getEps().toLowerCase()) {
            case "sanitas":
                pabellon = "Pabellón A (Norte)";
                break;
            case "sura":
                pabellon = "Pabellón B (Sur)";
                break;
            default:
                pabellon = "Pabellón General";
        }

        System.out.println("Atención: El paciente " + p.nombre +
                " ha sido enviado al " + pabellon);
    }
}
