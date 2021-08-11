/**
 * @class Triangle
 */
public class Triangle {

    private int a;
    private int b;
    private int c;

    /**
     *
     * @param a
     * @param b
     * @param c
     */
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *
     * @return si no es un triangulo "NOT_A_TRIANGLE", si es un triangulo retorna el tipo
     * de triangulo "EQUILATERAL_TRIANGLE" o "ISOSCELES_TRIANGLE" o "SCALENE_TRIANGLE"
     */
    public String trianlgeType(){
        if(this.a+this.b <= this.c || this.a+this.c <= this.b || this.b+this.c <= this.a)
            return "NOT_A_TRIANGLE";
        else if(this.a==this.b && this.b==this.c)
            return "EQUILATERAL_TRIANGLE";
        else if(this.a==this.b || this.b==this.c || this.a==this.c)
            return "ISOSCELES_TRIANGLE";
        else
            return "SCALENE_TRIANGLE";
    }

}