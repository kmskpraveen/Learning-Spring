import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

//public class Triangle implements ApplicationContextAware, BeanNameAware
//public class Triangle implements InitializingBean, DisposableBean
public class Triangle implements Shape
{

//    private List<Point> points;
//
//    public List<Point> getPoints() {
//        return points;
//    }
//
//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }

//    ----------------------------------------------------------------------------------

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private String beanName;

//    ----------------------------------------------------------------------------------


//    public Triangle(Point pt)
//    {
//        this.pointA = pt;
//    }



    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
    return pointB;
}

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

//    ----------------------------------------------------------------------------------

//    private String type;
//    private int height;
//
//    public Triangle(String type, int height)
//    {
//        this.type = type;
//        this.height =  height;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public void draw()
//    {
//        System.out.println(getType()+" triangle is drawn of height "+getHeight());
//    }

//    ----------------------------------------------------------------------------------
    public void draw()
    {
        System.out.println("Point A: ("+getPointA().getX()+", "+getPointA().getY()+")");
        System.out.println("Point B: ("+getPointB().getX()+", "+getPointB().getY()+")");
        System.out.println("Point C: ("+getPointC().getX()+", "+getPointC().getY()+")");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean initialized through abstraction");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean destroyed through abstraction");
//    }

//    @Override
//    public void setApplicationContext(ApplicationContext context) throws BeansException {
////        Triangle tri = (Triangle) context.getBean(beanName);
//        System.out.println("=11=======");
//        System.out.println(pointA.toString());
////        System.out.println(pointB.toString());
////        System.out.println(pointC.toString());
//
////        tri.draw();
//    }
//
//    @Override
//    public void setBeanName(String beanName) {
////        this.beanName = beanName;
////        System.out.println("=22=======");
////        System.out.println(beanName);
//    }
//    ----------------------------------------------------------------------------------

//    public void draw() {
//        for (Point point : points) {
//            System.out.println("Point: (" + point.getX() + ", " + point.getY() + ")");
//        }
//    }
//    ----------------------------------------------------------------------------------
}
