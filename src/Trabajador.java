public class Trabajador extends Persona {
    private Double salario;

    public Trabajador(String nombre, String telefono, Integer edad, Double salario) {
        super(nombre, telefono, edad);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
