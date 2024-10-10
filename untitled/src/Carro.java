public class Carro {

    private int id;
    private String nome;
    private String marca;
    private Cor cor;

    public Carro(int id, String nome, String marca, Cor cor) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
