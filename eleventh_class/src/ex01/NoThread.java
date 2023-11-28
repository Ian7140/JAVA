package ex01;

//video program
//subtitles should be shown at the sametime with frames
//have to contain 2 threads
//More than 2 threads will make it faster
// 1. NoThread
public class NoThread {
    public static void main(String[] args) {
        int[] frame = {1,2,3,4,5};
        String[] subtitle = {"안녕하세요","반갑습니다","왜요?","네, 알겠습니다","죄송합니다"};
        for(int i=0;i<frame.length;i++)
        {
            System.out.println("video frame : "+ frame[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(int i=0;i<frame.length;i++)
        {
            System.out.println("subtitle : "+ subtitle[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
