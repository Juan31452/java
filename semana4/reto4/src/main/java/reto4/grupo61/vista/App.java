package reto4.grupo61.vista;


public class App 
{
    public static void main( String[] args )
    {
        var reportesView = new ReportesView();
        var banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);
    }
}
