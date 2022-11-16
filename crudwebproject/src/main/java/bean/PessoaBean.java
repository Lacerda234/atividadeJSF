package bean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.crudwebproject.Dependente;
import com.mycompany.crudwebproject.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlInputText;

/**
 *
 * @author usuario
 */
@ManagedBean
@javax.faces.bean.SessionScoped
public class PessoaBean {
     
    Pessoa pessoaParaEditar;
     
    String nome;
    String cpf;
    Dependente dependente;

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
    Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoas = new ArrayList<>();
    
    
       
 
    public String adicionar(){
     
         pessoa.setNome(nome);
         pessoa.setCpf(cpf);
         pessoa.setDependente(dependente);
         pessoas.add(pessoa);
         pessoa = new Pessoa();
         System.out.println("Cadastro realizado!");
       //   System.out.println("Dependente:"+dependente.getNome());
         return "index?faces-redirect=true";
    
    }
    
    public String editar(String nome, String cpf){
         System.out.println("Edição realizada!");
          //System.out.println(dep);
         for(int k = 0; k<pessoas.size(); k++){
             if(pessoas.get(k).getNome().equals(pessoaParaEditar.getNome())){
                 pessoas.get(k).setNome(nome);
                  pessoas.get(k).setCpf(cpf);
                 // pessoas.get(k).setDependente(dep);
                 pessoas.get(k).setDependente(dependente);
                  //  System.out.println(pessoas.get(k).getDependente().getNome());
             }
         }
   

        return "index?faces-redirect=true";
    }
    
    public String deletar(Pessoa p){
        pessoas.remove(p);
        return "index?faces-redirect=true";
    }
    
    public String dadosEdicao(Pessoa p){
        pessoaParaEditar = p;
        return "editPessoa";
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
  
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    
}
