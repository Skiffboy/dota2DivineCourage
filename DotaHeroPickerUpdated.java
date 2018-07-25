package dotaheropickerupdated;

//author: Skiffage

//<editor-fold defaultstate="collapsed" desc="IMPORTS">
import java.awt.*;
import static java.awt.Transparency.TRANSLUCENT;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.*;
//</editor-fold>

public class DotaHeroPickerUpdated extends JFrame {
    //<editor-fold defaultstate="collapsed" desc="IMAGE ICONS INT">
    ImageIcon imageIconAncientApparition = new ImageIcon("heroes/ancientApparition.png"); // load the image to a imageIcon
    Image imageAncientApparition = imageIconAncientApparition.getImage(); // transform it 
    Image newimgAncientApparition = imageAncientApparition.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ancientApparitionFinal = new ImageIcon(newimgAncientApparition);  // transform it back
    
    ImageIcon imageIconAncientApparitionNC = new ImageIcon("heroes/ancientApparitionNoColor.png"); // load the image to a imageIcon
    Image imageAncientApparitionNC = imageIconAncientApparitionNC.getImage(); // transform it 
    Image newimgAncientApparitionNC = imageAncientApparitionNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ancientApparitionFinalNC = new ImageIcon(newimgAncientApparitionNC);  // transform it back
    
    ImageIcon imageIconBane = new ImageIcon("heroes/bane.png"); // load the image to a imageIcon
    Image imageBane= imageIconBane.getImage(); // transform it 
    Image newimgBane = imageBane.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon baneFinal = new ImageIcon(newimgBane);  // transform it back
    
    ImageIcon imageIconBaneNC = new ImageIcon("heroes/baneNoColor.png"); // load the image to a imageIcon
    Image imageBaneNC = imageIconBaneNC.getImage(); // transform it 
    Image newimgBaneNC = imageBaneNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon baneFinalNC = new ImageIcon(newimgBaneNC);  // transform it back
    
    ImageIcon imageIconBatrider = new ImageIcon("heroes/batrider.png"); // load the image to a imageIcon
    Image imageBatrider = imageIconBatrider.getImage(); // transform it 
    Image newimgBatrider = imageBatrider.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon batriderFinal = new ImageIcon(newimgBatrider);  // transform it back
    
    ImageIcon imageIconBatriderNC = new ImageIcon("heroes/batriderNoColor.png"); // load the image to a imageIcon
    Image imageBatriderNC = imageIconBatriderNC.getImage(); // transform it 
    Image newimgBatriderNC = imageBatriderNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon batriderFinalNC = new ImageIcon(newimgBatriderNC);  // transform it back
    
    ImageIcon imageIconChen = new ImageIcon("heroes/chen.png"); // load the image to a imageIcon
    Image imageChen = imageIconChen.getImage(); // transform it 
    Image newimgChen = imageChen.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon chenFinal = new ImageIcon(newimgChen);  // transform it back
    
    ImageIcon imageIconChenNC = new ImageIcon("heroes/chenNoColor.png"); // load the image to a imageIcon
    Image imageChenNC = imageIconChenNC.getImage(); // transform it 
    Image newimgChenNC = imageChenNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon chenFinalNC = new ImageIcon(newimgChenNC);  // transform it back
    
    ImageIcon imageIconCrystalMaiden = new ImageIcon("heroes/crystalMaiden.png"); // load the image to a imageIcon
    Image imageCrystalMaiden = imageIconCrystalMaiden.getImage(); // transform it 
    Image newimgCrystalMaiden = imageCrystalMaiden.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon crystalMaidenFinal = new ImageIcon(newimgCrystalMaiden);  // transform it back
    
    ImageIcon imageIconCrystalMaidenNC = new ImageIcon("heroes/crystalMaidenNoColor.png"); // load the image to a imageIcon
    Image imageCrystalMaidenNC = imageIconCrystalMaidenNC.getImage(); // transform it 
    Image newimgCrystalMaidenNC = imageCrystalMaidenNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon crystalMaidenFinalNC = new ImageIcon(newimgCrystalMaidenNC);  // transform it back
    
    ImageIcon imageIconDarkSeer = new ImageIcon("heroes/darkSeer.png"); // load the image to a imageIcon
    Image imageDarkSeer = imageIconDarkSeer.getImage(); // transform it 
    Image newimgDarkSeer = imageDarkSeer.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon darkSeerFinal = new ImageIcon(newimgDarkSeer);  // transform it back
    
    ImageIcon imageIconDarkSeerNC = new ImageIcon("heroes/darkSeerNoColor.png"); // load the image to a imageIcon
    Image imageDarkSeerNC = imageIconDarkSeerNC.getImage(); // transform it 
    Image newimgDarkSeerNC = imageDarkSeerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon darkSeerFinalNC = new ImageIcon(newimgDarkSeerNC);  // transform it back
    
    ImageIcon imageIconDarkWillow = new ImageIcon("heroes/darkWillow.png"); // load the image to a imageIcon
    Image imageDarkWillow = imageIconDarkWillow.getImage(); // transform it 
    Image newimgDarkWillow = imageDarkWillow.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon darkWillowFinal = new ImageIcon(newimgDarkWillow);  // transform it back
    
    ImageIcon imageIconDarkWillowNC = new ImageIcon("heroes/darkWillowNoColor.png"); // load the image to a imageIcon
    Image imageDarkWillowNC = imageIconDarkWillowNC.getImage(); // transform it 
    Image newimgDarkWillowNC = imageDarkWillowNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon darkWillowFinalNC = new ImageIcon(newimgDarkWillowNC);  // transform it back
    
    ImageIcon imageIconDazzle = new ImageIcon("heroes/dazzle.png"); // load the image to a imageIcon
    Image imageDazzle = imageIconDazzle.getImage(); // transform it 
    Image newimgDazzle = imageDazzle.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon dazzleFinal = new ImageIcon(newimgDazzle);  // transform it back
    
    ImageIcon imageIconDazzleNC = new ImageIcon("heroes/dazzleNoColor.png"); // load the image to a imageIcon
    Image imageDazzleNC = imageIconDazzleNC.getImage(); // transform it 
    Image newimgDazzleNC = imageDazzleNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon dazzleFinalNC = new ImageIcon(newimgDazzleNC);  // transform it back
    
    ImageIcon imageIconDeathProphet = new ImageIcon("heroes/deathProphet.png"); // load the image to a imageIcon
    Image imageDeathProphet = imageIconDeathProphet.getImage(); // transform it 
    Image newimgDeathProphet = imageDeathProphet.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon deathProphetFinal = new ImageIcon(newimgDeathProphet);  // transform it back
    
    ImageIcon imageIconDeathProphetNC = new ImageIcon("heroes/deathProphetNoColor.png"); // load the image to a imageIcon
    Image imageDeathProphetNC = imageIconDeathProphetNC.getImage(); // transform it 
    Image newimgDeathProphetNC = imageDeathProphetNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon deathProphetFinalNC = new ImageIcon(newimgDeathProphetNC);  // transform it back
    
    ImageIcon imageIconDisruptor = new ImageIcon("heroes/disruptor.png"); // load the image to a imageIcon
    Image imageDisruptor = imageIconDisruptor.getImage(); // transform it 
    Image newimgDisruptor = imageDisruptor.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon disruptorFinal = new ImageIcon(newimgDisruptor);  // transform it back
    
    ImageIcon imageIconDisruptorNC = new ImageIcon("heroes/disruptorNoColor.png"); // load the image to a imageIcon
    Image imageDisruptorNC = imageIconDisruptorNC.getImage(); // transform it 
    Image newimgDisruptorNC = imageDisruptorNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon disruptorFinalNC = new ImageIcon(newimgDisruptorNC);  // transform it back
    
    ImageIcon imageIconEnchantress = new ImageIcon("heroes/enchantress.png"); // load the image to a imageIcon
    Image imageEnchantress = imageIconEnchantress.getImage(); // transform it 
    Image newimgEnchantress = imageEnchantress.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon enchantressFinal = new ImageIcon(newimgEnchantress);  // transform it back
    
    ImageIcon imageIconEnchantressNC = new ImageIcon("heroes/enchantressNoColor.png"); // load the image to a imageIcon
    Image imageEnchantressNC = imageIconEnchantressNC.getImage(); // transform it 
    Image newimgEnchantressNC = imageEnchantressNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon enchantressFinalNC = new ImageIcon(newimgEnchantressNC);  // transform it back
    
    ImageIcon imageIconEnigma = new ImageIcon("heroes/enigma.png"); // load the image to a imageIcon
    Image imageEnigma = imageIconEnigma.getImage(); // transform it 
    Image newimgEnigma = imageEnigma.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon enigmaFinal = new ImageIcon(newimgEnigma);  // transform it back
    
    ImageIcon imageIconEnigmaNC = new ImageIcon("heroes/enigmaNoColor.png"); // load the image to a imageIcon
    Image imageEnigmaNC = imageIconEnigmaNC.getImage(); // transform it 
    Image newimgEnigmaNC = imageEnigmaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon enigmaFinalNC = new ImageIcon(newimgEnigmaNC);  // transform it back
    
    ImageIcon imageIconInvoker = new ImageIcon("heroes/invoker.png"); // load the image to a imageIcon
    Image imageInvoker = imageIconInvoker.getImage(); // transform it 
    Image newimgInvoker = imageInvoker.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon invokerFinal = new ImageIcon(newimgInvoker);  // transform it back
    
    ImageIcon imageIconInvokerNC = new ImageIcon("heroes/invokerNoColor.png"); // load the image to a imageIcon
    Image imageInvokerNC = imageIconInvokerNC.getImage(); // transform it 
    Image newimgInvokerNC = imageInvokerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon invokerFinalNC = new ImageIcon(newimgInvokerNC);  // transform it back
    
    ImageIcon imageIconJakiro = new ImageIcon("heroes/jakiro.png"); // load the image to a imageIcon
    Image imageJakiro = imageIconJakiro.getImage(); // transform it 
    Image newimgJakiro = imageJakiro.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon jakiroFinal = new ImageIcon(newimgJakiro);  // transform it back
    
    ImageIcon imageIconJakiroNC = new ImageIcon("heroes/jakiroNoColor.png"); // load the image to a imageIcon
    Image imageJakiroNC = imageIconJakiroNC.getImage(); // transform it 
    Image newimgJakiroNC = imageJakiroNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon jakiroFinalNC = new ImageIcon(newimgJakiroNC);  // transform it back
    
    ImageIcon imageIconKeeperOfTheLight = new ImageIcon("heroes/keeperOfTheLight.png"); // load the image to a imageIcon
    Image imageKeeperOfTheLight = imageIconKeeperOfTheLight.getImage(); // transform it 
    Image newimgKeeperOfTheLight = imageKeeperOfTheLight.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon keeperOfTheLightFinal = new ImageIcon(newimgKeeperOfTheLight);  // transform it back
    
    ImageIcon imageIconKeeperOfTheLightNC = new ImageIcon("heroes/keeperOfTheLightNoColor.png"); // load the image to a imageIcon
    Image imageKeeperOfTheLightNC = imageIconKeeperOfTheLightNC.getImage(); // transform it 
    Image newimgKeeperOfTheLightNC = imageKeeperOfTheLightNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon keeperOfTheLightFinalNC = new ImageIcon(newimgKeeperOfTheLightNC);  // transform it back
    
    ImageIcon imageIconLeshrac = new ImageIcon("heroes/leshrac.png"); // load the image to a imageIcon
    Image imageLeshrac = imageIconLeshrac.getImage(); // transform it 
    Image newimgLeshrac = imageLeshrac.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon leshracFinal = new ImageIcon(newimgLeshrac);  // transform it back
    
    ImageIcon imageIconLeshracNC = new ImageIcon("heroes/leshracNoColor.png"); // load the image to a imageIcon
    Image imageLeshracNC = imageIconLeshracNC.getImage(); // transform it 
    Image newimgLeshracNC = imageLeshracNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon leshracFinalNC = new ImageIcon(newimgLeshracNC);  // transform it back
    
    ImageIcon imageIconLich = new ImageIcon("heroes/lich.png"); // load the image to a imageIcon
    Image imageLich = imageIconLich.getImage(); // transform it 
    Image newimgLich = imageLich.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lichFinal = new ImageIcon(newimgLich);  // transform it back
    
    ImageIcon imageIconLichNC = new ImageIcon("heroes/lichNoColor.png"); // load the image to a imageIcon
    Image imageLichNC = imageIconLichNC.getImage(); // transform it 
    Image newimgLichNC = imageLichNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lichFinalNC = new ImageIcon(newimgLichNC);  // transform it back
    
    ImageIcon imageIconLina = new ImageIcon("heroes/lina.png"); // load the image to a imageIcon
    Image imageLina = imageIconLina.getImage(); // transform it 
    Image newimgLina = imageLina.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon linaFinal = new ImageIcon(newimgLina);  // transform it back
    
    ImageIcon imageIconLinaNC = new ImageIcon("heroes/linaNoColor.png"); // load the image to a imageIcon
    Image imageLinaNC = imageIconLinaNC.getImage(); // transform it 
    Image newimgLinaNC = imageLinaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon linaFinalNC = new ImageIcon(newimgLinaNC);  // transform it back
    
    ImageIcon imageIconLion = new ImageIcon("heroes/lion.png"); // load the image to a imageIcon
    Image imageLion = imageIconLion.getImage(); // transform it 
    Image newimgLion = imageLion.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lionFinal = new ImageIcon(newimgLion);  // transform it back
    
    ImageIcon imageIconLionNC = new ImageIcon("heroes/lionNoColor.png"); // load the image to a imageIcon
    Image imageLionNC = imageIconLionNC.getImage(); // transform it 
    Image newimgLionNC = imageLionNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lionFinalNC = new ImageIcon(newimgLionNC);  // transform it back
    
    ImageIcon imageIconNatureProphet = new ImageIcon("heroes/natureProphet.png"); // load the image to a imageIcon
    Image imageNatureProphet = imageIconNatureProphet.getImage(); // transform it 
    Image newimgNatureProphet = imageNatureProphet.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon natureProphetFinal = new ImageIcon(newimgNatureProphet);  // transform it back
    
    ImageIcon imageIconNatureProphetNC = new ImageIcon("heroes/natureProphetNoColor.png"); // load the image to a imageIcon
    Image imageNatureProphetNC = imageIconNatureProphetNC.getImage(); // transform it 
    Image newimgNatureProphetNC = imageNatureProphetNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon natureProphetFinalNC = new ImageIcon(newimgNatureProphetNC);  // transform it back
    
    ImageIcon imageIconNecrophos = new ImageIcon("heroes/necrophos.png"); // load the image to a imageIcon
    Image imageNecrophos = imageIconNecrophos.getImage(); // transform it 
    Image newimgNecrophos = imageNecrophos.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon necrophosFinal = new ImageIcon(newimgNecrophos);  // transform it back
    
    ImageIcon imageIconNecrophosNC = new ImageIcon("heroes/necrophosNoColor.png"); // load the image to a imageIcon
    Image imageNecrophosNC = imageIconNecrophosNC.getImage(); // transform it 
    Image newimgNecrophosNC = imageNecrophosNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon necrophosFinalNC = new ImageIcon(newimgNecrophosNC);  // transform it back
    
    ImageIcon imageIconOgreMagi = new ImageIcon("heroes/ogreMagi.png"); // load the image to a imageIcon
    Image imageOgreMagi = imageIconOgreMagi.getImage(); // transform it 
    Image newimgOgreMagi = imageOgreMagi.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ogreMagiFinal = new ImageIcon(newimgOgreMagi);  // transform it back
    
    ImageIcon imageIconOgreMagiNC = new ImageIcon("heroes/ogreMagiNoColor.png"); // load the image to a imageIcon
    Image imageOgreMagiNC = imageIconOgreMagiNC.getImage(); // transform it 
    Image newimgOgreMagiNC = imageOgreMagiNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ogreMagiFinalNC = new ImageIcon(newimgOgreMagiNC);  // transform it back
    
    ImageIcon imageIconOracle = new ImageIcon("heroes/oracle.png"); // load the image to a imageIcon
    Image imageOracle = imageIconOracle.getImage(); // transform it 
    Image newimgOracle = imageOracle.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon oracleFinal = new ImageIcon(newimgOracle);  // transform it back
    
    ImageIcon imageIconOracleNC = new ImageIcon("heroes/oracleNoColor.png"); // load the image to a imageIcon
    Image imageOracleNC = imageIconOracleNC.getImage(); // transform it 
    Image newimgOracleNC = imageOracleNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon oracleFinalNC = new ImageIcon(newimgOracleNC);  // transform it back
    
    ImageIcon imageIconOutworldDevourer = new ImageIcon("heroes/outworldDevourer.png"); // load the image to a imageIcon
    Image imageOutworldDevourer = imageIconOutworldDevourer.getImage(); // transform it 
    Image newimgOutworldDevourer = imageOutworldDevourer.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon outworldDevourerFinal = new ImageIcon(newimgOutworldDevourer);  // transform it back
    
    ImageIcon imageIconOutworldDevourerNC = new ImageIcon("heroes/outworldDevourerNoColor.png"); // load the image to a imageIcon
    Image imageOutworldDevourerNC = imageIconOutworldDevourerNC.getImage(); // transform it 
    Image newimgOutworldDevourerNC = imageOutworldDevourerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon outworldDevourerFinalNC = new ImageIcon(newimgOutworldDevourerNC);  // transform it back
    
    ImageIcon imageIconPuck = new ImageIcon("heroes/puck.png"); // load the image to a imageIcon
    Image imagePuck = imageIconPuck.getImage(); // transform it 
    Image newimgPuck = imagePuck.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon puckFinal = new ImageIcon(newimgPuck);  // transform it back
    
    ImageIcon imageIconPuckNC = new ImageIcon("heroes/puckNoColor.png"); // load the image to a imageIcon
    Image imagePuckNC = imageIconPuckNC.getImage(); // transform it 
    Image newimgPuckNC = imagePuckNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon puckFinalNC = new ImageIcon(newimgPuckNC);  // transform it back
    
    ImageIcon imageIconPugna = new ImageIcon("heroes/pugna.png"); // load the image to a imageIcon
    Image imagePugna = imageIconPugna.getImage(); // transform it 
    Image newimgPugna = imagePugna.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon pugnaFinal = new ImageIcon(newimgPugna);  // transform it back
    
    ImageIcon imageIconPugnaNC = new ImageIcon("heroes/pugnaNoColor.png"); // load the image to a imageIcon
    Image imagePugnaNC = imageIconPugnaNC.getImage(); // transform it 
    Image newimgPugnaNC = imagePugnaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon pugnaFinalNC = new ImageIcon(newimgPugnaNC);  // transform it back
    
    ImageIcon imageIconQueenOfPain = new ImageIcon("heroes/queenOfPain.png"); // load the image to a imageIcon
    Image imageQueenOfPain = imageIconQueenOfPain.getImage(); // transform it 
    Image newimgQueenOfPain = imageQueenOfPain.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon queenOfPainFinal = new ImageIcon(newimgQueenOfPain);  // transform it back
    
    ImageIcon imageIconQueenOfPainNC = new ImageIcon("heroes/queenOfPainNoColor.png"); // load the image to a imageIcon
    Image imageQueenOfPainNC = imageIconQueenOfPainNC.getImage(); // transform it 
    Image newimgQueenOfPainNC = imageQueenOfPainNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon queenOfPainFinalNC = new ImageIcon(newimgQueenOfPainNC);  // transform it back
    
    ImageIcon imageIconRubick = new ImageIcon("heroes/rubick.png"); // load the image to a imageIcon
    Image imageRubick = imageIconRubick.getImage(); // transform it 
    Image newimgRubick = imageRubick.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon rubickFinal = new ImageIcon(newimgRubick);  // transform it back
    
    ImageIcon imageIconRubickNC = new ImageIcon("heroes/rubickNoColor.png"); // load the image to a imageIcon
    Image imageRubickNC = imageIconRubickNC.getImage(); // transform it 
    Image newimgRubickNC = imageRubickNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon rubickFinalNC = new ImageIcon(newimgRubickNC);  // transform it back
    
    ImageIcon imageIconShadowDemon = new ImageIcon("heroes/shadowDemon.png"); // load the image to a imageIcon
    Image imageShadowDemon = imageIconShadowDemon.getImage(); // transform it 
    Image newimgShadowDemon = imageShadowDemon.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon shadowDemonFinal = new ImageIcon(newimgShadowDemon);  // transform it back
    
    ImageIcon imageIconShadowDemonNC = new ImageIcon("heroes/shadowDemonNoColor.png"); // load the image to a imageIcon
    Image imageShadowDemonNC = imageIconShadowDemonNC.getImage(); // transform it 
    Image newimgShadowDemonNC = imageShadowDemonNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon shadowDemonFinalNC = new ImageIcon(newimgShadowDemonNC);  // transform it back
    
    ImageIcon imageIconShadowShaman = new ImageIcon("heroes/shadowShaman.png"); // load the image to a imageIcon
    Image imageShadowShaman = imageIconShadowShaman.getImage(); // transform it 
    Image newimgShadowShaman = imageShadowShaman.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon shadowShamanFinal = new ImageIcon(newimgShadowShaman);  // transform it back
    
    ImageIcon imageIconShadowShamanNC = new ImageIcon("heroes/shadowShamanNoColor.png"); // load the image to a imageIcon
    Image imageShadowShamanNC = imageIconShadowShamanNC.getImage(); // transform it 
    Image newimgShadowShamanNC = imageShadowShamanNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon shadowShamanFinalNC = new ImageIcon(newimgShadowShamanNC);  // transform it back
    
    ImageIcon imageIconSilencer = new ImageIcon("heroes/silencer.png"); // load the image to a imageIcon
    Image imageSilencer = imageIconSilencer.getImage(); // transform it 
    Image newimgSilencer = imageSilencer.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon silencerFinal = new ImageIcon(newimgSilencer);  // transform it back
    
    ImageIcon imageIconSilencerNC = new ImageIcon("heroes/silencerNoColor.png"); // load the image to a imageIcon
    Image imageSilencerNC = imageIconSilencerNC.getImage(); // transform it 
    Image newimgSilencerNC = imageSilencerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon silencerFinalNC = new ImageIcon(newimgSilencerNC);  // transform it back
    
    ImageIcon imageIconSkywrathMage = new ImageIcon("heroes/skywrathMage.png"); // load the image to a imageIcon
    Image imageSkywrathMage = imageIconSkywrathMage.getImage(); // transform it 
    Image newimgSkywrathMage = imageSkywrathMage.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon skywrathMageFinal = new ImageIcon(newimgSkywrathMage);  // transform it back
    
    ImageIcon imageIconSkywrathMageNC = new ImageIcon("heroes/skywrathMageNoColor.png"); // load the image to a imageIcon
    Image imageSkywrathMageNC = imageIconSkywrathMageNC.getImage(); // transform it 
    Image newimgSkywrathMageNC = imageSkywrathMageNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon skywrathMageFinalNC = new ImageIcon(newimgSkywrathMageNC);  // transform it back
    
    ImageIcon imageIconStormSpirit = new ImageIcon("heroes/stormSpirit.png"); // load the image to a imageIcon
    Image imageStormSpirit = imageIconStormSpirit.getImage(); // transform it 
    Image newimgStormSpirit = imageStormSpirit.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon stormSpiritFinal = new ImageIcon(newimgStormSpirit);  // transform it back
    
    ImageIcon imageIconStormSpiritNC = new ImageIcon("heroes/stormSpiritNoColor.png"); // load the image to a imageIcon
    Image imageStormSpiritNC = imageIconStormSpiritNC.getImage(); // transform it 
    Image newimgStormSpiritNC = imageStormSpiritNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon stormSpiritFinalNC = new ImageIcon(newimgStormSpiritNC);  // transform it back
    
    ImageIcon imageIconTechies = new ImageIcon("heroes/techies.png"); // load the image to a imageIcon
    Image imageTechies = imageIconTechies.getImage(); // transform it 
    Image newimgTechies = imageTechies.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon techiesFinal = new ImageIcon(newimgTechies);  // transform it back
    
    ImageIcon imageIconTechiesNC = new ImageIcon("heroes/techiesNoColor.png"); // load the image to a imageIcon
    Image imageTechiesNC = imageIconTechiesNC.getImage(); // transform it 
    Image newimgTechiesNC = imageTechiesNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon techiesFinalNC = new ImageIcon(newimgTechiesNC);  // transform it back
    
    ImageIcon imageIconTinker = new ImageIcon("heroes/tinker.png"); // load the image to a imageIcon
    Image imageTinker = imageIconTinker.getImage(); // transform it 
    Image newimgTinker = imageTinker.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tinkerFinal = new ImageIcon(newimgTinker);  // transform it back
    
    ImageIcon imageIconTinkerNC = new ImageIcon("heroes/tinkerNoColor.png"); // load the image to a imageIcon
    Image imageTinkerNC = imageIconTinkerNC.getImage(); // transform it 
    Image newimgTinkerNC = imageTinkerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tinkerFinalNC = new ImageIcon(newimgTinkerNC);  // transform it back
    
    ImageIcon imageIconVisage = new ImageIcon("heroes/visage.png"); // load the image to a imageIcon
    Image imageVisage = imageIconVisage.getImage(); // transform it 
    Image newimgVisage = imageVisage.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon visageFinal = new ImageIcon(newimgVisage);  // transform it back
    
    ImageIcon imageIconVisageNC = new ImageIcon("heroes/visageNoColor.png"); // load the image to a imageIcon
    Image imageVisageNC = imageIconVisageNC.getImage(); // transform it 
    Image newimgVisageNC = imageVisageNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon visageFinalNC = new ImageIcon(newimgVisageNC);  // transform it back
    
    ImageIcon imageIconWarlock = new ImageIcon("heroes/warlock.png"); // load the image to a imageIcon
    Image imageWarlock = imageIconWarlock.getImage(); // transform it 
    Image newimgWarlock = imageWarlock.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon warlockFinal = new ImageIcon(newimgWarlock);  // transform it back
    
    ImageIcon imageIconWarlockNC = new ImageIcon("heroes/warlockNoColor.png"); // load the image to a imageIcon
    Image imageWarlockNC = imageIconWarlockNC.getImage(); // transform it 
    Image newimgWarlockNC = imageWarlockNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon warlockFinalNC = new ImageIcon(newimgWarlockNC);  // transform it back
    
    ImageIcon imageIconWindranger = new ImageIcon("heroes/windranger.png"); // load the image to a imageIcon
    Image imageWindranger = imageIconWindranger.getImage(); // transform it 
    Image newimgWindranger = imageWindranger.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon windrangerFinal = new ImageIcon(newimgWindranger);  // transform it back
    
    ImageIcon imageIconWindrangerNC = new ImageIcon("heroes/windrangerNoColor.png"); // load the image to a imageIcon
    Image imageWindrangerNC = imageIconWindrangerNC.getImage(); // transform it 
    Image newimgWindrangerNC = imageWindrangerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon windrangerFinalNC = new ImageIcon(newimgWindrangerNC);  // transform it back
    
    ImageIcon imageIconWinterWyvern = new ImageIcon("heroes/winterWyvern.png"); // load the image to a imageIcon
    Image imageWinterWyvern = imageIconWinterWyvern.getImage(); // transform it 
    Image newimgWinterWyvern = imageWinterWyvern.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon winterWyvernFinal = new ImageIcon(newimgWinterWyvern);  // transform it back
    
    ImageIcon imageIconWinterWyvernNC = new ImageIcon("heroes/winterWyvernNoColor.png"); // load the image to a imageIcon
    Image imageWinterWyvernNC = imageIconWinterWyvernNC.getImage(); // transform it 
    Image newimgWinterWyvernNC = imageWinterWyvernNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon winterWyvernFinalNC = new ImageIcon(newimgWinterWyvernNC);  // transform it back
    
    ImageIcon imageIconWitchDoctor = new ImageIcon("heroes/witchDoctor.png"); // load the image to a imageIcon
    Image imageWitchDoctor = imageIconWitchDoctor.getImage(); // transform it 
    Image newimgWitchDoctor = imageWitchDoctor.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon witchDoctorFinal = new ImageIcon(newimgWitchDoctor);  // transform it back
    
    ImageIcon imageIconWitchDoctorNC = new ImageIcon("heroes/witchDoctorNoColor.png"); // load the image to a imageIcon
    Image imageWitchDoctorNC = imageIconWitchDoctorNC.getImage(); // transform it 
    Image newimgWitchDoctorNC = imageWitchDoctorNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon witchDoctorFinalNC = new ImageIcon(newimgWitchDoctorNC);  // transform it back
    
    ImageIcon imageIconZeus = new ImageIcon("heroes/zeus.png"); // load the image to a imageIcon
    Image imageZeus = imageIconZeus.getImage(); // transform it 
    Image newimgZeus = imageZeus.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon zeusFinal = new ImageIcon(newimgZeus);  // transform it back
    
    ImageIcon imageIconZeusNC = new ImageIcon("heroes/zeusNoColor.png"); // load the image to a imageIcon
    Image imageZeusNC = imageIconZeusNC.getImage(); // transform it 
    Image newimgZeusNC = imageZeusNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon zeusFinalNC = new ImageIcon(newimgZeusNC);  // transform it back
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="IMAGE ICONS STR">
    ImageIcon imageIconAbaddon = new ImageIcon("heroes/abaddon.png"); // load the image to a imageIcon
    Image imageAbaddon = imageIconAbaddon.getImage(); // transform it 
    Image newimgAbaddon = imageAbaddon.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon abaddonFinal = new ImageIcon(newimgAbaddon);  // transform it back
    
    ImageIcon imageIconAbaddonNC = new ImageIcon("heroes/abaddonNoColor.png"); // load the image to a imageIcon
    Image imageAbaddonNC = imageIconAbaddonNC.getImage(); // transform it 
    Image newimgAbaddonNC = imageAbaddonNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon abaddonFinalNC = new ImageIcon(newimgAbaddonNC);
    
    ImageIcon imageIconEarthshaker = new ImageIcon("heroes/earthshaker.png"); // load the image to a imageIcon
    Image imageEarthshaker = imageIconEarthshaker.getImage(); // transform it 
    Image newimgEarthshaker = imageEarthshaker.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon earthshakerFinal = new ImageIcon(newimgEarthshaker);  // transform it back
    
    ImageIcon imageIconEarthshakerNC = new ImageIcon("heroes/earthshakerNoColor.png"); // load the image to a imageIcon
    Image imageEarthshakerNC = imageIconEarthshakerNC.getImage(); // transform it 
    Image newimgEarthshakerNC = imageEarthshakerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon earthshakerFinalNC = new ImageIcon(newimgEarthshakerNC);  // transform it back
    
    ImageIcon imageIconSven = new ImageIcon("heroes/sven.png"); // load the image to a imageIcon
    Image imageSven = imageIconSven.getImage(); // transform it 
    Image newimgSven = imageSven.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon svenFinal = new ImageIcon(newimgSven);  // transform it back
    
    ImageIcon imageIconSvenNC = new ImageIcon("heroes/svenNoColor.png"); // load the image to a imageIcon
    Image imageSvenNC = imageIconSvenNC.getImage(); // transform it 
    Image newimgSvenNC = imageSvenNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon svenFinalNC = new ImageIcon(newimgSvenNC);  // transform it back
    
    ImageIcon imageIconTiny = new ImageIcon("heroes/tiny.png"); // load the image to a imageIcon
    Image imageTiny = imageIconTiny.getImage(); // transform it 
    Image newimgTiny = imageTiny.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tinyFinal = new ImageIcon(newimgTiny);  // transform it back
    
    ImageIcon imageIconTinyNC = new ImageIcon("heroes/tinyNoColor.png"); // load the image to a imageIcon
    Image imageTinyNC = imageIconTinyNC.getImage(); // transform it 
    Image newimgTinyNC = imageTinyNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tinyFinalNC = new ImageIcon(newimgTinyNC);  // transform it back
    
    ImageIcon imageIconKunkka = new ImageIcon("heroes/kunkka.png"); // load the image to a imageIcon
    Image imageKunkka = imageIconKunkka.getImage(); // transform it 
    Image newimgKunkka = imageKunkka.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon kunkkaFinal = new ImageIcon(newimgKunkka);  // transform it back
    
    ImageIcon imageIconKunkkaNC = new ImageIcon("heroes/kunkkaNoColor.png"); // load the image to a imageIcon
    Image imageKunkkaNC = imageIconKunkkaNC.getImage(); // transform it 
    Image newimgKunkkaNC = imageKunkkaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon kunkkaFinalNC = new ImageIcon(newimgKunkkaNC);  // transform it back
    
    ImageIcon imageIconBeastMaster = new ImageIcon("heroes/beastmaster.png"); // load the image to a imageIcon
    Image imageBeastMaster = imageIconBeastMaster.getImage(); // transform it 
    Image newimgBeastMaster = imageBeastMaster.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon beastMasterFinal = new ImageIcon(newimgBeastMaster);  // transform it back
    
    ImageIcon imageIconBeastMasterNC = new ImageIcon("heroes/beastmasterNoColor.png"); // load the image to a imageIcon
    Image imageBeastMasterNC = imageIconBeastMasterNC.getImage(); // transform it 
    Image newimgBeastMasterNC = imageBeastMasterNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon beastMasterFinalNC = new ImageIcon(newimgBeastMasterNC);  // transform it back
    
    ImageIcon imageIconDragonKnight = new ImageIcon("heroes/dragonKnight.png"); // load the image to a imageIcon
    Image imageDragonKnight = imageIconDragonKnight.getImage(); // transform it 
    Image newimgDragonKnight = imageDragonKnight.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon dragonKnightFinal = new ImageIcon(newimgDragonKnight);  // transform it back
    
    ImageIcon imageIconDragonKnightNC = new ImageIcon("heroes/dragonKnightNoColor.png"); // load the image to a imageIcon
    Image imageDragonKnightNC = imageIconDragonKnightNC.getImage(); // transform it 
    Image newimgDragonKnightNC = imageDragonKnightNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon dragonKnightFinalNC = new ImageIcon(newimgDragonKnightNC);  // transform it back
    
    ImageIcon imageIconClockwerk = new ImageIcon("heroes/clockwerk.png"); // load the image to a imageIcon
    Image imageClockwerk = imageIconClockwerk.getImage(); // transform it 
    Image newimgClockwerk = imageClockwerk.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon clockwerkFinal = new ImageIcon(newimgClockwerk);  // transform it back
    
    ImageIcon imageIconClockwerkNC = new ImageIcon("heroes/clockwerkNoColor.png"); // load the image to a imageIcon
    Image imageClockwerkNC = imageIconClockwerkNC.getImage(); // transform it 
    Image newimgClockwerkNC = imageClockwerkNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon clockwerkFinalNC = new ImageIcon(newimgClockwerkNC);  // transform it back
    
    ImageIcon imageIconOmniknight = new ImageIcon("heroes/omniknight.png"); // load the image to a imageIcon
    Image imageOmniknight = imageIconOmniknight.getImage(); // transform it 
    Image newimgOmniknight = imageOmniknight.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon omniknightFinal = new ImageIcon(newimgOmniknight);  // transform it back
    
    ImageIcon imageIconOmniknightNC = new ImageIcon("heroes/omniknightNoColor.png"); // load the image to a imageIcon
    Image imageOmniknightNC = imageIconOmniknightNC.getImage(); // transform it 
    Image newimgOmniknightNC = imageOmniknightNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon omniknightFinalNC = new ImageIcon(newimgOmniknightNC);  // transform it back
    
    ImageIcon imageIconHuskar = new ImageIcon("heroes/huskar.png"); // load the image to a imageIcon
    Image imageHuskar = imageIconHuskar.getImage(); // transform it 
    Image newimgHuskar = imageHuskar.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon huskarFinal = new ImageIcon(newimgHuskar);  // transform it back
    
    ImageIcon imageIconHuskarNC = new ImageIcon("heroes/huskarNoColor.png"); // load the image to a imageIcon
    Image imageHuskarNC = imageIconHuskarNC.getImage(); // transform it 
    Image newimgHuskarNC = imageHuskarNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon huskarFinalNC = new ImageIcon(newimgHuskarNC);  // transform it back
    
    ImageIcon imageIconAxe = new ImageIcon("heroes/axe.png"); // load the image to a imageIcon
    Image imageAxe = imageIconAxe.getImage(); // transform it 
    Image newimgAxe = imageAxe.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon axeFinal = new ImageIcon(newimgAxe);  // transform it back
    
    ImageIcon imageIconAxeNC = new ImageIcon("heroes/axeNoColor.png"); // load the image to a imageIcon
    Image imageAxeNC = imageIconAxeNC.getImage(); // transform it 
    Image newimgAxeNC = imageAxeNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon axeFinalNC = new ImageIcon(newimgAxeNC);  // transform it back
    
    ImageIcon imageIconBrewmaster = new ImageIcon("heroes/brewmaster.png"); // load the image to a imageIcon
    Image imageBrewmaster = imageIconBrewmaster.getImage(); // transform it 
    Image newimgBrewmaster = imageBrewmaster.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon brewmasterFinal = new ImageIcon(newimgBrewmaster);  // transform it back
    
    ImageIcon imageIconBrewmasterNC = new ImageIcon("heroes/brewmasterNoColor.png"); // load the image to a imageIcon
    Image imageBrewmasterNC = imageIconBrewmasterNC.getImage(); // transform it 
    Image newimgBrewmasterNC = imageBrewmasterNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon brewmasterFinalNC = new ImageIcon(newimgBrewmasterNC);  // transform it back
    
    ImageIcon imageIconBristleback = new ImageIcon("heroes/bristleback.png"); // load the image to a imageIcon
    Image imageBristleback = imageIconBristleback.getImage(); // transform it 
    Image newimgBristleback = imageBristleback.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon bristlebackFinal = new ImageIcon(newimgBristleback);  // transform it back
    
    ImageIcon imageIconBristlebackNC = new ImageIcon("heroes/bristlebackNoColor.png"); // load the image to a imageIcon
    Image imageBristlebackNC = imageIconBristlebackNC.getImage(); // transform it 
    Image newimgBristlebackNC = imageBristlebackNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon bristlebackFinalNC = new ImageIcon(newimgBristlebackNC);  // transform it back
    
    ImageIcon imageIconCentaurWarrunner = new ImageIcon("heroes/centaurWarrunner.png"); // load the image to a imageIcon
    Image imageCentaurWarrunner = imageIconCentaurWarrunner.getImage(); // transform it 
    Image newimgCentaurWarrunner = imageCentaurWarrunner.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon centaurWarrunnerFinal = new ImageIcon(newimgCentaurWarrunner);  // transform it back
    
    ImageIcon imageIconCentaurWarrunnerNC = new ImageIcon("heroes/centaurWarrunnerNoColor.png"); // load the image to a imageIcon
    Image imageCentaurWarrunnerNC = imageIconCentaurWarrunnerNC.getImage(); // transform it 
    Image newimgCentaurWarrunnerNC = imageCentaurWarrunnerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon centaurWarrunnerFinalNC = new ImageIcon(newimgCentaurWarrunnerNC);  // transform it back
    
    ImageIcon imageIconChaosKnight = new ImageIcon("heroes/chaosKnight.png"); // load the image to a imageIcon
    Image imageChaosKnight = imageIconChaosKnight.getImage(); // transform it 
    Image newimgChaosKnight = imageChaosKnight.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon chaosKnightFinal = new ImageIcon(newimgChaosKnight);  // transform it back
    
    ImageIcon imageIconChaosKnightNC = new ImageIcon("heroes/chaosKnightNoColor.png"); // load the image to a imageIcon
    Image imageChaosKnightNC = imageIconChaosKnightNC.getImage(); // transform it 
    Image newimgChaosKnightNC = imageChaosKnightNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon chaosKnightFinalNC = new ImageIcon(newimgChaosKnightNC);  // transform it back
    
    ImageIcon imageIconDoom = new ImageIcon("heroes/doom.png"); // load the image to a imageIcon
    Image imageDoom = imageIconDoom.getImage(); // transform it 
    Image newimgDoom = imageDoom.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon doomFinal = new ImageIcon(newimgDoom);  // transform it back
    
    ImageIcon imageIconDoomNC = new ImageIcon("heroes/doomNoColor.png"); // load the image to a imageIcon
    Image imageDoomNC = imageIconDoomNC.getImage(); // transform it 
    Image newimgDoomNC = imageDoomNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon doomFinalNC = new ImageIcon(newimgDoomNC);  // transform it back
    
    ImageIcon imageIconEarthSpirit = new ImageIcon("heroes/earthSpirit.png"); // load the image to a imageIcon
    Image imageEarthSpirit = imageIconEarthSpirit.getImage(); // transform it 
    Image newimgEarthSpirit = imageEarthSpirit.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon earthSpiritFinal = new ImageIcon(newimgEarthSpirit);  // transform it back
    
    ImageIcon imageIconEarthSpiritNC = new ImageIcon("heroes/earthSpiritNoColor.png"); // load the image to a imageIcon
    Image imageEarthSpiritNC = imageIconEarthSpiritNC.getImage(); // transform it 
    Image newimgEarthSpiritNC = imageEarthSpiritNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon earthSpiritFinalNC = new ImageIcon(newimgEarthSpiritNC);  // transform it back
    
    ImageIcon imageIconElderTitan = new ImageIcon("heroes/elderTitan.png"); // load the image to a imageIcon
    Image imageElderTitan = imageIconElderTitan.getImage(); // transform it 
    Image newimgElderTitan = imageElderTitan.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon elderTitanFinal = new ImageIcon(newimgElderTitan);  // transform it back
    
    ImageIcon imageIconElderTitanNC = new ImageIcon("heroes/elderTitanNoColor.png"); // load the image to a imageIcon
    Image imageElderTitanNC = imageIconElderTitanNC.getImage(); // transform it 
    Image newimgElderTitanNC = imageElderTitanNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon elderTitanFinalNC = new ImageIcon(newimgElderTitanNC);  // transform it back
    
    ImageIcon imageIconIo = new ImageIcon("heroes/io.png"); // load the image to a imageIcon
    Image imageIo = imageIconIo.getImage(); // transform it 
    Image newimgIo = imageIo.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ioFinal = new ImageIcon(newimgIo);  // transform it back
    
    ImageIcon imageIconIoNC = new ImageIcon("heroes/ioNoColor.png"); // load the image to a imageIcon
    Image imageIoNC = imageIconIoNC.getImage(); // transform it 
    Image newimgIoNC = imageIoNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ioFinalNC = new ImageIcon(newimgIoNC);  // transform it back
    
    ImageIcon imageIconLegionCommander = new ImageIcon("heroes/legionCommander.png"); // load the image to a imageIcon
    Image imageLegionCommander = imageIconLegionCommander.getImage(); // transform it 
    Image newimgLegionCommander = imageLegionCommander.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon legionCommanderFinal = new ImageIcon(newimgLegionCommander);  // transform it back
    
    ImageIcon imageIconLegionCommanderNC = new ImageIcon("heroes/legionCommanderNoColor.png"); // load the image to a imageIcon
    Image imageLegionCommanderNC = imageIconLegionCommanderNC.getImage(); // transform it 
    Image newimgLegionCommanderNC = imageLegionCommanderNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon legionCommanderFinalNC = new ImageIcon(newimgLegionCommanderNC);  // transform it back
    
    ImageIcon imageIconLifestealer = new ImageIcon("heroes/lifestealer.png"); // load the image to a imageIcon
    Image imageLifestealer = imageIconLifestealer.getImage(); // transform it 
    Image newimgLifestealer = imageLifestealer.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lifestealerFinal = new ImageIcon(newimgLifestealer);  // transform it back
    
    ImageIcon imageIconLifestealerNC = new ImageIcon("heroes/lifestealerNoColor.png"); // load the image to a imageIcon
    Image imageLifestealerNC = imageIconLifestealerNC.getImage(); // transform it 
    Image newimgLifestealerNC = imageLifestealerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lifestealerFinalNC = new ImageIcon(newimgLifestealerNC);  // transform it back
    
    ImageIcon imageIconLycan = new ImageIcon("heroes/lycan.png"); // load the image to a imageIcon
    Image imageLycan = imageIconLycan.getImage(); // transform it 
    Image newimgLycan = imageLycan.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lycanFinal = new ImageIcon(newimgLycan);  // transform it back
    
    ImageIcon imageIconLycanNC = new ImageIcon("heroes/lycanNoColor.png"); // load the image to a imageIcon
    Image imageLycanNC = imageIconLycanNC.getImage(); // transform it 
    Image newimgLycanNC = imageLycanNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lycanFinalNC = new ImageIcon(newimgLycanNC);  // transform it back
    
    ImageIcon imageIconMagnus = new ImageIcon("heroes/magnus.png"); // load the image to a imageIcon
    Image imageMagnus = imageIconMagnus.getImage(); // transform it 
    Image newimgMagnus = imageMagnus.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon magnusFinal = new ImageIcon(newimgMagnus);  // transform it back
    
    ImageIcon imageIconMagnusNC = new ImageIcon("heroes/magnusNoColor.png"); // load the image to a imageIcon
    Image imageMagnusNC = imageIconMagnusNC.getImage(); // transform it 
    Image newimgMagnusNC = imageMagnusNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon magnusFinalNC = new ImageIcon(newimgMagnusNC);  // transform it back
    
    ImageIcon imageIconNightstalker = new ImageIcon("heroes/nightstalker.png"); // load the image to a imageIcon
    Image imageNightstalker = imageIconNightstalker.getImage(); // transform it 
    Image newimgNightstalker = imageNightstalker.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon nightstalkerFinal = new ImageIcon(newimgNightstalker);  // transform it back
    
    ImageIcon imageIconNightstalkerNC = new ImageIcon("heroes/nightstalkerNoColor.png"); // load the image to a imageIcon
    Image imageNightstalkerNC = imageIconNightstalkerNC.getImage(); // transform it 
    Image newimgNightstalkerNC = imageNightstalkerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon nightstalkerFinalNC = new ImageIcon(newimgNightstalkerNC);  // transform it back
    
    ImageIcon imageIconPhoenix = new ImageIcon("heroes/phoenix.png"); // load the image to a imageIcon
    Image imagePhoenix = imageIconPhoenix.getImage(); // transform it 
    Image newimgPhoenix = imagePhoenix.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon phoenixFinal = new ImageIcon(newimgPhoenix);  // transform it back
    
    ImageIcon imageIconPhoenixNC = new ImageIcon("heroes/phoenixNoColor.png"); // load the image to a imageIcon
    Image imagePhoenixNC = imageIconPhoenixNC.getImage(); // transform it 
    Image newimgPhoenixNC = imagePhoenixNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon phoenixFinalNC = new ImageIcon(newimgPhoenixNC);  // transform it back
    
    ImageIcon imageIconPudge = new ImageIcon("heroes/pudge.png"); // load the image to a imageIcon
    Image imagePudge = imageIconPudge.getImage(); // transform it 
    Image newimgPudge = imagePudge.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon pudgeFinal = new ImageIcon(newimgPudge);  // transform it back
    
    ImageIcon imageIconPudgeNC = new ImageIcon("heroes/pudgeNoColor.png"); // load the image to a imageIcon
    Image imagePudgeNC = imageIconPudgeNC.getImage(); // transform it 
    Image newimgPudgeNC = imagePudgeNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon pudgeFinalNC = new ImageIcon(newimgPudgeNC);  // transform it back
    
    ImageIcon imageIconSandKing = new ImageIcon("heroes/sandKing.png"); // load the image to a imageIcon
    Image imageSandKing = imageIconSandKing.getImage(); // transform it 
    Image newimgSandKing = imageSandKing.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon sandKingFinal = new ImageIcon(newimgSandKing);  // transform it back
    
    ImageIcon imageIconSandKingNC = new ImageIcon("heroes/sandKingNoColor.png"); // load the image to a imageIcon
    Image imageSandKingNC = imageIconSandKingNC.getImage(); // transform it 
    Image newimgSandKingNC = imageSandKingNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon sandKingFinalNC = new ImageIcon(newimgSandKingNC);  // transform it back
    
    ImageIcon imageIconSlardar = new ImageIcon("heroes/slardar.png"); // load the image to a imageIcon
    Image imageSlardar = imageIconSlardar.getImage(); // transform it 
    Image newimgSlardar = imageSlardar.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon slardarFinal = new ImageIcon(newimgSlardar);  // transform it back
    
    ImageIcon imageIconSlardarNC = new ImageIcon("heroes/slardarNoColor.png"); // load the image to a imageIcon
    Image imageSlardarNC = imageIconSlardarNC.getImage(); // transform it 
    Image newimgSlardarNC = imageSlardarNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon slardarFinalNC = new ImageIcon(newimgSlardarNC);  // transform it back
    
    ImageIcon imageIconSpiritBreaker = new ImageIcon("heroes/spiritBreaker.png"); // load the image to a imageIcon
    Image imageSpiritBreaker = imageIconSpiritBreaker.getImage(); // transform it 
    Image newimgSpiritBreaker = imageSpiritBreaker.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon spiritBreakerFinal = new ImageIcon(newimgSpiritBreaker);  // transform it back
    
    ImageIcon imageIconSpiritBreakerNC = new ImageIcon("heroes/spiritBreakerNoColor.png"); // load the image to a imageIcon
    Image imageSpiritBreakerNC = imageIconSpiritBreakerNC.getImage(); // transform it 
    Image newimgSpiritBreakerNC = imageSpiritBreakerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon spiritBreakerFinalNC = new ImageIcon(newimgSpiritBreakerNC);  // transform it back
    
    ImageIcon imageIconTidehunter = new ImageIcon("heroes/tidehunter.png"); // load the image to a imageIcon
    Image imageTidehunter = imageIconTidehunter.getImage(); // transform it 
    Image newimgTidehunter = imageTidehunter.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tidehunterFinal = new ImageIcon(newimgTidehunter);  // transform it back
    
    ImageIcon imageIconTidehunterNC = new ImageIcon("heroes/tidehunterNoColor.png"); // load the image to a imageIcon
    Image imageTidehunterNC = imageIconTidehunterNC.getImage(); // transform it 
    Image newimgTidehunterNC = imageTidehunterNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tidehunterFinalNC = new ImageIcon(newimgTidehunterNC);  // transform it back
    
    ImageIcon imageIconTreant = new ImageIcon("heroes/treant.png"); // load the image to a imageIcon
    Image imageTreant = imageIconTreant.getImage(); // transform it 
    Image newimgTreant = imageTreant.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon treantFinal = new ImageIcon(newimgTreant);  // transform it back
    
    ImageIcon imageIconTreantNC = new ImageIcon("heroes/treantNoColor.png"); // load the image to a imageIcon
    Image imageTreantNC = imageIconTreantNC.getImage(); // transform it 
    Image newimgTreantNC = imageTreantNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon treantFinalNC = new ImageIcon(newimgTreantNC);  // transform it back
    
    ImageIcon imageIconTusk = new ImageIcon("heroes/tusk.png"); // load the image to a imageIcon
    Image imageTusk = imageIconTusk.getImage(); // transform it 
    Image newimgTusk = imageTusk.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tuskFinal = new ImageIcon(newimgTusk);  // transform it back
    
    ImageIcon imageIconTuskNC = new ImageIcon("heroes/tuskNoColor.png"); // load the image to a imageIcon
    Image imageTuskNC = imageIconTuskNC.getImage(); // transform it 
    Image newimgTuskNC = imageTuskNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon tuskFinalNC = new ImageIcon(newimgTuskNC);  // transform it back
    
    ImageIcon imageIconUnderlord = new ImageIcon("heroes/underlord.png"); // load the image to a imageIcon
    Image imageUnderlord = imageIconUnderlord.getImage(); // transform it 
    Image newimgUnderlord = imageUnderlord.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon underlordFinal = new ImageIcon(newimgUnderlord);  // transform it back
    
    ImageIcon imageIconUnderlordNC = new ImageIcon("heroes/underlordNoColor.png"); // load the image to a imageIcon
    Image imageUnderlordNC = imageIconUnderlordNC.getImage(); // transform it 
    Image newimgUnderlordNC = imageUnderlordNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon underlordFinalNC = new ImageIcon(newimgUnderlordNC);  // transform it back
    
    ImageIcon imageIconUndying = new ImageIcon("heroes/undying.png"); // load the image to a imageIcon
    Image imageUndying = imageIconUndying.getImage(); // transform it 
    Image newimgUndying = imageUndying.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon undyingFinal = new ImageIcon(newimgUndying);  // transform it back
    
    ImageIcon imageIconUndyingNC = new ImageIcon("heroes/undyingNoColor.png"); // load the image to a imageIcon
    Image imageUndyingNC = imageIconUndyingNC.getImage(); // transform it 
    Image newimgUndyingNC = imageUndyingNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon undyingFinalNC = new ImageIcon(newimgUndyingNC);  // transform it back
    
    ImageIcon imageIconWraithKing = new ImageIcon("heroes/wraithKing.png"); // load the image to a imageIcon
    Image imageWraithKing = imageIconWraithKing.getImage(); // transform it 
    Image newimgWraithKing = imageWraithKing.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon wraithKingFinal = new ImageIcon(newimgWraithKing);  // transform it back
    
    ImageIcon imageIconWraithKingNC = new ImageIcon("heroes/wraithKingNoColor.png"); // load the image to a imageIcon
    Image imageWraithKingNC = imageIconWraithKingNC.getImage(); // transform it 
    Image newimgWraithKingNC = imageWraithKingNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon wraithKingFinalNC = new ImageIcon(newimgWraithKingNC);  // transform it back
    
    ImageIcon imageIconTimbersaw = new ImageIcon("heroes/timbersaw.png"); // load the image to a imageIcon
    Image imageTimbersaw = imageIconTimbersaw.getImage(); // transform it 
    Image newimgTimbersaw = imageTimbersaw.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon timbersawFinal = new ImageIcon(newimgTimbersaw);  // transform it back
    
    ImageIcon imageIconTimbersawNC = new ImageIcon("heroes/timbersawNoColor.png"); // load the image to a imageIcon
    Image imageTimbersawNC = imageIconTimbersawNC.getImage(); // transform it 
    Image newimgTimbersawNC = imageTimbersawNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon timbersawFinalNC = new ImageIcon(newimgTimbersawNC);  // transform it back
    
    ImageIcon imageIconAlchemist = new ImageIcon("heroes/alchemist.png"); // load the image to a imageIcon
    Image imageAlchemist = imageIconAlchemist.getImage(); // transform it 
    Image newimgAlchemist = imageAlchemist.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon alchemistFinal = new ImageIcon(newimgAlchemist);  // transform it back
    
    ImageIcon imageIconAlchemistNC = new ImageIcon("heroes/alchemistNoColor.png"); // load the image to a imageIcon
    Image imageAlchemistNC = imageIconAlchemistNC.getImage(); // transform it 
    Image newimgAlchemistNC = imageAlchemistNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon alchemistFinalNC = new ImageIcon(newimgAlchemistNC);  // transform it back
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="IMAGE ICONS AGI">
    ImageIcon imageIconAntimage = new ImageIcon("heroes/antimage.png"); // load the image to a imageIcon
    Image imageAntimage = imageIconAntimage.getImage(); // transform it 
    Image newimgAntimage = imageAntimage.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon antimageFinal = new ImageIcon(newimgAntimage);  // transform it back
    
    ImageIcon imageIconAntimageNC = new ImageIcon("heroes/antimageNoColor.png"); // load the image to a imageIcon
    Image imageAntimageNC = imageIconAntimageNC.getImage(); // transform it 
    Image newimgAntimageNC = imageAntimageNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon antimageFinalNC = new ImageIcon(newimgAntimageNC);
    
    ImageIcon imageIconArcWarden = new ImageIcon("heroes/arcWarden.png"); // load the image to a imageIcon
    Image imageArcWarden = imageIconArcWarden.getImage(); // transform it 
    Image newimgArcWarden = imageArcWarden.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon arcWardenFinal = new ImageIcon(newimgArcWarden);  // transform it back
    
    ImageIcon imageIconArcWardenNC = new ImageIcon("heroes/arcWardenNoColor.png"); // load the image to a imageIcon
    Image imageArcWardenNC = imageIconArcWardenNC.getImage(); // transform it 
    Image newimgArcWardenNC = imageArcWardenNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon arcWardenFinalNC = new ImageIcon(newimgArcWardenNC);
    
    ImageIcon imageIconBloodseeker = new ImageIcon("heroes/bloodseeker.png"); // load the image to a imageIcon
    Image imageBloodseeker = imageIconBloodseeker.getImage(); // transform it 
    Image newimgBloodseeker = imageBloodseeker.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon bloodseekerFinal = new ImageIcon(newimgBloodseeker);  // transform it back
    
    ImageIcon imageIconBloodseekerNC = new ImageIcon("heroes/bloodseekerNoColor.png"); // load the image to a imageIcon
    Image imageBloodseekerNC = imageIconBloodseekerNC.getImage(); // transform it 
    Image newimgBloodseekerNC = imageBloodseekerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon bloodseekerFinalNC = new ImageIcon(newimgBloodseekerNC);
    
    ImageIcon imageIconBountyHunter = new ImageIcon("heroes/bountyHunter.png"); // load the image to a imageIcon
    Image imageBountyHunter = imageIconBountyHunter.getImage(); // transform it 
    Image newimgBountyHunter = imageBountyHunter.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon bountyHunterFinal = new ImageIcon(newimgBountyHunter);  // transform it back
    
    ImageIcon imageIconBountyHunterNC = new ImageIcon("heroes/bountyHunterNoColor.png"); // load the image to a imageIcon
    Image imageBountyHunterNC = imageIconBountyHunterNC.getImage(); // transform it 
    Image newimgBountyHunterNC = imageBountyHunterNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon bountyHunterFinalNC = new ImageIcon(newimgBountyHunterNC);
    
    ImageIcon imageIconBroodmother = new ImageIcon("heroes/broodmother.png"); // load the image to a imageIcon
    Image imageBroodmother = imageIconBroodmother.getImage(); // transform it 
    Image newimgBroodmother = imageBroodmother.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon broodmotherFinal = new ImageIcon(newimgBroodmother);  // transform it back
    
    ImageIcon imageIconBroodmotherNC = new ImageIcon("heroes/broodmotherNoColor.png"); // load the image to a imageIcon
    Image imageBroodmotherNC = imageIconBroodmotherNC.getImage(); // transform it 
    Image newimgBroodmotherNC = imageBroodmotherNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon broodmotherFinalNC = new ImageIcon(newimgBroodmotherNC);
    
    ImageIcon imageIconClinkz = new ImageIcon("heroes/clinkz.png"); // load the image to a imageIcon
    Image imageClinkz = imageIconClinkz.getImage(); // transform it 
    Image newimgClinkz = imageClinkz.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon clinkzFinal = new ImageIcon(newimgClinkz);  // transform it back
    
    ImageIcon imageIconClinkzNC = new ImageIcon("heroes/clinkzNoColor.png"); // load the image to a imageIcon
    Image imageClinkzNC = imageIconClinkzNC.getImage(); // transform it 
    Image newimgClinkzNC = imageClinkzNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon clinkzFinalNC = new ImageIcon(newimgClinkzNC);
    
    ImageIcon imageIconDrowRanger = new ImageIcon("heroes/drowRanger.png"); // load the image to a imageIcon
    Image imageDrowRanger = imageIconDrowRanger.getImage(); // transform it 
    Image newimgDrowRanger = imageDrowRanger.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon drowRangerFinal = new ImageIcon(newimgDrowRanger);  // transform it back
    
    ImageIcon imageIconDrowRangerNC = new ImageIcon("heroes/drowRangerNoColor.png"); // load the image to a imageIcon
    Image imageDrowRangerNC = imageIconDrowRangerNC.getImage(); // transform it 
    Image newimgDrowRangerNC = imageDrowRangerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon drowRangerFinalNC = new ImageIcon(newimgDrowRangerNC);
    
    ImageIcon imageIconEmberSpirit = new ImageIcon("heroes/emberSpirit.png"); // load the image to a imageIcon
    Image imageEmberSpirit = imageIconEmberSpirit.getImage(); // transform it 
    Image newimgEmberSpirit = imageEmberSpirit.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon emberSpiritFinal = new ImageIcon(newimgEmberSpirit);  // transform it back
    
    ImageIcon imageIconEmberSpiritNC = new ImageIcon("heroes/emberSpiritNoColor.png"); // load the image to a imageIcon
    Image imageEmberSpiritNC = imageIconEmberSpiritNC.getImage(); // transform it 
    Image newimgEmberSpiritNC = imageEmberSpiritNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon emberSpiritFinalNC = new ImageIcon(newimgEmberSpiritNC);
    
    ImageIcon imageIconFacelessVoid = new ImageIcon("heroes/facelessVoid.png"); // load the image to a imageIcon
    Image imageFacelessVoid = imageIconFacelessVoid.getImage(); // transform it 
    Image newimgFacelessVoid = imageFacelessVoid.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon facelessVoidFinal = new ImageIcon(newimgFacelessVoid);  // transform it back
    
    ImageIcon imageIconFacelessVoidNC = new ImageIcon("heroes/facelessVoidNoColor.png"); // load the image to a imageIcon
    Image imageFacelessVoidNC = imageIconFacelessVoidNC.getImage(); // transform it 
    Image newimgFacelessVoidNC = imageFacelessVoidNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon facelessVoidFinalNC = new ImageIcon(newimgFacelessVoidNC);
    
    ImageIcon imageIconGyrocopter = new ImageIcon("heroes/gyrocopter.png"); // load the image to a imageIcon
    Image imageGyrocopter = imageIconGyrocopter.getImage(); // transform it 
    Image newimgGyrocopter = imageGyrocopter.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon gyrocopterFinal = new ImageIcon(newimgGyrocopter);  // transform it back
    
    ImageIcon imageIconGyrocopterNC = new ImageIcon("heroes/gyrocopterNoColor.png"); // load the image to a imageIcon
    Image imageGyrocopterNC = imageIconGyrocopterNC.getImage(); // transform it 
    Image newimgGyrocopterNC = imageGyrocopterNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon gyrocopterFinalNC = new ImageIcon(newimgGyrocopterNC);
    
    ImageIcon imageIconJuggernaut = new ImageIcon("heroes/juggernaut.png"); // load the image to a imageIcon
    Image imageJuggernaut = imageIconJuggernaut.getImage(); // transform it 
    Image newimgJuggernaut = imageJuggernaut.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon juggernautFinal = new ImageIcon(newimgJuggernaut);  // transform it back
    
    ImageIcon imageIconJuggernautNC = new ImageIcon("heroes/juggernautNoColor.png"); // load the image to a imageIcon
    Image imageJuggernautNC = imageIconJuggernautNC.getImage(); // transform it 
    Image newimgJuggernautNC = imageJuggernautNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon juggernautFinalNC = new ImageIcon(newimgJuggernautNC);
    
    ImageIcon imageIconLoneDruid = new ImageIcon("heroes/loneDruid.png"); // load the image to a imageIcon
    Image imageLoneDruid = imageIconLoneDruid.getImage(); // transform it 
    Image newimgLoneDruid = imageLoneDruid.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon loneDruidFinal = new ImageIcon(newimgLoneDruid);  // transform it back
    
    ImageIcon imageIconLoneDruidNC = new ImageIcon("heroes/loneDruidNoColor.png"); // load the image to a imageIcon
    Image imageLoneDruidNC = imageIconLoneDruidNC.getImage(); // transform it 
    Image newimgLoneDruidNC = imageLoneDruidNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon loneDruidFinalNC = new ImageIcon(newimgLoneDruidNC);
    
    ImageIcon imageIconLuna = new ImageIcon("heroes/luna.png"); // load the image to a imageIcon
    Image imageLuna = imageIconLuna.getImage(); // transform it 
    Image newimgLuna = imageLuna.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lunaFinal = new ImageIcon(newimgLuna);  // transform it back
    
    ImageIcon imageIconLunaNC = new ImageIcon("heroes/lunaNoColor.png"); // load the image to a imageIcon
    Image imageLunaNC = imageIconLunaNC.getImage(); // transform it 
    Image newimgLunaNC = imageLunaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon lunaFinalNC = new ImageIcon(newimgLunaNC);
    
    ImageIcon imageIconMedusa = new ImageIcon("heroes/medusa.png"); // load the image to a imageIcon
    Image imageMedusa = imageIconMedusa.getImage(); // transform it 
    Image newimgMedusa = imageMedusa.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon medusaFinal = new ImageIcon(newimgMedusa);  // transform it back
    
    ImageIcon imageIconMedusaNC = new ImageIcon("heroes/medusaNoColor.png"); // load the image to a imageIcon
    Image imageMedusaNC = imageIconMedusaNC.getImage(); // transform it 
    Image newimgMedusaNC = imageMedusaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon medusaFinalNC = new ImageIcon(newimgMedusaNC);
    
    ImageIcon imageIconMeepo = new ImageIcon("heroes/meepo.png"); // load the image to a imageIcon
    Image imageMeepo = imageIconMeepo.getImage(); // transform it 
    Image newimgMeepo = imageMeepo.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon meepoFinal = new ImageIcon(newimgMeepo);  // transform it back
    
    ImageIcon imageIconMeepoNC = new ImageIcon("heroes/meepoNoColor.png"); // load the image to a imageIcon
    Image imageMeepoNC = imageIconMeepoNC.getImage(); // transform it 
    Image newimgMeepoNC = imageMeepoNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon meepoFinalNC = new ImageIcon(newimgMeepoNC);
    
    ImageIcon imageIconMirana = new ImageIcon("heroes/mirana.png"); // load the image to a imageIcon
    Image imageMirana = imageIconMirana.getImage(); // transform it 
    Image newimgMirana = imageMirana.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon miranaFinal = new ImageIcon(newimgMirana);  // transform it back
    
    ImageIcon imageIconMiranaNC = new ImageIcon("heroes/miranaNoColor.png"); // load the image to a imageIcon
    Image imageMiranaNC = imageIconMiranaNC.getImage(); // transform it 
    Image newimgMiranaNC = imageMiranaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon miranaFinalNC = new ImageIcon(newimgMiranaNC);
    
    ImageIcon imageIconMonkeyKing = new ImageIcon("heroes/monkeyKing.png"); // load the image to a imageIcon
    Image imageMonkeyKing = imageIconMonkeyKing.getImage(); // transform it 
    Image newimgMonkeyKing = imageMonkeyKing.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon monkeyKingFinal = new ImageIcon(newimgMonkeyKing);  // transform it back
    
    ImageIcon imageIconMonkeyKingNC = new ImageIcon("heroes/monkeyKingNoColor.png"); // load the image to a imageIcon
    Image imageMonkeyKingNC = imageIconMonkeyKingNC.getImage(); // transform it 
    Image newimgMonkeyKingNC = imageMonkeyKingNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon monkeyKingFinalNC = new ImageIcon(newimgMonkeyKingNC);
    
    ImageIcon imageIconMorphling = new ImageIcon("heroes/morphling.png"); // load the image to a imageIcon
    Image imageMorphling = imageIconMorphling.getImage(); // transform it 
    Image newimgMorphling = imageMorphling.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon morphlingFinal = new ImageIcon(newimgMorphling);  // transform it back
    
    ImageIcon imageIconMorphlingNC = new ImageIcon("heroes/morphlingNoColor.png"); // load the image to a imageIcon
    Image imageMorphlingNC = imageIconMorphlingNC.getImage(); // transform it 
    Image newimgMorphlingNC = imageMorphlingNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon morphlingFinalNC = new ImageIcon(newimgMorphlingNC);
    
    ImageIcon imageIconNagaSiren = new ImageIcon("heroes/nagaSiren.png"); // load the image to a imageIcon
    Image imageNagaSiren = imageIconNagaSiren.getImage(); // transform it 
    Image newimgNagaSiren = imageNagaSiren.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon nagaSirenFinal = new ImageIcon(newimgNagaSiren);  // transform it back
    
    ImageIcon imageIconNagaSirenNC = new ImageIcon("heroes/nagaSirenNoColor.png"); // load the image to a imageIcon
    Image imageNagaSirenNC = imageIconNagaSirenNC.getImage(); // transform it 
    Image newimgNagaSirenNC = imageNagaSirenNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon nagaSirenFinalNC = new ImageIcon(newimgNagaSirenNC);
    
    ImageIcon imageIconNyxAssassin = new ImageIcon("heroes/nyxAssassin.png"); // load the image to a imageIcon
    Image imageNyxAssassin = imageIconNyxAssassin.getImage(); // transform it 
    Image newimgNyxAssassin = imageNyxAssassin.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon nyxAssassinFinal = new ImageIcon(newimgNyxAssassin);  // transform it back
    
    ImageIcon imageIconNyxAssassinNC = new ImageIcon("heroes/nyxAssassinNoColor.png"); // load the image to a imageIcon
    Image imageNyxAssassinNC = imageIconNyxAssassinNC.getImage(); // transform it 
    Image newimgNyxAssassinNC = imageNyxAssassinNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon nyxAssassinFinalNC = new ImageIcon(newimgNyxAssassinNC);
    
    ImageIcon imageIconPangolier = new ImageIcon("heroes/pangolier.png"); // load the image to a imageIcon
    Image imagePangolier = imageIconPangolier.getImage(); // transform it 
    Image newimgPangolier = imagePangolier.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon pangolierFinal = new ImageIcon(newimgPangolier);  // transform it back
    
    ImageIcon imageIconPangolierNC = new ImageIcon("heroes/pangolierNoColor.png"); // load the image to a imageIcon
    Image imagePangolierNC = imageIconPangolierNC.getImage(); // transform it 
    Image newimgPangolierNC = imagePangolierNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon pangolierFinalNC = new ImageIcon(newimgPangolierNC);
    
    ImageIcon imageIconPhantomAssassin = new ImageIcon("heroes/phantomAssassin.png"); // load the image to a imageIcon
    Image imagePhantomAssassin = imageIconPhantomAssassin.getImage(); // transform it 
    Image newimgPhantomAssassin = imagePhantomAssassin.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon phantomAssassinFinal = new ImageIcon(newimgPhantomAssassin);  // transform it back
    
    ImageIcon imageIconPhantomAssassinNC = new ImageIcon("heroes/phantomAssassinNoColor.png"); // load the image to a imageIcon
    Image imagePhantomAssassinNC = imageIconPhantomAssassinNC.getImage(); // transform it 
    Image newimgPhantomAssassinNC = imagePhantomAssassinNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon phantomAssassinFinalNC = new ImageIcon(newimgPhantomAssassinNC);
    
    ImageIcon imageIconPhantomLancer = new ImageIcon("heroes/phantomLancer.png"); // load the image to a imageIcon
    Image imagePhantomLancer = imageIconPhantomLancer.getImage(); // transform it 
    Image newimgPhantomLancer = imagePhantomLancer.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon phantomLancerFinal = new ImageIcon(newimgPhantomLancer);  // transform it back
    
    ImageIcon imageIconPhantomLancerNC = new ImageIcon("heroes/phantomLancerNoColor.png"); // load the image to a imageIcon
    Image imagePhantomLancerNC = imageIconPhantomLancerNC.getImage(); // transform it 
    Image newimgPhantomLancerNC = imagePhantomLancerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon phantomLancerFinalNC = new ImageIcon(newimgPhantomLancerNC);
    
    ImageIcon imageIconRazor = new ImageIcon("heroes/razor.png"); // load the image to a imageIcon
    Image imageRazor = imageIconRazor.getImage(); // transform it 
    Image newimgRazor = imageRazor.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon razorFinal = new ImageIcon(newimgRazor);  // transform it back
    
    ImageIcon imageIconRazorNC = new ImageIcon("heroes/razorNoColor.png"); // load the image to a imageIcon
    Image imageRazorNC = imageIconRazorNC.getImage(); // transform it 
    Image newimgRazorNC = imageRazorNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon razorFinalNC = new ImageIcon(newimgRazorNC);
    
    ImageIcon imageIconRiki = new ImageIcon("heroes/riki.png"); // load the image to a imageIcon
    Image imageRiki = imageIconRiki.getImage(); // transform it 
    Image newimgRiki = imageRiki.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon rikiFinal = new ImageIcon(newimgRiki);  // transform it back
    
    ImageIcon imageIconRikiNC = new ImageIcon("heroes/rikiNoColor.png"); // load the image to a imageIcon
    Image imageRikiNC = imageIconRikiNC.getImage(); // transform it 
    Image newimgRikiNC = imageRikiNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon rikiFinalNC = new ImageIcon(newimgRikiNC);
    
    ImageIcon imageIconShadowFiend = new ImageIcon("heroes/shadowFiend.png"); // load the image to a imageIcon
    Image imageShadowFiend = imageIconShadowFiend.getImage(); // transform it 
    Image newimgShadowFiend = imageShadowFiend.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon shadowFiendFinal = new ImageIcon(newimgShadowFiend);  // transform it back
    
    ImageIcon imageIconShadowFiendNC = new ImageIcon("heroes/shadowFiendNoColor.png"); // load the image to a imageIcon
    Image imageShadowFiendNC = imageIconShadowFiendNC.getImage(); // transform it 
    Image newimgShadowFiendNC = imageShadowFiendNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon shadowFiendFinalNC = new ImageIcon(newimgShadowFiendNC);
    
    ImageIcon imageIconSlark = new ImageIcon("heroes/slark.png"); // load the image to a imageIcon
    Image imageSlark = imageIconSlark.getImage(); // transform it 
    Image newimgSlark = imageSlark.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon slarkFinal = new ImageIcon(newimgSlark);  // transform it back
    
    ImageIcon imageIconSlarkNC = new ImageIcon("heroes/slarkNoColor.png"); // load the image to a imageIcon
    Image imageSlarkNC = imageIconSlarkNC.getImage(); // transform it 
    Image newimgSlarkNC = imageSlarkNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon slarkFinalNC = new ImageIcon(newimgSlarkNC);
    
    ImageIcon imageIconSniper = new ImageIcon("heroes/sniper.png"); // load the image to a imageIcon
    Image imageSniper = imageIconSniper.getImage(); // transform it 
    Image newimgSniper = imageSniper.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon sniperFinal = new ImageIcon(newimgSniper);  // transform it back
    
    ImageIcon imageIconSniperNC = new ImageIcon("heroes/sniperNoColor.png"); // load the image to a imageIcon
    Image imageSniperNC = imageIconSniperNC.getImage(); // transform it 
    Image newimgSniperNC = imageSniperNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon sniperFinalNC = new ImageIcon(newimgSniperNC);
    
    ImageIcon imageIconSpectre = new ImageIcon("heroes/spectre.png"); // load the image to a imageIcon
    Image imageSpectre = imageIconSpectre.getImage(); // transform it 
    Image newimgSpectre = imageSpectre.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon spectreFinal = new ImageIcon(newimgSpectre);  // transform it back
    
    ImageIcon imageIconSpectreNC = new ImageIcon("heroes/spectreNoColor.png"); // load the image to a imageIcon
    Image imageSpectreNC = imageIconSpectreNC.getImage(); // transform it 
    Image newimgSpectreNC = imageSpectreNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon spectreFinalNC = new ImageIcon(newimgSpectreNC);
    
    ImageIcon imageIconTemplarAssassin = new ImageIcon("heroes/templarAssassin.png"); // load the image to a imageIcon
    Image imageTemplarAssassin = imageIconTemplarAssassin.getImage(); // transform it 
    Image newimgTemplarAssassin = imageTemplarAssassin.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon templarAssassinFinal = new ImageIcon(newimgTemplarAssassin);  // transform it back
    
    ImageIcon imageIconTemplarAssassinNC = new ImageIcon("heroes/templarAssassinNoColor.png"); // load the image to a imageIcon
    Image imageTemplarAssassinNC = imageIconTemplarAssassinNC.getImage(); // transform it 
    Image newimgTemplarAssassinNC = imageTemplarAssassinNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon templarAssassinFinalNC = new ImageIcon(newimgTemplarAssassinNC);
    
    ImageIcon imageIconTerrorblade = new ImageIcon("heroes/terrorblade.png"); // load the image to a imageIcon
    Image imageTerrorblade = imageIconTerrorblade.getImage(); // transform it 
    Image newimgTerrorblade = imageTerrorblade.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon terrorbladeFinal = new ImageIcon(newimgTerrorblade);  // transform it back
    
    ImageIcon imageIconTerrorbladeNC = new ImageIcon("heroes/terrorbladeNoColor.png"); // load the image to a imageIcon
    Image imageTerrorbladeNC = imageIconTerrorbladeNC.getImage(); // transform it 
    Image newimgTerrorbladeNC = imageTerrorbladeNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon terrorbladeFinalNC = new ImageIcon(newimgTerrorbladeNC);
    
    ImageIcon imageIconTrollWarlord = new ImageIcon("heroes/trollWarlord.png"); // load the image to a imageIcon
    Image imageTrollWarlord = imageIconTrollWarlord.getImage(); // transform it 
    Image newimgTrollWarlord = imageTrollWarlord.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon trollWarlordFinal = new ImageIcon(newimgTrollWarlord);  // transform it back
    
    ImageIcon imageIconTrollWarlordNC = new ImageIcon("heroes/trollWarlordNoColor.png"); // load the image to a imageIcon
    Image imageTrollWarlordNC = imageIconTrollWarlordNC.getImage(); // transform it 
    Image newimgTrollWarlordNC = imageTrollWarlordNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon trollWarlordFinalNC = new ImageIcon(newimgTrollWarlordNC);
    
    ImageIcon imageIconUrsa = new ImageIcon("heroes/ursa.png"); // load the image to a imageIcon
    Image imageUrsa = imageIconUrsa.getImage(); // transform it 
    Image newimgUrsa = imageUrsa.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ursaFinal = new ImageIcon(newimgUrsa);  // transform it back
    
    ImageIcon imageIconUrsaNC = new ImageIcon("heroes/ursaNoColor.png"); // load the image to a imageIcon
    Image imageUrsaNC = imageIconUrsaNC.getImage(); // transform it 
    Image newimgUrsaNC = imageUrsaNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon ursaFinalNC = new ImageIcon(newimgUrsaNC);
    
    ImageIcon imageIconVengefulSpirit = new ImageIcon("heroes/vengefulSpirit.png"); // load the image to a imageIcon
    Image imageVengefulSpirit = imageIconVengefulSpirit.getImage(); // transform it 
    Image newimgVengefulSpirit = imageVengefulSpirit.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon vengefulSpiritFinal = new ImageIcon(newimgVengefulSpirit);  // transform it back
    
    ImageIcon imageIconVengefulSpiritNC = new ImageIcon("heroes/vengefulSpiritNoColor.png"); // load the image to a imageIcon
    Image imageVengefulSpiritNC = imageIconVengefulSpiritNC.getImage(); // transform it 
    Image newimgVengefulSpiritNC = imageVengefulSpiritNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon vengefulSpiritFinalNC = new ImageIcon(newimgVengefulSpiritNC);
    
    ImageIcon imageIconVenomancer = new ImageIcon("heroes/venomancer.png"); // load the image to a imageIcon
    Image imageVenomancer = imageIconVenomancer.getImage(); // transform it 
    Image newimgVenomancer = imageVenomancer.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon venomancerFinal = new ImageIcon(newimgVenomancer);  // transform it back
    
    ImageIcon imageIconVenomancerNC = new ImageIcon("heroes/venomancerNoColor.png"); // load the image to a imageIcon
    Image imageVenomancerNC = imageIconVenomancerNC.getImage(); // transform it 
    Image newimgVenomancerNC = imageVenomancerNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon venomancerFinalNC = new ImageIcon(newimgVenomancerNC);
    
    ImageIcon imageIconViper = new ImageIcon("heroes/viper.png"); // load the image to a imageIcon
    Image imageViper = imageIconViper.getImage(); // transform it 
    Image newimgViper = imageViper.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon viperFinal = new ImageIcon(newimgViper);  // transform it back
    
    ImageIcon imageIconViperNC = new ImageIcon("heroes/viperNoColor.png"); // load the image to a imageIcon
    Image imageViperNC = imageIconViperNC.getImage(); // transform it 
    Image newimgViperNC = imageViperNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon viperFinalNC = new ImageIcon(newimgViperNC);
    
    ImageIcon imageIconWeaver = new ImageIcon("heroes/weaver.png"); // load the image to a imageIcon
    Image imageWeaver = imageIconWeaver.getImage(); // transform it 
    Image newimgWeaver = imageWeaver.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon weaverFinal = new ImageIcon(newimgWeaver);  // transform it back
    
    ImageIcon imageIconWeaverNC = new ImageIcon("heroes/weaverNoColor.png"); // load the image to a imageIcon
    Image imageWeaverNC = imageIconWeaverNC.getImage(); // transform it 
    Image newimgWeaverNC = imageWeaverNC.getScaledInstance(60, 34,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon weaverFinalNC = new ImageIcon(newimgWeaverNC);
    
    //</editor-fold>
    private static JPanel strengthHeroesJPanel, agilityHeroesJPanel, intelligenceHeroesJPanel;
    
    //<editor-fold defaultstate="collapsed" desc="JTOGGLEBUTTON STR AGI INT INITIALIZATION">
    //JCheckBoxes for strength heroes   
    private JToggleButton earthshaker, sven, tiny, kunkka, beastMaster, dragonKnight, clockwerk, omniknight, huskar, alchemist,
            brewmaster, treant, io, centaurWarrunner, timbersaw, bristleback, tusk, elderTitan, legionCommander, earthSpirit, 
            phoenix, axe, pudge, sandKing, slardar, tidehunter, wraithKing, lifestealer, nightstalker, doom, spiritBreaker, lycan,
            chaosKnight, undying, magnus, abaddon, underlord;
    
    //JCheckBoxes for agility heroes
    private JToggleButton antimage, drowRanger, juggernaut, mirana, morphling, phantomLancer, vengefulSpirit, riki, sniper, templarAssassin,
            luna, bountyHunter, ursa, gyrocopter, loneDruid, nagaSiren, trollWarlord, emberSpirit, monkeyKing, pangolier, bloodseeker, shadowFiend,
            razor, venomancer, facelessVoid, phantomAssassin, viper, clinkz, broodmother, weaver, spectre, meepo, nyx, slark, medusa, terrorblade, arcWarden;
    
    //JCheckBoxes for int heroes
    private JToggleButton crystalMaiden, puck, stormSpirit, windranger, zeus, lina, shadowShaman, tinker, natureProphet, enchantress, jakiro, chen,
            silencer, ogreMagi, rubick, disruptor, keeperOfTheLight, skywrathMage, oracle, techies, darkWillow, bane, lich, lion, witchDoctor, 
            enigma, necrophos, warlock, queenOfPain, deathProphet, pugna, dazzle, leshrac, darkSeer, batrider, ancientApparition, invoker, outworldDevourer,
            shadowDemon, visage, winterWyvern;
    //</editor-fold>
    
    private JButton generate;
    
    private JButton disableStrength, disableAgility, disableIntelligence;
    
    private JTextArea results;
    
    private String generatedHero = "";
    
    //<editor-fold defaultstate="collapsed" desc="ITEMS">
    private String[] boots = {"Power Treads", "Phase Boots", "Tranquil Boots", "Arcane Boots", "Guardian Greaves", "Boots of Travel"};
    
    private String[] items = {"Hand of Midas", "Moon Shard", "Ring of Aquila", "Drum of Endurance", "Vladmir's Offering", 
    "Spirit Vessel", "Pipe of Insight", "Glimmer Cape", "Veil of Discord", "Aether Lens", "Necronomicon", "Solar Crest", "Dagon", "Eul's Scepter of Divinity", 
    "Rod of Atos", "Aghanim's Scepter", "Nullifier", "Refresher Orb", "Scythe of Vyse", "Octarine Core", "Blade Mail", "Crimson Guard", "Aeon Disk", 
    "Black King Bar", "Lotus Orb", "Shiva's Guard", "Hurricane Pike", "Linken's Sphere", "Bloodstone", "Manta Style", "Heart of Tarrasque", "Assault Cuirass", 
    "Armlet of Mordiggian", "Meteor Hammer", "Battle Fury", "Monkey King Bar", "Ethereal Blade", "Radiance", "Daedalus", "Butterfly", "Silver Edge", 
    "Divine Rapier", "Abyssal Blade", "Bloodthorn", "Kaya", "Mask Of Madness", "Echo Sabre", "Diffusal Blade", "Heaven's Halberd", "Desolator", 
    "Sange and Yasha", "Eye of Skadi", "Satanic", "Mjollnir"};
    //</editor-fold>
    
    public DotaHeroPickerUpdated() {
        createUserInterface();
    }
    
    private void createUserInterface() {
        //setting up container
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.decode("#1B1E21"));
        contentPane.setLayout(null);
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        
        //setup field to show results
        results = new JTextArea();
        results.setBounds(245,660,430,100);
        results.setEditable(false);
        results.setBackground(Color.decode("#1B1E21"));
        results.setForeground(Color.decode("#DAA520"));
        results.setText("RESULT:");
        contentPane.add(results);
       
        //setup JButton
        generate = new JButton("Generate Free Loss");
        generate.setBounds(25,660,210,42);
        contentPane.add(generate);
        generate.addActionListener(
            new ActionListener() { 
                public void actionPerformed(ActionEvent event){
                    generatedHero = generateJButtonActionPerformed(event);
                    Random rng = new Random();
                    results.setText("RESULT:");
                    String[] itemList = new String[5];
                    int count = 0;
                    while (count < 5) {
                        ArrayList<String> itemsListed = new ArrayList<String>(Arrays.asList(itemList));
                        String newItem = items[rng.nextInt(items.length)];
                        if (!itemsListed.contains(newItem)) {
                            itemList[count] = newItem;
                            count++;
                        }
                    }
                    results.append("\t" + generatedHero);
                    results.append("\n" + boots[rng.nextInt(boots.length)] + "   " + itemList[0] + "   " + itemList[1]);
                    results.append("\n" + itemList[2] + "   " + itemList[3] + "   " + itemList[4]);
                }
            }
        );
        
        //<editor-fold defaultstate="collapsed" desc="JBUTTON DISABLE AGI INT STR">
        disableStrength = new JButton("Toggle Strength");
        disableStrength.setBounds(25,585,210,42);
        contentPane.add(disableStrength);
        disableStrength.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    strengthActionPerformed(event);
                }
            }
        );
        
        disableAgility = new JButton("Toggle Agility");
        disableAgility.setBounds(275,585,210,42);
        contentPane.add(disableAgility);
        disableAgility.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    agilityActionPerformed(event);
                }
            }
        );
      
        disableIntelligence = new JButton("Toggle Intelligence");
        disableIntelligence.setBounds(525,585,210,42);
        contentPane.add(disableIntelligence);
        disableIntelligence.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    intelligenceActionPerformed(event);
                }
            }
        );
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="STR HERO JBUTTONS">
        //setup JPanel for strength
        strengthHeroesJPanel = new JPanel();
        strengthHeroesJPanel.setBorder(new TitledBorder("Strength"));
        strengthHeroesJPanel.setBounds(10,10,240,630); //(x,y,width,height)
        strengthHeroesJPanel.setBackground(Color.decode("#B9500B"));
        contentPane.add(strengthHeroesJPanel);
              
        earthshaker = new JToggleButton("Earthshaker", earthshakerFinalNC, true);
        earthshaker.setBackground(Color.decode("#B9500B"));
        earthshaker.setForeground(Color.decode("#B9500B"));
        earthshaker.setFont(new Font("Courier", Font.PLAIN, 0));
        earthshaker.setVerticalTextPosition(0);
        earthshaker.setContentAreaFilled(false);
        earthshaker.setSelectedIcon(earthshakerFinal);
        earthshaker.setBorder(emptyBorder);
        strengthHeroesJPanel.add(earthshaker);
        
        sven = new JToggleButton("Sven", svenFinalNC, true);
        sven.setBackground(Color.decode("#B9500B"));
        sven.setForeground(Color.decode("#B9500B"));
        sven.setFont(new Font("Courier", Font.PLAIN, 0));
        sven.setVerticalTextPosition(0);
        sven.setContentAreaFilled(false);
        sven.setSelectedIcon(svenFinal);
        sven.setBorder(emptyBorder);
        strengthHeroesJPanel.add(sven);
        
        sandKing = new JToggleButton("Sand King", sandKingFinalNC, true);
        sandKing.setBackground(Color.decode("#B9500B"));
        sandKing.setForeground(Color.decode("#B9500B"));
        sandKing.setFont(new Font("Courier", Font.PLAIN, 0));
        sandKing.setVerticalTextPosition(0);
        sandKing.setContentAreaFilled(false);
        sandKing.setSelectedIcon(sandKingFinal);
        sandKing.setBorder(emptyBorder);
        strengthHeroesJPanel.add(sandKing);
        
        tiny = new JToggleButton("Tiny", tinyFinalNC, true);
        tiny.setBackground(Color.decode("#B9500B"));
        tiny.setForeground(Color.decode("#B9500B"));
        tiny.setFont(new Font("Courier", Font.PLAIN, 0));
        tiny.setVerticalTextPosition(0);
        tiny.setContentAreaFilled(false);
        tiny.setSelectedIcon(tinyFinal);
        tiny.setBorder(emptyBorder);
        strengthHeroesJPanel.add(tiny);
        
        kunkka = new JToggleButton("Kunkka", kunkkaFinalNC, true);
        kunkka.setBackground(Color.decode("#B9500B"));
        kunkka.setForeground(Color.decode("#B9500B"));
        kunkka.setFont(new Font("Courier", Font.PLAIN, 0));
        kunkka.setVerticalTextPosition(0);
        kunkka.setContentAreaFilled(false);
        kunkka.setSelectedIcon(kunkkaFinal);
        kunkka.setBorder(emptyBorder);
        strengthHeroesJPanel.add(kunkka);   

        beastMaster = new JToggleButton("Beastmaster", beastMasterFinalNC, true);
        beastMaster.setBackground(Color.decode("#B9500B"));
        beastMaster.setForeground(Color.decode("#B9500B"));
        beastMaster.setFont(new Font("Courier", Font.PLAIN, 0));
        beastMaster.setVerticalTextPosition(0);
        beastMaster.setContentAreaFilled(false);
        beastMaster.setSelectedIcon(beastMasterFinal);
        beastMaster.setBorder(emptyBorder);
        strengthHeroesJPanel.add(beastMaster);
          
        dragonKnight = new JToggleButton("Dragon Knight", dragonKnightFinalNC, true);
        dragonKnight.setBackground(Color.decode("#B9500B"));
        dragonKnight.setForeground(Color.decode("#B9500B"));
        dragonKnight.setFont(new Font("Courier", Font.PLAIN, 0));
        dragonKnight.setVerticalTextPosition(0);
        dragonKnight.setContentAreaFilled(false);
        dragonKnight.setSelectedIcon(dragonKnightFinal);
        dragonKnight.setBorder(emptyBorder);
        strengthHeroesJPanel.add(dragonKnight);
               
        clockwerk = new JToggleButton("Clockwerk", clockwerkFinalNC, true);
        clockwerk.setBackground(Color.decode("#B9500B"));
        clockwerk.setForeground(Color.decode("#B9500B"));
        clockwerk.setFont(new Font("Courier", Font.PLAIN, 0));
        clockwerk.setVerticalTextPosition(0);
        clockwerk.setContentAreaFilled(false);
        clockwerk.setSelectedIcon(clockwerkFinal);
        clockwerk.setBorder(emptyBorder);
        strengthHeroesJPanel.add(clockwerk);
        
        omniknight = new JToggleButton("Omniknight", omniknightFinalNC, true);
        omniknight.setBackground(Color.decode("#B9500B"));
        omniknight.setForeground(Color.decode("#B9500B"));
        omniknight.setFont(new Font("Courier", Font.PLAIN, 0));
        omniknight.setVerticalTextPosition(0);
        omniknight.setContentAreaFilled(false);
        omniknight.setSelectedIcon(omniknightFinal);
        omniknight.setBorder(emptyBorder);
        strengthHeroesJPanel.add(omniknight);
               
        huskar = new JToggleButton("Huskar", huskarFinalNC, true);
        huskar.setBackground(Color.decode("#B9500B"));
        huskar.setForeground(Color.decode("#B9500B"));
        huskar.setFont(new Font("Courier", Font.PLAIN, 0));
        huskar.setVerticalTextPosition(0);
        huskar.setContentAreaFilled(false);
        huskar.setSelectedIcon(huskarFinal);
        huskar.setBorder(emptyBorder);
        strengthHeroesJPanel.add(huskar);
        
        alchemist = new JToggleButton("Alchemist", alchemistFinalNC, true);
        alchemist.setBackground(Color.decode("#B9500B"));
        alchemist.setForeground(Color.decode("#B9500B"));
        alchemist.setFont(new Font("Courier", Font.PLAIN, 0));
        alchemist.setVerticalTextPosition(0);
        alchemist.setContentAreaFilled(false);
        alchemist.setSelectedIcon(alchemistFinal);
        alchemist.setBorder(emptyBorder);
        strengthHeroesJPanel.add(alchemist);
        
        brewmaster = new JToggleButton("Brewmaster", brewmasterFinalNC, true);
        brewmaster.setBackground(Color.decode("#B9500B"));
        brewmaster.setForeground(Color.decode("#B9500B"));
        brewmaster.setFont(new Font("Courier", Font.PLAIN, 0));
        brewmaster.setVerticalTextPosition(0);
        brewmaster.setContentAreaFilled(false);
        brewmaster.setSelectedIcon(brewmasterFinal);
        brewmaster.setBorder(emptyBorder);
        strengthHeroesJPanel.add(brewmaster);
        
        treant = new JToggleButton("Treant", treantFinalNC, true);
        treant.setBackground(Color.decode("#B9500B"));
        treant.setForeground(Color.decode("#B9500B"));
        treant.setFont(new Font("Courier", Font.PLAIN, 0));
        treant.setVerticalTextPosition(0);
        treant.setContentAreaFilled(false);
        treant.setSelectedIcon(treantFinal);
        treant.setBorder(emptyBorder);
        strengthHeroesJPanel.add(treant);
        
        io = new JToggleButton("Io", ioFinalNC, true);
        io.setBackground(Color.decode("#B9500B"));
        io.setForeground(Color.decode("#B9500B"));
        io.setFont(new Font("Courier", Font.PLAIN, 0));
        io.setVerticalTextPosition(0);
        io.setContentAreaFilled(false);
        io.setSelectedIcon(ioFinal);
        io.setBorder(emptyBorder);
        strengthHeroesJPanel.add(io);
        
        centaurWarrunner = new JToggleButton("Centaur Warrunner", centaurWarrunnerFinalNC, true);
        centaurWarrunner.setBackground(Color.decode("#B9500B"));
        centaurWarrunner.setForeground(Color.decode("#B9500B"));
        centaurWarrunner.setFont(new Font("Courier", Font.PLAIN, 0));
        centaurWarrunner.setVerticalTextPosition(0);
        centaurWarrunner.setContentAreaFilled(false);
        centaurWarrunner.setSelectedIcon(centaurWarrunnerFinal);
        centaurWarrunner.setBorder(emptyBorder);
        strengthHeroesJPanel.add(centaurWarrunner);
        
        timbersaw = new JToggleButton("Timbersaw", timbersawFinalNC, true);
        timbersaw.setBackground(Color.decode("#B9500B"));
        timbersaw.setForeground(Color.decode("#B9500B"));
        timbersaw.setFont(new Font("Courier", Font.PLAIN, 0));
        timbersaw.setVerticalTextPosition(0);
        timbersaw.setContentAreaFilled(false);
        timbersaw.setSelectedIcon(timbersawFinal);
        timbersaw.setBorder(emptyBorder);
        strengthHeroesJPanel.add(timbersaw);
        
        bristleback = new JToggleButton("Bristleback", bristlebackFinalNC, true);
        bristleback.setBackground(Color.decode("#B9500B"));
        bristleback.setForeground(Color.decode("#B9500B"));
        bristleback.setFont(new Font("Courier", Font.PLAIN, 0));
        bristleback.setVerticalTextPosition(0);
        bristleback.setContentAreaFilled(false);
        bristleback.setSelectedIcon(bristlebackFinal);
        bristleback.setBorder(emptyBorder);
        strengthHeroesJPanel.add(bristleback);
        
        tusk = new JToggleButton("Tusk", tuskFinalNC, true);
        tusk.setBackground(Color.decode("#B9500B"));
        tusk.setForeground(Color.decode("#B9500B"));
        tusk.setFont(new Font("Courier", Font.PLAIN, 0));
        tusk.setVerticalTextPosition(0);
        tusk.setContentAreaFilled(false);
        tusk.setSelectedIcon(tuskFinal);
        tusk.setBorder(emptyBorder);
        strengthHeroesJPanel.add(tusk);
        
        elderTitan = new JToggleButton("Elder Titan", elderTitanFinalNC, true);
        elderTitan.setBackground(Color.decode("#B9500B"));
        elderTitan.setForeground(Color.decode("#B9500B"));
        elderTitan.setFont(new Font("Courier", Font.PLAIN, 0));
        elderTitan.setVerticalTextPosition(0);
        elderTitan.setContentAreaFilled(false);
        elderTitan.setSelectedIcon(elderTitanFinal);
        elderTitan.setBorder(emptyBorder);
        strengthHeroesJPanel.add(elderTitan);
        
        legionCommander = new JToggleButton("Legion Commander", legionCommanderFinalNC, true);
        legionCommander.setBackground(Color.decode("#B9500B"));
        legionCommander.setForeground(Color.decode("#B9500B"));
        legionCommander.setFont(new Font("Courier", Font.PLAIN, 0));
        legionCommander.setVerticalTextPosition(0);
        legionCommander.setContentAreaFilled(false);
        legionCommander.setSelectedIcon(legionCommanderFinal);
        legionCommander.setBorder(emptyBorder);
        strengthHeroesJPanel.add(legionCommander);
        
        earthSpirit = new JToggleButton("Earth Spirit", earthSpiritFinalNC, true);
        earthSpirit.setBackground(Color.decode("#B9500B"));
        earthSpirit.setForeground(Color.decode("#B9500B"));
        earthSpirit.setFont(new Font("Courier", Font.PLAIN, 0));
        earthSpirit.setVerticalTextPosition(0);
        earthSpirit.setContentAreaFilled(false);
        earthSpirit.setSelectedIcon(earthSpiritFinal);
        earthSpirit.setBorder(emptyBorder);
        strengthHeroesJPanel.add(earthSpirit);
        
        phoenix = new JToggleButton("Phoenix", phoenixFinalNC, true);
        phoenix.setBackground(Color.decode("#B9500B"));
        phoenix.setForeground(Color.decode("#B9500B"));
        phoenix.setFont(new Font("Courier", Font.PLAIN, 0));
        phoenix.setVerticalTextPosition(0);
        phoenix.setContentAreaFilled(false);
        phoenix.setSelectedIcon(phoenixFinal);
        phoenix.setBorder(emptyBorder);
        strengthHeroesJPanel.add(phoenix);
        
        axe = new JToggleButton("Axe", axeFinalNC, true);
        axe.setBackground(Color.decode("#B9500B"));
        axe.setForeground(Color.decode("#B9500B"));
        axe.setFont(new Font("Courier", Font.PLAIN, 0));
        axe.setVerticalTextPosition(0);
        axe.setContentAreaFilled(false);
        axe.setSelectedIcon(axeFinal);
        axe.setBorder(emptyBorder);
        strengthHeroesJPanel.add(axe);
        
        pudge = new JToggleButton("Pudge", pudgeFinalNC, true);
        pudge.setBackground(Color.decode("#B9500B"));
        pudge.setForeground(Color.decode("#B9500B"));
        pudge.setFont(new Font("Courier", Font.PLAIN, 0));
        pudge.setVerticalTextPosition(0);
        pudge.setContentAreaFilled(false);
        pudge.setSelectedIcon(pudgeFinal);
        pudge.setBorder(emptyBorder);
        strengthHeroesJPanel.add(pudge);
        
        slardar = new JToggleButton("Slardar", slardarFinalNC, true);
        slardar.setBackground(Color.decode("#B9500B"));
        slardar.setForeground(Color.decode("#B9500B"));
        slardar.setFont(new Font("Courier", Font.PLAIN, 0));
        slardar.setVerticalTextPosition(0);
        slardar.setContentAreaFilled(false);
        slardar.setSelectedIcon(slardarFinal);
        slardar.setBorder(emptyBorder);
        strengthHeroesJPanel.add(slardar);
        
        tidehunter = new JToggleButton("Tidehunter", tidehunterFinalNC, true);
        tidehunter.setBackground(Color.decode("#B9500B"));
        tidehunter.setForeground(Color.decode("#B9500B"));
        tidehunter.setFont(new Font("Courier", Font.PLAIN, 0));
        tidehunter.setVerticalTextPosition(0);
        tidehunter.setContentAreaFilled(false);
        tidehunter.setSelectedIcon(tidehunterFinal);
        tidehunter.setBorder(emptyBorder);
        strengthHeroesJPanel.add(tidehunter);
        
        wraithKing = new JToggleButton("Wraith King", wraithKingFinalNC, true);
        wraithKing.setBackground(Color.decode("#B9500B"));
        wraithKing.setForeground(Color.decode("#B9500B"));
        wraithKing.setFont(new Font("Courier", Font.PLAIN, 0));
        wraithKing.setVerticalTextPosition(0);
        wraithKing.setContentAreaFilled(false);
        wraithKing.setSelectedIcon(wraithKingFinal);
        wraithKing.setBorder(emptyBorder);
        strengthHeroesJPanel.add(wraithKing);
        
        lifestealer = new JToggleButton("Lifestealer", lifestealerFinalNC, true);
        lifestealer.setBackground(Color.decode("#B9500B"));
        lifestealer.setForeground(Color.decode("#B9500B"));
        lifestealer.setFont(new Font("Courier", Font.PLAIN, 0));
        lifestealer.setVerticalTextPosition(0);
        lifestealer.setContentAreaFilled(false);
        lifestealer.setSelectedIcon(lifestealerFinal);
        lifestealer.setBorder(emptyBorder);
        strengthHeroesJPanel.add(lifestealer);
        
        nightstalker = new JToggleButton("Nightstalker", nightstalkerFinalNC, true);
        nightstalker.setBackground(Color.decode("#B9500B"));
        nightstalker.setForeground(Color.decode("#B9500B"));
        nightstalker.setFont(new Font("Courier", Font.PLAIN, 0));
        nightstalker.setVerticalTextPosition(0);
        nightstalker.setContentAreaFilled(false);
        nightstalker.setSelectedIcon(nightstalkerFinal);
        nightstalker.setBorder(emptyBorder);
        strengthHeroesJPanel.add(nightstalker);
        
        doom = new JToggleButton("Doom", doomFinalNC, true);
        doom.setBackground(Color.decode("#B9500B"));
        doom.setForeground(Color.decode("#B9500B"));
        doom.setFont(new Font("Courier", Font.PLAIN, 0));
        doom.setVerticalTextPosition(0);
        doom.setContentAreaFilled(false);
        doom.setSelectedIcon(doomFinal);
        doom.setBorder(emptyBorder);
        strengthHeroesJPanel.add(doom);
        
        spiritBreaker = new JToggleButton("Spirit Breaker", spiritBreakerFinalNC, true);
        spiritBreaker.setBackground(Color.decode("#B9500B"));
        spiritBreaker.setForeground(Color.decode("#B9500B"));
        spiritBreaker.setFont(new Font("Courier", Font.PLAIN, 0));
        spiritBreaker.setVerticalTextPosition(0);
        spiritBreaker.setContentAreaFilled(false);
        spiritBreaker.setSelectedIcon(spiritBreakerFinal);
        spiritBreaker.setBorder(emptyBorder);
        strengthHeroesJPanel.add(spiritBreaker);
        
        lycan = new JToggleButton("Lycan", lycanFinalNC, true);
        lycan.setBackground(Color.decode("#B9500B"));
        lycan.setForeground(Color.decode("#B9500B"));
        lycan.setFont(new Font("Courier", Font.PLAIN, 0));
        lycan.setVerticalTextPosition(0);
        lycan.setContentAreaFilled(false);
        lycan.setSelectedIcon(lycanFinal);
        lycan.setBorder(emptyBorder);
        strengthHeroesJPanel.add(lycan);
        
        chaosKnight = new JToggleButton("Chaos Knight", chaosKnightFinalNC, true);
        chaosKnight.setBackground(Color.decode("#B9500B"));
        chaosKnight.setForeground(Color.decode("#B9500B"));
        chaosKnight.setFont(new Font("Courier", Font.PLAIN, 0));
        chaosKnight.setVerticalTextPosition(0);
        chaosKnight.setContentAreaFilled(false);
        chaosKnight.setSelectedIcon(chaosKnightFinal);
        chaosKnight.setBorder(emptyBorder);
        strengthHeroesJPanel.add(chaosKnight);
        
        undying = new JToggleButton("Undying", undyingFinalNC, true);
        undying.setBackground(Color.decode("#B9500B"));
        undying.setForeground(Color.decode("#B9500B"));
        undying.setFont(new Font("Courier", Font.PLAIN, 0));
        undying.setVerticalTextPosition(0);
        undying.setContentAreaFilled(false);
        undying.setSelectedIcon(undyingFinal);
        undying.setBorder(emptyBorder);
        strengthHeroesJPanel.add(undying);
        
        magnus = new JToggleButton("Magnus", magnusFinalNC, true);
        magnus.setBackground(Color.decode("#B9500B"));
        magnus.setForeground(Color.decode("#B9500B"));
        magnus.setFont(new Font("Courier", Font.PLAIN, 0));
        magnus.setVerticalTextPosition(0);
        magnus.setContentAreaFilled(false);
        magnus.setSelectedIcon(magnusFinal);
        magnus.setBorder(emptyBorder);
        strengthHeroesJPanel.add(magnus);
        
        abaddon = new JToggleButton("Abaddon", abaddonFinalNC, true);
        abaddon.setBackground(Color.decode("#B9500B"));
        abaddon.setForeground(Color.decode("#B9500B"));
        abaddon.setFont(new Font("Courier", Font.PLAIN, 0));
        abaddon.setVerticalTextPosition(0);
        abaddon.setContentAreaFilled(false);
        abaddon.setSelectedIcon(abaddonFinal);
        abaddon.setBorder(emptyBorder);
        strengthHeroesJPanel.add(abaddon);
        
        underlord = new JToggleButton("Underlord", underlordFinalNC, true);
        underlord.setBackground(Color.decode("#B9500B"));
        underlord.setForeground(Color.decode("#B9500B"));
        underlord.setFont(new Font("Courier", Font.PLAIN, 0));
        underlord.setVerticalTextPosition(0);
        underlord.setContentAreaFilled(false);
        underlord.setSelectedIcon(underlordFinal);
        underlord.setBorder(emptyBorder);
        strengthHeroesJPanel.add(underlord);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="AGI HERO JBUTTONS">
        //setup JPanel for agility
        agilityHeroesJPanel = new JPanel();
        agilityHeroesJPanel.setBorder(new TitledBorder("Agility"));
        agilityHeroesJPanel.setBounds(260,10,240,630); //(x,y,width,height)
        agilityHeroesJPanel.setBackground(Color.decode("#167C13"));
        contentPane.add(agilityHeroesJPanel);
        
        antimage = new JToggleButton("Anti-Mage", antimageFinalNC, true);
        antimage.setBackground(Color.decode("#B9500B"));
        antimage.setForeground(Color.decode("#B9500B"));
        antimage.setFont(new Font("Courier", Font.PLAIN, 0));
        antimage.setVerticalTextPosition(0);
        antimage.setContentAreaFilled(false);
        antimage.setSelectedIcon(antimageFinal);
        antimage.setBorder(emptyBorder);
        agilityHeroesJPanel.add(antimage);
        
        drowRanger = new JToggleButton("Drow Ranger", drowRangerFinalNC, true);
        drowRanger.setBackground(Color.decode("#B9500B"));
        drowRanger.setForeground(Color.decode("#B9500B"));
        drowRanger.setFont(new Font("Courier", Font.PLAIN, 0));
        drowRanger.setVerticalTextPosition(0);
        drowRanger.setContentAreaFilled(false);
        drowRanger.setSelectedIcon(drowRangerFinal);
        drowRanger.setBorder(emptyBorder);
        agilityHeroesJPanel.add(drowRanger);
        
        juggernaut = new JToggleButton("Juggernaut", juggernautFinalNC, true);
        juggernaut.setBackground(Color.decode("#B9500B"));
        juggernaut.setForeground(Color.decode("#B9500B"));
        juggernaut.setFont(new Font("Courier", Font.PLAIN, 0));
        juggernaut.setVerticalTextPosition(0);
        juggernaut.setContentAreaFilled(false);
        juggernaut.setSelectedIcon(juggernautFinal);
        juggernaut.setBorder(emptyBorder);
        agilityHeroesJPanel.add(juggernaut);
        
        mirana = new JToggleButton("Mirana", miranaFinalNC, true);
        mirana.setBackground(Color.decode("#B9500B"));
        mirana.setForeground(Color.decode("#B9500B"));
        mirana.setFont(new Font("Courier", Font.PLAIN, 0));
        mirana.setVerticalTextPosition(0);
        mirana.setContentAreaFilled(false);
        mirana.setSelectedIcon(miranaFinal);
        mirana.setBorder(emptyBorder);
        agilityHeroesJPanel.add(mirana);
        
        morphling = new JToggleButton("Morphling", morphlingFinalNC, true);
        morphling.setBackground(Color.decode("#B9500B"));
        morphling.setForeground(Color.decode("#B9500B"));
        morphling.setFont(new Font("Courier", Font.PLAIN, 0));
        morphling.setVerticalTextPosition(0);
        morphling.setContentAreaFilled(false);
        morphling.setSelectedIcon(morphlingFinal);
        morphling.setBorder(emptyBorder);
        agilityHeroesJPanel.add(morphling);
        
        phantomLancer = new JToggleButton("Phantom Lancer", phantomLancerFinalNC, true);
        phantomLancer.setBackground(Color.decode("#B9500B"));
        phantomLancer.setForeground(Color.decode("#B9500B"));
        phantomLancer.setFont(new Font("Courier", Font.PLAIN, 0));
        phantomLancer.setVerticalTextPosition(0);
        phantomLancer.setContentAreaFilled(false);
        phantomLancer.setSelectedIcon(phantomLancerFinal);
        phantomLancer.setBorder(emptyBorder);
        agilityHeroesJPanel.add(phantomLancer);
        
        vengefulSpirit = new JToggleButton("Vengeful Spirit", vengefulSpiritFinalNC, true);
        vengefulSpirit.setBackground(Color.decode("#B9500B"));
        vengefulSpirit.setForeground(Color.decode("#B9500B"));
        vengefulSpirit.setFont(new Font("Courier", Font.PLAIN, 0));
        vengefulSpirit.setVerticalTextPosition(0);
        vengefulSpirit.setContentAreaFilled(false);
        vengefulSpirit.setSelectedIcon(vengefulSpiritFinal);
        vengefulSpirit.setBorder(emptyBorder);
        agilityHeroesJPanel.add(vengefulSpirit);
        
        riki = new JToggleButton("Riki", rikiFinalNC, true);
        riki.setBackground(Color.decode("#B9500B"));
        riki.setForeground(Color.decode("#B9500B"));
        riki.setFont(new Font("Courier", Font.PLAIN, 0));
        riki.setVerticalTextPosition(0);
        riki.setContentAreaFilled(false);
        riki.setSelectedIcon(rikiFinal);
        riki.setBorder(emptyBorder);
        agilityHeroesJPanel.add(riki);
        
        sniper = new JToggleButton("Sniper", sniperFinalNC, true);
        sniper.setBackground(Color.decode("#B9500B"));
        sniper.setForeground(Color.decode("#B9500B"));
        sniper.setFont(new Font("Courier", Font.PLAIN, 0));
        sniper.setVerticalTextPosition(0);
        sniper.setContentAreaFilled(false);
        sniper.setSelectedIcon(sniperFinal);
        sniper.setBorder(emptyBorder);
        agilityHeroesJPanel.add(sniper);
        
        templarAssassin = new JToggleButton("Templar Assassin", templarAssassinFinalNC, true);
        templarAssassin.setBackground(Color.decode("#B9500B"));
        templarAssassin.setForeground(Color.decode("#B9500B"));
        templarAssassin.setFont(new Font("Courier", Font.PLAIN, 0));
        templarAssassin.setVerticalTextPosition(0);
        templarAssassin.setContentAreaFilled(false);
        templarAssassin.setSelectedIcon(templarAssassinFinal);
        templarAssassin.setBorder(emptyBorder);
        agilityHeroesJPanel.add(templarAssassin);
        
        luna = new JToggleButton("Luna", lunaFinalNC, true);
        luna.setBackground(Color.decode("#B9500B"));
        luna.setForeground(Color.decode("#B9500B"));
        luna.setFont(new Font("Courier", Font.PLAIN, 0));
        luna.setVerticalTextPosition(0);
        luna.setContentAreaFilled(false);
        luna.setSelectedIcon(lunaFinal);
        luna.setBorder(emptyBorder);
        agilityHeroesJPanel.add(luna);
        
        bountyHunter = new JToggleButton("Bounty Hunter", bountyHunterFinalNC, true);
        bountyHunter.setBackground(Color.decode("#B9500B"));
        bountyHunter.setForeground(Color.decode("#B9500B"));
        bountyHunter.setFont(new Font("Courier", Font.PLAIN, 0));
        bountyHunter.setVerticalTextPosition(0);
        bountyHunter.setContentAreaFilled(false);
        bountyHunter.setSelectedIcon(bountyHunterFinal);
        bountyHunter.setBorder(emptyBorder);
        agilityHeroesJPanel.add(bountyHunter);
        
        ursa = new JToggleButton("Ursa", ursaFinalNC, true);
        ursa.setBackground(Color.decode("#B9500B"));
        ursa.setForeground(Color.decode("#B9500B"));
        ursa.setFont(new Font("Courier", Font.PLAIN, 0));
        ursa.setVerticalTextPosition(0);
        ursa.setContentAreaFilled(false);
        ursa.setSelectedIcon(ursaFinal);
        ursa.setBorder(emptyBorder);
        agilityHeroesJPanel.add(ursa);
        
        gyrocopter = new JToggleButton("Gyrocopter", gyrocopterFinalNC, true);
        gyrocopter.setBackground(Color.decode("#B9500B"));
        gyrocopter.setForeground(Color.decode("#B9500B"));
        gyrocopter.setFont(new Font("Courier", Font.PLAIN, 0));
        gyrocopter.setVerticalTextPosition(0);
        gyrocopter.setContentAreaFilled(false);
        gyrocopter.setSelectedIcon(gyrocopterFinal);
        gyrocopter.setBorder(emptyBorder);
        agilityHeroesJPanel.add(gyrocopter);
        
        loneDruid = new JToggleButton("Lone Druid", loneDruidFinalNC, true);
        loneDruid.setBackground(Color.decode("#B9500B"));
        loneDruid.setForeground(Color.decode("#B9500B"));
        loneDruid.setFont(new Font("Courier", Font.PLAIN, 0));
        loneDruid.setVerticalTextPosition(0);
        loneDruid.setContentAreaFilled(false);
        loneDruid.setSelectedIcon(loneDruidFinal);
        loneDruid.setBorder(emptyBorder);
        agilityHeroesJPanel.add(loneDruid);
        
        nagaSiren = new JToggleButton("Naga Siren", nagaSirenFinalNC, true);
        nagaSiren.setBackground(Color.decode("#B9500B"));
        nagaSiren.setForeground(Color.decode("#B9500B"));
        nagaSiren.setFont(new Font("Courier", Font.PLAIN, 0));
        nagaSiren.setVerticalTextPosition(0);
        nagaSiren.setContentAreaFilled(false);
        nagaSiren.setSelectedIcon(nagaSirenFinal);
        nagaSiren.setBorder(emptyBorder);
        agilityHeroesJPanel.add(nagaSiren);
        
        trollWarlord = new JToggleButton("Troll Warlord", trollWarlordFinalNC, true);
        trollWarlord.setBackground(Color.decode("#B9500B"));
        trollWarlord.setForeground(Color.decode("#B9500B"));
        trollWarlord.setFont(new Font("Courier", Font.PLAIN, 0));
        trollWarlord.setVerticalTextPosition(0);
        trollWarlord.setContentAreaFilled(false);
        trollWarlord.setSelectedIcon(trollWarlordFinal);
        trollWarlord.setBorder(emptyBorder);
        agilityHeroesJPanel.add(trollWarlord);
        
        emberSpirit = new JToggleButton("Ember Spirit", emberSpiritFinalNC, true);
        emberSpirit.setBackground(Color.decode("#B9500B"));
        emberSpirit.setForeground(Color.decode("#B9500B"));
        emberSpirit.setFont(new Font("Courier", Font.PLAIN, 0));
        emberSpirit.setVerticalTextPosition(0);
        emberSpirit.setContentAreaFilled(false);
        emberSpirit.setSelectedIcon(emberSpiritFinal);
        emberSpirit.setBorder(emptyBorder);
        agilityHeroesJPanel.add(emberSpirit);
        
        monkeyKing = new JToggleButton("Monkey King", monkeyKingFinalNC, true);
        monkeyKing.setBackground(Color.decode("#B9500B"));
        monkeyKing.setForeground(Color.decode("#B9500B"));
        monkeyKing.setFont(new Font("Courier", Font.PLAIN, 0));
        monkeyKing.setVerticalTextPosition(0);
        monkeyKing.setContentAreaFilled(false);
        monkeyKing.setSelectedIcon(monkeyKingFinal);
        monkeyKing.setBorder(emptyBorder);
        agilityHeroesJPanel.add(monkeyKing);
        
        pangolier = new JToggleButton("Pangolier", pangolierFinalNC, true);
        pangolier.setBackground(Color.decode("#B9500B"));
        pangolier.setForeground(Color.decode("#B9500B"));
        pangolier.setFont(new Font("Courier", Font.PLAIN, 0));
        pangolier.setVerticalTextPosition(0);
        pangolier.setContentAreaFilled(false);
        pangolier.setSelectedIcon(pangolierFinal);
        pangolier.setBorder(emptyBorder);
        agilityHeroesJPanel.add(pangolier);
        
        bloodseeker = new JToggleButton("Bloodseeker", bloodseekerFinalNC, true);
        bloodseeker.setBackground(Color.decode("#B9500B"));
        bloodseeker.setForeground(Color.decode("#B9500B"));
        bloodseeker.setFont(new Font("Courier", Font.PLAIN, 0));
        bloodseeker.setVerticalTextPosition(0);
        bloodseeker.setContentAreaFilled(false);
        bloodseeker.setSelectedIcon(bloodseekerFinal);
        bloodseeker.setBorder(emptyBorder);
        agilityHeroesJPanel.add(bloodseeker);
        
        shadowFiend = new JToggleButton("Shadow Fiend", shadowFiendFinalNC, true);
        shadowFiend.setBackground(Color.decode("#B9500B"));
        shadowFiend.setForeground(Color.decode("#B9500B"));
        shadowFiend.setFont(new Font("Courier", Font.PLAIN, 0));
        shadowFiend.setVerticalTextPosition(0);
        shadowFiend.setContentAreaFilled(false);
        shadowFiend.setSelectedIcon(shadowFiendFinal);
        shadowFiend.setBorder(emptyBorder);
        agilityHeroesJPanel.add(shadowFiend);
        
        razor = new JToggleButton("Razor", razorFinalNC, true);
        razor.setBackground(Color.decode("#B9500B"));
        razor.setForeground(Color.decode("#B9500B"));
        razor.setFont(new Font("Courier", Font.PLAIN, 0));
        razor.setVerticalTextPosition(0);
        razor.setContentAreaFilled(false);
        razor.setSelectedIcon(razorFinal);
        razor.setBorder(emptyBorder);
        agilityHeroesJPanel.add(razor);
        
        venomancer = new JToggleButton("Venomancer", venomancerFinalNC, true);
        venomancer.setBackground(Color.decode("#B9500B"));
        venomancer.setForeground(Color.decode("#B9500B"));
        venomancer.setFont(new Font("Courier", Font.PLAIN, 0));
        venomancer.setVerticalTextPosition(0);
        venomancer.setContentAreaFilled(false);
        venomancer.setSelectedIcon(venomancerFinal);
        venomancer.setBorder(emptyBorder);
        agilityHeroesJPanel.add(venomancer);
        
        facelessVoid = new JToggleButton("Faceless Void", facelessVoidFinalNC, true);
        facelessVoid.setBackground(Color.decode("#B9500B"));
        facelessVoid.setForeground(Color.decode("#B9500B"));
        facelessVoid.setFont(new Font("Courier", Font.PLAIN, 0));
        facelessVoid.setVerticalTextPosition(0);
        facelessVoid.setContentAreaFilled(false);
        facelessVoid.setSelectedIcon(facelessVoidFinal);
        facelessVoid.setBorder(emptyBorder);
        agilityHeroesJPanel.add(facelessVoid);
        
        phantomAssassin = new JToggleButton("Phantom Assassin", phantomAssassinFinalNC, true);
        phantomAssassin.setBackground(Color.decode("#B9500B"));
        phantomAssassin.setForeground(Color.decode("#B9500B"));
        phantomAssassin.setFont(new Font("Courier", Font.PLAIN, 0));
        phantomAssassin.setVerticalTextPosition(0);
        phantomAssassin.setContentAreaFilled(false);
        phantomAssassin.setSelectedIcon(phantomAssassinFinal);
        phantomAssassin.setBorder(emptyBorder);
        agilityHeroesJPanel.add(phantomAssassin);
        
        viper = new JToggleButton("Viper", viperFinalNC, true);
        viper.setBackground(Color.decode("#B9500B"));
        viper.setForeground(Color.decode("#B9500B"));
        viper.setFont(new Font("Courier", Font.PLAIN, 0));
        viper.setVerticalTextPosition(0);
        viper.setContentAreaFilled(false);
        viper.setSelectedIcon(viperFinal);
        viper.setBorder(emptyBorder);
        agilityHeroesJPanel.add(viper);
        
        clinkz = new JToggleButton("Clinkz", clinkzFinalNC, true);
        clinkz.setBackground(Color.decode("#B9500B"));
        clinkz.setForeground(Color.decode("#B9500B"));
        clinkz.setFont(new Font("Courier", Font.PLAIN, 0));
        clinkz.setVerticalTextPosition(0);
        clinkz.setContentAreaFilled(false);
        clinkz.setSelectedIcon(clinkzFinal);
        clinkz.setBorder(emptyBorder);
        agilityHeroesJPanel.add(clinkz);
        
        broodmother = new JToggleButton("Broodmother", broodmotherFinalNC, true);
        broodmother.setBackground(Color.decode("#B9500B"));
        broodmother.setForeground(Color.decode("#B9500B"));
        broodmother.setFont(new Font("Courier", Font.PLAIN, 0));
        broodmother.setVerticalTextPosition(0);
        broodmother.setContentAreaFilled(false);
        broodmother.setSelectedIcon(broodmotherFinal);
        broodmother.setBorder(emptyBorder);
        agilityHeroesJPanel.add(broodmother);
        
        weaver = new JToggleButton("Weaver", weaverFinalNC, true);
        weaver.setBackground(Color.decode("#B9500B"));
        weaver.setForeground(Color.decode("#B9500B"));
        weaver.setFont(new Font("Courier", Font.PLAIN, 0));
        weaver.setVerticalTextPosition(0);
        weaver.setContentAreaFilled(false);
        weaver.setSelectedIcon(weaverFinal);
        weaver.setBorder(emptyBorder);
        agilityHeroesJPanel.add(weaver);
        
        spectre = new JToggleButton("Spectre", spectreFinalNC, true);
        spectre.setBackground(Color.decode("#B9500B"));
        spectre.setForeground(Color.decode("#B9500B"));
        spectre.setFont(new Font("Courier", Font.PLAIN, 0));
        spectre.setVerticalTextPosition(0);
        spectre.setContentAreaFilled(false);
        spectre.setSelectedIcon(spectreFinal);
        spectre.setBorder(emptyBorder);
        agilityHeroesJPanel.add(spectre);
        
        meepo = new JToggleButton("Meepo", meepoFinalNC, true);
        meepo.setBackground(Color.decode("#B9500B"));
        meepo.setForeground(Color.decode("#B9500B"));
        meepo.setFont(new Font("Courier", Font.PLAIN, 0));
        meepo.setVerticalTextPosition(0);
        meepo.setContentAreaFilled(false);
        meepo.setSelectedIcon(meepoFinal);
        meepo.setBorder(emptyBorder);
        agilityHeroesJPanel.add(meepo);
        
        nyx = new JToggleButton("Nyx Assassin", nyxAssassinFinalNC, true);
        nyx.setBackground(Color.decode("#B9500B"));
        nyx.setForeground(Color.decode("#B9500B"));
        nyx.setFont(new Font("Courier", Font.PLAIN, 0));
        nyx.setVerticalTextPosition(0);
        nyx.setContentAreaFilled(false);
        nyx.setSelectedIcon(nyxAssassinFinal);
        nyx.setBorder(emptyBorder);
        agilityHeroesJPanel.add(nyx);
        
        slark = new JToggleButton("Slark", slarkFinalNC, true);
        slark.setBackground(Color.decode("#B9500B"));
        slark.setForeground(Color.decode("#B9500B"));
        slark.setFont(new Font("Courier", Font.PLAIN, 0));
        slark.setVerticalTextPosition(0);
        slark.setContentAreaFilled(false);
        slark.setSelectedIcon(slarkFinal);
        slark.setBorder(emptyBorder);
        agilityHeroesJPanel.add(slark);
        
        medusa = new JToggleButton("Medusa", medusaFinalNC, true);
        medusa.setBackground(Color.decode("#B9500B"));
        medusa.setForeground(Color.decode("#B9500B"));
        medusa.setFont(new Font("Courier", Font.PLAIN, 0));
        medusa.setVerticalTextPosition(0);
        medusa.setContentAreaFilled(false);
        medusa.setSelectedIcon(medusaFinal);
        medusa.setBorder(emptyBorder);
        agilityHeroesJPanel.add(medusa);
        
        terrorblade = new JToggleButton("Terrorblade", terrorbladeFinalNC, true);
        terrorblade.setBackground(Color.decode("#B9500B"));
        terrorblade.setForeground(Color.decode("#B9500B"));
        terrorblade.setFont(new Font("Courier", Font.PLAIN, 0));
        terrorblade.setVerticalTextPosition(0);
        terrorblade.setContentAreaFilled(false);
        terrorblade.setSelectedIcon(terrorbladeFinal);
        terrorblade.setBorder(emptyBorder);
        agilityHeroesJPanel.add(terrorblade);
        
        arcWarden = new JToggleButton("Arc Warden", arcWardenFinalNC, true);
        arcWarden.setBackground(Color.decode("#B9500B"));
        arcWarden.setForeground(Color.decode("#B9500B"));
        arcWarden.setFont(new Font("Courier", Font.PLAIN, 0));
        arcWarden.setVerticalTextPosition(0);
        arcWarden.setContentAreaFilled(false);
        arcWarden.setSelectedIcon(arcWardenFinal);
        arcWarden.setBorder(emptyBorder);
        agilityHeroesJPanel.add(arcWarden);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="INT HERO JBUTTONS">
        //setup JPanel for intelligence
        intelligenceHeroesJPanel = new JPanel();
        intelligenceHeroesJPanel.setBorder(new TitledBorder("Intelligence"));
        intelligenceHeroesJPanel.setBounds(510,10,240,630); //(x,y,width,height)
        intelligenceHeroesJPanel.setBackground(Color.decode("#257DAE"));
        contentPane.add(intelligenceHeroesJPanel);
        
        crystalMaiden = new JToggleButton("Crystal Maiden", crystalMaidenFinalNC, true);
        crystalMaiden.setBackground(Color.decode("#B9500B"));
        crystalMaiden.setForeground(Color.decode("#B9500B"));
        crystalMaiden.setFont(new Font("Courier", Font.PLAIN, 0));
        crystalMaiden.setVerticalTextPosition(0);
        crystalMaiden.setContentAreaFilled(false);
        crystalMaiden.setSelectedIcon(crystalMaidenFinal);
        crystalMaiden.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(crystalMaiden);
        
        puck = new JToggleButton("Puck", puckFinalNC, true);
        puck.setBackground(Color.decode("#B9500B"));
        puck.setForeground(Color.decode("#B9500B"));
        puck.setFont(new Font("Courier", Font.PLAIN, 0));
        puck.setVerticalTextPosition(0);
        puck.setContentAreaFilled(false);
        puck.setSelectedIcon(puckFinal);
        puck.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(puck);
        
        stormSpirit = new JToggleButton("Storm Spirit", stormSpiritFinalNC, true);
        stormSpirit.setBackground(Color.decode("#B9500B"));
        stormSpirit.setForeground(Color.decode("#B9500B"));
        stormSpirit.setFont(new Font("Courier", Font.PLAIN, 0));
        stormSpirit.setVerticalTextPosition(0);
        stormSpirit.setContentAreaFilled(false);
        stormSpirit.setSelectedIcon(stormSpiritFinal);
        stormSpirit.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(stormSpirit);
        
        windranger = new JToggleButton("Windranger", windrangerFinalNC, true);
        windranger.setBackground(Color.decode("#B9500B"));
        windranger.setForeground(Color.decode("#B9500B"));
        windranger.setFont(new Font("Courier", Font.PLAIN, 0));
        windranger.setVerticalTextPosition(0);
        windranger.setContentAreaFilled(false);
        windranger.setSelectedIcon(windrangerFinal);
        windranger.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(windranger);
        
        zeus = new JToggleButton("Zeus", zeusFinalNC, true);
        zeus.setBackground(Color.decode("#B9500B"));
        zeus.setForeground(Color.decode("#B9500B"));
        zeus.setFont(new Font("Courier", Font.PLAIN, 0));
        zeus.setVerticalTextPosition(0);
        zeus.setContentAreaFilled(false);
        zeus.setSelectedIcon(zeusFinal);
        zeus.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(zeus);
        
        lina = new JToggleButton("Lina", linaFinalNC, true);
        lina.setBackground(Color.decode("#B9500B"));
        lina.setForeground(Color.decode("#B9500B"));
        lina.setFont(new Font("Courier", Font.PLAIN, 0));
        lina.setVerticalTextPosition(0);
        lina.setContentAreaFilled(false);
        lina.setSelectedIcon(linaFinal);
        lina.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(lina);
        
        shadowShaman = new JToggleButton("Shadow Shaman", shadowShamanFinalNC, true);
        shadowShaman.setBackground(Color.decode("#B9500B"));
        shadowShaman.setForeground(Color.decode("#B9500B"));
        shadowShaman.setFont(new Font("Courier", Font.PLAIN, 0));
        shadowShaman.setVerticalTextPosition(0);
        shadowShaman.setContentAreaFilled(false);
        shadowShaman.setSelectedIcon(shadowShamanFinal);
        shadowShaman.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(shadowShaman);
        
        tinker = new JToggleButton("Tinker", tinkerFinalNC, true);
        tinker.setBackground(Color.decode("#B9500B"));
        tinker.setForeground(Color.decode("#B9500B"));
        tinker.setFont(new Font("Courier", Font.PLAIN, 0));
        tinker.setVerticalTextPosition(0);
        tinker.setContentAreaFilled(false);
        tinker.setSelectedIcon(tinkerFinal);
        tinker.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(tinker);
        
        natureProphet = new JToggleButton("Nature's Prophet", natureProphetFinalNC, true);
        natureProphet.setBackground(Color.decode("#B9500B"));
        natureProphet.setForeground(Color.decode("#B9500B"));
        natureProphet.setFont(new Font("Courier", Font.PLAIN, 0));
        natureProphet.setVerticalTextPosition(0);
        natureProphet.setContentAreaFilled(false);
        natureProphet.setSelectedIcon(natureProphetFinal);
        natureProphet.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(natureProphet);
        
        enchantress = new JToggleButton("Enchantress", enchantressFinalNC, true);
        enchantress.setBackground(Color.decode("#B9500B"));
        enchantress.setForeground(Color.decode("#B9500B"));
        enchantress.setFont(new Font("Courier", Font.PLAIN, 0));
        enchantress.setVerticalTextPosition(0);
        enchantress.setContentAreaFilled(false);
        enchantress.setSelectedIcon(enchantressFinal);
        enchantress.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(enchantress);
        
        jakiro = new JToggleButton("Jakiro", jakiroFinalNC, true);
        jakiro.setBackground(Color.decode("#B9500B"));
        jakiro.setForeground(Color.decode("#B9500B"));
        jakiro.setFont(new Font("Courier", Font.PLAIN, 0));
        jakiro.setVerticalTextPosition(0);
        jakiro.setContentAreaFilled(false);
        jakiro.setSelectedIcon(jakiroFinal);
        jakiro.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(jakiro);
        
        chen = new JToggleButton("Chen", chenFinalNC, true);
        chen.setBackground(Color.decode("#B9500B"));
        chen.setForeground(Color.decode("#B9500B"));
        chen.setFont(new Font("Courier", Font.PLAIN, 0));
        chen.setVerticalTextPosition(0);
        chen.setContentAreaFilled(false);
        chen.setSelectedIcon(chenFinal);
        chen.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(chen);
        
        silencer = new JToggleButton("Silencer", silencerFinalNC, true);
        silencer.setBackground(Color.decode("#B9500B"));
        silencer.setForeground(Color.decode("#B9500B"));
        silencer.setFont(new Font("Courier", Font.PLAIN, 0));
        silencer.setVerticalTextPosition(0);
        silencer.setContentAreaFilled(false);
        silencer.setSelectedIcon(silencerFinal);
        silencer.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(silencer);
        
        ogreMagi = new JToggleButton("Ogre Magi", ogreMagiFinalNC, true);
        ogreMagi.setBackground(Color.decode("#B9500B"));
        ogreMagi.setForeground(Color.decode("#B9500B"));
        ogreMagi.setFont(new Font("Courier", Font.PLAIN, 0));
        ogreMagi.setVerticalTextPosition(0);
        ogreMagi.setContentAreaFilled(false);
        ogreMagi.setSelectedIcon(ogreMagiFinal);
        ogreMagi.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(ogreMagi);
        
        rubick = new JToggleButton("Rubick", rubickFinalNC, true);
        rubick.setBackground(Color.decode("#B9500B"));
        rubick.setForeground(Color.decode("#B9500B"));
        rubick.setFont(new Font("Courier", Font.PLAIN, 0));
        rubick.setVerticalTextPosition(0);
        rubick.setContentAreaFilled(false);
        rubick.setSelectedIcon(rubickFinal);
        rubick.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(rubick);
        
        disruptor = new JToggleButton("Disruptor", disruptorFinalNC, true);
        disruptor.setBackground(Color.decode("#B9500B"));
        disruptor.setForeground(Color.decode("#B9500B"));
        disruptor.setFont(new Font("Courier", Font.PLAIN, 0));
        disruptor.setVerticalTextPosition(0);
        disruptor.setContentAreaFilled(false);
        disruptor.setSelectedIcon(disruptorFinal);
        disruptor.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(disruptor);
        
        keeperOfTheLight = new JToggleButton("Keeper Of The Light", keeperOfTheLightFinalNC, true);
        keeperOfTheLight.setBackground(Color.decode("#B9500B"));
        keeperOfTheLight.setForeground(Color.decode("#B9500B"));
        keeperOfTheLight.setFont(new Font("Courier", Font.PLAIN, 0));
        keeperOfTheLight.setVerticalTextPosition(0);
        keeperOfTheLight.setContentAreaFilled(false);
        keeperOfTheLight.setSelectedIcon(keeperOfTheLightFinal);
        keeperOfTheLight.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(keeperOfTheLight);
        
        skywrathMage = new JToggleButton("Skywrath Mage", skywrathMageFinalNC, true);
        skywrathMage.setBackground(Color.decode("#B9500B"));
        skywrathMage.setForeground(Color.decode("#B9500B"));
        skywrathMage.setFont(new Font("Courier", Font.PLAIN, 0));
        skywrathMage.setVerticalTextPosition(0);
        skywrathMage.setContentAreaFilled(false);
        skywrathMage.setSelectedIcon(skywrathMageFinal);
        skywrathMage.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(skywrathMage);
    
        oracle = new JToggleButton("Oracle", oracleFinalNC, true);
        oracle.setBackground(Color.decode("#B9500B"));
        oracle.setForeground(Color.decode("#B9500B"));
        oracle.setFont(new Font("Courier", Font.PLAIN, 0));
        oracle.setVerticalTextPosition(0);
        oracle.setContentAreaFilled(false);
        oracle.setSelectedIcon(oracleFinal);
        oracle.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(oracle);
        
        techies = new JToggleButton("Techies", techiesFinalNC, true);
        techies.setBackground(Color.decode("#B9500B"));
        techies.setForeground(Color.decode("#B9500B"));
        techies.setFont(new Font("Courier", Font.PLAIN, 0));
        techies.setVerticalTextPosition(0);
        techies.setContentAreaFilled(false);
        techies.setSelectedIcon(techiesFinal);
        techies.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(techies);
        
        darkWillow = new JToggleButton("Dark Willow", darkWillowFinalNC, true);
        darkWillow.setBackground(Color.decode("#B9500B"));
        darkWillow.setForeground(Color.decode("#B9500B"));
        darkWillow.setFont(new Font("Courier", Font.PLAIN, 0));
        darkWillow.setVerticalTextPosition(0);
        darkWillow.setContentAreaFilled(false);
        darkWillow.setSelectedIcon(darkWillowFinal);
        darkWillow.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(darkWillow);
        
        bane = new JToggleButton("Bane", baneFinalNC, true);
        bane.setBackground(Color.decode("#B9500B"));
        bane.setForeground(Color.decode("#B9500B"));
        bane.setFont(new Font("Courier", Font.PLAIN, 0));
        bane.setVerticalTextPosition(0);
        bane.setContentAreaFilled(false);
        bane.setSelectedIcon(baneFinal);
        bane.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(bane);
        
        lich = new JToggleButton("Lich", lichFinalNC, true);
        lich.setBackground(Color.decode("#B9500B"));
        lich.setForeground(Color.decode("#B9500B"));
        lich.setFont(new Font("Courier", Font.PLAIN, 0));
        lich.setVerticalTextPosition(0);
        lich.setContentAreaFilled(false);
        lich.setSelectedIcon(lichFinal);
        lich.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(lich);
        
        lion = new JToggleButton("Lion", lionFinalNC, true);
        lion.setBackground(Color.decode("#B9500B"));
        lion.setForeground(Color.decode("#B9500B"));
        lion.setFont(new Font("Courier", Font.PLAIN, 0));
        lion.setVerticalTextPosition(0);
        lion.setContentAreaFilled(false);
        lion.setSelectedIcon(lionFinal);
        lion.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(lion);
        
        witchDoctor = new JToggleButton("Witch Doctor", witchDoctorFinalNC, true);
        witchDoctor.setBackground(Color.decode("#B9500B"));
        witchDoctor.setForeground(Color.decode("#B9500B"));
        witchDoctor.setFont(new Font("Courier", Font.PLAIN, 0));
        witchDoctor.setVerticalTextPosition(0);
        witchDoctor.setContentAreaFilled(false);
        witchDoctor.setSelectedIcon(witchDoctorFinal);
        witchDoctor.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(witchDoctor);
        
        enigma = new JToggleButton("Enigma", enigmaFinalNC, true);
        enigma.setBackground(Color.decode("#B9500B"));
        enigma.setForeground(Color.decode("#B9500B"));
        enigma.setFont(new Font("Courier", Font.PLAIN, 0));
        enigma.setVerticalTextPosition(0);
        enigma.setContentAreaFilled(false);
        enigma.setSelectedIcon(enigmaFinal);
        enigma.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(enigma);
        
        necrophos = new JToggleButton("Necrophos", necrophosFinalNC, true);
        necrophos.setBackground(Color.decode("#B9500B"));
        necrophos.setForeground(Color.decode("#B9500B"));
        necrophos.setFont(new Font("Courier", Font.PLAIN, 0));
        necrophos.setVerticalTextPosition(0);
        necrophos.setContentAreaFilled(false);
        necrophos.setSelectedIcon(necrophosFinal);
        necrophos.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(necrophos);
        
        warlock = new JToggleButton("Warlock", warlockFinalNC, true);
        warlock.setBackground(Color.decode("#B9500B"));
        warlock.setForeground(Color.decode("#B9500B"));
        warlock.setFont(new Font("Courier", Font.PLAIN, 0));
        warlock.setVerticalTextPosition(0);
        warlock.setContentAreaFilled(false);
        warlock.setSelectedIcon(warlockFinal);
        warlock.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(warlock);
        
        queenOfPain = new JToggleButton("Queen Of Pain", queenOfPainFinalNC, true);
        queenOfPain.setBackground(Color.decode("#B9500B"));
        queenOfPain.setForeground(Color.decode("#B9500B"));
        queenOfPain.setFont(new Font("Courier", Font.PLAIN, 0));
        queenOfPain.setVerticalTextPosition(0);
        queenOfPain.setContentAreaFilled(false);
        queenOfPain.setSelectedIcon(queenOfPainFinal);
        queenOfPain.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(queenOfPain);
        
        deathProphet = new JToggleButton("Death Prophet", deathProphetFinalNC, true);
        deathProphet.setBackground(Color.decode("#B9500B"));
        deathProphet.setForeground(Color.decode("#B9500B"));
        deathProphet.setFont(new Font("Courier", Font.PLAIN, 0));
        deathProphet.setVerticalTextPosition(0);
        deathProphet.setContentAreaFilled(false);
        deathProphet.setSelectedIcon(deathProphetFinal);
        deathProphet.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(deathProphet);
        
        pugna = new JToggleButton("Pugna", pugnaFinalNC, true);
        pugna.setBackground(Color.decode("#B9500B"));
        pugna.setForeground(Color.decode("#B9500B"));
        pugna.setFont(new Font("Courier", Font.PLAIN, 0));
        pugna.setVerticalTextPosition(0);
        pugna.setContentAreaFilled(false);
        pugna.setSelectedIcon(pugnaFinal);
        pugna.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(pugna);
        
        dazzle = new JToggleButton("Dazzle", dazzleFinalNC, true);
        dazzle.setBackground(Color.decode("#B9500B"));
        dazzle.setForeground(Color.decode("#B9500B"));
        dazzle.setFont(new Font("Courier", Font.PLAIN, 0));
        dazzle.setVerticalTextPosition(0);
        dazzle.setContentAreaFilled(false);
        dazzle.setSelectedIcon(dazzleFinal);
        dazzle.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(dazzle);
        
        leshrac = new JToggleButton("Leshrac", leshracFinalNC, true);
        leshrac.setBackground(Color.decode("#B9500B"));
        leshrac.setForeground(Color.decode("#B9500B"));
        leshrac.setFont(new Font("Courier", Font.PLAIN, 0));
        leshrac.setVerticalTextPosition(0);
        leshrac.setContentAreaFilled(false);
        leshrac.setSelectedIcon(leshracFinal);
        leshrac.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(leshrac);
        
        darkSeer = new JToggleButton("Dark Seer", darkSeerFinalNC, true);
        darkSeer.setBackground(Color.decode("#B9500B"));
        darkSeer.setForeground(Color.decode("#B9500B"));
        darkSeer.setFont(new Font("Courier", Font.PLAIN, 0));
        darkSeer.setVerticalTextPosition(0);
        darkSeer.setContentAreaFilled(false);
        darkSeer.setSelectedIcon(darkSeerFinal);
        darkSeer.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(darkSeer);
        
        batrider = new JToggleButton("Batrider", batriderFinalNC, true);
        batrider.setBackground(Color.decode("#B9500B"));
        batrider.setForeground(Color.decode("#B9500B"));
        batrider.setFont(new Font("Courier", Font.PLAIN, 0));
        batrider.setVerticalTextPosition(0);
        batrider.setContentAreaFilled(false);
        batrider.setSelectedIcon(batriderFinal);
        batrider.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(batrider);
        
        ancientApparition = new JToggleButton("Ancient Apparition", ancientApparitionFinalNC, true);
        ancientApparition.setBackground(Color.decode("#B9500B"));
        ancientApparition.setForeground(Color.decode("#B9500B"));
        ancientApparition.setFont(new Font("Courier", Font.PLAIN, 0));
        ancientApparition.setVerticalTextPosition(0);
        ancientApparition.setContentAreaFilled(false);
        ancientApparition.setSelectedIcon(ancientApparitionFinal);
        ancientApparition.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(ancientApparition);
        
        invoker = new JToggleButton("Invoker", invokerFinalNC, true);
        invoker.setBackground(Color.decode("#B9500B"));
        invoker.setForeground(Color.decode("#B9500B"));
        invoker.setFont(new Font("Courier", Font.PLAIN, 0));
        invoker.setVerticalTextPosition(0);
        invoker.setContentAreaFilled(false);
        invoker.setSelectedIcon(invokerFinal);
        invoker.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(invoker);
        
        outworldDevourer = new JToggleButton("Outworld Devourer", outworldDevourerFinalNC, true);
        outworldDevourer.setBackground(Color.decode("#B9500B"));
        outworldDevourer.setForeground(Color.decode("#B9500B"));
        outworldDevourer.setFont(new Font("Courier", Font.PLAIN, 0));
        outworldDevourer.setVerticalTextPosition(0);
        outworldDevourer.setContentAreaFilled(false);
        outworldDevourer.setSelectedIcon(outworldDevourerFinal);
        outworldDevourer.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(outworldDevourer);
        
        shadowDemon = new JToggleButton("Shadow Demon", shadowDemonFinalNC, true);
        shadowDemon.setBackground(Color.decode("#B9500B"));
        shadowDemon.setForeground(Color.decode("#B9500B"));
        shadowDemon.setFont(new Font("Courier", Font.PLAIN, 0));
        shadowDemon.setVerticalTextPosition(0);
        shadowDemon.setContentAreaFilled(false);
        shadowDemon.setSelectedIcon(shadowDemonFinal);
        shadowDemon.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(shadowDemon);
        
        visage = new JToggleButton("Visage", visageFinalNC, true);
        visage.setBackground(Color.decode("#B9500B"));
        visage.setForeground(Color.decode("#B9500B"));
        visage.setFont(new Font("Courier", Font.PLAIN, 0));
        visage.setVerticalTextPosition(0);
        visage.setContentAreaFilled(false);
        visage.setSelectedIcon(visageFinal);
        visage.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(visage);
        
        winterWyvern = new JToggleButton("Winter Wyvern", winterWyvernFinalNC, true);
        winterWyvern.setBackground(Color.decode("#B9500B"));
        winterWyvern.setForeground(Color.decode("#B9500B"));
        winterWyvern.setFont(new Font("Courier", Font.PLAIN, 0));
        winterWyvern.setVerticalTextPosition(0);
        winterWyvern.setContentAreaFilled(false);
        winterWyvern.setSelectedIcon(winterWyvernFinal);
        winterWyvern.setBorder(emptyBorder);
        intelligenceHeroesJPanel.add(winterWyvern);
        //</editor-fold>
        
        //visibility
        setTitle("Dota Hero Picker");
        setSize(770,750);
        setVisible(true); 
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void strengthActionPerformed(ActionEvent event) {      
        Component[] comps = strengthHeroesJPanel.getComponents();
        
        for (Component comp: comps) {
            if (comp instanceof JToggleButton) {
                JToggleButton box = (JToggleButton) comp;
                if (box.isSelected()) {
                    box.setSelected(false);
                } else {
                    box.setSelected(true);
                }
            }
        }
    }
    
    public static void agilityActionPerformed(ActionEvent event) {      
        Component[] comps = agilityHeroesJPanel.getComponents();
        
        for (Component comp: comps) {
            if (comp instanceof JToggleButton) {
                JToggleButton box = (JToggleButton) comp;
                if (box.isSelected()) {
                    box.setSelected(false);
                } else {
                    box.setSelected(true);
                }
            }
        }
    }
    
    public static void intelligenceActionPerformed(ActionEvent event) {      
        Component[] comps = intelligenceHeroesJPanel.getComponents();
        
        for (Component comp: comps) {
            if (comp instanceof JToggleButton) {
                JToggleButton box = (JToggleButton) comp;
                if (box.isSelected()) {
                    box.setSelected(false);
                } else {
                    box.setSelected(true);
                }
            }
        }
    }
    
    public static String generateJButtonActionPerformed(ActionEvent event) {
        ArrayList<String> heroPool = new ArrayList<String>();
        ArrayList<String> strengthHeroes = manageCheckedCheckboxes(strengthHeroesJPanel);
        ArrayList<String> agilityHeroes = manageCheckedCheckboxes(agilityHeroesJPanel);
        ArrayList<String> intelligenceHeroes = manageCheckedCheckboxes(intelligenceHeroesJPanel);
        
        for (String s: strengthHeroes) {
            heroPool.add(s);
        }
        
        for (String s: agilityHeroes) {
            heroPool.add(s);
        }
        
        for (String s: intelligenceHeroes) {
            heroPool.add(s);
        }
        
        Random rng = new Random();
        String randomHero = heroPool.get(rng.nextInt(heroPool.size()));
        return randomHero;
    }
    
    public static ArrayList<String> manageCheckedCheckboxes(final Container c) {
        Component[] comps = c.getComponents();
        ArrayList<String> checkedText = new ArrayList<String>();
        
        for (Component comp: comps) {
            if (comp instanceof JToggleButton) {
                JToggleButton box = (JToggleButton) comp;
                if (box.isSelected()) {
                    String text = box.getText();
                    checkedText.add(text);
                }
            }
        }
        return checkedText;
    }
    
    public static void main(String[] args) {
        new DotaHeroPickerUpdated();
    }
    
}
