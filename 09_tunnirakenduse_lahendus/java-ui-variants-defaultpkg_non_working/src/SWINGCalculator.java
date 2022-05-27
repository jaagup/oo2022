import javax.swing.*;
import java.awt.*;

public class SWINGCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SWINGCalculator::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        Font f = new Font("SansSerif", Font.BOLD, 20);

        JTextField aField = new JTextField("2");
        aField.setHorizontalAlignment(SwingConstants.RIGHT);
        aField.setFont(f);

        JTextField bField = new JTextField("3");
        bField.setHorizontalAlignment(SwingConstants.RIGHT);
        bField.setFont(f);

        JTextField ansField = new JTextField();
        ansField.setHorizontalAlignment(SwingConstants.RIGHT);
        ansField.setFont(f);

        JComboBox<Operation> opCombo = new JComboBox<>();
        opCombo.setFont(f);
        opCombo.addItem(new OpAdd());
        opCombo.addItem(new OpSub());
        opCombo.addItem(new OpMul());
        opCombo.addItem(new OpDiv());

        JButton calcButton = new JButton("Calculate");
        calcButton.setFont(f);
        calcButton.addActionListener(e -> {
            int a = Integer.parseInt(aField.getText());
            int b = Integer.parseInt(bField.getText());
            ansField.setText("" + ((Operation) opCombo.getSelectedItem()).operate(a, b));
        });

        JFrame frame = new JFrame("SWINGCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();
        BoxLayout boxLayout = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(boxLayout);

        pane.add(aField);
        pane.add(bField);
        pane.add(opCombo);
        pane.add(calcButton);
        pane.add(ansField);

        frame.pack();
        frame.setVisible(true);
    }

    static abstract class Operation {
        private final String title;
        Operation(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }

        abstract int operate(int a, int b);
    }
    static class OpAdd extends Operation {
        OpAdd() {
            super("+");
        }
        int operate(int a, int b) {
            return a + b;
        }
    }
    static class OpSub extends Operation {
        OpSub() {
            super("-");
        }
        int operate(int a, int b) {
            return a - b;
        }
    }
    static class OpMul extends Operation {
        OpMul() {
            super("*");
        }
        int operate(int a, int b) {
            return a * b;
        }
    }
    static class OpDiv extends Operation {
        OpDiv() {
            super("-");
        }
        int operate(int a, int b) {
            return a / b;
        }
    }
}
