package com.example.wolfzeus;

import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.EntityEquipment;

public final class WolfZeusListener implements Listener {
    private static final String REQUIRED_NAME = "Zeus";
    private static final PlainTextComponentSerializer PLAIN_TEXT = PlainTextComponentSerializer.plainText();

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onWolfAttack(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Wolf wolf)
                || !hasRequiredName(wolf)
                || !(event.getEntity() instanceof LivingEntity target)) {
            return;
        }

        destroyArmor(target);
        event.setDamage(target.getHealth() + target.getAbsorptionAmount() + 1.0D);
    }

    private static boolean hasRequiredName(Wolf wolf) {
        if (wolf.customName() == null) {
            return false;
        }
        return REQUIRED_NAME.equals(PLAIN_TEXT.serialize(wolf.customName()));
    }

    private static void destroyArmor(LivingEntity target) {
        EntityEquipment equipment = target.getEquipment();
        if (equipment == null) {
            return;
        }

        equipment.setHelmet(null, false);
        equipment.setChestplate(null, false);
        equipment.setLeggings(null, false);
        equipment.setBoots(null, false);
    }
}
