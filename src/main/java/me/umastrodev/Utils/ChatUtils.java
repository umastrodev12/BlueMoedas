package me.umastrodev.bluemoedas.utils;

import org.bukkit.ChatColor;

import me.umastrodev.bluemoedas.utils.chat;

public class ChatUtils {
    public static String colorize(String message) {
      // Usando a lib do Bukkit "ChatColor" é possível fazer com que, mudaremos a Fonte e o estilo de formatação da Mensagem no chat //
        // Óbvio que em algumas vezes, o ChatUtils não vai funcionar, então, você pode até alterar esta parte do código, SÓ DESSE UTIL //
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}