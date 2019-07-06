package command;
/**
 * Create by zhaihongwei on 2018/3/30
 * ��������
 */
public class LightOnCommand implements Command{

    private Light light;

    /**
     * �������������ʱ�򣬴������ĵƶ����ɵƶ�������Լ�
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * ����ĵƶ�������Լ��Ŀ��Ʒ���
     */
    public void execute() {
        light.lightOn();
    }
}
