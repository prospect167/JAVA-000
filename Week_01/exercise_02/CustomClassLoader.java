package com.prospect.java.exercises.jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * 自定义类加载器
 * @author prospect
 * @create 2020/10/18 11:22 下午
 */
public class CustomClassLoader extends ClassLoader {

    private String filename = "src/main/java/com/prospect/java/exercises/jvm/Hello.xlass";

    @Override
    public Class<?> findClass(String name) {
        byte[] data = decodeByteStream(filename);
        if (data == null) {
            return null;
        }
        return super.defineClass(name, data, 0, data.length);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object obj = new CustomClassLoader().findClass("Hello").newInstance();
        obj.getClass().getDeclaredMethod("hello").invoke(obj);
    }

    /**
     * 解码混淆字节码
     * @param filename
     * @return
     */
    private byte[] decodeByteStream(String filename) {
        byte[] stream = readFileStream(filename);
        if (null == stream) {
            throw new IllegalArgumentException("the file is empty");
        }
        for (int i = 0; i < stream.length; i++) {
            stream[i] = (byte)(255 - stream[i]);
        }
        return stream;
    }

    /**
     * 读取文件字节流
     * @param filename
     * @return
     */
    private byte[] readFileStream(String filename) {
        File file = new File(filename);
        long fileSize = file.length();
        if (fileSize > Integer.MAX_VALUE) {
            System.out.println("the file is too big... filename:" + filename);
            return null;
        }
        byte[] buffer = null;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            buffer = new byte[(int)fileSize];
            int offset = 0;
            int numRead = 0;
            while (offset < buffer.length && (numRead = inputStream.read(buffer, offset, buffer.length) - offset) > 0) {
                offset += numRead;
            }
            if (offset != buffer.length) {
                throw new IOException("Could not completely read the file: " + filename);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
