package org.example.designPattern.topic53CompositePattern.fileSysytem;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class DirectoryNode extends FileSystemNode {
    /*
    子節點容器
     */
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public DirectoryNode(String path) {
        super(path);
    }

    /*
    實作子節點相關行為
     */
    @Override
    public int countNumOfFiles() {
        int numOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    /*
    實作子節點相關行為
     */
    @Override
    public long countSizeOfFiles() {
        long sizeOfFiles = 0 ;
        for (FileSystemNode fileOrDir : subNodes) {
            sizeOfFiles += fileOrDir.countNumOfFiles();
        }
        return sizeOfFiles;
    }

    /*
    添加子節點
     */
    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    /*
    刪除子節點
     */
    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (;i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
