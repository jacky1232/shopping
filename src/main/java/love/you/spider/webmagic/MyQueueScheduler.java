package love.you.spider.webmagic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.scheduler.MonitorableScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: yirui_dai
 * @Description:不要过滤相同的请求url
 * @Date: Created in 17:20 2018/4/6 0006
 */
public class MyQueueScheduler implements Scheduler,MonitorableScheduler {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    private BlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();


    @Override
    public int getTotalRequestsCount(Task task) {
        logger.info("getTotalRequestsCount:" + queue.size());
        return queue.size();
    }

    @Override
    public void push(Request request, Task task) {
        queue.add(request);
    }

    @Override
    public synchronized Request poll(Task task) {
        return queue.poll();
    }

    @Override
    public int getLeftRequestsCount(Task task) {
        logger.info("getLeftRequestsCount:" + queue.size());
        return queue.size();
    }


}
