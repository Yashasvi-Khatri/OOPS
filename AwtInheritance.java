
		import java.awt.*;
		import java.awt.event.*;

		public class AwtInheritance extends Frame {
		    private Button button;

		    public AwtInheritance(String title) {
		        super(title); // Call the Frame constructor

		        // Create a button
		        button = new Button("Click Me");
		        button.setBounds(50, 50, 100, 30); // Set button position and size

		        // Add the button to the frame
		        add(button);

		        // Set the frame size and layout
		        setSize(300, 200);
		        setLayout(null); // No layout manager
		        setVisible(true); // Make the frame visible

		        // Add a window listener to close the frame when it's closed
		        addWindowListener(new WindowAdapter() {
		            @Override
		            public void windowClosing(WindowEvent e) {
		                dispose(); // Close the frame
		                System.exit(0); // Exit the application
		            }
		        });
		    }

		    public static void main(String[] args) {
		        new AwtInheritance("My AWT Application"); // Create an instance of MyFrame
		    }
		}
