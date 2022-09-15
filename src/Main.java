public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona humano1 = new Persona();

        // Persona
        humano1.setNombre("Federico");
        humano1.setEdad(21);
        humano1.setTelefono("676526738");

        // Cliente
        Cliente cliente1 = new Cliente("Mariela", 1200.0);
        cliente1.setEdad(34);
        cliente1.setTelefono("763351356");

        // Trabajador
        Trabajador empleado = new Trabajador("Luis", "623781293", 36, 1850.0);

        System.out.println("\n/----- Persona -----/");
        System.out.println("Nombre: " + humano1.getNombre());
        System.out.println("Edad: " + humano1.getEdad() + " años");
        System.out.println("Teléfono: " + humano1.getTelefono());

        System.out.println("\n/----- Cliente -----/");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad() + " años");
        System.out.println("Teléfono: " + cliente1.getTelefono());
        System.out.println("Crédito: " + cliente1.getCredito() + " €");

        System.out.println("\n/----- Trabajador -----/");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad() + " años");
        System.out.println("Teléfono: " + empleado.getTelefono());
        System.out.println("Salario: " + empleado.getSalario() + " €");
    }
}
