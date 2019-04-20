
public class Inside {
    public static void main(String[] args) { //takes data given and initializes it
        double[] ptX = { 1, 2, 3, 4 };
        double[] ptY = { 1, 2, 3, 4 };
        double[] circleX = { 0, 5 };
        double[] circleY = { 0, 5 };
        double[] circleRadius = { 3, 3 };
        double[] rectLeft = { -2.5, -2.5 };
        double[] rectTop = { 2.5, 5.0 };
        double[] rectWidth = { 6.0, 5.0 };
        double[] rectHeight = { 5.0, 2.5 };

        System.out.println(" --- Report of Points and Circles ---\n"); //prints title with newline
        for (int i = 0; i < 2 ; i++) { //cycles through each circle and points
            for (int j = 0; j < 4; j++) {
                isPointInsideCircle(ptX[j], ptY[j], circleX[i], circleY[i], circleRadius[i]);
            }
        }
        System.out.println(" \n--- Report of Points and Rectangles ---\n");
        for (int i = 0; i < 2 ; i++) { //cycles through rectangles and points
            for (int j = 0; j < 4; j++) {
                isPointInsideRectangle(ptX[j], ptY[j], rectLeft[i], rectTop[i], rectWidth[i], rectHeight[i]);
            }
        }
        reportCircle(3.0,2.0,5);
    }
    static void reportPoint ( double x, double y){
        System.out.printf("Point( %.1f, %.1f )", x,y); //returns a single point statement
    }
    static void reportCircle ( double x, double y, double r){ // returns a single circle statement
        System.out.printf("Circle( %.1f, %.1f) Radius: %.1f", x,y,r);
    }
    static void reportRectangle ( double left, double top, double width, double height){ //returns a single rectangle statement
        System.out.printf("Rectangle(%.1f, %.1f, %.1f, %.1f)", left,top , left+ width, top - height);
    }
    static boolean isPointInsideCircle ( double ptX, double ptY, double circleX, double circleY, double circleRadius) { //mathmatically finds if point is inside circle
        double distanceX = ptX - circleX;
        double distanceY = ptY - circleY;
        double distanceFromCenter = java.lang.Math.sqrt(distanceX * distanceX + distanceY * distanceY); // find the hypotenuse of the triangle formed by x and y's
        if (distanceFromCenter < circleRadius) {
            System.out.printf("Point ( %.1f , %.1f ) is inside the Circle( %.1f , %.1f ) Radius: %.1f \n", ptX, ptY, circleX, circleY, circleRadius);
            return true;
        } else {
            System.out.printf("Point ( %.1f , %.1f ) is outside the Circle( %.1f , %.1f ) Radius: %.1f \n", ptX, ptY, circleX, circleY, circleRadius);
            return false;
        }
    }
    static boolean isPointInsideRectangle ( double ptX, double ptY, double rLeft, double rTop, double rWidth, double rHeight) //mathmatically finds if point is inside a rectangle
    {
        boolean xLimit = false;
        boolean yLimit = false;
        if (rLeft < ptX && ptX < (rLeft + rWidth)) { //tests horizontal limits of the point
            xLimit = true;
        }
        if (rTop > ptY && ptY > (rTop - rHeight)) {// tests vertical limits of the point
            yLimit = true;
        }
        if (xLimit && yLimit) { //returns true if the point is within horizontal and vertical limits.
            System.out.printf("Point (%.1f , %.1f ) is inside Rectangle ( %.1f, %.1f , %.1f, %.1f) \n", ptX, ptY, rLeft, rTop, rWidth, rHeight);
            return true;
        } else { //reports false for any other value
            System.out.printf("Point (%.1f , %.1f ) is outside Rectangle ( %.1f, %.1f , %.1f, %.1f) \n", ptX, ptY, rLeft, rTop, rWidth, rHeight);
            return false;
        }
    }
}

