package de.servergrid.mixin;

import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.widget.MultiplayerServerListWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(MultiplayerScreen.class)
public interface MultiplayerScreenAccessor {
    @Accessor("serverListWidget")
    MultiplayerServerListWidget servergrid$getList();

    @Invoker("connect")
    void servergrid$connect();
}
