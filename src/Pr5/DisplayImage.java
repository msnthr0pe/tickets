package Pr5;
import javax.swing.*; // Импорт классов из библиотеки Swing для создания графического интерфейса
import java.awt.*; // Импорт классов из библиотеки AWT для работы с графикой

public class DisplayImage extends JFrame { // Объявление класса DisplayImage, который наследует JFrame (окно)

    public DisplayImage(String imagePath) { // Конструктор класса, принимает путь к изображению как аргумент
        setTitle("Image Display"); // Устанавливаем заголовок окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Устанавливаем операцию закрытия окна при нажатии на "крестик"

        ImageIcon imageIcon = new ImageIcon(imagePath); // Создаем объект ImageIcon на основе указанного пути к изображению
        JLabel label = new JLabel(imageIcon); // Создаем метку (label) для отображения изображения

        getContentPane().add(label, BorderLayout.CENTER); // Добавляем метку на панель контента окна в центре

        pack(); // Автоматически подгоняем размер окна под размер изображения
        setLocationRelativeTo(null); // Центрируем окно на экране
    }

    public static void main(String[] args) { // Метод main, начало выполнения программы
        if (args.length != 1) { // Проверяем, передан ли ровно один аргумент (путь к изображению)
            System.out.println("Пожалуйста, укажите путь к картинке в аргументах командной строки."); // Выводим сообщение об ошибке
            return; // Завершаем выполнение программы
        }

        SwingUtilities.invokeLater(() -> { // Запуск кода в потоке диспетчера событий Swing
            String imagePath = args[0]; // Получаем путь к изображению из аргументов командной строки
            DisplayImage frame = new DisplayImage(imagePath); // Создаем экземпляр класса DisplayImage с указанным путем
            frame.setVisible(true); // Делаем окно видимым
        });
    }
}