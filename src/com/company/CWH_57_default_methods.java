package com.company;
interface  camera{
        void  takeSnap();
        void recordVideo();
private void greet(){
        System.out.println(" good morning");
        }
   default void record4kVideo() {
    greet();
        System.out.println("recording 4k videos");
    }
interface WiFi{
     void connectToNetwork(String network );
       String [] getNetwork();
}
} class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling.."+ phoneNumber );
    }
    void PickUp(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements camera, camera.WiFi {
    public void takeSnap() {
        System.out.println("Taking Your Photo");
    }

    public void recordVideo() {
        System.out.println("Recording your video");
    }
   public void connectToNetwork(String network){

        System.out.println("Connected to :"+ network);
    }
  public   String [] getNetwork(){
        String []  networkList = {"Harry","Redmi 6A","ViVo612"};
        return networkList;
    }
}
public class CWH_57_default_methods {
    public static void main(String[] args) {
MyCellPhone c= new MyCellPhone();
MySmartPhone s = new MySmartPhone();
String [] ar = s.getNetwork();
        for ( String item :ar) {
            System.out.println(item);
        }
s.connectToNetwork("Redmi 6A");
s.recordVideo();
s.takeSnap();
s.callNumber(96962058);
s.record4kVideo();
    }
}
