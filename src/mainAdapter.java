public class mainAdapter {

    public static void main (String [] args)
    {
        System.out.println("enter your xml code : ");
        jsonclass js = new jsonclass();
        System.out.println(js.convert("<h1>Note</h1> " ));

    }
}
