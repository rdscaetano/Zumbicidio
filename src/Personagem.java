public class Personagem {

    private int saude;
    private int percepcao;
    private int posicaoX;
    private int posicaoY;

    public Personagem(int saude, int percepcao, int x, int y) {
        this.saude = saude;
        this.percepcao = percepcao;
        this.posicaoX = x;
        this.posicaoY = y;
    }

    public void mover(int novoX, int novoY) {
        this.posicaoX = novoX;
        this.posicaoY = novoY;
    }

    public void atacar(Zumbi zumbi, Arma arma) {
        zumbi.receberDano(arma.getDano());
        System.out.println("O zumbi recebeu " + arma.getDano() + " de dano!");
    }

    public void receberDano(int dano) {
        saude -= dano;
        System.out.println("O personagem recebeu " + dano + " de dano! Saúde atual: " + saude);
    }

    public void recuperarVida(int vida) {
        saude += vida;
        System.out.println("O personagem recuperou " + vida + " de vida! Saúde atual: " + saude);
    }

    public int getSaude() { return saude; }
    public int getPercepcao() { return percepcao; }
    public int getPosicaoX() { return posicaoX; }
    public int getPosicaoY() { return posicaoY; }
}
