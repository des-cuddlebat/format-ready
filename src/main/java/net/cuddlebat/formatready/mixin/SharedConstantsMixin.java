package net.cuddlebat.formatready.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.SharedConstants;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin
{
	@ModifyConstant(
		method = "isValidChar(C)Z",
		constant = @Constant(intValue = 167))
	private static int allowSectionSign(int sectionSignAnsi)
	{
		return 0;
	}
}