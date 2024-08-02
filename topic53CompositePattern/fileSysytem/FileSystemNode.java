package org.example.designPattern.topic53CompositePattern.fileSysytem;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 抽象層
 * 定義共同接口
 */
@AllArgsConstructor
public abstract class FileSystemNode {

    /*
    共同屬性
     */
    @Getter
    protected String path;

    /*
    共同接口
     */
    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();
}
