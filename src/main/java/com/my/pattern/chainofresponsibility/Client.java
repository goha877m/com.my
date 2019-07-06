package com.my.pattern.chainofresponsibility;
public class Client {
        public static void main(String[] args) {
            //������������쵼
            GroupLeader groupLeader = new GroupLeader();
            DirectorLeader directorLeader = new DirectorLeader();
            ManagerLeader managerLeader = new ManagerLeader();
            Boss boss = new Boss();

            //������һ���쵼�������
            managerLeader.nextHandler = groupLeader.nextHandler = directorLeader.nextHandler = boss;

            //���뱨��
            managerLeader.handleRequest(251);
        }
}
