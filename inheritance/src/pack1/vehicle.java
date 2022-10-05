/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author 92333
 */
public class vehicle {
     protected String regno;
    protected String make;
    protected String model;
    protected int year;
    
    public vehicle()
    {
        regno = "-";
        make = "-";
        model = "-";
        year = 0;
    }
    public vehicle(String r, String mk, String md, int y)
    {
        regno = r;
        make = mk;
        model = md;
        year = y;
    }
    public void set(String r, String mk, String md, int y)
    {
        regno = r;
        make = mk;
        model = md;
        year = y;
    }    
    public void show()
    {
        System.out.println(regno);
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }
    
}
