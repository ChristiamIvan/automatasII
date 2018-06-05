package Images;

/**
 *
 * @author Migue
 */
public class Tupla 
{
    private String  valor;
    private boolean operador;
    
    public Tupla()
    {
        operador = false;
        valor= "";
        
    }
    
    public Tupla(String va , boolean  op)
    {
        valor = va;
        operador = op;
    }
    
    public void setValor(String va)
    {
        this.valor = va;
    }
    
    public void setOperador(boolean op)
    {
        this.operador = op;
    }
    
    public String getValor()
    {
        return valor;
    }
    
    public boolean getOperator()
    {
        return operador;
    }
}
