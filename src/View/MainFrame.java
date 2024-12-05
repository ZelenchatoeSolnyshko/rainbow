package View;

import Controller.RainbowController;
import Model.RainbowModel;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Rainbow Builder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Создаем модель
        RainbowModel model = new RainbowModel();

        // Создаем панель и контроллер
        RainbowPanel panel = new RainbowPanel();
        RainbowController controller = new RainbowController(model, panel);

        // Устанавливаем контроллер для панели
        panel.setController(controller);

        // Добавляем верхнюю панель инструментов
        JToolBar toolBar = new JToolBar();
        JButton generateButton = new JButton("Generate Rainbow");
        generateButton.addActionListener(e -> controller.generateRainbow());
        toolBar.add(generateButton);
        add(toolBar, "North"); // Добавляем на верхнюю часть окна

        // Добавляем основную панель
        add(panel);

        setVisible(true);
    }
}