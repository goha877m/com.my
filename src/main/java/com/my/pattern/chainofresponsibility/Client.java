package com.my.pattern.chainofresponsibility;
public class Client {
        public static void main(String[] args) {
            //构造各个级别领导
            GroupLeader groupLeader = new GroupLeader();
            DirectorLeader directorLeader = new DirectorLeader();
            ManagerLeader managerLeader = new ManagerLeader();
            Boss boss = new Boss();

            //设置上一级领导处理对象
            managerLeader.nextHandler = groupLeader.nextHandler = directorLeader.nextHandler = boss;

            //申请报销
            managerLeader.handleRequest(251);
        }
}
