package fishnetwork.guishop.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class FileUtil {


    public static List<File> loadAllFiles(File directory) {
        List<File> files = new ArrayList<>();
        for(File file: directory.listFiles()) {
            if(file.isDirectory()) {
                files.addAll(loadAllFiles(file));
            }else{
                files.add(file);
            }
        }
        return files;
    }


    public static void copyFolderFromJar(Class<?> classInJar, String folderName, File destFolder, boolean replace) throws IOException {
        byte[] buffer = new byte[1024];
        String path = classInJar.getProtectionDomain().getCodeSource().getLocation().getPath();
        String decodedPath = URLDecoder.decode(path, "UTF-8");
        File fullPath = new File(decodedPath);
        ZipInputStream zis = new ZipInputStream(new FileInputStream(fullPath));
        ZipEntry entry;
        while((entry = zis.getNextEntry()) != null) {
            String fileName = entry.getName();
            if(!fileName.startsWith(folderName+"/")) continue;
            if(fileName.endsWith("/")) {
                File file = new File(destFolder+File.separator+fileName);
                if(file.isFile()) file.delete();
                file.mkdirs();
                continue;
            }
            File file = new File(destFolder+File.separator+fileName);
            if(!replace && file.exists()) continue;
            file.getParentFile().mkdirs();
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            int length;
            while((length = zis.read(buffer)) > 0) fos.write(buffer, 0, length);
            fos.close();
        }
        zis.closeEntry();
        zis.close();
    }


    public static void copyFileFromJar(Class<?> classInJar, String fileName, File destFolder, boolean replace) throws IOException {
        URL url = classInJar.getClassLoader().getResource(fileName);
        if(url == null) return;
        URLConnection connection = url.openConnection();
        connection.setUseCaches(false);
        InputStream in = connection.getInputStream();
        File file = new File(destFolder, fileName);
        if(!file.exists() || replace) {
            OutputStream out = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len;
            while((len = in.read(buf)) > 0) out.write(buf, 0, len);
            out.close();
            in.close();
        }
    }


}