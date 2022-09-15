public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona humano1 = new Persona();

        humano1.setNombre("Federico");
        humano1.setEdad(21);
        humano1.setTelefono("676526738");

        System.out.println("Nombre: " + humano1.getNombre());
        System.out.println("Edad: " + humano1.getEdad());
        System.out.println("Teléfono: " + humano1.getTelefono());

    }
}
