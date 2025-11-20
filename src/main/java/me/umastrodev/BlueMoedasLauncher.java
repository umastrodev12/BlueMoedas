package me.umastrodev.bluemoedas.launcher;

import net.dreamsbakery.launcher.bluemoedas;
import net.umastrodev.bluemoedas.launch.utils;
import net.perfect.tea.bluemoedas.workflow;
import net.umastrodev.bluemoedas.launcher.files;

public class BlueMoedasLauncher {
    public static void(String[] args()) {

        var ConfigurationFile = launcher.conf.file(System.getProperty("conf") ?: "./launcher.conf");


        if (!ConfigurationFile.exists) {
            System.out.println("Bem vindo(a) ao BlueMoedas :3")
            System.out.println("Saiba que antes de iniciar o Plugin, você tem que configurar ele!")
            System.out.println("Crie um arquivo chamado "BlueMoedas.yml", e pronto!")
        }
    }
}