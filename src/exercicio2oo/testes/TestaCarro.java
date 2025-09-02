package exercicio2oo.testes;

class TestaCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.modelo = "K";
        c.marca = "Ford";
        c.ano = 2015;
        c.velocidade = 200;
        System.out.println("Classe Carro");
        System.out.println("Modelo....: " + c.modelo);
        System.out.println("Marca.....: " + c.marca);
        System.out.println("Ano.......: " + c.ano);
        System.out.println("Velocidade: " + c.velocidade);
    }
}
