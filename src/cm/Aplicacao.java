package cm;

import cm.model.Tabuleiro;
import cm.view.TabuleiroConsole;

public class Aplicacao {

    static void main() {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
