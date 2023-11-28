package ex03;

//Second way is quiet longer...
//As it's dividing its responsibility to Runnable space, This will be good code :)

class SMIFileRunnable implements Runnable{
    @Override
    public void run() {
        //subtitles diving in lol
        String[] subtitles = {"one","two","three","four","five"};
        for(int i=0;i<subtitles.length;i++){
            System.out.println(" - subtitle -> " + subtitles[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class VideoFileRunnable implements Runnable{
    @Override
    public void run() {
        int[] frame = {1,2,3,4,5};
        for(int i=0;i<frame.length;i++)
        {
            System.out.println("- video frame -> " + frame[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SecondWayToMakeThread {
    public static void main(String[] args) {

    }
}
