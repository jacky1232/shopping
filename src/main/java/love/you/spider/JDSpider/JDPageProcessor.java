package love.you.spider.JDSpider;

import love.you.spider.webmagic.MyHttpClientDownloader;
import love.you.spider.webmagic.MyQueueScheduler;
import org.apache.http.HttpHost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.*;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.utils.HttpConstant;

/**
 * @Author: yirui_dai<yirui_dai @ aliyun.com>
 * @Description:爬取京东页面商品
 * @Date: Created in 16:00 2018/4/6 0006
 */
public class JDPageProcessor implements PageProcessor {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private HttpHost httpHost  = new HttpHost("127.0.0.1",8888);

    private Site site = Site.me().setRetryTimes(3).setHttpProxy(httpHost).setSleepTime(100);


    @Override
    public void process(Page page) {
        logger.info(page.getRawText());
        return;
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        //考虑绕过https，和不要去除重复请求处理
        Spider spider =  Spider.create(new JDPageProcessor())
                .addPipeline(new JDPipeline())
                //不要去除重复请求处理
                .setScheduler(new MyQueueScheduler())
                .setDownloader(new MyHttpClientDownloader())
                .thread(1);
        Request request = new Request("https://xueqiu.com/");
        request.setMethod(HttpConstant.Method.GET);
        spider.addRequest(request);
        Request request1 = new Request("https://www.baidu.com");
        request1.setMethod(HttpConstant.Method.GET);
        spider.addRequest(request1);
        spider.start();
    }
}
