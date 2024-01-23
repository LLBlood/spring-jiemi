package cn.liulin.springjiemi.ioc.event;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * cn.liulin.springjiemi.ioc.event$
 *
 * @author ll
 * @date 2024-01-10 13:55:54
 **/
public class GitTest {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\ll.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader.ready()) {
            stringBuilder.append(bufferedReader.readLine());
        }
        String directoryPath = "F:\\backup2024-01-10\\carfi_project";
        JSONArray jsonArray = JSON.parseArray(stringBuilder.toString());
        List<String> list = new LinkedList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String repositoryUrl = jsonObject.getString("http_url_to_repo");
            list.add(repositoryUrl);
//            try {
//                // 创建目标目录
//                Path directory = Paths.get(directoryPath);
//                if (!Files.exists(directory)) {
//                    Files.createDirectories(directory);
//                }
//
//                // 执行git clone命令
//                ProcessBuilder processBuilder = new ProcessBuilder("git", "clone", repositoryUrl);
//                processBuilder.directory(new File(directoryPath));
//                Process process = processBuilder.start();
//
//                // 读取命令输出
////            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
////            String line;
////            while ((line = reader.readLine()) != null) {
////                System.out.println(line);
////            }
//
//                // 等待命令执行完成并检查退出代码
//                int exitCode = process.waitFor();
//                if (exitCode != 0) {
//                    System.err.println("git clone command failed with exit code " + exitCode);
//                } else {
//                    System.out.println("git clone command executed successfully");
//                }
//            } catch (IOException | InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
