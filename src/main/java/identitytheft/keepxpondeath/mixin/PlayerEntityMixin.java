package identitytheft.keepxpondeath.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
	@Inject(method = "getXpToDrop", at = @At("RETURN"), cancellable = true)
	private void dontdropxp$getXpToDrop(CallbackInfoReturnable<Integer> info) {
		info.setReturnValue(0);
	}
}