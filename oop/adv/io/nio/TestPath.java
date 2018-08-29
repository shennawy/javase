package javase.oop.adv.io.nio;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.StandardCopyOption;

import java.util.List;
import java.util.stream.Stream;

public class TestPath {
    public static void main(String[] args) {

     /*   Path p = Paths.get("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\read_file_stream.txt");

        Path fileName = p.getFileName();
        System.out.println("File name : " + fileName);

        System.out.println("getParent: " + p.getParent());
        System.out.println("getNameCount: " + p.getNameCount());
        System.out.println("getRoot: " + p.getRoot());
        System.out.println("isAbsolute: " + p.isAbsolute());
        System.out.println("toAbsolutePath: " + p.toAbsolutePath());

        // sub paths

        Path subPath1 = p.subpath(0, 1);
        System.out.println("sub Path : " + subPath1);
        Path subPath2 = p.subpath(0, 2);
        System.out.println("sub Path : " + subPath2);


        // normalize paths
        // .. Means up one level
        // normalize reads/decode the '..'
        Path p3 = Paths.get("D:\\home\\myWork\\..\\articles");
        Path cleanPath = p3.normalize();
        System.out.println("Clean path : " + cleanPath);


        // joining paths
        Path pFirst = Paths.get("D:\\home\\myWork\\articles");
        Path pSecond = pFirst.resolve("java");
        System.out.println("After join : " + pFirst);
        System.out.println("After join : " + pSecond);


        /*
       * Use Files class to check, read, delete, copy,
       * move, manage metadata of a file or directory
      */
        // ex1. Check files
        // The Files.exists() method checks
        // if a given Path exists in the file system, for example
        /*
        Path path = Paths.get("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\read_file.txt");
        boolean exists = Files.exists(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });
        System.out.println("File Exists : ? " + exists);


        // ex. Read files
        System.out.println("Reading file");
        try {
            List<String> strList = Files.readAllLines(path);

            strList.forEach(s -> System.out.println(s));

        } catch (IOException e) {
            e.printStackTrace();
        }
        


        // ex. Deleting Files
        System.out.println("Deleting File ....");
        try {
            path = Paths.get("D:\\files\\servletData.txt");
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

*/
        /*
        // ex. Copying File
        System.out.println("Copying Files...");
        Path pSrc = Paths.get("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\read_file.txt");
        Path pDest = Paths.get("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\read_file2.txt");

        try {
            //  Files.copy(pSrc, pDest);
            Files.copy(pSrc, pDest, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
        */
/*
        // ex. Move Files

        System.out.println("Moving Files...");
        pSrc = Paths.get("D:\\files\\servletData.txt");
        pDest = Paths.get("D:\\files\\servletData22.txt");

        try {
            //  Files.copy(pSrc, pDest);
            Files.move(pSrc, pDest, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }


        /// ex.  Manage metadata
        /// The following methods can be used to extract information about the file or directory:

        //        Tests whether a file is a directory.
        // public static boolean isDirectory(Path path, LinkOption... options)
        // Files.isDirectory(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});

        // Tests whether a file is executable.
        // public static boolean isExecutable(Path path)

        //Tells whether or not a file is considered hidden.
        //public static boolean isHidden(Path path)

        // Tests whether a file is readable.
        // public static boolean isReadable(Path path)

        //Tests whether a file is writable.
        // public static boolean isWritable(Path path)

        // Returns the size of a file (in bytes).
        // public static long size(Path path)
*/

        /// Streams with Files
        System.out.println("___________ List files ________");
        //Auto close resource Try
        try (Stream<Path> stream = Files.list(Paths.get("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase"))) {
            stream.map(String::valueOf).filter(pTextFiles -> pTextFiles.endsWith(".txt")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
