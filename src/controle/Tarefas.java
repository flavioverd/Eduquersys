/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author Flávio
 */
public class Tarefas {
    
    private String nome;
    private String dataEntrega;

    public Tarefas(String nome, String dataEntrega) {
        this.nome = nome;
        this.dataEntrega = dataEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
}
