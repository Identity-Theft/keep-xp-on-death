package identitytheft.keepxpondeath.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin {
    @Inject(method = "copyFrom", at = @At("RETURN"))
    private void noXpToDrop(ServerPlayerEntity oldPlayer, boolean alive, CallbackInfo info) {
        ServerPlayerEntity player = (ServerPlayerEntity)(Object)this;

        player.experienceLevel = oldPlayer.experienceLevel;
        player.totalExperience = oldPlayer.totalExperience;
        player.experienceProgress = oldPlayer.experienceProgress;
        player.setScore(oldPlayer.getScore());
    }
}
