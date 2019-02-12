/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import eduquersys.Professor;
import eduquersys.Tarefas;

/**
 *
 * @author Flávio
 */
public class Aula {
    
    private String nome;
    private String diaSemana;
    private Professor professor;
    private Tarefas tarefas;

    public Aula(String nome, String diaSemana) {
        this.nome = nome;
        this.diaSemana = diaSemana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Tarefas getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefas tarefas) {
        this.tarefas = tarefas;
    }
    
}
