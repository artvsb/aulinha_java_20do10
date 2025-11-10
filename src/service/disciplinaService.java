package service;

import model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class disciplinaService {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public void cadastrarDisciplina(Disciplina disciplinas) {
        disciplinas.add(disciplinas);
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinas;
    }

    public void atualizarDisciplina(String nome, String novoNome) {
        for (Disciplina disciplinas : disciplinas) {
            if (disciplinas.getNome().equalsIgnoreCase(nome)) {
                disciplinas.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Disciplina não foi encontrado.");
    }

    public void deletarDisciplina(String nome) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getNome().equalsIgnoreCase(nome)) {
                disciplinas.remove(i);
                System.out.println("Deletado com sucesso!");
                return;
            }
            System.out.println("Disciplina não encontrado.");
        }
    }
}

