/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

/**
 *
 * @author User
 */
public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(){
        this.month = 1;
        this.day = 1;
        this.year = 2000;
    }
    
    public Date(int month, int day, int year){
        if(month >= 1 && month <= 12){
            this.month = month;
            if(month == 2 && year % 4 == 0){
                if(day <= 31 && day >= 1){
                    this.day = day;
                }else{
                    this.day = 1;
                }
            }else if(month == 2 && year % 4 == 1){
                if(day <= 28 && day >= 1){
                    this.day = day;
                }else{
                    this.day = 1;
                }
            }else{
                if(day <= 31 && day >= 1){
                this.day = day;
            }else{
                this.day = 1;
            }
            }
        }else{
            if(day <= 31 && day >= 1){
                this.day = day;
            }else{
                this.day = 1;
            }
            this.month = 1;
        }
        
        if(year >= 1950 && year <= 2023){
            this.year = year;
        }else{
            this.year = 2000;
        }
        
        
        
    }
    
    public int getMonth(){
        return month;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public int getDay(){
        return day;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void displayDate(){
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        return 
                this.month+"/"+this.day+"/"+this.year;
    }
}
