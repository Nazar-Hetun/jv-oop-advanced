package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, sides: "
                + firstLeg + " and " + secondLeg + " units, color: " + color);
    }
}
