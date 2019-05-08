/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author clt
 */
public class load {
 public   Map<String,Customer > custmer = new HashMap<String, Customer>();
 public  Map<String, Artwork> ArtWork =new HashMap<String,Artwork>();
  public  List <owner> admin = new ArrayList<>(); 
    
     public BufferedImage read_images(File file ) throws IOException{
      BufferedImage image = null; 
      image = ImageIO.read(file);
      return image ;
    }
    public void load_owner () throws FileNotFoundException, IOException{
    File file = new File("E:\\Final l Final\\Final\\src\\art\\gallery\\owner.txt");
    BufferedReader br; 
        
            br = new BufferedReader(new FileReader(file));
             String st; 
             
      while ((st = br.readLine()) != null) 
        {  
      String [] line =st.split("@");;
        
       owner admin1 =new owner(line[0], line[1]);
       admin.add(admin1);
        }
        br.close();
    
    }
 public void load_customer() throws FileNotFoundException, IOException{
      File file = new File("E:\\Final l Final\\Final\\src\\art\\gallery\\custmer.txt");
    BufferedReader br; 
        
            br = new BufferedReader(new FileReader(file));
             String st; 
             
      while ((st = br.readLine()) != null) 
        {  
      String [] line =st.split("@");;
        
       Customer cust =new Customer(line[0], line[1],line[2],Double.valueOf(line[3]));
       custmer.put(line[0], cust);
        }
        br.close();
    
    }
    public void write_Customer(load l) throws IOException
    {  
         File file = new File("E:\\Final l Final\\Final\\src\\art\\gallery\\custmer.txt");
         FileWriter fileWritter = new FileWriter(file,false);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         for (Customer C : l.custmer.values()){
       
         bw.write(C.Name);
         bw.write("@");
         bw.write(C.Password);
         bw.write("@");
         bw.write(C.getAddress());
         bw.write("@");
         bw.write(String.valueOf(C.getTotal_price()));
         bw.newLine();
         }
         bw.close();
    }
       public void  add_Artwork(load l) throws IOException{
      File file = new File("E:\\Final l Final\\Final\\src\\art\\gallery\\artist.txt");
         FileWriter fileWritter = new FileWriter(file,false);
         BufferedWriter bw = new BufferedWriter(fileWritter);
        for (Artwork art : l.ArtWork.values()){
           
           bw.write(art.getA().Name);
           bw.write("@");
           bw.write(art.getA().Birthplace);
           bw.write("@");
           bw.write(String.valueOf(art.getA().Age));
           bw.write("@");
           bw.write(art.getA().Category);
           bw.newLine();
          
               bw.write(art.getTitle());
               bw.write("@");
               bw.write(String.valueOf(art.getYear()));
               bw.write("@");
               bw.write(String.valueOf(art.getPrice()));
               bw.write("@");
               bw.write(art.getDescription());
               bw.write("@");
               bw.write(String.valueOf(art.getLike()));
                bw.write("@");
               bw.write(String.valueOf(art.getDislike()));
                bw.write("@");
               bw.write(String.valueOf(art.getCount()));
               bw.newLine();
        }
                    
       bw.close();
    }
    public void load_Art() throws FileNotFoundException, IOException
     {
          File file = new File("E:\\Final l Final\\Final\\src\\art\\gallery\\artist.txt");
    BufferedReader br; 
        
            br = new BufferedReader(new FileReader(file));
            String st; 
             
      while ((st = br.readLine()) != null) 
        {  
      String [] line =st.split("@") ;;
       Artist A =new Artist(line[0], line[1],Integer.valueOf(line[2]),line[3]);
      
       st = br.readLine();
       String [] line2 = st.split("@");;
       Artwork Art = new Artwork(A, Integer.valueOf(line2[1]), line2[0], Double.valueOf(line2[2]), line2[3], Integer.valueOf(line2[4]),Integer.valueOf(line2[5]),Integer.valueOf(line2[6]));
       
        ArtWork.put(Art.getTitle(), Art);
      
        }
        br.close();
     }
    }
    
    

