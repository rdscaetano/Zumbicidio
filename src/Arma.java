abstract class Item {
    protected String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe para itens de cura
class Cura extends Item {
    public Cura() {
        super("Atadura");
    }

    public void usar(Personagem jogador) {
        //recupera 1 de vida
        System.out.println("O jogador usou uma atadura e recuperou 1 ponto de vida!");
    }
}

// Classe para armas
public class Arma extends Item {
    protected int dano;

    public Arma(String nome, int dano) {
        super(nome);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }
}

// Subclasse de arma: Taco de Beisebol
class TacoDeBeisebol extends Arma {
    public TacoDeBeisebol() {
        super("Taco de Beisebol", 1);
    }
}

// Subclasse de arma: Revólver
class Revolver extends Arma {
    private int municao;

    public Revolver() {
        super("Revólver", 2);
        this.municao = 1;
    }

    public boolean atirar() {
        if (municao > 0) {
            municao--;
            System.out.println("Disparo realizado! Munição restante: " + municao);
            //computar dano no zumbi
            return true;
        } else {
            System.out.println("Sem munição!");
            return false;
        }
    }

    public void recarregar() {
        municao++;
        System.out.println("Munição recarregada! Munição atual: " + municao);
    }
}
