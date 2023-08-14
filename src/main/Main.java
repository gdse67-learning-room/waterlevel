package main;

import view.AlarmWindow;
import view.MainWindow;
import view.NoticeBoardWindow;
import view.SplitterWindow;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danu
 */
public class Main {
    public static void main(String[] args) {
        
        AlarmWindow aw = new AlarmWindow();
        SplitterWindow sw = new SplitterWindow();
        NoticeBoardWindow nbw = new NoticeBoardWindow();
        
        
        MainWindow mainWindow = new MainWindow(sw, aw, nbw);
        mainWindow.setVisible(true);
        
        aw.setVisible(true);
        sw.setVisible(true);
        nbw.setVisible(true);
    }
}
