package ejemplossemana2.Herencia;
//extends Persona por que hereda lo de la clase persona,
// metodos y atributos
public class Estudiante extends Persona{
    private String carrera; 
    private int semestre;

    public Estudiante() {
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
   

}
