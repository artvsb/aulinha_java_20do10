package controller;

import model.Professor;

import java.util.List;

public class professorController {
    private professorService professorService = new professorService();

    public void cadastrarProfessor(Professor professor) {
        professorService.cadastrarProfessor(professor);
    }

    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }

    public void atualizarProfessor(String nome, String novoNome) {
        professorService.atualizarProfessor(nome, novoNome);
    }

    public void deletarProfessor(String nome) {
        professorService.deletarProfessor(nome);
    }
}
