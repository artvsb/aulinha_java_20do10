// uma folha da árvore binária é uma classe sem filhos -> CLASSE 'FINAL'

public final class Aluno extends Pessoa {
    private int matricula;
    private double nota1, nota2, nota3, media;
    private final CARGO cargo;

    //construtor inserido em Aluno devido aos dados de parâmetros (nome, idade, matricula) prefixados na main
    //construtor tem como função setar os dados para a memória
    public Aluno(String nome, int idade, int matricula, cargo.Aluno) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public Aluno() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public String exibirDados() {
        return super.exibirDados();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


}