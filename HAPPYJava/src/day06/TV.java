package day06;

public class TV {
    private boolean power;
    private int channel;

    public TV(boolean power, int channel) {
        this.power = power;
        this.channel = channel;
    }

    public void togglePower() {
        power = !power;
        if (power) {
            System.out.println("전원이 켜졌습니다.");
        } else {
            System.out.println("전원이 꺼졌습니다.");
        }
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
        System.out.println("채널을 " + channel + "번으로 변경했습니다.");
    }

    public static void main(String[] args) {
        TV tv = new TV(true, 5);
        tv.togglePower();
        tv.changeChannel(5);
    }
}
