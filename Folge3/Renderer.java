package de.yaquza.ingamerenderer;

import de.yaquza.client.ClientSettings;
import de.yaquza.helper.Help;
import de.yaquza.helper.Rainbow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class Renderer extends GuiIngame {
   public Renderer(Minecraft mcIn) {
      super(mcIn);
   }

   public void renderGameOverlay(float partialTicks) {
      super.renderGameOverlay(partialTicks);

      int ping;
      int x = Minecraft.getMinecraft().thePlayer.getPosition().getX();
      int y = Minecraft.getMinecraft().thePlayer.getPosition().getY();
      int z = Minecraft.getMinecraft().thePlayer.getPosition().getZ();

      if (Help.mc.isSingleplayer()) {
         ping = 0;
      } else {
         ping = (int) Minecraft.getMinecraft().getCurrentServerData().pingToServer;
      }

      if (ClientSettings.FPS) {
         Help.renderIngameOverlay("FPS: " + Minecraft.getDebugFPS(), 2, 20, Rainbow.rainbowEffect(1, 1.0F).getRGB());
      }
      if (ClientSettings.Ping) {
         Help.renderIngameOverlay("PING: " + ping, 2, 28, -1);
      }
      if (ClientSettings.Coords) {
         Help.renderIngameOverlay("X: " + x, 2, 36, -1);
         Help.renderIngameOverlay("Y: " + y, 2, 44, -1);
         Help.renderIngameOverlay("Z: " + z, 2, 52, -1);
      }
   }

}
