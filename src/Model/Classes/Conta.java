package Model.Classes;

public class Conta extends Usuarios {
    protected String Banco;
    protected int NumeroBanco;
    protected int NumeroConta;
    
    public Conta(){
    }

    public Conta(int id,String Banco, int NumeroBanco, int NumeroConta, String Nome, String Cpf, String Telefone) {
        super(id, Nome, Cpf, Telefone);
        this.Banco = Banco;
        this.NumeroBanco = NumeroBanco;
        this.NumeroConta = NumeroConta;
    }

    public Conta(String Banco, int NumeroBanco, int NumeroConta) {
        this.Banco = Banco;
        this.NumeroBanco = NumeroBanco;
        this.NumeroConta = NumeroConta;
    }
    
    public String toString(){
        return this.Banco;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public int getNumeroBanco() {
        return NumeroBanco;
    }

    public void setNumeroBanco(int NumeroBanco) {
        this.NumeroBanco = NumeroBanco;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    
    
}
