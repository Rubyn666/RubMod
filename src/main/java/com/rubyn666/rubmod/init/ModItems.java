package com.rubyn666.rubmod.init;

import java.util.ArrayList;
import java.util.List;

import com.rubyn666.rubmod.objects.armour.ArmourBase;
import com.rubyn666.rubmod.objects.items.ItemBase;
import com.rubyn666.rubmod.objects.tools.ToolAxe;
import com.rubyn666.rubmod.objects.tools.ToolHoe;
import com.rubyn666.rubmod.objects.tools.ToolPickaxe;
import com.rubyn666.rubmod.objects.tools.ToolShovel;
import com.rubyn666.rubmod.objects.tools.ToolSword;
import com.rubyn666.rubmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_UNKNOWN = EnumHelper.addToolMaterial("tool_unknown", 3, 2000, 9.0F, 3.5F, 15);
	public static final ArmorMaterial ARMOUR_UNKOWN = EnumHelper.addArmorMaterial("armour_Unkown", Reference.MOD_ID + ":unkown", 50, new int[]{6, 12, 16, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);
	
	//Items
	public static final Item PEARL_LINKING = new ItemBase("pearl_linking");
	
	//Tools
	public static final Item AXE_UNKNOWN = new ToolAxe("axe_unknown", TOOL_UNKNOWN);
	public static final Item HOE_UNKNOWN = new ToolHoe("hoe_unknown", TOOL_UNKNOWN);
	public static final Item PICKAXE_UNKNOWN = new ToolPickaxe("pickaxe_unknown", TOOL_UNKNOWN);
	public static final Item SHOVEL_UNKNOWN = new ToolShovel("shovel_unknown", TOOL_UNKNOWN);
	public static final Item SWORD_UNKOWN = new ToolSword("sword_unknown", TOOL_UNKNOWN);
	
	//Armour
	public static final Item HELMET_UNKOWN = new ArmourBase("helmet_unknown", ARMOUR_UNKOWN, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_UNKOWN = new ArmourBase("chestplate_unknown", ARMOUR_UNKOWN, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_UNKOWN = new ArmourBase("leggings_unknown", ARMOUR_UNKOWN, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_UNKOWN = new ArmourBase("boots_unknown", ARMOUR_UNKOWN, 1, EntityEquipmentSlot.FEET);
}
