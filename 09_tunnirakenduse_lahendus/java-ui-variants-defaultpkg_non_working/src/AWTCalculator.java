import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTCalculator extends Frame {

    public static final String OP_ADD = "+";
    public static final String OP_SUB = "-";
    public static final String OP_MUL = "*";
    public static final String OP_DIV = "/";

    public static void main(String[] args) {
        AWTCalculator c = new AWTCalculator();
    }

    public AWTCalculator() {
        Font f = new Font("SansSerif", Font.BOLD, 20);

        TextField aField = new TextField("2");
        aField.setFont(f);

        TextField bField = new TextField("3");
        bField.setFont(f);

        TextField ansField = new TextField();
        ansField.setFont(f);

        Choice opChoice = new Choice();
        opChoice.add(OP_ADD);
        opChoice.add(OP_SUB);
        opChoice.add(OP_MUL);
        opChoice.add(OP_DIV);
        opChoice.setFont(f);

        Button calcButton = new Button("Calculate");
        calcButton.setFont(f);
        calcButton.addActionListener(e -> {
            int a = Integer.parseInt(aField.getText());
            int b = Integer.parseInt(bField.getText());

            String opVal = opChoice.getSelectedItem();
            if (OP_ADD.equals(opVal)) {
                ansField.setText("" + (a + b));
            } else if (OP_SUB.equals(opVal)) {
                ansField.setText("" + (a - b));
            } else if (OP_MUL.equals(opVal)) {
                ansField.setText("" + (a * b));
            } else if (OP_DIV.equals(opVal)) {
                ansField.setText("" + (a / b));
            }
        });

        add(aField);
        add(bField);
        add(opChoice);
        add(calcButton);
        add(ansField);

        setLayout(new GridLayout(0, 1));

        setSize(400, 400);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
