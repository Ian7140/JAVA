package ex01;

//In Button class, there is a method called 'onclick();
//It has a different act when you play 'onclick()'
//If someone calls setOnClickListener,
//the role of 'onclick()' gets clear and works overridden that
//someone defined

class Button
{
    OnClickListener ocl;
    void setOnClickListener(OnClickListener ocl)
    {
        this.ocl = ocl;
    }
    // Take the finished OnClickListener interface from outside
    interface OnClickListener
    {
        void onClick();
        //Why is it abstract method? : We don't know what role
        //would click button get
    }

    void onClick()
    {
        ocl.onClick();
    }
}
public class ButtonAPIExample
{
    public static void main(String[] args)
    {
        //first ex : play some music
        Button btn1 = new Button();
        btn1.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick()
            {
                System.out.println("Playing-");
            }
        });
        btn1.onClick();

        Button btn2 = new Button();
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("NAVER on!");
            }
        });
        btn2.onClick();
    }
}
