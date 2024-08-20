package Model.Classes;

public class Usuarios {
    protected int id;
    protected String Nome;
    protected String Cpf;
    protected String Telefone;
    protected Conta idConta;
    
    public Usuarios(){
    }

    public Usuarios(int id, String Nome, String Cpf, String Telefone) {
        this.id = id;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
    }
    
    

    public Usuarios(int id, String Nome, String Cpf, String Telefone, Conta idConta) {
        this.id = id;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.idConta = idConta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Conta getIdConta() {
        return idConta;
    }

    public void setIdConta(Conta idConta) {
        this.idConta = idConta;
    }

      
}
