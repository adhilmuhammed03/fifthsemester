import java.awt.*;
import java.awt.event.*;

class p20 extends Frame {
    List listBox;
    TextField inputField;
    Button addButton, removeButton;

    public p20() {
        // Create UI components
        listBox = new List();
        inputField = new TextField(20);
        addButton = new Button("Add");
        removeButton = new Button("Remove");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(new Label("Item:"));
        add(inputField);
        add(addButton);
        add(removeButton);
        add(listBox);

        // Add button functionality
        addButton.addActionListener(e -> {
            String item = inputField.getText().trim();
            if (!item.isEmpty()) {
                listBox.add(item);
                inputField.setText("");
            }
        });

        // Remove button functionality
        removeButton.addActionListener(e -> {
            String selectedItem = listBox.getSelectedItem();
            if (selectedItem != null) {
                listBox.remove(selectedItem);
            }
        });

        // Window close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        // Frame settings
        setTitle("List Box App");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new p20();
    }
}
