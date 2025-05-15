import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Questao3 extends JFrame {

    private JSlider slider;
    private JProgressBar progressBar;
    private JLabel valorLabel;

    public Questao3() {
        setTitle("Questão 3 - Slider e ProgressBar");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(slider.getValue());
        progressBar.setStringPainted(true);

        valorLabel = new JLabel("Valor atual: " + slider.getValue(), JLabel.CENTER);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = slider.getValue();
                progressBar.setValue(valor);
                valorLabel.setText("Valor atual: " + valor);
            }
        });

        add(slider);
        add(progressBar);
        add(valorLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Questao3();
            }
        });
    }
}
