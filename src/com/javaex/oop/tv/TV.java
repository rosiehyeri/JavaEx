package com.javaex.oop.tv;

//채널 범위 : 1~255
//볼륨 범위 : 0~100
public class TV {

	//실수
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_CHANNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자 : channel, volume, power의 초기값 각각 7, 20, false
	public TV() {
		this(7,20,false);
		//this.channel = 7;
		//this.volume = 20;
		//this.power = false; 라고 해도됨
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
	public boolean isPower() {		//boolean은 getter를 is로 쓰는 것이 관례
		return power;
	}
	
	//TV 전원 제어
	public void power(boolean on) {
		this.power = on;
	}
	
	//채널 변경 메서드
	public void channel(int channel) {
		if (channel>=MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel; }
		//범위를 벗어나면 채널 변경을 하지 않는다.
	}
	
	//채널 변경 메서드 (오버로딩)
	public void channel(boolean up) {
		if (up) {
            if (this.channel < MAX_CHANNEL) 		// 최대 채널에 도달하지 않음
                this.channel++;
        } else {
        	if (this.channel > MIN_CHANNEL)			// 최소 채널에 도달하지 않음
                this.channel--;
        }
   
	}
	
	// 볼륨 조절 메서드
    public void volume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME)
            this.volume = volume;
    }

    // 볼륨 조절 메서드 (오버로딩)
    public void volume(boolean up) {
        if (up) {
            if (this.volume < MAX_VOLUME)		// 최대 볼륨에 도달하지 안흠
                this.volume++;
        } else {		
            if (this.volume > MIN_VOLUME)		// 최소 볼륨에 도달하지 않음  
                this.volume--;
        }
    }

    // TV 정보 출력
    public void status() {
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
        System.out.println("Power: " + (power ? "On" : "Off"));
    }
	
	
}