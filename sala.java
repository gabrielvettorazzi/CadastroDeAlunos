//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class sala {
    ArrayList<aluno> listaDeAlunos = new ArrayList();

    public sala() {
    }

    void insereAluno(aluno Novoaluno) {
        Novoaluno.calcularNotas();
        this.listaDeAlunos.add(Novoaluno);
    }

    void listarAlunos() {
        System.out.println("lista de alunos");
        Iterator var1 = this.listaDeAlunos.iterator();

        while(var1.hasNext()) {
            aluno alunonalista = (aluno)var1.next();
            alunonalista.listar();
        }

    }

    void listarSituacoes() {
        System.out.println("Situacoes");
        Iterator var1 = this.listaDeAlunos.iterator();

        while(var1.hasNext()) {
            aluno alunoNalista = (aluno)var1.next();
            alunoNalista.situacoes();
        }

    }
}

