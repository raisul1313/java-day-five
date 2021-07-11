package interfaceexample;

import javafx.scene.AccessibleAttribute;

public class IntMain {

    public static void main(String[] args) {
        MyButton btn = new MyButton(); //Class object 
        btn.onClick();
        btn.onLongClicked();
        
        System.out.println("");
        ButtonClickListener bcl = new MyButton(); //child input in pareant
        ButtonLongClickListener blcl = new MyButton();
        bcl.onClick();
        blcl.onLongClicked(); 
        
        System.out.println(""); // Annonymus Class
        ButtonClickListener listener1 = new ButtonClickListener() {
            @Override
            public void onClick() {
                System.out.println("Defult Click Behaviour.");
            }
        };
        listener1.onClick();
        
    }
    
}
