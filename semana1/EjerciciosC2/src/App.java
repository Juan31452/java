import java.util.Scanner;
/*&&	 And lógico (y)	 ||	 Or lógico (o)*/

public class App {
    public static void main(String[] args) throws Exception {
       /* //Datos para punto uno
        int dia, mes, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fecha de nacimiento:");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();
        sc.close();
        Uno(dia, mes, a);*/
        

        /* 
        // Datos para el punto dos
        double pu, c, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio de la unidad del producto: ");                                          
        pu = sc.nextDouble();
        System.out.print("Cantidad de productos vendidos: ");
        c = sc.nextDouble();
        System.out.print("Valor del IVA en porcentaje: ");
        i= sc.nextDouble();
        sc.close();
        Dos(pu, c, i);*/
        

        
        //Datos para el punto tres
        int N, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número N : ");
        N=sc.nextInt();
        System.out.print("Ingrese el número m : ");
        m=sc.nextInt();
        sc.close();
        Tres(N,m);
      

       /*
        //Datos para el punto cuatro
        double v;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la velocidad en Km/h : ");
        v=sc.nextDouble();
        Cuatro(v);
        sc.close();
        */

        /*
        //Datos para el punto cinco
        double c1,c2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el cateto uno : ");
        c1=sc.nextDouble();
        System.out.print("Ingrese el cateto dos : ");
        c2=sc.nextDouble();
        Cinco(c1,c2);
        sc.close();
        */

        /*
        //Datos para el punto seis
        //Cambie los condicionales
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero para saber si es multiplo de Diez : ");
        n=sc.nextInt();
        Seis(n);
        sc.close();
        */

        /*
        //Datos para el punto siete
        //Cambie los condicionales
        char c;
        //Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese la letra para comprobar : ");
        //lee un byte y devuelve un int. Como cada carácter 
        //representa un número, podemos convertir la int en un carácter y viceversa.
        c= (char) System.in.read();
        //par utilizar Scanner se debe hacer lo siguiente:
        // lee el primer carácter del escáner.
        //c = sc.next().charAt(0);// solo tomar un elemento
        Siete(c);
        //sc.close();
        */

        /*
        //Datos para el punto ocho
        //Cambie los condicionales
        double di, ds;
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese dividendo : ");
        di = sc.nextDouble();
        System.out.print("Ingrese divisor : ");
        ds = sc.nextDouble();
        Ocho(di,ds);
        sc.close();
        */

        /*
        //Datos para el punto nueve
        //generar un proceso cuando se tiene igualdad entre dos o mas
        int n1,n2,n3;
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese el primer número : ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número : ");
        n2 = sc.nextInt();
        System.out.print("Ingrese el tercer número : ");
        n3 = sc.nextInt();
        Nueve(n1,n2,n3);
        sc.close();
        */

        
        /*
        //Datos para el punto Diez
        //Cambie los condicionales
        int h,m,s;
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese las horas: ");
        h = sc.nextInt();
        System.out.print("Ingrese los minutos : ");
        m= sc.nextInt();
        System.out.print("Ingrese los segundos : ");
        s = sc.nextInt();
        Diez(h,m,s);
        sc.close();
        */

        /*
        //Datos para el punto Once
        //Cambie la forma del switch y que tambien contemple si ingresan otro numero 
        int m;
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese el número del mes: ");
        m = sc.nextInt();
        Once(m);
        sc.close();
        */

        //Datos para el punto Doce
        //Añada un switch y que el usuario diga con cual ciclo quiere realizarlo
        // System.out.println("Numeros del 1 al 100: ");  
        // Doce();



    }
   
    public static void Uno(int dia, int mes, int a){
        int ns, valor, e1, e2, e3, e4;                                          
        valor = dia + mes + a;//12+7+1980 = 1999
        e1 = valor/1000;      //obtiene la primera cifra 1
        e2 = (valor/100)%10;    //(19)%10  obtiene la segunda cifra 9
        e3 = (valor/10)%10;     //(199)%10  obtiene la tercera cifra 9
        e4 = valor%10;        //obtiene la última cifra 9
        ns = e1 + e2 + e3 + e4;
        System.out.println("Su número de la suerte es: " + ns);  
    }

    public static void Dos(double pu, double c, double i){
        double pSinIva,tIva;
        pSinIva = pu * c;
        tIva = (pSinIva * i) / 100;
        System.out.println("Precio de venta -> " + (pSinIva + tIva));      
    }
    public static void Tres(int N, int m)
    {
        // utilizo la libreria matematica para realizar la potencia
        int p=(int)Math.pow(10,m);//Math.pow devuelve un número de tipo double
        //se convierte a int
        N = N / p; //división entre enteros
        System.out.println("Número modificado " + N);
    }
    public static void Cuatro(double v)
    {
        // 0.2777 es la relacion entre 1000 dividido 36000
        double vms=v*0.27777;
        System.out.println(v + " Km/h -> " + (double)(vms) + " m/s");   
    }
    
    public static void Cinco(double c1, double c2){
        double h=Math.sqrt(Math.pow(c1,2)+ Math.pow(c2, 2));
        System.out.println("Hipotenusa -> " + h );   
    }
    public static void Seis(int n){
        if(n%10==0){
            System.out.println("Es múltiplo de 10");   
        }
          
        else
        {
            System.out.println("No es múltiplo de 10");
        }
           
    }

    public static void Siete(char c){
        //método isUpperCase de la clase Character determina 
        //si el carácter especificado es un carácter en mayúsculas.
        if (Character.isUpperCase(c))         
            System.out.println("Es una letra mayúscula");
        else 
            System.out.println("No es una letra mayúscula");
        
    }

    public static void Ocho(double di, double ds){
        if(ds==0){
            System.out.println("No se puede dividir por cero");   
         }else{
            double r=di/ds;
             System.out.println("El resultado de la división es: "+r);          
         }
    }

    public static void Nueve(int n1, int n2, int n3){
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
    }

    public static void Diez(int h, int m, int s){
        if(h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60) //&& And y                                                         
            System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");
    }

    public static void Once(int m){
        if(m < 1 || m > 12) 
        //se comprueba que el valor del mes es correcto                                   
            System.out.println("No es un mes valido");
        else{  //si el mes es correcto
            switch(m){  //nombre del mes segun sea el valor                                  
                case 1: System.out.print("Enero");
                        break;
                case 2: System.out.print("Febrero");
                        break;
                case 3: System.out.print("Marzo");
                        break;
                case 4: System.out.print("Abril");
                        break;
                case 5: System.out.print("Mayo");
                        break;
                case 6: System.out.print("Junio");
                        break;
                case 7: System.out.print("Julio");
                        break;
                case 8: System.out.print("Agosto");
                        break;
                case 9: System.out.print("Septiembre");
                        break;
                case 10: System.out.print("Octubre");
                        break;
                case 11: System.out.print("Noviembre");
                        break;
                case 12: System.out.print("Diciembre");
                        break;
            }
            // mostrar si es un mes de 30, 31 0 28 días
            // Ene Mar May Juli Agosto Octu Dici
            // Feb 28
            //Abril=4  Junio=6 Sep=9 Nov=11 

            if(m == 4 || m == 6 || m == 9 || m == 11)       
               System.out.println(" Mes de 30 días");
            else if(m == 2)
                     System.out.println(" Mes de 28 días");
                   else
                      System.out.println(" Mes de 31 días");
        }
    }
    
    public static void Doce(){
        
        // con el ciclo while
        int i=1;
        System.out.println("Realizado con el ciclo While");
        while(i<=100) {
            System.out.println(i);                                                                         
            i++;
        }

        // //Con el ciclo do while
        // int i=1;
        // System.out.println("Realizado con el ciclo Do While");
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=100);

        //con el ciclo for
        // System.out.println("Realizado con el ciclo For");
        // for(int i = 1; i<=100;i++){
        //         // primer valor inicializacion, de donde arranca 
        //         // segundo elemento hasta donde Llega
        //         // tercer valor incremento
        //     System.out.println(i);
        // }
            
    }
}
