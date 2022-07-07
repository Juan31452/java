package ejemplossemana2;

// mayuscula al inicial y mayusculas para otras palabras
public class DatosPersona {
        //Declaracion de variables (Atributos, propiedades)
	// minuscula al inicial y mayusculas para otras palabras
        private String nombre;
        private String apellido;
        private int edad;
    
        //constructor y parametros asignados
        //Vacio para crear un objeto y despues pasar los atributos
        public DatosPersona(){
        }
        
        //Constructor con argumentos, puede crear el objeto 
        //pasandole la informacion
        public DatosPersona (String pNombre, String pApellido, int pEdad)
        {
            this.nombre = pNombre;
            this.apellido = pApellido;
            this.edad = pEdad;
        }//cierre del constructor
    
        //Métodos de acceso y mutadores
        //Setters: establecer, sirven para asignar un valor a un 
        //campo/atributo.
        //Getters:obtener, sirven para tener el valor de un 
        //campo/atributo.
        // public void setNombre(String valorNombre){
        //     nombre = valorNombre;   
        // }
        // public void setApellido (String valorApellido){
        //     apellido = valorApellido;
        // }
        // public void setEdad(int valorEdad){
        //     edad = valorEdad;
        // }
    
        // //Descriptor de acceso getter. Cambiar contenidos de las variables de clase
        // public String getNombre(){
        //     return nombre;
        // }
        // public String getApellido(){
        //     return apellido;
        // }
        // public int getEdad(){
        //     return edad;
        // }
    
	// minuscula al inicial y mayusculas para otras palabras
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String Vapellido) {
            apellido = Vapellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public static void main(String[] args) {
            DatosPersona pers = new DatosPersona("Ana", "Ocampo", 37);
            //llamado los elementos que genere con getter, puedo obtener 
            //la informacion que tengo allí almacenda
            System.out.println("El registro es: \n * Nombre: " + pers.getNombre()+ " * Apellido: " + pers.getApellido() + " * Edad: "+ pers.getEdad());
            //Cambiar un atributo con set
            pers.setApellido("Ruiz");
            System.out.println("El registro es: \n * Nombre: " + pers.getNombre()+ " * Apellido: " + pers.getApellido() + " * Edad: "+ pers.getEdad());
            
            //Creando un objeto desde el construtor vacio.
            DatosPersona pers1 = new DatosPersona();
            //la informacion que tengo allí almacenda
            System.out.println("El registro es: \n * Nombre: " + pers1.getNombre()+ " * Apellido: " + pers1.getApellido() + " * Edad: "+ pers1.getEdad());
            //Cambiar un atributo con set
            pers1.setApellido("Lopéz");
            pers1.setNombre("Lola");
            System.out.println("El registro es: \n * Nombre: " + pers1.getNombre()+ " * Apellido: " + pers1.getApellido() + " * Edad: "+ pers1.getEdad());
        }
}
