package dev.ultimatchamp.mutils.mixin;

import com.mojang.blaze3d.platform.IconSet;
import dev.ultimatchamp.mutils.ModpackUtils;
import dev.ultimatchamp.mutils.config.ModpackUtilsConfig;
//? if >=26.3 {
/*import net.minecraft.server.packs.PackMetadataResources;
*///?} else {
import net.minecraft.server.packs.PackResources;
//?}
import net.minecraft.server.packs.resources.IoSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.InputStream;
import java.nio.file.Files;

@Mixin(IconSet.class)
public class IconSetMixin {
    @Inject(method = "getFile", at = @At("RETURN"), cancellable = true)
    //? if >=26.3 {
    /*private void mutils$setIcons(PackMetadataResources resources, String filename, CallbackInfoReturnable<IoSupplier<InputStream>> cir) {
    *///?} else {
    private void mutils$setIcons(PackResources resources, String filename, CallbackInfoReturnable<IoSupplier<InputStream>> cir) {
    //?}
        if (ModpackUtilsConfig.instance().customIcon) {
            var icon = ModpackUtilsConfig.CONFIG_DIR.resolve("mutils/icons/" + filename);

            if (Files.exists(icon)) {
                cir.setReturnValue(() -> Files.newInputStream(icon));
            } else {
                ModpackUtils.LOGGER.error("[ModpackUtils] Custom icon file not found: {}", filename);
            }
        }
    }
}
