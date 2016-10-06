package adventureGame;

//Mr. Golanka,
//We're sorry you have to read through this code.
//Good Luck.
//-John and Will
 

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.text.Caret;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class MainWindow {

	AdventureGame class1 = new AdventureGame();
	private JFrame frame;
	ImageIcon hobbitHole = new ImageIcon("hobbiHoleFirstImage.png");
	ImageIcon title = new ImageIcon("theuntoldjourney.png");
	JLabel titleLabel = new JLabel(title);
	String previous = "Error, 'reset' to play again";
	int health = 90;
	int wealth = 2;
	protected String inventory;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}//try catch
			}//run
		});
	}//main

	public MainWindow() {
		initialize();
		
	}//constructor -- cunstorter -- Saradermi Pergenchersi


	
	
	public void initialize() {	
		frame = new JFrame();
		frame.setBounds(100, 5, 800, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setTitle("The Untold Journey");
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		final JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBounds(75, 665, 89, 23);
		panel.add(btnEnter);
		
		final JTextField textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.GREEN);
		textField.setCaretColor(Color.WHITE);
		textField.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		textField.setToolTipText("Enter text here");
		textField.setBounds(175, 650, 436, 57);
		panel.add(textField);
		
		final JTextArea txtrDisplay = new JTextArea();
		txtrDisplay.setText(class1.strings[0]);
		txtrDisplay.setForeground(Color.GREEN);		
		txtrDisplay.setBackground(Color.BLACK);
		txtrDisplay.setEditable(false);
		txtrDisplay.setBounds(175, 350, 436, 300);
		txtrDisplay.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 11));
		panel.add(txtrDisplay);
		
	

		JLabel titleLabel = new JLabel();
		try{
			Image image = ImageIO.read(getClass().getResource("theuntoldjourney.png"));
			titleLabel.setIcon(new ImageIcon(image));
		}catch (IOException ex){		
		}//catch
		titleLabel.setBounds(100, -32, 800, 150);
		titleLabel.setVisible(true);	
		panel.add(titleLabel);
		
		
		final JLabel holdImage = new JLabel();
		try{
			Image img = ImageIO.read(getClass().getResource("HobbitholeFirstImage.png"));
			holdImage.setIcon(new ImageIcon(img));
		}catch (IOException ex){	
		}//catch
		holdImage.setBounds(277, -35, 525, 525);
		panel.add(holdImage);
		holdImage.setVisible(true);
		
		final JLabel mapImage = new JLabel();
		try{
			Image mapimg = ImageIO.read(getClass().getResource("map.png"));
			mapImage.setIcon(new ImageIcon(mapimg));
		}catch (IOException ex){	
		}//catch
		mapImage.setBounds(130, -120, 525, 525);
		panel.add(mapImage);
		mapImage.setVisible(false);
		
		final JLabel oldForestImage = new JLabel();
		try{
			Image forestimg = ImageIO.read(getClass().getResource("oldForest.png"));
			oldForestImage.setIcon(new ImageIcon(forestimg));
		}catch (IOException ex){	
		}//catch
		oldForestImage.setBounds(130, 90, 625, 625);
		oldForestImage.setSize(350, 252);
		panel.add(oldForestImage);
		oldForestImage.setVisible(false);
		
		btnEnter.addActionListener(new ActionListener(/*max was here*/){
			public void actionPerformed(ActionEvent e) {			
				if(txtrDisplay.getText().equals(class1.strings[0])){
					if(textField.getText().contains("c") ||
					textField.getText().contains("begin") || 
					textField.getText().contains("next") ||
					textField.getText().contains("go") ||
					textField.getText().contains("start") ||
					textField.getText().equals("") ||
					textField.getText().contains("ok") ||
					textField.getText().contains("ye")
					){
						txtrDisplay.setText(class1.strings[1]);
						textField.setText("");
						return;
					}//continue
				}//Opts. strings[0]
				
				if(txtrDisplay.getText().equals(class1.strings[1])){
					if(textField.getText().contains("open") || 
					textField.getText().contains("out") ||
					textField.getText().contains("go")
					){
						mapImage.setVisible(true);
						holdImage.setVisible(false);
						txtrDisplay.setText(class1.strings[2]);
						textField.setText("");
						return;
					}//Opening door
					if(textField.getText().contains("lock") ||
					textField.getText().contains("bolt") || 
					textField.getText().contains("secure")
					){
						previous = txtrDisplay.getText();
						txtrDisplay.setText("You fasten the doors shut. You look through the peephole once more."
						+ "\nOn the doormat is a paper.");
						textField.setText("");
						return;
					}//Locking door
				}//Opts. strings[1]
				if(txtrDisplay.getText().equals("You fasten the doors shut. You look through the peephole once more." //if they locked the door and open it
						+ "\nOn the doormat is a paper.")){
					if(textField.getText().contains("open") ||
					textField.getText().contains("go")||
					textField.getText().contains("out")				
					){
						mapImage.setVisible(true);
						holdImage.setVisible(false);
						txtrDisplay.setText(class1.strings[2]);
						textField.setText("");	
						return;
					}
				}
				
				
				if(txtrDisplay.getText().equals(class1.strings[2])){//what does it say?
					//holdImage.setVisible(false);
					//mapImage.setVisible(true);
					if(textField.getText().contains("turn") ||
					textField.getText().contains("flip") ||
					textField.getText().contains("other side") ||
					textField.getText().contains("pick up") ||
					textField.getText().contains("read") ||
					textField.getText().contains("investigate")
					){
						txtrDisplay.setText(class1.strings[3]);
						textField.setText("");
						return;
					}//Turn over map
				}//Opts. strings[2]
				
				if(txtrDisplay.getText().equals(class1.strings[3])){
					if(textField.getText().contains("agre") ||
					textField.getText().contains("ye") ||
					textField.getText().contains("help gandalf") ||
					textField.getText().contains("help him") ||
					textField.getText().contains("sure")||
					textField.getText().contains("certainly")||
					textField.getText().contains("indeed")||
					textField.getText().contains("yup")||
					textField.getText().contains("ok")||
					textField.getText().contains("affirmative")||
					textField.getText().contains("right") ||
					textField.getText().contains("course")
					){
						txtrDisplay.setText(class1.strings[4]);
						class1.inventory.add("Map");
						textField.setText("");
						return;
					}//Agree to help Gandalf
				}//Opts. strings[3]
				
				if(txtrDisplay.getText().equals(class1.strings[4]) || txtrDisplay.getText().equals(class1.strings[6])){
					if(textField.getText().contains("ins") ||
					textField.getText().equals("in") ||
					textField.getText().equals("go in") ||
					textField.getText().contains("house") ||
					textField.getText().contains("tool") ||
					textField.getText().contains("sup")||
					textField.getText().contains("home")||
					textField.getText().contains("return")||
					textField.getText().contains("close door")
					
					){
						txtrDisplay.setText(class1.strings[5]);
						textField.setText("");
						return;
					}//Go inside (to get tools
					
					if(textField.getText().contains("north") ||
					textField.getText().contains("leave") ||
					textField.getText().contains("out")||
					textField.getText().contains("hire")
					){
						txtrDisplay.setText(class1.strings[6]);
						textField.setText("");
						return;
					}
				}//Opts. strings[4] / strings[6]
				
//BRAIN KILLS ITSELF
				if(txtrDisplay.getText().equals(class1.strings[5])){//okay, let's go
					if(textField.getText().contains("all") ||
					textField.getText().contains("everything")
					){
						txtrDisplay.setText(class1.getStuff[12]);
						class1.inventory.add("Sting");
						class1.inventory.add("Flask of water");
						class1.inventory.add("Pouch of coins");
						wealth += 78;
					}
					
					if(textField.getText().contains("sting") ||
					textField.getText().contains("sword") ||
					textField.getText().contains("take sword") ||
					textField.getText().contains("get sword")||
					textField.getText().contains("blade")
					){	
						txtrDisplay.setText(class1.getStuff[0]);
						class1.inventory.add("Sting");
						textField.setText("");
						return;
					}//take sword from all
					
					if(textField.getText().contains("flask") ||
					textField.getText().contains("water")
					){	
						txtrDisplay.setText(class1.getStuff[2]);
						class1.inventory.add("Flask of water");
						textField.setText("");
						return;
					}//take water from all
					
					if(textField.getText().contains("pouch") ||
					textField.getText().contains("coin")
					){			
						txtrDisplay.setText(class1.getStuff[1]);
						class1.inventory.add("Pouch of coins");
						wealth += 78;
						textField.setText("");
						return;
					}//take coins from all
				}//Opts. strings[5]
				
				if(txtrDisplay.getText().equals(class1.getStuff[2])){//took w from cws --> cs
					if(textField.getText().contains("sword")||
					textField.getText().contains("blade")||
					textField.getText().contains("sting")	
					){//take s, c is left
						txtrDisplay.setText(class1.getStuff[7]);
						textField.setText("");
						class1.inventory.add("Sting");
						return;
					}
					
					if(textField.getText().contains("coin") ||
					textField.getText().contains("pouch")
					){//take c, s is left
						txtrDisplay.setText(class1.getStuff[8]);
						textField.setText("");
						class1.inventory.add("Pouch of coins");
						wealth += 78;
						return;
					}		
				}
				
				if(txtrDisplay.getText().equals(class1.getStuff[7])){
					if(textField.getText().contains("coin") ||
					textField.getText().contains("pouch")
					){
						txtrDisplay.setText(class1.getStuff[6]);
						textField.setText("");
						class1.inventory.add("Pouch of coins");
						wealth += 78;
						return;
					}
				}
				if(txtrDisplay.getText().equals(class1.getStuff[8])){
					if(textField.getText().contains("sword") ||
					textField.getText().contains("sting") ||
					textField.getText().contains("blade")
					){
						txtrDisplay.setText(class1.getStuff[9]);
						textField.setText("");
						class1.inventory.add("Sting");
						return;
					}
				}
				
				if(txtrDisplay.getText().equals(class1.getStuff[0])){
					if(textField.getText().contains("flask") ||
					textField.getText().contains("water")
					){
						txtrDisplay.setText(class1.getStuff[5]);
						textField.setText("");
						class1.inventory.add("Flask of water");
						return;
					}//take water from coin + water
					
					if(textField.getText().contains("pouch") ||
					textField.getText().contains("coin")
					){
						txtrDisplay.setText(class1.getStuff[3]);
						textField.setText("");
						class1.inventory.add("Pouch of coins");
						wealth += 78;
						return;
					}//take coins form coin + water
				}//Opts. getStuff[0]

				if(txtrDisplay.getText().equals(class1.getStuff[3])){
					if(textField.getText().contains("water") ||
					textField.getText().contains("flask")
					){
						txtrDisplay.setText(class1.getStuff[4]);
						textField.setText("");
						class1.inventory.add("Flask of water");
						return;
					}//take water from water + coins
				}//Opts. getStuff[3]
				
				if(txtrDisplay.getText().equals(class1.getStuff[5])){
					if(textField.getText().contains("pouch")||
					textField.getText().contains("coin")
					){
						txtrDisplay.setText(class1.getStuff[6]);//took w, c left
						textField.setText("");
						return;
					}//take coins from coins
				}
				
				if(txtrDisplay.getText().equals(class1.getStuff[1])){ // SW
					if(textField.getText().contains("water") ||
					textField.getText().contains("flask")
					){
						txtrDisplay.setText(class1.getStuff[10]);//TAKE W, JUST S LEFT
						textField.setText("");
						class1.inventory.add("Flask of water");
						return;
					}//take water from sword + water
					
					if(textField.getText().contains("sting") ||
					textField.getText().contains("sword") ||
					textField.getText().contains("blade")
					){
						txtrDisplay.setText(class1.getStuff[11]);//TAKE S, JUST W LEFT
						textField.setText("");
						class1.inventory.add("Sting");
						return;
					}//take sword from sword + water
				}
				
				if(txtrDisplay.getText().equals(class1.getStuff[10])){
					if(textField.getText().contains("sword") ||
					textField.getText().contains("sting") ||
					textField.getText().contains("blade")
					){
						txtrDisplay.setText(class1.getStuff[9]);//TAKE B, DONE
						textField.setText("");
						class1.inventory.add("Sting");
						return;
					}
				}
				if(txtrDisplay.getText().equals(class1.getStuff[11])){
					if(textField.getText().contains("water") ||
					textField.getText().contains("flask")
					){
						txtrDisplay.setText(class1.getStuff[4]);
						textField.setText("");
						class1.inventory.add("Flask of water");
						return;
					}
				}
//DONE WITH THE BRAIN KILLING:
				
				if(txtrDisplay.getText().equals(class1.getStuff[4]) ||
				txtrDisplay.getText().equals(class1.getStuff[6]) ||
				txtrDisplay.getText().equals(class1.getStuff[9]) ||
				txtrDisplay.getText().equals(class1.getStuff[12])
				){
					if(textField.getText().contains("leave") ||
					textField.getText().contains("out")||
					textField.getText().contains("going") ||
					textField.getText().contains("shire")
					){
						txtrDisplay.setText(class1.strings[7]);
						textField.setText("");
						return;
					}
				}//if you have all your stuff, go northerino INTO SHIRE
				
				if(txtrDisplay.getText().equals(class1.badMoves[1])){
					if(textField.getText().equals("r") ||
					textField.getText().contains("go") ||
					textField.getText().contains("back")||
					textField.getText().contains("return")||
					textField.getText().contains("shire")
					){
						txtrDisplay.setText(class1.strings[8]);
						textField.setText("");
						return;
					}//continue
				}//when you're lost

				if(txtrDisplay.getText().equals(class1.badMoves[6])){
					if(textField.getText().equals("r") ||
					textField.getText().contains("go") ||
					textField.getText().contains("back")||
					textField.getText().contains("return")||
					textField.getText().contains("shire")
					){
						txtrDisplay.setText(class1.strings[8]);
						textField.setText("");
						return;
					}//continue
				}//when you're lost
//OPTIONS FROM SHIRE:
				if(txtrDisplay.getText().equals(class1.strings[7]) || txtrDisplay.getText().equals(class1.strings[8])){
					if(textField.getText().contains("west") ||
					textField.getText().equals("w") 
					){
						txtrDisplay.setText(class1.badMoves[0]);
						textField.setText("");
						return;
					}//west
					if(textField.getText().contains("south") ||
					textField.getText().equals("s")
					){
						txtrDisplay.setText(class1.badMoves[4]);
						textField.setText("");
						return;
					}//south
					if(textField.getText().equals("e")||
					textField.getText().contains("east")
					){
						txtrDisplay.setText(class1.strings[9]);
						textField.setText("");
					}//east (GOOD
					if(textField.getText().contains("north") ||
					textField.getText().equals("n")
					){
						txtrDisplay.setText(class1.badMoves[3]);
						textField.setText("");
						return;
					}//north
				}//if they go west from strings7 or 8
//NORTH FROM SHIRE:
				if(txtrDisplay.getText().equals(class1.badMoves[3])){
					if(textField.getText().contains("south") ||
					textField.getText().equals("s") ||
					textField.getText().contains("shire")||
					textField.getText().contains("out")||
					textField.getText().contains("going") ||
					textField.getText().contains("shire") ||
					textField.getText().contains("back")
					){
						txtrDisplay.setText(class1.strings[8]);
						textField.setText("");
						return;
					}//set to center if u say go south
				}//if you went north from shire
			
//WEST FROM SHIRE:
				if(txtrDisplay.getText().equals(class1.badMoves[0])){
					if(textField.getText().contains("west") ||
					textField.getText().contains("north")||
					textField.getText().contains("south") ||
					textField.getText().equals("w") ||
					textField.getText().equals("n") ||
					textField.getText().equals("s")
					){
						txtrDisplay.setText(class1.badMoves[1]);
						textField.setText("");
						return;
					}//west --> west || north || south
					if(textField.getText().equals("e") ||
					textField.getText().contains("back") ||
					textField.getText().contains("east") ||
					textField.getText().contains("shire") ||
					textField.getText().contains("return")
					){
						txtrDisplay.setText(class1.strings[8]);
						textField.setText("");
						return;
					}//west --> east
				}//if they go west from strings7

//SOUTH FROM SHIRE:

				if(txtrDisplay.getText().equals(class1.badMoves[4])){
					if(textField.getText().contains("south") ||
					textField.getText().equals("s")||
					textField.getText().equals("w") ||
					textField.getText().contains("west")
					){
						txtrDisplay.setText(class1.badMoves[1]);
						textField.setText("");
						return;
					}//south --> south || west
					if(textField.getText().contains("east") ||
					textField.getText().equals("e")||
					textField.getText().contains("forest")
					){
						txtrDisplay.setText(class1.badMoves[5]);
						textField.setText("");
						return;
					}//south --> east
					if(textField.getText().contains("north") ||
					textField.getText().equals("n")||
					textField.getText().contains("shire")
					){
						txtrDisplay.setText(class1.strings[8]);
						textField.setText("");
						return;
					}//south --> north (back to shire)
				}//gone south from shire
				if(txtrDisplay.getText().equals(class1.badMoves[5])){
					if(textField.getText().contains("south") ||
					textField.getText().equals("s")||
					textField.getText().equals("e")||
					textField.getText().contains("east")
					){
						txtrDisplay.setText(class1.badMoves[6]);
						textField.setText("");
						return;
					}//(south --> east) -- > south || west || north
					if(textField.getText().contains("north") ||
					textField.getText().equals("n")
					){
						txtrDisplay.setText(class1.strings[9]);
						textField.setText("");
						return;
					}//if you're south east and go north
					if(textField.getText().equals("w") ||
					textField.getText().contains("west")
					){
						txtrDisplay.setText(class1.badMoves[4]);
						textField.setText("");
						return;
					}
					if(textField.getText().contains("look")||
					textField.getText().contains("inspect") ||
					textField.getText().contains("inves")||
					textField.getText().contains("obj")||
					textField.getText().contains("gr")||
					textField.getText().contains("fl")||
					textField.getText().contains("take")||
					textField.getText().contains("pick")
					){
						txtrDisplay.setText(class1.badMoves[12]);
						textField.setText("");
						class1.inventory.add("Necklace\n");
						return;
						
					}
				}//if you went south--> east (if you're in forest)
				if(txtrDisplay.getText().equals(class1.badMoves[12])){
					if(textField.getText().contains("south") ||
					textField.getText().equals("s")||
					textField.getText().equals("e")||
					textField.getText().contains("east")
					){
						txtrDisplay.setText(class1.badMoves[6]);
						textField.setText("");
						return;
					}//(south --> east) -- > south || west || north
					if(textField.getText().contains("north") ||
					textField.getText().equals("n")
					){
						txtrDisplay.setText(class1.strings[9]);
						textField.setText("");
						return;
					}//if you're south east and go north
					if(textField.getText().equals("w") ||
					textField.getText().contains("west")
					){
						txtrDisplay.setText(class1.badMoves[4]);
						textField.setText("");
						return;
			
					}
				}//if you went south--> east (if you're in forest)
				
//CORRECT OPTIONS, CONSTANT EAST
				if(txtrDisplay.getText().equals(class1.strings[9])){
					if(textField.getText().contains("east") ||
					textField.getText().equals("e")){
						textField.setText("");
						txtrDisplay.setText(class1.strings[10]);
						return;
						}//east from road to buckland
					
					if(textField.getText().contains("south") ||
							textField.getText().equals("s")){
								textField.setText("");
								txtrDisplay.setText(class1.badMoves[5]);
								return;
								}//south from road to buckland					
					
					if(textField.getText().contains("west") ||
						textField.getText().equals("w")){
							textField.setText("");
							txtrDisplay.setText(class1.strings[8]);
							return;
							}//west from road to buckland	
					if(textField.getText().contains("north") ||
							textField.getText().equals("n")){
								textField.setText("");
								txtrDisplay.setText(class1.badMoves[8]);
								return;
								}//north from road to buckland	
				}
			if(txtrDisplay.getText().equals(class1.strings[10])){
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					textField.setText("");
					txtrDisplay.setText(class1.badMoves[7]);
					return;
			}//south from brandywine bridge
		
				if(textField.getText().equals("n")||
				textField.getText().contains("north")){
					textField.setText("");
					txtrDisplay.setText(class1.badMoves[9]);
					return;
			}//north from brandywine bridge
				if(textField.getText().equals("w")||
						textField.getText().contains("west")){
							textField.setText("");
							txtrDisplay.setText(class1.strings[9]);
							return;
					}//west from brandywine bridge	
				if(textField.getText().equals("e")||
						textField.getText().contains("east")){
							textField.setText("");
							txtrDisplay.setText(class1.strings[11]);
							return;
					}//east from brandywine bridge				
		}//at brandywine bridge
			if(txtrDisplay.getText().equals(class1.strings[11]) ||
			txtrDisplay.getText().equals(class1.badMoves[13])){
				previous = txtrDisplay.getText();
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[12]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[10]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					textField.setText("");
					health += 10;
					txtrDisplay.setText(class1.badMoves[13]);
				}	
				if(textField.getText().equals("n") ||
				textField.getText().contains("north")){
					textField.setText("");
					txtrDisplay.setText(class1.badMoves[14]); //beginning of unwelcoming house
				}	
		}
			if(txtrDisplay.getText().equals(class1.strings[12])){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[13]);
				}
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					textField.setText("");
					txtrDisplay.setText(class1.oldForest[0]);
				}	
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[11]);
				}	
				if(textField.getText().equals("n") ||
				textField.getText().contains("north")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[11]); //north, valley is around you. to the south is the road. CHANGE
				}	
			}
			if(txtrDisplay.getText().equals(class1.strings[13])){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[14]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[12]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					textField.setText("");
					txtrDisplay.setText(class1.badMoves[16]);
				}
				//add north, valley.badmoves15
			}
			if(txtrDisplay.getText().equals(class1.strings[13])){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[14]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[12]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					textField.setText("");
					txtrDisplay.setText(class1.badMoves[16]);
				}
				//add north, valley.badmoves15
			}
			if(txtrDisplay.getText().contains(class1.strings[14])){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[15]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[13]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					textField.setText("");
					txtrDisplay.setText("BREE"
							+ "\nThe shops are closed and there is no point of entry.\n" + (class1.strings[22].replace("BREE"   //this replaces the unnecessary and repeating text.
									+ "\nYou step through the front gate. To the south are a few closed "
									+ "\nshops." , "")));
				}
				if(textField.getText().equals("n") ||
					textField.getText().contains("north")||
					textField.getText().contains("inn")||
					textField.getText().contains("pony")||
					textField.getText().contains("prancing")
						){
							textField.setText("");
							txtrDisplay.setText(class1.prancing[0]);
						}	
				//add north, prancing pony
			}
			
			if(txtrDisplay.getText().equals(class1.prancing[0])){
				if(textField.getText().contains("y") &&
				class1.inventory.contains("Necklace")){
					textField.setText("");
					txtrDisplay.setText(class1.prancing[1]);
					wealth += 10;
				}
				if(textField.getText().contains("n") &&
				!class1.inventory.contains("Necklace")){
					textField.setText("");
					txtrDisplay.setText(class1.prancing[2]);
				}
				if(textField.getText().contains("y") &&
				!class1.inventory.contains("Necklace")){
					textField.setText("");
					txtrDisplay.setText(class1.prancing[3]);
				}
				if(textField.getText().contains("n") &&
				class1.inventory.contains("Necklace")){
					textField.setText("");
					txtrDisplay.setText(class1.prancing[4]);
				}
				textField.addKeyListener(new KeyAdapter(){
					public void keyReleased(KeyEvent e){
						if(e.getKeyCode() == 89 && class1.inventory.contains("Necklace") && txtrDisplay.getText().equals(class1.prancing[0])){ //if they click y
							textField.setText("");
							txtrDisplay.setText(class1.prancing[1]);
							
						}//
						if(e.getKeyCode() == 78 && !class1.inventory.contains("Necklace") && txtrDisplay.getText().equals(class1.prancing[0])){ //if they click n
							textField.setText("");
							txtrDisplay.setText(class1.prancing[2]);
							
						}//
						if(e.getKeyCode() == 89 && !class1.inventory.contains("Necklace") && txtrDisplay.getText().equals(class1.prancing[0])){ //if they click n
							textField.setText("");
							txtrDisplay.setText(class1.prancing[3]);
							
						}//
						if(e.getKeyCode() == 78 && class1.inventory.contains("Necklace") && txtrDisplay.getText().equals(class1.prancing[0])){ //if they click n
							textField.setText("");
							txtrDisplay.setText(class1.prancing[4]);
							
						}//
					}//
				});
			
			}
			if(txtrDisplay.getText().equals(class1.prancing[1]) || 
			txtrDisplay.getText().equals(class1.prancing[2])|| 
			txtrDisplay.getText().equals(class1.prancing[4])|| 
			txtrDisplay.getText().equals(class1.prancing[3])){
				if(textField.getText().contains("leave") ||
				textField.getText().contains("go")||
				textField.getText().contains("s")||
				textField.getText().contains("behind")||
				textField.getText().contains("door")||
				textField.getText().contains("exit")){
					txtrDisplay.setText(class1.strings[14].replace("BREE"
							+ "\nYou step through the front gate. To the south are a few closed "//FINALLY IN BREE
							+ "\nshops. To the north is the Prancing Pony Inn, a three story "
							+ "\nbuilding with many windows. Above the arch entrance is lamp "
							+ "\nilluminating the sign with a fat white pony rearing on its "
							+ "\nhind legs." , ""));
				}
			}
			if(txtrDisplay.getText().contains(class1.strings[14].replace("BREE"
					+ "\nYou step through the front gate. To the south are a few closed "//FINALLY IN BREE
					+ "\nshops. To the north is the Prancing Pony Inn, a three story "
					+ "\nbuilding with many windows. Above the arch entrance is lamp "
					+ "\nilluminating the sign with a fat white pony rearing on its "
					+ "\nhind legs." , ""))){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[15]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[13]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					textField.setText("");
					txtrDisplay.setText("BREE"
							+ "\nThe shops are closed and there is no point of entry.\n" + (class1.strings[22].replace("BREE"   //this replaces the unnecessary and repeating text.
									+ "\nYou step through the front gate. To the south are a few closed "
									+ "\nshops." , "")));
				}
			}
			
			if(txtrDisplay.getText().contains(class1.strings[15])){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[16]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[14]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")||
				textField.getText().contains("north")||
				textField.getText().equals("n")){
					textField.setText("");
					txtrDisplay.setText("BREE"
							+ "\nThe homes are locked and the windows are closed. There are no places to climb"
							+ "\nor jump. They must be asleep.\n" + (class1.strings[15].replace("BREE", ""))); //replace BREE with " ".
				}
			}
			if(txtrDisplay.getText().contains(class1.strings[17])){ //17 is the after 15
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[18]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[15]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					
				}
			}
			if(txtrDisplay.getText().contains(class1.strings[18])){ //17 is the after 15
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[19]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[17]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					
				}
			}
			if(txtrDisplay.getText().contains(class1.strings[19])){ //17 is the after 15
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[20]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[18]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					
				}
			}
			if(txtrDisplay.getText().contains(class1.strings[20])){ //17 is the after 15
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[21]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[19]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					
				}
			}
			if(txtrDisplay.getText().contains(class1.strings[21])){ //17 is the after 15
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[22]);
				}
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[20]);
				}	
				if(textField.getText().equals("s") ||
				textField.getText().contains("south")){
					
				}
			}
//GLOBAL OPTIONS:
			if(txtrDisplay.getText().equals(class1.badMoves[16])){
				if(textField.getText().equals("w") ||
				textField.getText().contains("west")){
					textField.setText("");
					txtrDisplay.setText(class1.oldForest[0]); //may change, to another point in oldforest because of the distance traveled.
				}
				if(textField.getText().equals("n") ||
				textField.getText().contains("north")){
					textField.setText("");
					txtrDisplay.setText(class1.strings[13]);
				}
				//add north and east
			}
			if(txtrDisplay.getText().contains(class1.badMoves[14])){
				if(textField.getText().contains("knock")){
					txtrDisplay.setText("You knock, but there is no response.\n" + class1.badMoves[14]);
				}
				if(textField.getText().contains("window")){
					txtrDisplay.setText("With great effort, you open the windows slightly. There is no room"
							+ "\nfor entrance, but you can hear someone talking. "
							+ "\n" + class1.badMoves[14]);
				}
			}
			if(txtrDisplay.getText().equals(class1.badMoves[9])){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")||
				textField.getText().contains("north")||
				textField.getText().equals("n")
				){
					textField.setText("");
					txtrDisplay.setText(class1.badMoves[8]);
					return;
				}
				if(textField.getText().equals("s") ||
						textField.getText().contains("south")
						){
							textField.setText("");
							txtrDisplay.setText(class1.strings[10]);
							return;
						}
				if(textField.getText().equals("w") ||
						textField.getText().contains("west")
						){
							textField.setText("");
							txtrDisplay.setText(class1.badMoves[1]);
							return;
						}
			}//north from brandywine bridge options
			if(txtrDisplay.getText().equals(class1.badMoves[7])){
				if(textField.getText().equals("e") ||
				textField.getText().contains("east")
				){
					textField.setText("");
					txtrDisplay.setText(class1.badMoves[8]);
					return;
				}
				if(textField.getText().equals("w") ||
						textField.getText().contains("west")
						){
							textField.setText("");
							txtrDisplay.setText(class1.badMoves[5]);
							return;
						}
				if(textField.getText().equals("n") ||
						textField.getText().contains("north")
						){
							textField.setText("");
							txtrDisplay.setText(class1.strings[10]);
							return;
						}
				if(textField.getText().equals("s") ||
						textField.getText().contains("south")
						){
							textField.setText("");
							txtrDisplay.setText(class1.badMoves[11]);
							return;
						}
			}//south from brandywine bridge options	
			
				//ADD: ONLY SET PREVIOUS TO WHAT'S IN THE DISPLAY IF IT IS PART OF THE PATHING AKA IF IT'S ON THE strings[] or getStuff[] arrays
				if(textField.getText().contains("res")){
					txtrDisplay.setText(class1.strings[0]);
					class1.inventory.clear();
					textField.setText("");
					return;
				}//restart
				
				if(textField.getText().contains("qq")){ //MASTER COMMAND, catches up editor
					previous = txtrDisplay.getText();
					class1.inventory.add("Map");
					class1.inventory.add("Sting");
					class1.inventory.add("Flask of water");
					class1.inventory.add("Pouch of coins\n");
					wealth += 78;
					class1.inventory.add("Necklace");
					mapImage.setVisible(true);
					holdImage.setVisible(false);
					txtrDisplay.setText(class1.strings[9]);
					textField.setText("");
					return;
				}//show inventory
				if(textField.getText().contains("back")){
					txtrDisplay.setText(previous);
					textField.setText("");
				}//Go Back
				if(textField.getText().contains("diagnose")){
					previous = txtrDisplay.getText();
					txtrDisplay.setText("Your health is " + health +"."
							+ "\n\nGo back.");
					textField.setText("");
				}
				if(textField.getText().contains("rape")){
					previous = txtrDisplay.getText();
					txtrDisplay.setText("Ahem, that's a strange idea..."
							+ "\n\nGo back.");
					textField.setText("");
				}//Go Back
				if(textField.getText().contains("wank")){
					previous = txtrDisplay.getText();
					txtrDisplay.setText("Now is not that time for that."
							+ "\n\nGo back.");
					textField.setText("");
				}//Go Back
				if(textField.getText().contains("do nothing")){
					previous = txtrDisplay.getText();
					txtrDisplay.setText("We aren't going to get anywhere like this."
							+ "\n\nGo back.");
					textField.setText("");
				}//Go Back
				
				if(textField.getText().contains("help")){
					previous = txtrDisplay.getText();
					txtrDisplay.setText("List of essential commands:"
					+ "\n\n'back' - Returns to previous screen (not always usable)."
					+ "\n'inventory' - Shows contents of inventory."
					+ "\n'reset' - Restarts the game."
					+ "\n'take (item)' - Attempt to add (item) to your inventory."
					+ "\n'drop (item)' - Remove (item) from your inventory."
					+ "\n'use (item) - Attempts to use (item) for something."
					+ "\n'attack (creature) with (item)' - attacks creature with item."
					+ "\n'examine (item)' - Gives brief description of item."
					+ "\n\nGo Back. [Use the 'back' command]"); 
					textField.setText("");
					return;
				}//List of commands (help)
				
				if(textField.getText().contains("examine")){ //examination of items
					previous = txtrDisplay.getText();
					if(textField.getText().contains("ring") &&
					class1.inventory.contains("The One Ring")){
						txtrDisplay.setText("The One Ring:"
						+ "\n\nThe magic ring of invisibility, created by Sauron the "
						+ "\nDark Lord. Inscribed about the ring are the words in elvish"
						+ "\n\n       One Ring to rule them all, One Ring to find them,"
						+ "\n   One Ring to bring them all and in the darkness bind them."
						+ "\n\n Go back.");
					}
				}
				if(textField.getText().contains("inven")){
					previous = txtrDisplay.getText();
					txtrDisplay.setText("You are carrying: " + "\n\n" + class1.inventory + "\n\n"
							+ "Wealth: " + wealth + " coins."
							+ "\nGo Back.");
					textField.setText("");
					return;
				}//show inventory
			
				textField.setText("");
			}//actionPerformed
			});//ActionListener
		
		textField.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){
				if(e.getKeyCode() == 10){
					btnEnter.doClick();
				}//if it's the Enter Button
			}//keyReleased
		});//KeyListenerForEnter
		
	
		
		
	}//initialize
}//classlass