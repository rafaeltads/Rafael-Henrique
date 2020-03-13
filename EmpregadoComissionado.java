package Interface;

/**
 *
 * @author Rafu
 */
public class EmpregadoComissionado extends Empregado{
    private double vendasBruta;
    private double porcentagemComissao;
     public EmpregadoComissionado( String primeiro, String ultimo, String cpf, 
      double vendas, double porcentagem)
              {
      super( primeiro, ultimo, cpf);
      setVendasBruta( vendas );
      setPorcentagemComissao( porcentagem );
   } 

    public double getVendasBruta() {
        return vendasBruta;
    }

    public void setVendasBruta(double vendas) {
        vendasBruta = ( vendas < 0.0 ) ? 0.0 : vendas;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagem) {
        porcentagemComissao = ( porcentagem > 0.0 && porcentagem < 1.0 ) ? porcentagem : 0.0;
    }

    @Override
    public double ganhos() {
       return getPorcentagemComissao() * getVendasBruta();
    }
     
}
