import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Okno extends JFrame {

	private JPanel contentPane;
	public static final int CANVAS_WIDTH = 700;
	public static final int CANVAS_HEIGHT = 400;
	public static final Color CANVAS_BG_COLOR = Color.WHITE;
	
	private String imgLokalitaFilename = "images\\";
	private Image imgLokalita;
	
	private MapaSveta mapaSveta;
	private JLabel lblNewLabel;
	private JPanel panel;
	private MapCanvas canvas;
	
	Random rn = new Random();
	ArrayList<NPC> npcArray = new ArrayList<>();
	String npc = "";
	JLabel lblNPC;
	HashMap<Integer, Predmet> predmety = new HashMap<Integer, Predmet>();
	ArrayList<Predmet> predmetArray = new ArrayList<>();
	int pocet;
	JLabel lblPredmet;
	String predmet = "";
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		

		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno frame = new Okno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void spustBtn(int poradi) {
		if(!mapaSveta.jdiNa(poradi)) {
		    		   JFrame frame = new JFrame("Info");
		    		   JOptionPane.showMessageDialog(frame, "Timto smerem nemuzes jit");
		    	   }
		    	   
		    	   try {
		   	    		String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
		   	    		imgLokalita = ImageIO.read(new File(imgLokalitaFilename+poloha+".jpg"));
		   			} catch (IOException e) {
		   				System.out.println("Chybi obrazky");
		   			}
		    	   
		    	   canvas.repaint();
		    	   lblNewLabel.setText(mapaSveta.nazevAktualniPolohy());
		    	   
		    	   int poloha;
		    	   poloha = mapaSveta.aktualniID();
		    	   
		    	   npc="";
			    	   for(int i =0;i<npcArray.size();i++) {
			    		  if(poloha==npcArray.get(i).getId()) {
			    			  npc += npcArray.get(i);
			    		  }
			    	   }
		    	   lblNPC.setText(npc);
		    	   
		    	   
		    	   predmet="";
		    	   for(int i =0;i<predmetArray.size();i++) {
		    		  if(poloha==predmetArray.get(i).getId()) {
		    			  predmet += predmetArray.get(i);
		    			  
		    		  }
		    	   }
		    	   lblPredmet.setText(predmet);    	   
	}
	
	class MapCanvas  extends JPanel {
	      @Override
	      public void paintComponent(Graphics g) {
	         super.paintComponent(g);
	         setBackground(CANVAS_BG_COLOR);
	         Image img = imgLokalita;
	         g.drawImage(img, 0, 0, 700, 400, null);
	         //sprite.paint(g);
	      }
	   }
	
	public Okno() {
		
		Equipment eq1 = new Equipment();
		Inventory in1 = new Inventory();
		Item i1 = new Item("Mec", 5, ItemType.Zbran);
		Item i2 = new Item("Dreveny", 6, ItemType.Stit);
		Item i3 = new Item("Zelezne", 12, ItemType.Brnko);
		Item i4 = new Item("Ruby", 1, ItemType.Amulet);
		Spotrebitel s1 = new Spotrebitel("Hovezi", 500, SpotrebitelskeItems.Maso);
		Spotrebitel s2 = new Spotrebitel("Chleba", 300, SpotrebitelskeItems.Pecivo);
		Spotrebitel s3 = new Spotrebitel("injekce", 80, SpotrebitelskeItems.Leky);
		Spotrebitel s4 = new Spotrebitel("Sily", 100, SpotrebitelskeItems.Lektvar);
		eq1.add(i1);	
		eq1.add(i2);
		eq1.add(i3);
		eq1.add(i4);
		in1.addInv(s1);
		in1.addInv(s2);
		in1.addInv(s3);
		in1.addInv(s4);
		Postava p1 = new Postava("Radek", "Rytíø", eq1, in1);
		System.out.println(p1);
		int was;
		was = sc.nextInt();
		switch (was) {
		case 1: // zautoc
			
			break;
		case 2: // jit dal
			
			break;
		case 3: // jist
			
			break;
		case 4: // nasadit brnko
			
			break;
		default: 
			System.out.println("System.ERROR");
		}
		
		try {
			mapaSveta = MapaSveta.nacti("mapa.csv");
		}catch (IOException e) {
			System.out.println("Chybi mapa");
		}
	    try {
	    	//mapaSveta = MapaSveta.nacti("mapa.csv");
	    	String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
			imgLokalita = ImageIO.read(new File(imgLokalitaFilename+poloha+".jpg"));
		} catch (IOException e) {
			System.out.println("Chybi obrazky");
		}
	    for(int i=0;i<5;i++) {
	    	int idNPC = rn.nextInt(8); 
	    	int zivNPC = rn.nextInt(4)+3;
	    	int utokNPC = rn.nextInt(9)+1;
	    	NPC npc1 = new NPC(idNPC, zivNPC, utokNPC);
	    	npcArray.add(npc1);
	    }
	    
	    int a1 = rn.nextInt(8);
	    int a2 = rn.nextInt(8);
	    int a3 = rn.nextInt(8);
	    int a4 = rn.nextInt(8);
	    int a5 = rn.nextInt(8);
	    int a6 = rn.nextInt(8);
	    predmety.put(0, new Predmet(a1, "Stul", 5));
		predmety.put(1, new Predmet(a2, "Zidle", 2));
		predmety.put(2, new Predmet(a3, "Motyka", 2));
		predmety.put(3, new Predmet(a4, "Leky", 1));
		predmety.put(4, new Predmet(a5, "Hrabe", 2));
	    predmety.put(5, new Predmet(a6, "Lopata", 3));
	    int xx = 0;
	    while(xx<=5) {
	    	predmetArray.add(predmety.get(xx));
	    	xx++;
	    }
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hra");
		pack();           
	    this.setResizable(false);
	    setVisible(true);  
	    requestFocus(); 
		setBounds(100, 100, 800, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		canvas = new MapCanvas();
	    canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
	    panel.add(canvas);
	    
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnSever = new JButton("Sever");
		panel_1.add(btnSever);
		btnSever.addActionListener(new ActionListener() {
		       @Override
		       public void actionPerformed(ActionEvent evt) {
		    	   spustBtn(0);
		       }
		});
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(340);
		panel_1.add(horizontalStrut_2, BorderLayout.WEST);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(340);
		panel_1.add(horizontalStrut_3, BorderLayout.EAST);
		
		Component verticalStrut_6 = Box.createVerticalStrut(10);
		panel_1.add(verticalStrut_6, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnZapad = new JButton(" Z\u00E1pad ");
		panel_2.add(btnZapad);
		btnZapad.addActionListener(new ActionListener() {
		       @Override
		       public void actionPerformed(ActionEvent evt) {
		    	   spustBtn(3);
		       }
		});
		
		Component verticalStrut = Box.createVerticalStrut(190);
		panel_2.add(verticalStrut, BorderLayout.NORTH);
		
		Component verticalStrut_3 = Box.createVerticalStrut(200);
		panel_2.add(verticalStrut_3, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnJih = new JButton("Jih");
		panel_3.add(btnJih);
		btnJih.addActionListener(new ActionListener() {
		       @Override
		       public void actionPerformed(ActionEvent evt) {
		    	   spustBtn(2);
		       }
		});
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		Component verticalStrut_2 = Box.createVerticalStrut(5);
		panel_5.add(verticalStrut_2, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel(mapaSveta.nazevAktualniPolohy());
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel_5.add(lblNewLabel, BorderLayout.CENTER);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(100);
		panel_5.add(horizontalStrut_4, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		lblNPC = new JLabel("");
		panel_6.add(lblNPC);
		
		JPanel panel_7 = new JPanel();
		panel_6.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		lblPredmet = new JLabel("");
		panel_7.add(lblPredmet);
		
		Component horizontalStrut = Box.createHorizontalStrut(340);
		panel_3.add(horizontalStrut, BorderLayout.WEST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(340);
		panel_3.add(horizontalStrut_1, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnVychod = new JButton("V\u00FDchod");
		panel_4.add(btnVychod);
		btnVychod.addActionListener(new ActionListener() {
		       @Override
		       public void actionPerformed(ActionEvent evt) {
		    	   spustBtn(1);
		       }
		});
		
		Component verticalStrut_4 = Box.createVerticalStrut(200);
		panel_4.add(verticalStrut_4, BorderLayout.SOUTH);
		
		Component verticalStrut_5 = Box.createVerticalStrut(190);
		panel_4.add(verticalStrut_5, BorderLayout.NORTH);
		
		
	    
	    

	}
	
}
