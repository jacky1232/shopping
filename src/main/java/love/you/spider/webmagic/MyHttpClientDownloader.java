package love.you.spider.webmagic;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.CharsetUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.downloader.AbstractDownloader;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.downloader.HttpClientGenerator;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.selector.PlainText;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yirui_dai
 * @Description: 参考csdn网页https://blog.csdn.net/zhlei12345/article/details/72675573
 *   解决绕过https问题
 * @Date: Created in 16:30 2018/4/6 0006
 */
public class MyHttpClientDownloader extends HttpClientDownloader {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public MyHttpClientDownloader()  {
        try {
            Field field = this.getClass().getSuperclass().getDeclaredField("httpClientGenerator");
            field.setAccessible(true);
            field.set(this,new MyHttpClientGenerator());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
