package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Movement implements MouseListener, MouseMotionListener {
    private int X,Y;

    public Movement(JPanel panel){
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        X = e.getX();
        Y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        e.getComponent().setLocation(e.getX()+e.getComponent().getX()-X,e.getY()+e.getComponent().getY()-Y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}