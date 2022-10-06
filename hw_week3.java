import java.util.*;

class hsrClass implements Runnable
{
    static int hsr=10000;
    int thsr;
    Thread t;

    hsrClass(String name)
    {
        thsr=0;
        t=new Thread(this, name);
        t.start();
    }

    public void run()
    {
        while (grabhsr()==true)
        {
            thsr++;
            // System.out.println(t.getName()+"賣掉"+thsr+"張票");
        }
        System.out.println(t.getName()+"賣掉"+thsr+"張票");
    }

    private synchronized static boolean grabhsr()
    {
        if(hsr>0)
        {
            hsr--;
            return true;
        }
        else 
            return false;
    }

}


public class hw_week3 
{
    public static void main(String[] args)
    {
        hsrClass a = new hsrClass("機器一");
        hsrClass b = new hsrClass("機器二");
        hsrClass c = new hsrClass("機器三");
        hsrClass d = new hsrClass("機器四");
        

    }
}
