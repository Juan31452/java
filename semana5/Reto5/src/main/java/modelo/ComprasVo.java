
package modelo;

public class ComprasVo {
  private Integer id_compra;
  private String constructora;
  private String banco_vinculado;

    public ComprasVo() {
        
    }

    public ComprasVo(Integer id_compra, String constructora, String banco_vinculado) {
        this.id_compra = id_compra;
        this.constructora = constructora;
        this.banco_vinculado = banco_vinculado;
    }

    public Integer getId_compra() {
        return id_compra;
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBanco_vinculado() {
        return banco_vinculado;
    }

    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }
  
    @Override
    public String toString() 
    {
        return String.format("%3d %-25s %-20s",id_compra,
        constructora,banco_vinculado);
    }           
}
