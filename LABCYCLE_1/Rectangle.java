class Rectangle {
    double len, bre, area;

    void setData(double length, double bredth) {
        len = length;
        bre = bredth;
    }

    double getArea() {
        area = len * bre;
        return area;
    }

    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.setData(12.48, 13);
        System.out.println("Area = " + rect.getArea());
    }
}
