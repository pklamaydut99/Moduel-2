package lop_va_doi_tuong.fan;

public class Bai3 {
    //             Fan             
    //-------------------------------
    // - SLOW: int                 
    // - MEDIUM: int               
    // - FAST: int                 
    // - speed: int                
    // - on: boolean               
    // - radius: double            
    // - color: String             
    //-------------------------------
    // + getSpeed(): int           
    // + setSpeed(speed: int): void 
    // + isOn(): boolean           
    // + setOn(on: boolean): void  
    // + getRadius(): double       
    // + setRadius(radius: double): void 
    // + getColor(): String        
    // + setColor(color: String): void 
    // + Fan()                     
    // + toString(): String        
    //-------------------------------
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);  // Gán tốc độ lớn nhất (FAST)
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);  // Quạt ở trạng thái bật

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("red");
        fan2.setOn(false);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
