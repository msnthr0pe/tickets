package Pr5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationExample extends JFrame {
    private ImageIcon[] frames;
    private int currentFrameIndex;
    private JLabel animationLabel;

    public AnimationExample() {
        setTitle("Пример анимации");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        frames = new ImageIcon[2];
        frames[0] = new ImageIcon("C:\\Users\\ZBVF\\Downloads\\catbop1.png");
        frames[1] = new ImageIcon("C:\\Users\\ZBVF\\Downloads\\catbop2.png");

        currentFrameIndex = 0;

        animationLabel = new JLabel(frames[currentFrameIndex]); // Создаем метку с первым кадром
        getContentPane().add(animationLabel, BorderLayout.CENTER);

        // Создаем таймер для обновления кадров анимации
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Переключаемся на следующий кадр
                currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrameIndex]); // Устанавливаем новый кадр
            }
        });

        timer.start(); // Запускаем таймер

        setLocationRelativeTo(null); // Центрируем окно
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnimationExample example = new AnimationExample();
                example.setVisible(true);
            }
        });
    }
}