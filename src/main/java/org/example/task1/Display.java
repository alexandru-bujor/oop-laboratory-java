package org.example.task1;

public class Display {

    int width;
    int height;
    float ppi;
    public String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m){
        int tsize = this.width*this.height;
        int osize = m.width*m.height;

        if ( tsize > osize ) { System.out.print("The display " + this.model + " is bigger than " + m.model + "\n"); }
        else if (tsize == osize) { System.out.print("The displays are the same size" + "\n");}
        else { System.out.print("The " + m.model + " is bigger than " + this.model + "\n");}
    }

    public void compareWithMonitor(Display m){
        int tsize = this.width*this.height;
        int osize = m.width*m.height;

        if (tsize > osize && this.ppi > m.ppi) {
            System.out.println(this.model + " is both larger and sharper than " + m.model + "." + "\n");
        } else if (tsize < osize && this.ppi < m.ppi) {
            System.out.println(m.model + " is both larger and sharper than " + this.model + "." + "\n");
        } else if (tsize > osize) {
            System.out.println(this.model + " is larger, but " + m.model + " is sharper." + "\n");
        } else if (this.ppi > m.ppi) {
            System.out.println(this.model + " is sharper, but " + m.model + " is larger." + "\n");
        } else {
            System.out.println(this.model + " and " + m.model + " are either similar or vary only slightly." + "\n");
        }
    }


    public void compareSharpness(Display m){

        float tsize = this.ppi;
        float msize = m.ppi;

        if ( tsize > msize ) { System.out.print("The display " + this.model + " has more ppi than  " + m.model + "\n"); }
        else if (tsize == msize) { System.out.print("The displays are at the same ppi." + "\n");}
        else { System.out.print("The " + m.model + " has more ppi than " + this.model + "\n");}

    }

}
