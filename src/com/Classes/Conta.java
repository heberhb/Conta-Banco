package com.Classes;

public class Conta {
    private String Nome;
    private String banco;
    
    public Conta(){
        
    }
    
    @Override
    public String toString(){
        return this.Nome+"("+this.banco+")";
    }

    public Conta(String Nome, String banco) {
        this.Nome = Nome;
        this.banco = banco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    
}
