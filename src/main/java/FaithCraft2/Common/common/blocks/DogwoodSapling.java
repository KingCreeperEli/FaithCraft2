/*package FaithCraft2.Common.common.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import FaithCraft2.Common.common.*;
import FaithCraft2.Common.common.worldgen.WorldGenDogwoodTrees;

public class DogwoodSapling extends BlockSapling{

	public static final String[] field_149882_a = new String[] {"dogwood"};
	
	@SideOnly(Side.CLIENT)
    private IIcon dogwoodSapling;
	
	public DogwoodSapling(int id) {
		super();
		this.setCreativeTab(FaithCraft2.FaithCraft2Tab);
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	}
	
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
		dogwoodSapling = iconRegister.registerIcon(FaithCraft2.modid + ":" + "DogwoodSapling");
    }
	
	@Override
	public IIcon getIcon(int side, int metadata) {
		return dogwoodSapling;
	}
	
	public void func_149878_d(World p_149878_1_, int p_149878_2_, int p_149878_3_, int p_149878_4_, Random p_149878_5_)
    {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(p_149878_1_, p_149878_5_, p_149878_2_, p_149878_3_, p_149878_4_)) return;
        int l = p_149878_1_.getBlockMetadata(p_149878_2_, p_149878_3_, p_149878_4_) & 7;
        Object object = p_149878_5_.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenDogwoodTrees(true);
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;

        switch (l)
        {
            case 0:
            default:
                break;
            case 1:
                label78:

                for (i1 = 0; i1 >= -1; --i1)
                {
                    for (j1 = 0; j1 >= -1; --j1)
                    {
                        if (this.func_149880_a(p_149878_1_, p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1, 1) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1, 1) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1 + 1, 1) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1 + 1, 1))
                        {
                            object = new WorldGenMegaPineTree(false, p_149878_5_.nextBoolean());
                            flag = true;
                            break label78;
                        }
                    }
                }

                if (!flag)
                {
                    j1 = 0;
                    i1 = 0;
                    object = new WorldGenTaiga2(true);
                }

                break;
            case 2:
                object = new WorldGenForest(true, false);
                break;
            case 3:
                label93:

                for (i1 = 0; i1 >= -1; --i1)
                {
                    for (j1 = 0; j1 >= -1; --j1)
                    {
                        if (this.func_149880_a(p_149878_1_, p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1, 3) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1, 3) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1 + 1, 3) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1 + 1, 3))
                        {
                            object = new WorldGenMegaJungle(true, 10, 20, 3, 3);
                            flag = true;
                            break label93;
                        }
                    }
                }

                if (!flag)
                {
                    j1 = 0;
                    i1 = 0;
                    object = new WorldGenDogwoodTrees(true, 4 + p_149878_5_.nextInt(7), 3, 3, false);
                }

                break;
            case 4:
                object = new WorldGenSavannaTree(true);
                break;
            case 5:
                label108:

                for (i1 = 0; i1 >= -1; --i1)
                {
                    for (j1 = 0; j1 >= -1; --j1)
                    {
                        if (this.func_149880_a(p_149878_1_, p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1, 5) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1, 5) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1 + 1, 5) && this.func_149880_a(p_149878_1_, p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1 + 1, 5))
                        {
                            object = new WorldGenCanopyTree(true);
                            flag = true;
                            break label108;
                        }
                    }
                }

                if (!flag)
                {
                    return;
                }
        }

        Block block = Blocks.air;

        if (flag)
        {
            p_149878_1_.setBlock(p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1, block, 0, 4);
            p_149878_1_.setBlock(p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1, block, 0, 4);
            p_149878_1_.setBlock(p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1 + 1, block, 0, 4);
            p_149878_1_.setBlock(p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1 + 1, block, 0, 4);
        }
        else
        {
            p_149878_1_.setBlock(p_149878_2_, p_149878_3_, p_149878_4_, block, 0, 4);
        }

        if (!((WorldGenerator)object).generate(p_149878_1_, p_149878_5_, p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1))
        {
            if (flag)
            {
                p_149878_1_.setBlock(p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1, this, l, 4);
                p_149878_1_.setBlock(p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1, this, l, 4);
                p_149878_1_.setBlock(p_149878_2_ + i1, p_149878_3_, p_149878_4_ + j1 + 1, this, l, 4);
                p_149878_1_.setBlock(p_149878_2_ + i1 + 1, p_149878_3_, p_149878_4_ + j1 + 1, this, l, 4);
            }
            else
            {
                p_149878_1_.setBlock(p_149878_2_, p_149878_3_, p_149878_4_, this, l, 4);
            }
        }
    }

	
	
	
}
*/