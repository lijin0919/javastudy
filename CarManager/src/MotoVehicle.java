/**
 * ������
 */
public abstract class MotoVehicle {
	private String vehicleId;//���ƺ�
	private String brand;//Ʒ��
	private int perRent;//�����
	public abstract float calRent(int days);//�������
	//public abstract void leaseOutFlow();//�⳵����
	
	public MotoVehicle(){
		
	}
	
	public MotoVehicle(String vehicleId, String brand,int perRent) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.perRent=perRent;
	}

	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPerRent() {
		return perRent;
	}
	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}
}
