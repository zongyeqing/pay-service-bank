package com.zong.pay.core.bank.util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 宗叶青 on 2017/8/26/23:29
 */
public class FileUtil {

    /**
     * 对于内容为非中文的大文件读取，可根据该方法读取文件指定位置的字符串。
     * @param filePath  文件路径
     * @param beginIndex  开始字符位置
     * @param byteLength  读取字符长度
     * @return  读取的字符串
     * @throws IOException
     */
    public static String getStringFromFile(String filePath, int beginIndex, int byteLength) throws IOException {
        String returnStr = null;
        RandomAccessFile randomFile = new RandomAccessFile(filePath, "r");
        randomFile.seek(beginIndex);
        byte[] bytes = new byte[byteLength];
        while(randomFile.read(bytes) != -1){
            returnStr = new String(bytes);
            break;
        }
        randomFile.close();
        return returnStr;
    }

    /**
     * 传入文件夹路径，该方法能够实现创建整个路径
     * @param path 文件夹路径，不包含文件名称及后缀名
     */
    public static void isDir(String path){
        String[] paths = path.split("/");
        String filePath = "";
        for(int i = 0; i<paths.length; i++){
            if(i == 0){
                filePath = paths[0];
            }else{
                filePath += "/" + paths[i];
            }
            creatDir(filePath);
        }
    }

    /**
     * 该方法用来判断文件夹是否存在，如果不存在则创建，存在则什么都不做
     * @param filePath
     */
    public static void creatDir(String filePath){
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdir();
        }
    }


}
