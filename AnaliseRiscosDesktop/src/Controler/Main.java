package Controler;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.NumericShaper;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import view.EstadoTelaAnaliseRisco;
import view.EstadoTelaBhaskara;
import view.TelaAnaliseRisco;
import view.TelaBhaskara;

public class Main {

	public static void main(String[] args) {
		TelaAnaliseRisco <EstadoTelaAnaliseRisco> tb = new TelaAnaliseRisco <EstadoTelaAnaliseRisco>();
		tb.setEstado(new EstadoTelaAnaliseRisco());
		tb.exibe();	
	}
	


}
