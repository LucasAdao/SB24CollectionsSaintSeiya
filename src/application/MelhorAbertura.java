package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MelhorAbertura {
    public static void main(String[] args) {
        String url = "https://www.youtube.com/watch?v=ZHKeARKylMI";

        try {
            // Verifica se a área de trabalho é suportada
            if (Desktop.isDesktopSupported()) {
                // Obtém a instância da área de trabalho
                Desktop desktop = Desktop.getDesktop();
                
                // Abre o navegador padrão com a URL especificada
                desktop.browse(new URI(url));
            } else {
                System.out.println("A área de trabalho não é suportada.");
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}