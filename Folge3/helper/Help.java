package de.yaquza.helper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;

public class Help {

   public static Minecraft mc = Minecraft.getMinecraft();
   public static FontRenderer fr = Minecraft.getMinecraft().fontRendererObj;

   public static void renderIngameOverlay(String Name, int x, int y, int color) {
      Minecraft.getMinecraft().fontRendererObj.drawString(Name, x, y, color);
   }

}
