/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.Date;


public class ProdutoDTO {
    
  private String descricao_Prod;
  private String nome_Prod;
  private int id_Prod;
  private Date dat;

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }



  
    public String getDescricao_Prod() {
        return descricao_Prod;
    }

    public void setDescricao_Prod(String descricao_Prod) {
        this.descricao_Prod = descricao_Prod;
    }
    
 
    public int getId_Prod() {
        return id_Prod;
    }

    public void setId_Prod(int id_Prod) {
        this.id_Prod = id_Prod;
    }

    public String getNome_Prod() {
        return nome_Prod;
    }

    public void setNome_Prod(String nome_Prod) {
        this.nome_Prod = nome_Prod;
    }


    
}
