package ex04;
//Third way -> MOST USED!
//It's runnable interface either. But, it's using anonymous interface.

public class ThirdWayToMakeThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
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
        });

        Thread thread2 = new Thread(new Runnable() {
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
        });

        thread1.start();
        thread2.start();
    }
}
