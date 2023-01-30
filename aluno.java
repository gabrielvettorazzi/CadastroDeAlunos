//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class aluno {
    String nome;
    String cpf;
    String situacao = "reprovado";
    float total = 0.0F;
    ArrayList<Float> notasAluno = new ArrayList();

    public aluno() {
    }

    public aluno(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    void insereNotas(float nota) {
        this.notasAluno.add(nota);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void listar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);

        for(int i = 0; i < this.notasAluno.size(); ++i) {
            System.out.println("Notas: " + (i + 1) + ": " + String.valueOf(this.notasAluno.get(i)));
        }

    }

    void situacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Total: " + this.total);
        System.out.println("Situacao: " + this.situacao);
    }

    void calcularNotas() {
        float notaDalista;
        for(Iterator var1 = this.notasAluno.iterator(); var1.hasNext(); this.total += notaDalista) {
            notaDalista = (Float)var1.next();
        }

        if (this.total >= 70.0F) {
            this.situacao = "aprovado";
        } else {
            this.situacao = "reprovado";
        }

    }

    public ArrayList<Float> getNotasAluno() {
        return this.notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
    }
}
