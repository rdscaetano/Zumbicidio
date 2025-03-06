// Classe abstrata representando um Zumbi
public abstract class Zumbi {
    int saude;
    int posicaoX;
    int posicaoY;

    public Zumbi(int saude, int x, int y) {
        this.saude = saude;
        this.posicaoX = x;
        this.posicaoY = y;
    }

    public abstract void mover(); // Método abstrato para movimentação específica

    public void atacar(Personagem jogador) {
        jogador.receberDano(1);
    }

    public void receberDano(int dano) {
        saude -= dano;
        if (saude <= 0) {
            System.out.println("Zumbi eliminado!");
            //remover zumbi da tela
        }
    }

    public int getPosicaoX() {
        return posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }
    public int getSaude() {
        return saude;
    }
}

// Zumbi Rastejante
class ZumbiRastejante extends Zumbi {
    public ZumbiRastejante(int x, int y) {
        super(1, x, y);
    }

    @Override
    public void mover() {
        //move 1

    }
}

// Zumbi Comum
class ZumbiComum extends Zumbi {
    public ZumbiComum(int x, int y) {
        super(2, x, y);
    }

    @Override
    public void mover() {
        //move 1

    }
}

// Zumbi Corredor
class ZumbiCorredor extends Zumbi {
    public ZumbiCorredor(int x, int y) {
        super(2, x, y);

    }

    @Override
    public void mover() {
        //move 2

    }
}

// Subclasse para Zumbi Gigante
class ZumbiGigante extends Zumbi {
    public ZumbiGigante(int x, int y) {
        super(3, x, y);
    }

    @Override
    public void mover() {
        //ele não se move
    }

    @Override
    public void atacar(Personagem jogador) {
        jogador.receberDano(2);
    }
}
