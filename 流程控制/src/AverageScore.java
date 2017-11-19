import java.util.*;
public class AverageScore{
	/**
	 * ͳ��80������ѧ������
	 */
    public static void main(String[] args){
    	int score;             //ÿ�ſεĳɼ�
     	int sum = 0;           //�ɼ�֮��
     	double avg = 0.0;      //ƽ����
    	Scanner input = new Scanner(System.in);
    	System.out.print("����ѧ������: ");
    	String name = input.next(); 	
        for(int i = 0; i < 5; i++){  	//ѭ��5��¼��5�ſγɼ�
    	     System.out.print("������5�Ź����е�" + (i+1) + "�ſεĳɼ��� ");
    	     score = input.nextInt();  	//¼��ɼ�
    	     sum = sum + score;        	//����ɼ���
    	}
    	avg = (double)sum / 5;                  //����ƽ����
    	System.out.println(name + "��ƽ�����ǣ�" + avg);
    }
}

