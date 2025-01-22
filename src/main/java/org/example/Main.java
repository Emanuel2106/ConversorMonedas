package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("🚀 ¡Conversor de Monedas iniciado con SLF4J correctamente!");
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
