public class Cliente extends Persona{
    private Double credito;

    public Cliente(String nombre, Double credito) {
        super(nombre);
        this.credito = credito;
    }

    //getters and setters

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }
}
