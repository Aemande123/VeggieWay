package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.items.CropQuinoa;
import com.kwpugh.veggie_way.items.DrinkBase;
import com.kwpugh.veggie_way.items.HandRake;
import com.kwpugh.veggie_way.items.ItemCaffeine;
import com.kwpugh.veggie_way.items.ItemCarbs;
import com.kwpugh.veggie_way.items.ItemDryingAgent;
import com.kwpugh.veggie_way.items.ItemEnergyPowder;
import com.kwpugh.veggie_way.items.ItemFructose;
import com.kwpugh.veggie_way.items.ItemProteins;
import com.kwpugh.veggie_way.items.ItemSuperfoodPowder;
import com.kwpugh.veggie_way.items.ItemVitamins;
import com.kwpugh.veggie_way.items.ItemWheatgerm;
import com.kwpugh.veggie_way.items.SeedQuinoa;
import com.kwpugh.veggie_way.lists.FoodList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SoupItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, VeggieWay.modid);
	
	public static final RegistryObject<Item> HAND_RAKE = ITEMS.register("hand_rake", () -> new HandRake(ItemTier.IRON, -2, -3, new Item.Properties().group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().food(FoodList.apple_pie).group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> MELON_PIE = ITEMS.register("melon_pie", () -> new Item(new Item.Properties().food(FoodList.melon_pie).group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", () -> new Item(new Item.Properties().food(FoodList.sweet_berry_pie).group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", () -> new SoupItem(new Item.Properties().maxStackSize(1).food(FoodList.pumpkin_soup).group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> QUINOA_SEEDS = ITEMS.register("quinoa_seeds", () -> new SeedQuinoa(BlockInit.PLANT_QUINOA.get(), (new Item.Properties().group(VeggieWay.veggie_way))));
	public static final RegistryObject<Item> QUINOA = ITEMS.register("quinoa", () -> new CropQuinoa(new Item.Properties().group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> DRYING_AGENT = ITEMS.register("drying_agent", () -> new ItemDryingAgent(new Item.Properties().group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> CARBS = ITEMS.register("carbs", () -> new ItemCarbs(new Item.Properties().group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> FRUCTOSE = ITEMS.register("fructose", () -> new ItemFructose(new Item.Properties().group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> PROTEINS = ITEMS.register("proteins", () -> new ItemProteins(new Item.Properties().group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> VITAMINS = ITEMS.register("vitamins", () -> new ItemVitamins(new Item.Properties().group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> CAFFEINE = ITEMS.register("caffeine", () -> new ItemCaffeine(new Item.Properties().group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> WHEATGERM = ITEMS.register("wheatgerm", () -> new ItemWheatgerm(new Item.Properties().group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> ENERGY_POWDER = ITEMS.register("energy_powder", () -> new ItemEnergyPowder(new Item.Properties().group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_POWDER = ITEMS.register("superfood_powder", () -> new ItemSuperfoodPowder(new Item.Properties().group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> ENERGY_DRINK = ITEMS.register("energy_drink", () -> new DrinkBase(new Item.Properties().food(FoodList.energyDrink).group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_SHAKE = ITEMS.register("superfood_shake", () -> new DrinkBase(new Item.Properties().food(FoodList.superfoodShake).group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_SMOOTHIE = ITEMS.register("superfood_smoothie", () -> new DrinkBase(new Item.Properties().food(FoodList.superfoodSmoothie).group(VeggieWay.veggie_way)));
	
	public static final RegistryObject<Item> ENERGY_BAR = ITEMS.register("energy_bar", () -> new Item(new Item.Properties().food(FoodList.energyBar).group(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_BAR = ITEMS.register("superfood_bar", () -> new Item(new Item.Properties().food(FoodList.superfoodBar).group(VeggieWay.veggie_way)));
}
