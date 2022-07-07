package ejemplossemana2.Herencia;

//extends Persona por que hereda lo de la clase persona,
// metodos y atributos
public class Docente extends Persona{
    private String materia;
    private String tipoCargo;
    public Docente() {
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getTipoCargo() {
        return tipoCargo;
    }
    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
    
}
