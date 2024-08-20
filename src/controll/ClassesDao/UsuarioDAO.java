package controll.ClassesDao;


import Model.Classes.Usuarios;
import Model.Classes.ConexaoJDBC;
import Model.Classes.Conta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    private final ConexaoJDBC conexao;
    private final Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public UsuarioDAO(){
        this.conexao = new ConexaoJDBC();
        this.conn = this.conexao.GetConexaoJDBC();
    }
    
    public int buscarUsuario(Usuarios usuario){
        String sql = "SELECT u.Nome, u.Telefone, c.Conta FROM usuario INNER JOIN conta ON usuario.idUsuario = Conta.id";
        try{
            ps = this.conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuarios user = new Usuarios();
                user.setNome(rs.getString("Nome"));
                user.setTelefone(rs.getString("Telefone"));
            }
            System.out.println("Usuario encontrado");
            return 1;
        } catch (SQLException ex) {
            System.out.println("Usuario não encontrado");
        }
        return 0;
    }
    
    public void CadastrarUsuario(Usuarios usuario,Conta conta){
        String sql = "INSERT INTO usuario (Nome,Cpf,Telefone,idConta) VALUES(?,?,?,?)";
        try{
            ps = this.conn.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCpf());
            ps.setString(3, usuario.getTelefone());
            ps.setInt(4, conta.getId());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
