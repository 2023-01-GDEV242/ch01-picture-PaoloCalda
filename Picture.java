/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Paolo Caldaro
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square door;
    private Square shed;
    private Triangle roof;
    private Triangle shedroof;
    private Circle sun;
    private Person man;
    private Square eye;
    private Square mouth;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        mouth = new Square();
        eye = new Square();
        door = new Square();
        shed = new Square();
        roof = new Triangle();
        shedroof = new Triangle();
        sun = new Circle();
        man = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-180);
            wall.moveVertical(-40);
            wall.changeSize(130);
            wall.makeVisible();
            
            mouth.moveHorizontal(-100);
            mouth.moveVertical(160);
            mouth.changeSize(130);
            mouth.makeVisible();
            
            shed.changeColor("red");
            shed.moveHorizontal(-10);
            shed.moveVertical(-40);
            shed.changeSize(130);
            shed.makeVisible();
            
            door.changeColor("black");
            door.moveHorizontal(-140);
            door.moveVertical(0);
            door.changeSize(50);
            door.makeVisible();
            
            eye.changeColor("black");
            eye.moveHorizontal(30);
            eye.moveVertical(0);
            eye.changeSize(50);
            eye.makeVisible();
            
            roof.changeColor("blue");
            roof.changeSize(60, 180);
            roof.moveHorizontal(-25);
            roof.moveVertical(-110);
            roof.makeVisible();
            
            shedroof.changeColor("blue");
            shedroof.changeSize(60, 180);
            shedroof.moveHorizontal(150);
            shedroof.moveVertical(-110);
            shedroof.makeVisible();
            
            sun.changeColor("blue");
            sun.moveHorizontal(10);
            sun.moveVertical(100);
            sun.changeSize(80);
            sun.makeVisible();
            
            man.changeColor("black");
            man.changeSize(20, 20);
            man.moveHorizontal(0);
            man.moveVertical(65);
            man.makeVisible();
    
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        door.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        door.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
