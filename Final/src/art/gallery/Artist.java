/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

/**
 *
 * @author clt
 */
/**
 * 
 * Artist class  carries all the information about artists
 */
public class Artist {
 /** Artist's name */   
 String Name;
 /** Artist's birthplace*/
 String Birthplace;
 /** Artist's Age*/
 int Age;
 /** Artist's category*/
 String  Category  ;

 
/** A default constructor */
    public Artist() {
    }
 /**Constructor that fills in the artist's data */
 Artist (String Name  ,String Birthplace ,int Age ,String   Category )
 {
    this.Name=Name;
    this.Birthplace=Birthplace;
    this.Age=Age;
    this.Category=Category;
}
 
  
}
/** Artwork class carries artwork's data */
class Artwork
{
  private Artist A;
  private  int Year;
private String Title;
 private Double Price;
private String description;
private int like=0;
private int dislike=0;
private int count;

    public Artist getA() {
        return A;
    }

    public void setA(Artist A) {
        this.A = A;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
  
/** Artwork constructor that fills in artwork's data*/
Artwork ( Artist A ,int Year  ,String Title ,Double Price, String description, int like, int dislike ,int count)
{
    this.A=A;
    this.Year=Year;
    this.Title=Title;
    this.Price=Price;
    this.description=description;
    this.like=like;
    this.dislike=dislike;
    this.count=count;
 
}
}
