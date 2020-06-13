package com.plkj.studysample.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Renzituo
 * on 2020-05-10
 * 对应Composite
 */
public class Folder extends File {
    private List<File> fileList;

    public Folder(String name){
        super(name);
        fileList = new ArrayList<>();
    }
    @Override
    public void watch() {
        //递归查询文件
    }
    @Override
    public void add(File file) {
        fileList.add(file);
    }
    @Override
    public File getChild(int position) {
        return fileList.get(position);
    }
}
