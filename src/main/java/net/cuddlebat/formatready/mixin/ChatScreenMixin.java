package net.cuddlebat.formatready.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

@Mixin(ChatScreen.class)
public abstract class ChatScreenMixin extends Screen
{
	protected ChatScreenMixin(Text title)
	{
		super(title);
	}
	
	@Override
	public void sendMessage(String message)
	{
		message = message.replace('$', '§').replace("§§", "$");
		super.sendMessage(message);
	}
}