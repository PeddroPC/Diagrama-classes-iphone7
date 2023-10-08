public class Iphone implements Reprodutor, Navegador {
    private String modelo;
    private String cor;
    private String numeroSerie;

    public Iphone(String modelo, String cor, String numeroSerie) {
        this.modelo = modelo;
        this.cor = cor;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void tocar() {
    }

    @Override
    public void pausar() {
    }

    @Override
    public void avancar() {
    }

    @Override
    public void retroceder() {
    }

    @Override
    public void abrirPagina(String url) {
    }

    @Override
    public void fecharPagina() {
    }

    public void ligar() {
    }

    public void desligar() {
    }
}
