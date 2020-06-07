package com.plkj.studysample.designPattern.composite;

/**
 * Created by Renzituo
 * on 2020-05-10
 */
public class TestComposite {
    public static void main(String[] args){
        TestFile testFile = new TestFile("a");
        testFile.watch();

        Folder folder = new Folder("555");
        folder.add(testFile);
        folder.watch();//有了自己的watch方法
        folder.getChild(0).watch();//也可调用testFile的watch方法
    }
}
