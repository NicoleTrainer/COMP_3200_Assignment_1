import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a canvas containing randomly generated shapes.
 */
class Ccanvas {
    private List<CShape> randomShapesList; //List to store randomly generated shapes.

    /**
     * Constructs a canvas and generates random shapes to populate it.
     */
    public Ccanvas() {
        this.randomShapesList = new ArrayList<>();
        randomShapes();
    }

    /**
     * Generates random shapes and add them to the canvas.
     */
    private void randomShapes() {
        Random random = new Random();


        while (randomShapesList.size() < 10) { //Generates random shapes until the list contains 10 shapes.
            CShape cShape = null;
            int shapeRan = random.nextInt(4); //Four possible random shapes.

            switch (shapeRan) {

                case 0: //Shape is a circle.
                    cShape = new CCircle(random.nextInt(100) + 1); // Radius of random circle is between 1 and 100.
                    break;
                case 1: //Shape is an oval.
                    cShape = new COval(random.nextInt(100) + 1, random.nextInt(100) + 1); //Horizontal radius and vertical radius of oval is between 1 and 100.
                    break;
                case 2: //Shape is a rectangle.
                    cShape = new CRectangle(random.nextInt(100) + 1, random.nextInt(100) + 1); // Length and width of random rectangle is between 1 and 100.
                    break;
                case 3: //Shape is a square.
                    cShape = new CSquare(random.nextInt(100) + 1); //Side length of random square is between 1 and 100.
                    break;
                default:
                    break;

            }
            if (!(randomShapesList.contains(cShape))) { //Add generated shape to list if it is not already present.
                randomShapesList.add(cShape);
            }
        }

    }

    /**
     * Displays shape details of the shapes populating the canvas.
     */
    public void displayShapeDetails() {
        for (CShape cShape : randomShapesList) {
            System.out.print("Shape " + (cShape.getId() + 1) + ": ");

            switch (cShape.getClass().getSimpleName()) {

                //Determine shape type then display details accordingly.
                case "CCircle":
                    CCircle circle = (CCircle) cShape;
                    System.out.println("CIRCLE " + circle.getHorizontalRadius());
                    break;

                case "COval":
                    COval oval = (COval) cShape;
                    System.out.println("OVAL " + oval.getHorizontalRadius() + "x" + oval.getVerticalRadius());
                    break;

                case "CRectangle":
                    CRectangle rectangle = (CRectangle) cShape;
                    System.out.println("RECTANGLE " + rectangle.getLength() + "x" + rectangle.getWidth());
                    break;

                case "CSquare":
                    CSquare square = (CSquare) cShape;
                    System.out.println("SQUARE " + square.getLength() + "x" + square.getWidth());
                    break;

                default:
                    break;
            }
        }
    }


}
