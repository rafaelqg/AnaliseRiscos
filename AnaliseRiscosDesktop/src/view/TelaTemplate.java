package view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaTemplate<E> extends JFrame {
	protected E estado;
	
	public TelaTemplate() {
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		this.setSize(new Dimension(220, 140));
	}
	
	public void setEstado(E e) {
		this.estado = e;
	}
	protected abstract void lerEstado();
	
	protected  abstract void atualizaEstado();
	
	public void exibe() {
		this.setVisible(true);
	}
}
