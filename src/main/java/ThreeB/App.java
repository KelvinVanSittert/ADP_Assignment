package ThreeB;

/**
 * @Author Jaco De Beer
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("ADP3 Assignment1");

        //Adding two random numbers between 0 and 20
        int firstValue = (int) (Math.random()*20);
        int secondValue = (int) (Math.random()*20);
        System.out.println(firstValue + " + " + secondValue +" = "+(firstValue+secondValue));
    }
}
