package chapter6;

class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    double volumeTwo() {
        return width * height * depth;
    }

    double volumeThree() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volumeFour() {
        return width * height * depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volumeFive() {
        return width * height* depth;

    }
}


