package com.company;

interface  camera2 {
    void recordVideo();

    private void greet() {
        System.out.println(" good morning");
    }

    default void record4kVideo() {
        greet();
        System.out.println("recording 4k videos");
    }
}
    interface WiFi{
        void connectToNetwork(String network );
        String [] getNetwork();
    }

class MyCellPhone2{
    void callNumber(long phoneNumber){
        System.out.println("Calling.."+ phoneNumber );
    }
    void PickUp(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements camera2, WiFi {
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

public class CWH_59_polymorphism {
    public static void main(String[] args) {
      //  MyCellPhone c= new MyCellPhone();
       MySmartPhone2 s = new MySmartPhone2();
        String [] ar = s.getNetwork();
        for ( String item :ar) {
            System.out.println(item);
        }
        camera2 cam1=  new MySmartPhone2();
     //   s.connectToNetwork("Redmi 6A");
     //   s.recordVideo();
      //  s.takeSnap();
      //  s.callNumber(96962058);
     //   s.record4kVideo();
        cam1.recordVideo();
        cam1.record4kVideo();
    }
}
