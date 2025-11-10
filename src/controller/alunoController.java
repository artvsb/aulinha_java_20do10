package controller;

import model.Aluno;
import service.alunoService;

import java.util.List;

public class alunoController {
    private alunoService alunoService = new alunoService();

    public void cadastrarAluno(Aluno aluno) {
        alunoService.cadastrarAluno(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    public void atualizarAluno(String nome, String novoNome) {
        alunoService.atualizarAluno(nome, novoNome);
    }

    public void deletarAluno(String nome) {
        alunoService.deletarAluno(nome);
    }
}