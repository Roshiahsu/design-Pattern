package org.example.designPattern.topic53CompositePattern.fileSysytem;

import java.io.File;

/**
 * Leaf 子節點
 */
public class FileNode extends FileSystemNode {
    public FileNode(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        File file = new File(path);
        if (!file.exists()) {
            return 0;
        }
        return file.length();
    }
}
