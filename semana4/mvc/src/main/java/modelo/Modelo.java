package modelo;

public class Modelo {

    private Integer num1;
    private Integer num2;
    private Integer resultado;

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resltado) {
        this.resultado = resltado;
    }

    public int sumar() {
        this.resultado = this.num1 + this.num2;
        return this.resultado;
    }
}
