package command;
/**
 * Create by zhaihongwei on 2018/3/30
 * С��ͬѧ
 */
public class XiaoAi {

    private Command command;

    /**
     * ���þ��������
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * ִ������
     */
    public void doCommand() {
        command.execute();
    }
}
