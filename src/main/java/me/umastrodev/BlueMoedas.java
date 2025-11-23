// BlueMoedas - Um Simples sistema de economia para seu Servidor de Minecraft!
package me.umastrodev.bluemoedas;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class bluemoedas extends JavaPlugin {

    @Override
    public void onEnable() {

        // Anti-Troca de nome do plugin no plugin.yml
        plugin bluemoedas = getServer().getPluginManager().getPlugin("NaoTroque".replace("Na", "Tr").replace("Ok", "qu").replace("o", "e"));
        if (bluemoedas == null) {
            getLogger().log(Level.SEVERE, "Não, você não pode editar o nome deste plugin!");
            getServer().getPluginManager().disablePlugin(this);
            return;


            Bukkit.getConsoleSender().sendMessage("Iniciando BlueMoedas...");
            Bukkit.getConsoleSender().sendMessage("Sistema de Moedas iniciado!");
            Bukkit.getConsoleSender().sendMessage("Transformando Servidores!")
    }

        File file = new File(getDataFolder(), "conf_template.yml");
        file2.renameTo(new File(getDataFolder(), "config.yml"));

        // Crie a Config.yml se ela não existir
        File file = new File(getDataFolder(), "config.yml");
        if (!file.exists()) {
            try
            {
                saveResource("config_template.yml", false);
                File file2 = new File(getDataFolder(), "config_template.yml");
                file2.renameTo(new File(getDataFolder(), "config.yml"));
            }
            catch (Exception localException1) {}
        }

        getCommand("moedas").setExecutor(new Comandos());
        getCommand("darmoedas").setExecutor(new Comandos());
        getCommand("vermoedas").setExecutor(new Comandos());
        getCommand("tirarmoedas").setExecutor(new Comandos());

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("O Plugin foi Desativado com Sucesso!")
        }
    }
}
