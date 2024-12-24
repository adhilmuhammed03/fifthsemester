import java.applet.Applet;
import java.awt.*;

class p19 extends Applet {
    private int x, y, width, height;
    private Color rectColor;

    public void init() {
        // Retrieve parameters from the HTML file
        String xParam = getParameter("x");
        String yParam = getParameter("y");
        String widthParam = getParameter("width");
        String heightParam = getParameter("height");
        String colorParam = getParameter("color");

        // Parse parameters
        x = Integer.parseInt(xParam);
        y = Integer.parseInt(yParam);
        width = Integer.parseInt(widthParam);
        height = Integer.parseInt(heightParam);

        // Convert color string to Color object
        rectColor = parseColor(colorParam);
    }
    public void paint(Graphics g) {
        // Set the color and draw the rectangle
        g.setColor(rectColor);
        g.fillRect(x, y, width, height);
    }

    // Helper method to parse color string
    Color parseColor(String colorParam) {
        switch (colorParam.toLowerCase()) {
            case "red":
                return Color.RED;
            case "blue":
                return Color.BLUE;
            default:
                return Color.GRAY; // Default color
        }
    }
}
