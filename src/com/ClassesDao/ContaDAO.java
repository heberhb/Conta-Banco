package com.ClassesDao;


import com.Classes.Conta;
import com.Conta.ConexaoBD.ConexaoJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {
    private final ConexaoJDBC conexao;
    private final Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public ContaDAO(){
        this.conexao = new ConexaoJDBC();
        this.conn = this.conexao.GetConexaoJDBC();
    }
    
    public List<Conta> ListaConta(){
        String sql = "SELECT*FROM conta";
        try{
            ps = this.conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Conta> lista = new ArrayList<>();
            while(rs.next()){
                Conta conta = new Conta();
                conta.setNome(rs.getString("Nome"));
                conta.setBanco(rs.getString("Banco"));
                lista.add(conta);
            }
            System.out.println("Contas Adicionadas com sucesso ");
            return lista;
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar contas !! ");
             return null;
        }
    }
}
