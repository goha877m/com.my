package command;
/**
 * Create by zhaihongwei on 2018/3/30
 * �ͻ��˶���
 */
public class Client {

    public static void main(String[] args) {
        // ����С��ͬѧ
        XiaoAi xiaoAi = new XiaoAi();
        // ��������ĵȶ����൱�ھ�������������
        Light light = new Light();
        // �����˿��Ƶ�������������ķ�����
        System.out.println("С��ͬѧ���Ұѵƿ�һ�£�");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        // С��ͬѧ���ܵ����㷢��������,��ִ������
        xiaoAi.setCommand(lightOnCommand);
        xiaoAi.doCommand();

        System.out.println("-------------------------------------------------");
        System.out.println("С��ͬѧ���ҹ�һ�µƣ�");
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        xiaoAi.setCommand(lightOffCommand);
        xiaoAi.doCommand();

    }
}
