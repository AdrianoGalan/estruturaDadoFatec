package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class acaoBtAddAll implements ActionListener {
	
	private JTextField textFieldNome;
	private JButton btnAddTudo;
	
	

	public acaoBtAddAll(JTextField textFieldNome, JButton btnAddTudo) {
	
		this.textFieldNome = textFieldNome;
		this.btnAddTudo = btnAddTudo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btAddAll();
		
	}
	
	private void btAddAll() {
		textFieldNome.setText("");
	}
	

}
