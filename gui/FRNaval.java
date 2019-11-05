package gui;

import regras.CtrlRegras;
import regras.Fachada;

import javax.swing.*;
import java.awt.*;

public class FRNaval extends JFrame {

	public FRNaval(Fachada f) {
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		int x=sl/2 - sl/8;
		int y=sa/2 - sa/8;

        setBounds(x,y,sl/4,sa/4);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Box caixa = new Box(BoxLayout.Y_AXIS);

		caixa.add(Box.createVerticalGlue());
		caixa.add(new PNInicio(f,this));
		caixa.add(Box.createVerticalGlue());

		getContentPane().add(caixa);

		setTitle("Batalha Naval");
	}
	
	public static void main(String args[]) {
		(new FRNaval(Fachada.getFachada())).setVisible(true);
	}
}
