/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author F2258573
 */
public class Orcamento {
   private String Data;
    private String Descricao;
 


    

    public String getData() {
        return Data;
    }
public Orcamento(){
    this.Data = "";
    this.Descricao="";
   
}
    public Orcamento(String Data, String Descricao) {
        this.Data = Data;
        this.Descricao = Descricao;
  
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
