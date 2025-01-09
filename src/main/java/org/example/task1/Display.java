package org.example.task1;

public class Display {

    int width;
    int height;
    float ppi;
    String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m){
        int tsize = this.width*this.height;
        int osize = m.width*m.height;

        if ( tsize > osize ) { System.out.print("The display " + this.model + " is bigger than " + m.model); }

    }

    void compareWithMonitor(Display m){

    }


    void compareSharpness(Display m){

    }

}
