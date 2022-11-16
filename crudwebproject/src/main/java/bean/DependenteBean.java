/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import com.mycompany.crudwebproject.Dependente;
import com.mycompany.crudwebproject.Pessoa;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author usuario
 */
@ManagedBean
@javax.faces.bean.SessionScoped
public class DependenteBean {
    
    String uuid;
    String nome;
    Date dataDeNascimento;
    private Dependente dependente = new Dependente();
    
    private List<Dependente> dependentes = new ArrayList<>();

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    
    
   public String adicionar(){
     
         dependente.setNome(nome);
         dependente.setDataDeNascimento(dataDeNascimento);
         dependentes.add(dependente);
         dependente = new Dependente();
         System.out.println("Dependente adicionado!");
         return "dependentes?faces-redirect=true";
    
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    

   
    public void setDataDeNascimento(Date dataDeNascimento) {
          System.out.println(dataDeNascimento);

              this.dataDeNascimento = dataDeNascimento;
    }
    
   
    
}
