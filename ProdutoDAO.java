/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
     Connection conn;
     PreparedStatement pstm;
     ResultSet rs;
     ArrayList<ProdutoDTO> lista = new ArrayList<>();
     
    public void novoDesc(ProdutoDTO objprodutodto) throws ClassNotFoundException{
  
       String sql = "insert into produto values (null,?,?,null)";
       
         try {
             conn = conect.getConnection();
             pstm = conn.prepareStatement(sql);
             pstm.setString(1, objprodutodto.getNome_Prod());
             pstm.setString(2, objprodutodto.getDescricao_Prod());
             
             
             pstm.execute();
             pstm.close();
             
         } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null,"Erro ao inserir dados"+ erro.getMessage());
         }
         
        
    }
    
        public ArrayList<ProdutoDTO> PesquisarProd() throws ClassNotFoundException{
            
            String sql = "select * from produto";
            conn = conect.getConnection();

            try{
             pstm = conn.prepareStatement(sql);
             rs = pstm.executeQuery();

                 while(rs.next()){
                     ProdutoDTO objprodutodto = new ProdutoDTO();
                     objprodutodto.setId_Prod(rs.getInt("id"));
                     objprodutodto.setNome_Prod(rs.getString("nome"));
                     objprodutodto.setDescricao_Prod(rs.getString("descricao"));
                     objprodutodto.setDat(rs.getDate("data_cadastro"));
                     
                     
                     lista.add(objprodutodto);
                 }             
             
             pstm.close();
                
            }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar dados"+ erro.getMessage());
            }
            return lista;
        }
    
        public void upDesc(ProdutoDTO objprodutodto) throws ClassNotFoundException{
  
       String sql = "UPDATE produto SET nome = ?,descricao = ? WHERE id = ?";     
         try {
             conn = conect.getConnection();
             pstm = conn.prepareStatement(sql);
             pstm.setString(1, objprodutodto.getNome_Prod());
             pstm.setString(2, objprodutodto.getDescricao_Prod());
             pstm.setInt(3, objprodutodto.getId_Prod());
             
             
             pstm.execute();
             pstm.close();
             
         } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null,"Erro ao atualizar dados"+ erro.getMessage());
         }
         
        
    }
        
       public void deleteDesc(ProdutoDTO objprodutodto) throws ClassNotFoundException{
       
        conn = conect.getConnection();
       String sql = "delete from produto WHERE id = ?";     
       
         try {
             
             pstm = conn.prepareStatement(sql);
         
             pstm.setInt(1, objprodutodto.getId_Prod());
             
             
             pstm.execute();
             pstm.close();
             
         } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null,"Erro ao deletar dados"+ erro.getMessage());
         }
         
        
    }
        
        
    
}
