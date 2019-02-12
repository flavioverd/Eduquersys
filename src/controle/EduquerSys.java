/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import eduquersys.Aluno;
import eduquersys.Aula;
import eduquersys.Banco;
import eduquersys.Login;
import eduquersys.Professor;
import eduquersys.Tarefas;

/**
 *
  * @author Flavio
 */
public class EduquerSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco banco = new Banco();
        
        Aluno aluno = new Aluno("Wellington","wellingtonantonio_zaneze@live.com","123", 0);
        
        Professor professor = new Professor("Xablau");
        
        Tarefas tarefas = new Tarefas("Lista de Exercicios","07/01/00");
        
        Aula aula = new Aula("Matematica","Segunda");
        
        
        Login login = new Login();
        login.setVisible(true);
        
    }
    
}
