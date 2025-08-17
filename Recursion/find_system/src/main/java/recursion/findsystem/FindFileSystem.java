package recursion.findsystem;

import java.io.File;
import java.util.Scanner;


public class FindFileSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the root from where the search should begin: ");
        String path = scanner.nextLine();
        System.out.print("Input the file to be found: ");
        String filename = scanner.nextLine();
        find(path, filename);
        scanner.close();
    }

    public static void find(String path, String filename){
        /*Find all the entries filename given a file path */
        File root = new File(path);
        find(root, filename);
    }

    private static void find(File file, String filename){
        if (file.getName().equals(filename)){
            System.out.println(file.getAbsolutePath());
        }
        if (file.isDirectory()){
            for (File child : file.listFiles()){
                find(child, filename);
            }
        }
    }
}