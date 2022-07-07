package ejemplossemana2.Herencia;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Estudiante e = new Estudiante();
        Docente pro = new Docente();

        p.setNombre("Luis Pinzo Ruiz");
        p.setEdad(45);

        e.setNombre("Andres Roncancio Pardo");
        e.setSemestre(2);
        e.setCarrera("Ingeniería de sistemas");

        pro.setNombre("Manuel Esteban Tellez");
        pro.setMateria("Electrónica II");
        pro.setTipoCargo("Docente Títular");

        System.out.println("Vamos a imprimir el objeto \"p\" de la clase padre Persona:  ");
        System.out.printf("Nombre: %s,  Edad %d \n", p.getNombre(), p.getEdad());
        
        System.out.print("Vamos a imprimir el objeto \"e\" de la clase hija Estudiante:  ");
        System.out.printf("\nNombre: %s,  Carrera %s, Legajo %d \n", e.getNombre(), e.getCarrera(), e.getSemestre());

        System.out.print("Vamos a imprimir el objeto \"pro\" de la clase hija Docente:  ");
        System.out.printf("\nNombre: %s,  Materia %s, Cargo %s \n", pro.getNombre(), pro.getMateria(), pro.getTipoCargo());
    }
}
