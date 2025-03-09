/**
     *classe usuario , define tabela usuario
     * 
     * 
     */

package classes;
  import jakarta.persistence.Entity;
  import jakarta.persistence.GeneratedValue;
  import jakarta.persistence.GenerationType;
  import jakarta.persistence.Id;
import java.sql.Date;
  import java.time.LocalDate;


@Entity
public class paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String dataNasc;
    private String email;
    private String Historico_medico;
    private String orcamento;
    private int valor_orcamento;
     

    public paciente() {
    }

     
    public paciente(String nome, String cpf, String endereco, String telefone, String dataNasc, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.email = email;
        this.Historico_medico = "";
        this.orcamento = "";
        this.valor_orcamento = 0;
    }

    public int getValor_orcamento() {
        return valor_orcamento;
    }

    public void setValor_orcamento(int valor_orcamento) {
        this.valor_orcamento = valor_orcamento;
    }

   



    public String getOrcamento() {
        return orcamento;
    }



    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    
  
     
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHistorico_medico(String Historico_medico) {
        this.Historico_medico = Historico_medico;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public String getHistorico_medico() {
        return Historico_medico;
    }

  
}
