import java.time.format.DateTimeFormatter;

public class Triangle {

    private float base;
    private float altura;
    private float area;

    public Triangle (float base, float altura){
        this.base = base;
        this.altura = altura;
    }


    public float getArea(){
        area = (base * altura) / 2f;
        return area;

    }

    public void setBase(float base){
        this.base = base;

    }

    public void setAltura(float altura){
        this.altura = altura;

    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }



}
