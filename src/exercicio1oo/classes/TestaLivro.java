package exercicio1oo.classes;

class TestaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "Tolkien";
        livro.genero = "Ficção";
        livro.titulo = "O Senhor dos Anéis";
        livro.emprestado = true;

        System.out.println("Classe Livro");
        System.out.println("Autor.....: " + livro.autor);
        System.out.println("Gênero....: " + livro.genero);
        System.out.println("Título....: " + livro.titulo);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}
