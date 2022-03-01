package Lab5;
import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled, Date dateCreated){
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
   }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;

    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\n" + "color: " + color + " " + "and  filled: " + filled;
    }
    
}
