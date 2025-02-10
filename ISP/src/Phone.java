public interface Phone {
    void showTime();
    void answerCall();
    //void record4kVideo();//If normal phones are implementing this interface the
    //client is forced to implement this method too which violates ISP
}
