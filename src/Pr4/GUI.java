package Pr4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame {
    private int milanWins = 0;
    private int madridWins = 0;
    private String lastScorer = "N/A";
    JLabel lbl1 = new JLabel("Result: "+ madridWins+ " X "+milanWins);
    JLabel lbl2 = new JLabel("Last Scorer: " + lastScorer);
    JLabel lbl3 = new JLabel("Winner: " + winner());
    JButton madrid = new JButton("Real Madrid");
    JButton milan = new JButton("AC Milan");
    public GUI() {
        super("Game");

        setLayout(new GridLayout());
        setLayout(new GridLayout(1,5));
        add(milan);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(madrid);

        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridWins+=1;
                lastScorer = "Madrid";
                lbl1.setText("Result: "+ madridWins+ " X "+milanWins);
                lbl2.setText("Last Scorer: " + lastScorer);
                lbl3.setText("Winner: " + winner());
            }
        });
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanWins+=1;
                lastScorer = "Milan";
                lbl1.setText("Result: "+ madridWins+ " X "+milanWins);
                lbl2.setText("Last Scorer: " + lastScorer);
                lbl3.setText("Winner: " + winner());
            }
        });
        setSize(800, 500);
        setVisible(true);
    }
    private String winner(){
        if (madridWins == milanWins){
            return "Draw";
        } else if (madridWins > milanWins) {
            return "Madrid";
        } else {
            return "Milan";
        }
    }
    public static void main(String[] args) {
        new GUI();
    }
}
