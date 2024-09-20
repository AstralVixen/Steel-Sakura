package net.astralvixen.steelandsakura.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

import java.util.UUID;

public class BloodlustEffectExpiresProcedure {
    private static final UUID SPEED_BOOST_UUID = UUID.fromString("c08c3db4-95e1-44d7-bc2b-0c4b5a7baf97");
    private static final UUID ATTACK_BOOST_UUID = UUID.fromString("5b4c6376-d4db-4dbb-a4d2-36d2c10a5d0d");

    public static void execute(Entity entity) {
        if (entity == null || !(entity instanceof LivingEntity livingEntity))
            return;

        // Remove the speed boost modifier
        if (livingEntity.getAttribute(Attributes.MOVEMENT_SPEED) != null) {
            livingEntity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(SPEED_BOOST_UUID);
        }

        // Remove the attack damage boost modifier
        if (livingEntity.getAttribute(Attributes.ATTACK_DAMAGE) != null) {
            livingEntity.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(ATTACK_BOOST_UUID);
        }
    }
}
