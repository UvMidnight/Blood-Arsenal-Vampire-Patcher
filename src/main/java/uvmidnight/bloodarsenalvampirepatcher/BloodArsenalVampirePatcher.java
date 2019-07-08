package uvmidnight.bloodarsenalvampirepatcher;

import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRegistry;
import com.arc.bloodarsenal.common.BloodArsenal;
import com.arc.bloodarsenal.common.items.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = BloodArsenalVampirePatcher.MODID, version = BloodArsenalVampirePatcher.VERSION, acceptableRemoteVersions = "*", dependencies = "required-after:AWWayofTime;after:guideapi;required-after:BloodArsenal")
public class BloodArsenalVampirePatcher {
    public static final String MODID = "bloodarsenalvampirepatcher";
    public static final String VERSION = "1.0";''

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if (!BloodArsenal.isHalloween()) {
            BindingRegistry.registerRecipe(new ItemStack(ModItems.vampire_cape), new ItemStack(Items.leather_chestplate));
            BindingRegistry.registerRecipe(new ItemStack(ModItems.vampire_greaves), new ItemStack(Items.leather_leggings));
            BindingRegistry.registerRecipe(new ItemStack(ModItems.vampire_boots), new ItemStack(Items.leather_boots));
        }
    }
}
