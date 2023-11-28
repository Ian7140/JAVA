package ex02;
//subtitle
class SMIFileThread extends Thread{
    @Override
    public void run(){
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
//video frame
class VideoFileThread extends Thread{
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

public class FirstWayToMakeThread {
    public static void main(String[] args) {
        //double thread -> play at the same time
        Thread VideoFileThread = new VideoFileThread();
        //play thread by created object
        VideoFileThread.start();

        Thread smiFileThread = new SMIFileThread();
        smiFileThread.start();
        //playing at the same time....WHY?
    }
}
