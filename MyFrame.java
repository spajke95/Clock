
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aca
 */
public class MyFrame extends JFrame{
    //Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My clock program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        
        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        dayFormat=new SimpleDateFormat("EEEE");
        dateFormat=new SimpleDateFormat("MMMMM dd, yyyy");
        
        timeLabel=new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(Color.green);
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
       
        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Ink free",Font.PLAIN,35));
        
        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Ink free",Font.PLAIN,25));
        
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        
        setTime();
    }
    public void setTime(){
        while(true){
            time=timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            
            day=dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            
            date=dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
