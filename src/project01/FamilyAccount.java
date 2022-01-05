package project01;

/**
 * @author ：KITE
 * @description：TODO
 * @date ：2022/1/5 13:40
 */
public class FamilyAccount {
    public static void main(String[] args) {



        //定义一个布尔型的变量用于while()循环
        boolean isFlag = true;


        //


        int balance = 1000;

        //用于存放收支明细信息
        String details = (" " + "\t\t" + balance + "\t\t" + " " + "\t\t" + " " + "\n");


        while (isFlag) {

            //设置控制台界面
            System.out.println("--------家庭收支记账本--------\n");
            System.out.println("        1 收支明细");
            System.out.println("        2 登录收入");
            System.out.println("        3 登录支出");
            System.out.println("        4 退   出\n");
            System.out.print("        请选择（1-4）");

            //获取用户的选择1-4
            char keyBoard = Utility.readMenuSelection();
            switch (keyBoard) {
                case '1':
                    System.out.println("--------当前收支明细记录--------");
                    System.out.println("收支\t账户金额\t收支金额\t说  明");
                    System.out.println(details);
                    System.out.println("-------------------------------");

                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int in_money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String in_info = Utility.readString();

                    //处理balance
                    balance += in_money;

                    //处理details
                    details += ("收入\t" + balance + "\t" + in_money + "\t\t" + in_info + "\n");
                    System.out.println("----------登记完成----------\n\n");

                    break;
                case '3':
//                    System.out.println(3);
                    System.out.print("本次支出金额：");
                    int out_money = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String out_info = Utility.readString();

                    //处理balance
                    if (out_money > balance) {
                        System.out.println("你的账户余额不足");
                    } else {
                        balance -= out_money;
                    }

                    //处理details
                    details += ("收入\t" + balance + "\t\t" + out_money + "\t\t" + out_info + "\n");
                    System.out.println("----------登记完成----------\n\n");


                    break;
                case '4':
                    System.out.println("是否要确认退出Y/N：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;

            }
//            isFlag = false;
        }


    }
}
