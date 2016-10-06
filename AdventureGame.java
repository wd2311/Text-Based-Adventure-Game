package adventureGame;

import java.awt.Font;
import java.util.ArrayList;

public class AdventureGame{
	
	String[] strings = new String[30];
	String[] getStuff = new String[30];
	String[] badMoves = new String[30];
	String[] oldForest = new String[15];
	String[] weathertop = new String[15];
	String[] prancing = new String[15];
	ArrayList<String> inventory = new ArrayList<String>();
	
	
	/*
	 * To Flaff About:
	 * Saradermi Pergenchersi
	 * Constorter
	 * Eventural Game
	 * Syntanx
	 */
	
	public AdventureGame(){
		
		inventory.add("The One Ring");
		
		strings[0] = "In a hole in the ground there lived a hobbit. Not a nasty, "
				+ "\ndirty, wet hole, filled with the ends of worms and an oozy "
				+ "\nsmell, nor yet a dry, bare, sandy hole with nothing in it to "
				+ "\nsit on or to eat: it was a hobbithole, and that means comfort."
				+ "\nYou are the hobbit."
				+ "\n\nContinue?"
				+ "\n\n>Type 'help' for a list of commands.";
		
		strings[1] = "You're sitting in your study examining an elven tome. The "
				+ "\nwords are foreign to you. Moments later, you hear a thud on "
				+ "\nyour door. Who could it be? You slip on your boots and hurry "
				+ "\nto the door. You look through the peephole and see no one "
				+ "\nthere.";
		
		strings[2] = "You open your door. Placed on your doormat is an archaic map "
				+ "\nof Middle Earth. You have plenty of these and another would be "
				+ "\nobsolete, but there is something peculiar about this one. You "
				+ "\npick it up. The text is faintly glowing and it smells of troll. "
				+ "\nInk is permeating the paper from the other side.";
		
		strings[3] = "On the backside of the map is an etched note. The note reads:"
				+ "\n\nBilbo, my old friend, time has come and gone and I feel a "
				+ "\nreunion is quite neccesary. However, I am in somewhat of a "
				+ "\npredicemant. Days ago, I was captured by a tribe of trolls "
				+ "\nwhile traveling to Rivendell. They have imprisoned me in a "
				+ "\ncamp somewhere in the Trollshaws, east of The Shire. Though "
				+ "\nit may be a burdensome task, I ask you to find me and aid me "
				+ "\nin my escape. Use the ring if need be, I await your arrival."
				+ "\nUntil next time, Gandalf."
				+ "\n\nDo you agree to help Gandalf escape?";
				//"Your task for your adventure is to reach Gandalf."

		
		strings[4] = "You place the map into your satchel. You are standing in your "
				+ "\ndoorway. Behind you is your home, abundant with supplies. To "
				+ "\nyour north is The Shire."
				+ "\n\n'Map' has been added to your inventory.";
		
		strings[5] = "You walk into your home. On the wall is your sword, Sting. "
				+ "\nPlaced on your table is a flask of water and a pouch of coins.";
		strings[6] = "You walk down your path and reach your front gate. You look "
				+ "\nback and notice that your door is still open. You should "
				+ "\nreturn home and get some supplies.";
		
		strings[5] = "You walk into your home. On the wall is your sword, Sting. "
				+ "\nPlaced on your table is a flask of water and a pouch of "
				+ "\ncoins.";
//THE PAIN:
		getStuff[0] = "You take the blade and place it in your satchel. On the "
				+ "\ntable is a pouch of coins and a flask of water."
				+ "\n\n'Sting' has been added to your inventory.";
		getStuff[1] = "You take the pouch of coins and place it in your satchel. "
				+ "\nOn the wall is your blade. On the table is the flask of water."
				+ "\n\n'Pouch of coins' has been added to your inventory.";
		getStuff[2] = "You take the flask of water and place it in your satchel. On "
				+ "\nthe wall is your blade and on the table is a pouch of coins."
				+ "\n\n'Flask of water' has been added to your inventory.";
		getStuff[3] = "You place the pouch of coins in your satchel. On the table "
				+ "\nis a flask of water." //take pouch, flask left
				+ "\n\n'Pouch of coins' has been added to your inventory.";
		getStuff[4] = "You place the flask of water in your satchel. You should "
				+ "\nget going. " //take flask and done
				+ "\n\n'Flask of water' has been added to your inventory";
		getStuff[5] = "You place the flask of water in your satchel. On the table "
				+ "\nis a pouch of coins." //take flask and coins left
				+ "\n\n'Flask of water' has been added to your inventory.";
		getStuff[6] = "You place the pouch of coins in your satchel. You should "
				+ "\nget going." //take coins and done
				+ "\n\n'Pouch of coins' has been added to your inventory.";
		getStuff[7] = "You take the blade and place it in your satchel. On the "
				+ "\ntable is a pouch of coins."//take blade, coins left
				+ "\n\n'Sting' has been added to your inventory.";
		getStuff[8] = "You take the pouch of coins and place it in your satchel. On"
				+ "\n the wall is your blade."//take coins, blade is left
				+ "\n\n'Pouch of coins' has been added to your inventory.";
		getStuff[9] = "You take the blade and place it in your satchel. You should "
				+ "\nget going."//take blade, done
				+ "\n\n'Sting' has been added to your inventory.";
		getStuff[10] = "You place the flask of water in your satchel. On the wall is "
				+ "\nyour blade."//take flask, blade is left
				+ "\n\n'Flask of water' has been added to your inventory.";
		getStuff[11] = "You place the blade in your satchel. On the table is a flask "
				+ "\nof water."//take blade, flask is left
				+ "\n\n'Sting' has been added to your inventory.";
		getStuff[12] = "You place the blade, the pouch of coins, and the flask of "
				+ "\nwater into your satchel. You should get going."
				+ "\n\n'Flask of water' has been added to your inventory."
				+ "\n'Pouch of coins' has been added to your inventory."
				+ "\n'Sting' has been added to your inventory.";
//PAIN IS OVER
		
		strings[7] = "You leave your home and walk through the gate into the shire. "
				+ "\nTo the west is a valley, to the north is your home, to the "
				+ "\neast is the road leading to Buckland, and to the south is a "
				+ "\nvalley.";
		strings[8] = "You're in the shire. To the west is an empty valley, to the "
				+ "\nnorth is your home, to the east is the road leading to "
				+ "\nBuckland, and to the south is a valley.";
		
		
		//ALL EAST, NOTHING ELSE, ONLY EAST. EAST EAST EAST. 
		
		strings[9] = "GREAT EAST ROAD"
				+ "\nYou're on the road to Buckland. North of you is the river, "
				+ "\nto your south is a small forest, to your west is the road "
				+ "\nleading to your home, and east of you is Brandywine Bridge "
				+ "\nleading to Buckland.";
		
		strings[10] = "BRANDYWINE BRIDGE"
				+ "\nYou are standing at the foot of Brandywine Bridge, the bridge "
				+ "\nconnecting Hobbiton to Buckland. To the south is the "
				+ "\nriverbank, to the north is the riverbank, and to the west is "
				+ "\nthe path to Hobbiton. On a wooden post you see a notice in "
				+ "\nlarge letters LOST NECKLACE! PLEASE RETURN TO BARLIMAN AT THE "
				+ "\nPRANCING PONY INN! REWARD. Over the bridge to the east, you"
				+ "\nsee Buckland in the distance.";
		strings[11] = "GREAT EAST ROAD"
				+ "\nYou have crossed the bridge and are now in Buckland. To your "
				+ "\neast lies the stone path that leads through Buckland to the "
				+ "\ngates of Bree. To the north is a two story house with a sign "
				+ "\nthat reads 'Visitors NOT welcome.' A small water fountain "
				+ "\nlies to the south. To your west is the Brandywine Bridge.";
		
		strings[12] = "BUCKLAND"
				+ "\nThe road to Bree lies to the east, and the road to "
				+ "\nBrandywine Bridge lies to your west. To your south is the Old "
				+ "\nForest, filled with strange spirits and swaying trees. To the "
				+ "\nnorth is a vast valley, filled with hills and nothing else.";
		strings[13] = "GREAT EAST ROAD"
				+ "\nYou can see Bree in the distance to the east. In the north, "
				+ "\nyou see miles of hills and valleys. To south lies the Barrow "
				+ "\nDowns, a series of hills along the west of the Old Forest. In "
				+ "\nthe west is Buckland. The sun is nearing the horizon to the "
				+ "\neast.";
		strings[14] = "BREE"
				+ "\nYou step through the front gate. To the south are a few closed "//FINALLY IN BREE
				+ "\nshops. To the north is the Prancing Pony Inn, a three story "
				+ "\nbuilding with many windows. Above the arch entrance is lamp "
				+ "\nilluminating the sign with a fat white pony rearing on its "
				+ "\nhind legs. Westward lies the great east road, leading back to "
				+ "\nBuckland. In the east is the rest of Bree."; 
		strings[15] = "BREE"
				+ "\nThe sun has touched the horizon and the winds have picked up. "
				+ "\nIn the east lies the eastern gate of Bree. To the south and "
				+ "\nnorth are small two stories homes.";
		strings[17] = "GREAT EAST ROAD"
				+ "\nA light rain falls, cooling you down after such a long walk. "
				+ "\nThe Midgewater Marshes lie in the north, from the road you "
				+ "\ncan hear the malicious crickets. In the south is the valley "
				+ "\nnorth of the South Downs. The Great East Road continues "
				+ "\neastward. The eastern gate of Bree lies in the west.";
		strings[18] = "GREAT EAST ROAD"
				+ "\nThe road continues in the east and back to Bree in the west. "
				+ "\nIn the north lies Amon Sûl (Weathertop), \"Hill of Wind\", "
				+ "\noverlooking the Great East Road which youstand on. Atop the "
				+ "\nhill is the ruins of a watchtower, burned and destroyed in "
				+ "\nT.A. 1409. A path leads to the top northward. In the south "
				+ "\nlies a vast valley leading to the South Downs.";
		strings[19] = "GREAT EAST ROAD"
				+ "\nThe East Road leads east to the Last Bridge, though it is "
				+ "\nnot in sight. Not too long and you'll be on the outer edge "
				+ "\nof the Trollshaws. In the north is the grassy lands east of "
				+ "\nthe Weather Hills. In the south is miles and miles of grass "
				+ "\nand hills. In the west, the moon has risen to the horizon. "
				+ "\nThe fading lamplights of Bree can barely be seen.";
		strings[20] = "GREAT EAST ROAD"
				+ "\nThe treetops of the Trollshaws hide the sun, The Misty "
				+ "\nMountains are in sight. To the north and south lie a grassy "
				+ "\nland, ridden with insects and critters. In the east you can "
				+ "\nsee the Last Bridge, marking the western boundary of the"
				+ "\nTrollshaws. Westward lies the road which you have been "
				+ "\nfollowing for all this time.";
		strings[21] = "THE LAST BRIDGE"
				+ "\nThe Last Bridge, crossing the river Mitheithel along the "
				+ "\nGreat East Road. The Mitheithel runs south and north, "
				+ "\neventually leading to the Coldfells in the north and the "
				+ "\nThe Angle in south. In the west is the Great East Road."
				+ "\nThe familiar smell of troll is in the air, wafting "
				+ "\nwestward from the Trollshaws in the east.";
		strings[22] = "To the north is the Prancing Pony Inn, a three story "
				+ "\nbuilding with many windows. Above the arch entrance is lamp "
				+ "\nilluminating the sign with a fat white pony rearing on its "
				+ "\nhind legs. Westward lies the great east road, leading back to "
				+ "\nBuckland. In the east is the rest of Bree.";
				
//bad moves. Moves that don't progress the story.		except for some, like badMoves[12] or [5]
		
		badMoves[1] = "All around you is valley. You're lost. Return to the "
				+ "\nshire.";//type (return to shire) --> strings[8]
		badMoves[6] = "Trees have obstructed your view completed. You are lost. "
				+ "\nReturn to the shire."; //LOST IN FOREST 
		
		//badMoves in the east
		badMoves[15] = ""; //valley north of strings13
		badMoves[16] = "THE BARROW DOWNS"
				+ "\nNothing more than hills and rock lie to the near south and "
				+ "\neast. In the West you hear the creaking of trees and the "
				+ "\nsongs of birds. In the north is the Great East Road.";
		//This is if you go west from shire:
		badMoves[0] = "To your north is a valley, to your south is a valley, to "
				+ "\nyour east is your home in Hobbiton and to your west is a "
				+ "\nvalley.";//east goes to string8, west|north|south --> badMoves1
		
		//This is if you go south from shire:
		badMoves[4] = "To your north is your home in Hobbiton, to your east is a "//south from strings8
				+ "\nsmall forest, to your nwest is the White Downs, a series of "
				+ "\nlow hills and nothing else, and to the south is a valley.";
		badMoves[5] = "You are in a small forest, with trees obstructing all "
				+ "\nviews except to the north, where a small clearing may be "
				+ "\nseen. Some glimmering object is on the floor.";//east from badMoves4(south) //not really a badmove.
		badMoves[12] = "You look closer at the object. It is a necklace, probably "
				+ "\na family heirloom."
				+ "\n\n'Necklace' has been added to your inventory."
				+ "\n\nYou are in a small forest, with trees obstructing all views "
				+ "\nexcept to the north, where a small clearing may be seen."; //connected to badmoves5
		
		//This is if you go north from shire:
		badMoves[3] = "You enter your home. You have taken all of the supplies. "
				+ "\nYou should get going.";//same options from 4, 6 and 9: loops to 7
		
		//this is if you go south from brandywine bridge.
		badMoves[7] = "You're walking along river bank. To your west is a small"
				+ "\nforest, to your east the river, to the south is the river"
				+ "\nbank, and to the north is the bridge to Buckland.";
		badMoves[9] = "You're walking along the river bank. To your west is valley,"
				+ "\nto the north is the river, to the south is Brandywine Bridge,"
				+ "\nand east of you is the river.";
		badMoves[11] = "River bank stuff";
		//if you go north from the road to buckland
		badMoves[8] = "You've fallen into river and hit your head on a rock."
				+ "\n"
				+ "\nSorry, you have died.";
		
		//other stuff
		badMoves[13] = "You take a drink from the fountain. You feel more energetic "
				+ "\nand your mouth is no longer dry. "
				+ "\nYour health is 100."
				+ "\nThe road to Bree lies to the east, and the"
				+ "\nroad to Brandywine Bridge lies to your west. To your south is "
				+ "\nthe Old Forest, filled with strange spirits and swaying trees. "
				+ "\nTo the north is a vast valley, filled with hills and nothing "
				+ "\nelse.";
		badMoves[14] = "UNWELCOMING HOUSE"
				+ "\nThe windows are shut and bolted, the curtains are drawn. The "
				+ "\ndoor lies infront of you, locked for sure. Your are at the "
				+ "\nsouth side of the house.";
		
//inside the Old Forest
		oldForest[0] = "foresttt";
		
//Weathertop,  Amon Sûl
		weathertop[0] = "";
		
//prancing pony inn
		prancing[0] = "THE PRANCING PONY INN"
				+ "\nInside the Prancing Pony Inn, all is loud and lively. The tall "
				+ "\nhumans stumble past you and the loud dwarves are busy with "
				+ "\ntheir ale. Behind the bar is Bob and Nob serving pints of mead. "
				+ "\nA shaggy old man with a plump gut walks up to you and greets "
				+ "\nyou."
				+ "\n\n\"Hello there hobbit, fine evenin'. Barliman Butterbur, "
				+ "\npleased to meet your acquaintance... By any chance, have you"
				+ "\nfound any necklace on your way over to Bree? It was me mum's"
				+ "\nand it's soon to belong to some crook if I don't get it soon."
				+ "\nI'll reward you. I've got some coin.\""
				+ "\n\n[y]es, I have it right here in my satchel."
				+ "\n\n[n]o, sorry. Didn't see anything."
				+ "\n";
		prancing[1] = "\"You're in luck, Barliman,\" you say with a chuckle and a"
				+ "\ngrin. \"I found this in the small forest south of Hobbiton.\""
				+ "\nYou reach into your satchel and grab the necklace. Barliman"
				+ "\nButterbur's face lights up and he laughs. You hand him the "
				+ "\nnecklace."
				+ "\n\n\"Thank you, hobbit. This is all I've got on me at the"
				+ "\nmoment. If it were later in the evening and more o' these men"
				+ "\nwere drinking, perhaps your reward would be greater. I'm "
				+ "\nafraid I have to head back to the bar. Thank you once more, "
				+ "\ncome back anytime for a round on me.\""
				+ "\n\nHe digs in his pockets, takes out 10 silver pennies and puts"
				+ "\nthem in your hand. The door is behind you.";
		prancing[2] = "\"Sorry, I don't have your necklace,\" you say to Barliman."
				+ "\n\"I saw your sign on my way here, where do you think you lost it?\""
				+ "you ask curiously."
				+ "\n\n\"I lost in somewhere in that small forest south of Hobbiton. I"
				+ "\nsearched and search but found nothing. If you see it, I'll be"
				+ "\nright here.\""
				+ "\n\nBarliman walks over to Bob and Nob behind the bar. The door is"
				+ "\nbehind you. ";
		prancing[3] = "\"Yes, I've got it right here in my satchel,\" you say to him."
				+ "\nYou reach your hand in your satchel and find no necklace. You"
				+ "\nsmile awkwardly back at him and say \"it seems I don't have your"
				+ "\nnecklace after all...\" Barliman Butterbur frowns at you."
				+ "\n\n\"You make me sad, hobbit. If you find it again, I'll be here.\""
				+ "\n\nThe old man walks back to Bob and Nob behind the bar. The door is"
				+ "\nbehind you.";
		prancing[4] = "\"Sorry old man, I haven't got your necklace,\" you say, lying."
				+ "\n\n\"Very well then, hobbit. I'll be here if you find it\""
				+ "\n\nHe walks over to Nob and Bob behind the bar. The door is behind"
				+ "\nyou.";
	}//constorter
}//class

