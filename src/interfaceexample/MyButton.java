 package interfaceexample;

public class MyButton implements ButtonClickListener, ButtonLongClickListener {

    @Override
    public void onClick() {
        System.out.println("MyButton Clicked.");
    }

    @Override
    public void onLongClicked() {
        System.out.println("MyButton Long Clicked.");
    }
    
}
