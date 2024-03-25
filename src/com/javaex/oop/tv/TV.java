package com.javaex.oop.tv;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	
	//생성자 : channel, volume, power의 초기값 각각 7, 20, false
	public TV() {
		this(7,20,false);
	}
	
	//생성자 : 초기값 설정
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//getter 메서드
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	//TV 전원 제어
	public void power(boolean on) {
		power = on;
	}
	
	//채널 변경
	public void channel(int channel) {
		if (channel>=1 && channel <=255)
			this.channel = channel;
	}
	
	//채널 증가 또는 감소
	public void channel(boolean up) {
		if (up) {
            if (channel < 255)
                channel++;
        } else {
            if (channel > 1)
                channel--;
        }
	}
	
	// 볼륨 설정
    public void volume(int volume) {
        if (volume >= 0 && volume <= 100)
            this.volume = volume;
    }

    // 볼륨 증가 또는 감소
    public void volume(boolean up) {
        if (up) {
            if (volume < 100)
                volume++;
        } else {
            if (volume > 0)
                volume--;
        }
    }

    // TV 정보 출력
    public void status() {
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
        System.out.println("Power: " + (power ? "On" : "Off"));
    }
	
	
}