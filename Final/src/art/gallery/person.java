/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author clt
 */
abstract public class person {
    
   protected String Name;
   protected String Password;
    person(){
       Name="";
      Password="";
   }
   person(String Name,String Password){
       this.Name=Name;
       this.Password=Password;
   }
    abstract public boolean Login(String Name ,String Password );
}

 class owner extends person {
public owner()
     {
         super();
     }
     @Override
     public boolean Login(String Name ,String Password )
     { boolean exists = false;
        load l=new load ();
        try {
            l.load_owner();
        } catch (IOException ex) {
            Logger.getLogger(form1.class.getName()).log(Level.SEVERE, null, ex);
        }
           for (int i =0 ; i <l.admin.size() ; i ++)
           {  
           owner owner1 = l.admin.get(i);
           String name, pass;
           name=owner1.Name;
           pass=owner1.Password;
           if (name.equals(Name)&&pass.equals(Password))
           {
               exists=true;
               break;
           }
           }                 
             if (exists==true)
             return true;
               return false; 
          
     }
   
     public owner(String Name, String Password)
     {
         super(Name,Password);
     }
     public boolean Adding_Artwork( load l ,Artwork item) throws IOException
     {    l.load_Art();
     if (l.ArtWork.containsKey(item.getTitle()))
         return true;
     else return false;
     
     }
     public  List <Customer> Customers_info(load l)
     {   
              List <Customer> Customers_info= new ArrayList<>();

         for (String key : l.custmer.keySet()) {
            Customers_info.add(l.custmer.get(key));
             }
     return Customers_info;
  }
     
 }
class Customer extends person{
private String Address;
private double Total_price;
public Customer (){
    super();
    Address ="";
    Total_price=0.0;
}

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getTotal_price() {
        return Total_price;
    }

    public void setTotal_price(double Total_price) {
        this.Total_price = Total_price;
    }
Customer (String Name,String Password,String Address,double Total_price){
    super(Name,Password);
    this.Address=Address;
    this.Total_price=Total_price;
}
    @Override
    public boolean Login(String Name, String Password) {
        load l=new load ();
        try {
            l.load_customer();
        }
        catch (IOException ex) {
            Logger.getLogger(form1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if(l.custmer.containsKey(Name))
            {
                 
               Customer Value = l.custmer.get(Name);
               
               String x=Value.Password;
                if(x.equals(Password))
                 return true;
                else
                    return false;
               
            }
            else
                   return false;
   
    }
    
    public  void Buy_anyitem (Double item_price,Customer c) throws IOException
    {
        load l= new load();
        l.load_customer();
        c.setTotal_price(c.getTotal_price()+item_price);
        l.custmer.put(c.Name, c);
        l.write_Customer(l);
    }
    public void Customer_Register(Customer c, load l){
    
    l.custmer.put(c.Name, c);
    }
}


