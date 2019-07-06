package command;
/**
 * Create by zhaihongwei on 2018/3/30
 * �ص�����
 */
public class LightOffCommand implements Command{

    private Light light;

    /**
     * �����ص������ʱ�򣬴������ĵƶ����ɵƶ�������Լ�
     * @param light
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * ����ĵƶ�������Լ��ĹصƷ���
     */
    public void execute() {
        light.lightOff();
    }
}
