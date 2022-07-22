package top.beif.designpattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Facade角色是代表构成系统的许多其他角色的＂简单窗口” 。Facade角色向系统外部提供高层接口(API)。
 * @author 16116
 */
public class PageMaker {

    private PageMaker() {}

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome ot " + username + "'s page!");
            writer.paragraph(username + " 欢迎来到 " + username + " 的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");

            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link Page");

            Set<String> strings = mailprop.stringPropertyNames();
            for (String str : strings) {
                writer.mailto(str, mailprop.getProperty(str));
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
