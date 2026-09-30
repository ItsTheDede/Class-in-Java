public class Aula {
    String nome;
    int numero;
    String curso;
    String ufcd;
    int ano;

    public Aula(String nome, int numero, String curso, String ufcd, int ano) {
        this.nome = nome;
        this.numero = numero;
        this.curso = curso;
        this.ufcd = ufcd;
        this.ano = ano;
    }

    public void cartao() {
        System.out.println("O nome do Aluno é: " + nome);
        System.out.println("O Número de cartão é: " + numero);
        System.out.println("O Curso é: " + curso);
        System.out.println("A UFCD que está a dar é: " + ufcd);
        System.out.println("E o Ano letivo é: " + ano);
    }
}