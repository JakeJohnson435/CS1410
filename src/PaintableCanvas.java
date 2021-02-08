

import java.awt.Color;

//Important Notes
//Double click the algoritharium.jar file to load the gui
//Create a new picture, or load a picture
//Select Code -> Load and your DrBsPaintableCanvas.class file

//Eclipse should auto-compile every time you save your file

//Select Code -> Reload if you add methods, but otherwise, you probably shouldn't have to

public class PaintableCanvas {

    public static void main(String[] args) {

    int x = 999;
    int [] array = new int[1];
    array[0] = 999;

    zero(x);
    zero(array);

System.out.print(x);
System.out.print(array[0]);
}



    public static void zero(int [] array)
    {
        array[0] = 0;

    }

    public static void zero (int x)
    {
        x=0;
    }
}

