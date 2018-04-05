package love.you;

import org.mybatis.generator.api.ShellRunner;

/**
 * @Author: yirui_dai
 * @Description:自动生成持久层代码启动类
 * @Date: Created in 15:27 2018/4/5 0005
 */
public class App {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "E:/work1/shopping/src/main/resources/mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
