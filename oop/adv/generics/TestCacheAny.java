package javase.oop.adv.generics;

import java.util.ArrayList;

public class TestCacheAny {

    public static void main(String[] args) {
        CacheAny<String> cacheString = new CacheAny<>();
        cacheString.setVar("Welcome to Java");

        CacheAny<Integer> cacheInteger = new CacheAny<>();
        cacheInteger.setVar(30);
        System.out.println(cacheInteger.getVar());
        
        
    }

}
