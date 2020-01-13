
@FunctionalInterface
  interface funInterface
        {
             void  show();

        }
class funInterfaceImpl implements funInterface {
    @Override
    public void show() {

        System.out.println("I M HERE");

    }
}
public  class FunctionalInterFaceEx {


    public static void main(String args[])
    {
        //1.normal way
        funInterface objFun=new funInterfaceImpl();
        objFun.show();

        ////2.Anonymous Class
        funInterface objFun1 = new funInterface() {
            public void show() {
                System.out.println("I M HERE with Anonimous class");
            }};
        objFun1.show();

        //2.using lamda
            funInterface objFu2n = ()-> System.out.println("I M HERE with lamda");
        objFu2n.show();




    }
}
