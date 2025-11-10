package service;

import model.Coordenador;

import java.util.ArrayList;
import java.util.List;

public class coordenadorService {
    public class coordenadorService {
        private List<Coordenador> coordenadores = new ArrayList<>();
        public void cadastrarCoordenador(Coordenador coordenador) {
            coordenadores.add(coordenador); }
        public List<Coordenador> listarCoordenadores() {
            return coordenadores;
        }
        public void atualizarCoordenador(String nome, String novoNome) {
            for (Coordenador coordenador : coordenadores) {
                if (coordenador.getNome().equalsIgnoreCase(nome)) {
                    coordenador.setNome(novoNome);
                    System.out.println("Atualizado com sucesso!");
                    return; }
            } System.out.println("Coordenador não foi encontrado."); }
        public void deletarCoordenador(String nome) {
            for (int i = 0; i < coordenadores.size(); i++) {
                if (coordenadores.get(i).getNome().equalsIgnoreCase(nome)) {
                    coordenadores.remove(i);
                    System.out.println("Deletado com sucesso!");
                    return; }
                System.out.println("Coordenador não encontrado."); } }
    }

