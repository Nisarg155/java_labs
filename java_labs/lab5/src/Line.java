public class Line implements RelationInterface{
    double x1 ,x2 ,y1,y2;

    public Line(float x1,float x2,float y1, float y2) {
        this.x1 =  x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    double getLength()
    {
        return Math.sqrt(Math.pow((x2-x1),2) +Math.pow((y2-y1),2));
    }
    @Override
    public boolean isGreater(Line l) {
        return this.getLength() > l.getLength();
    }
    @Override
    public boolean isEqual(Line l) {
        return this.getLength() == l.getLength();
    }
    @Override
    public boolean isLess(Line l) {
        return this.getLength() < l.getLength();
    }
}
