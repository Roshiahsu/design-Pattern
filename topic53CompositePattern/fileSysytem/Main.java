package org.example.designPattern.topic53CompositePattern.fileSysytem;

public class Main {
    public static void main(String[] args) {
        DirectoryNode fileSystemTree = new DirectoryNode("/");
        DirectoryNode node_wz = new DirectoryNode("/wz/");
        DirectoryNode node_xzg = new DirectoryNode("/xzg");
        fileSystemTree.addSubNode(node_wz);
        fileSystemTree.addSubNode(node_xzg);

        FileNode node_wz_a = new FileNode("/wz/a.txt");
        FileNode node_wz_b = new FileNode("/wz/b.txt");
        DirectoryNode node_wz_movies = new DirectoryNode("/wz/movies/");
        node_wz.addSubNode(node_wz_a);
        node_wz.addSubNode(node_wz_b);
        node_wz.addSubNode(node_wz_movies);

        FileNode node_wz_movies_c = new FileNode("/wz/movies/c.avi");
        node_wz_movies.addSubNode(node_wz_movies_c);

        DirectoryNode node_xzg_docs = new DirectoryNode("/xzg/docs/");
        node_xzg.addSubNode(node_xzg_docs);

        FileNode node_xzg_docs_d = new FileNode("/xzg/docs/d.txt");
        node_xzg_docs.addSubNode(node_xzg_docs_d);

        System.out.println("/ files num:" + fileSystemTree.countNumOfFiles());
        System.out.println("/wz/ file num:" + node_wz.countNumOfFiles());

    }
}
