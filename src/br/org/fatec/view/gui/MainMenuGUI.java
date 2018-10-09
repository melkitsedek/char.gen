package br.org.fatec.view.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.org.fatec.view.*;

public class MainMenuGUI extends JFrame implements Observer, ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton createCharacterBtn, loadCharacterBtn, createGroupBtn, loadGroupBtn;
	String message;
	
	public MainMenuGUI() {
		this.setTitle("Main menu");
		this.setLayout(new BorderLayout());
		
		createCharacterBtn = new JButton(); 
		createCharacterBtn.addActionListener(this);
		createCharacterBtn.setText("Create character");
		createCharacterBtn.setSize(50, 20);
		this.add(createCharacterBtn, BorderLayout.NORTH);
		 
		
		loadCharacterBtn = new JButton();
		loadCharacterBtn.addActionListener(this);
		loadCharacterBtn.setText("Load character");
		loadCharacterBtn.setSize(50, 20);
		this.add(loadCharacterBtn, BorderLayout.SOUTH);
		
		
		createGroupBtn = new JButton();
		createGroupBtn.addActionListener(this);
		createGroupBtn.setText("Create group");
		createGroupBtn.setSize(50, 20);
		this.add(createGroupBtn, BorderLayout.EAST);
		 
		
		loadGroupBtn = new JButton(); 
		loadGroupBtn.addActionListener(this);
		loadGroupBtn.setText("Load group");
		loadGroupBtn.setSize(50, 20);
		this.add(loadGroupBtn, BorderLayout.WEST);
		
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(createCharacterBtn))
			message = ("Create character.");
		if (event.getSource().equals(loadCharacterBtn))
			message = ("Load character.");
		if (event.getSource().equals(createGroupBtn))
			message = ("Create group.");
		if (event.getSource().equals(loadGroupBtn))
			message = ("Load group.");
		display();
	}

	@Override
	public void update() {
		
		
	}
	
	private void display() {
		System.out.println(message);

	}

}
