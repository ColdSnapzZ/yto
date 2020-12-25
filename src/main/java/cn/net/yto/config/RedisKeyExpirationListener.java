package cn.net.yto.config;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * @Author zht
 * @Date 2020/12/21 16:46
 * @Description
 */
@Component
public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {
    public RedisKeyExpirationListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    /**
     * 当key过期的时候会自动触发该方法
     * 不能得到value，只能得到key
     */
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("key="+message.toString());
        System.out.println(new String(pattern));
    }
}
