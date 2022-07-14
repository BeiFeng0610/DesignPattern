package top.beif.designpattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class DirectorTest {

    @Test
    public void test1(){
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }

    @Test
    public void test2(){
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        String result = htmlBuilder.getResult();
        System.out.println(result + "文件编写完成");
    }

    @Test
    public void test3(){
        MarkdownBuilder markdownBuilder = new MarkdownBuilder();
        Director director = new Director(markdownBuilder);
        director.construct();
        String result = markdownBuilder.getResult();
        System.out.println(result + "文件编写完成");
    }

}