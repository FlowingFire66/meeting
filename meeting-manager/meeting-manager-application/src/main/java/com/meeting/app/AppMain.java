package com.meeting.app;

import com.meeting.command.AgendaCommand;
import com.meeting.command.UserCommand;
import com.meeting.pojo.User;
import com.meeting.utils.HelpPrint;
import com.meeting.utils.JSonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * User: FlowingFire
 * Date: 2017/9/21 0021
 * Time: 22:28
 * Description:
 */
//项目运行入口
public class AppMain {
    private final static Logger logger = LoggerFactory.getLogger(AppMain.class);
    public static void main(String[] args) {
        //d25252
        UserCommand userCommand=new UserCommand();
        AgendaCommand agendaCommand=new AgendaCommand();
        //用来表示是否登陆，及显示当前用户信息1
        User user=null;
        logger.debug("程序开始执行！");
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if("end".equals(s)){
                break;
            }else{
                if(s!=null){
                    String[] arg = s.split(" ");
                    switch (arg[0]){
                        case "login":
                           user=userCommand.loginOptions(arg);
                           //System.out.println(user);
                           break;
                        case "register":
                            userCommand.registerOptions(arg);
                            break;
                        case "findAllUsers":
                            userCommand.findAllUsersOptions(arg);
                            break;

                        case "lgout":
                            userCommand.lgout(arg);
                            break;
                        case "deleteMe":                                          //Urms
                            System.out.println("输入y确定删除/输入n取消");
                            String s1 = scanner.nextLine();
                            while(!"y".equals(s1)&&!"n".equals(s1)){
                                System.out.println("输入错误请重新输入");
                                //System.out.println("输入y确定/n取消");
                                s1 = scanner.nextLine();
                            }

                            if ("y".equals(s1)) {
                                System.out.println("成功删除用户！");             //Urms
                                userCommand.deleteMe(arg);
                            }else if("n".equals(s1)){                             //Urms
                                System.out.println("取消删除！");
                            }
//                            userCommand.loginOptions(arg);
                            break;
                        case "createAgenda":
                            agendaCommand.createAgenda(arg);
                            break;
                        case "invite":
                            agendaCommand.invite(arg);
                            break;
                        case "deletePar":
                            agendaCommand.deletePar(arg);
                            break;

                        case "query":
                            agendaCommand.query(arg);
                            break;
                        case "cancelOne":
                            agendaCommand.cancelOne(arg);
                            break;
                        case "rejectOne":
                            agendaCommand.rejectOne(arg);
                            break;
                        case "clearAllAgenda":                                       //Urms

                            System.out.println("输入y确定/n取消");
                            String s2 = scanner.nextLine();
                            while(!"y".equals(s2)&&!"n".equals(s2)){
                                System.out.println("输入错误请重新输入");
                                //System.out.println("输入y确定/n取消");
                                s2 = scanner.nextLine();
                            }
                            if ("y".equals(s2)){
                                agendaCommand.clearAllAgenda(arg);
                            }else if("n".equals(s2)){
                                System.out.println("已撤销取消会议操作！");
                            }
                            break;
                        default:

                            System.out.println("非法输入，请重新输入！");
                            HelpPrint.print();

                            break;
                    }
                }






            }
        }
    }
}
