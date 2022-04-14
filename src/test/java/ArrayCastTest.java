import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import example.json.JSONWrapper;
import org.junit.jupiter.api.Test;

public class ArrayCastTest {

    @Test
    public void arrayTest() {
        Integer[] integers = new Integer[23];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }
        Object[] oa = integers;
        for (Object o : oa) {
            System.out.println(o);
        }
    }

    @Test
    public void testArrayJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsons = "[{\"aggScore\":17193,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c96449.html\",\"title\":\"jaxen-1.1-beta-6.jar.zip\"},{\"aggScore\":11540,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c279533.html\",\"title\":\"junit-4.12.jar\"},{\"aggScore\":10840,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9383/t_c151455.html\",\"title\":\"slf4j-api.jar.zip\"},{\"aggScore\":10536,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c95409.html\",\"title\":\"java-util-1.3.1.jar.zip\"},{\"aggScore\":8930,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c116042.html\",\"title\":\"jstl-1.2.jar.zip\"},{\"aggScore\":8783,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9352/t_c41575.html\",\"title\":\"cglib-nodep-2.2.2.jar.zip\"},{\"aggScore\":7888,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9383/t_c151628.html\",\"title\":\"slf4j.jar.zip\"},{\"aggScore\":7096,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9377/t_c138199.html\",\"title\":\"mysql-connector-java-5.1.15-bin.jar.zip\"},{\"aggScore\":6427,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c96004.html\",\"title\":\"javax.servlet.jsp.jstl.jar.zip\"},{\"aggScore\":6351,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c96056.html\",\"title\":\"javax.validation-1.0.0.GA.jar.zip\"},{\"aggScore\":5676,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9377/t_c268726.html\",\"title\":\"mysql-connector-java-5.1.6-bin.jar\"},{\"aggScore\":5444,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c115035.html\",\"title\":\"json-lib-2.3-jdk15.jar.zip\"},{\"aggScore\":5119,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c96072.html\",\"title\":\"javax.xml.bind.jar.zip\"},{\"aggScore\":4975,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9383/t_c151538.html\",\"title\":\"slf4j-log4j.jar.zip\"},{\"aggScore\":4974,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9352/t_c47013.html\",\"title\":\"commons-pool2-2.2.jar\"},{\"aggScore\":3892,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c279069.html\",\"title\":\"解决redis服务安装成功后远程telnet报\\\"nc: connect to 192.168.1.202 port 6379 (tcp) failed: Connection refused\\\"连接拒绝的问题\"},{\"aggScore\":3749,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/t_c265386.html\",\"title\":\"《MySQL技术内幕：InnoDB存储引擎  第2版》PDF版本下载\"},{\"aggScore\":3655,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c267386.html\",\"title\":\"jackson-core-2.5.0.jar\"},{\"aggScore\":3537,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/t_c265730.html\",\"title\":\"《Linux设备驱动开发详解：基于最新的Linux 4.0内核》PDF版本下载\"},{\"aggScore\":3090,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c114623.html\",\"title\":\"jsch-0.1.37.jar.zip\"},{\"aggScore\":3052,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c279540.html\",\"title\":\"解决运行springframework启动初始化时报\\\"BeanInstantiationException: Failed to instantiate..Caused by: java.lang.NoSuchFieldError: INSTANCE\\\"异常错误\"},{\"aggScore\":2654,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c279498.html\",\"title\":\"解决\\\"org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /master\\\"异常问题\"},{\"aggScore\":2587,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/t_c265087.html\",\"title\":\"《Java并发编程实战》PDF版本下载\"},{\"aggScore\":2403,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/t_c265752.html\",\"title\":\"《算法 第4版》PDF版本下载\"},{\"aggScore\":2357,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c279106.html\",\"title\":\"解决客户端挂载mount网络文件系统nfs共享资源路径报\\\"mount.nfs: Connection timed out\\\"问题\"},{\"aggScore\":2156,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c267606.html\",\"title\":\"访问JSON格式接口报“org.springframework.web.HttpMediaTypeNotAcceptableException: Could not find acceptable representation”异常\"},{\"aggScore\":2148,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9352/t_c200278.html\",\"title\":\"cxf-rt-transports-http-jetty-2.4.0-sources.jar\"},{\"aggScore\":2148,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9350/t_c267206.html\",\"title\":\"aopalliance-1.0.jar\"},{\"aggScore\":2143,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9372/t_c83218.html\",\"title\":\"httpcore-4.2.4.jar\"},{\"aggScore\":2105,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9353/t_c28237.html\",\"title\":\"dnsjava-2.1.2.jar.zip\"},{\"aggScore\":2058,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c279746.html\",\"title\":\"解决zookeeper集群模式下无法启动报\\\"Error contacting service. It is probably not running.\\\"错误提示问题\"},{\"aggScore\":1994,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c279027.html\",\"title\":\"关于“.MyBatisSystemException: nested exception is org.apache.ibatis.builder.BuilderException”异常问题解决\"},{\"aggScore\":1775,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9370/t_c45922.html\",\"title\":\"freemarker-2.3.jar.zip\"},{\"aggScore\":1763,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/t_c275226.html\",\"title\":\"《Netty实战》PDF版本下载\"},{\"aggScore\":1676,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/t_c265726.html\",\"title\":\"《分布式系统：概念与设计 原书第5版》PDF版本下载\"},{\"aggScore\":1665,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9371/t_c271426.html\",\"title\":\"guava-19.0.jar\"},{\"aggScore\":1624,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c279259.html\",\"title\":\"关于java.lang.reflect.InvocationTargetException的类反射异常应用场景代码示例\"},{\"aggScore\":1605,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9383/t_c155209.html\",\"title\":\"spring-context-2.0.4.jar.zip\"},{\"aggScore\":1575,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9382/t_c143938.html\",\"title\":\"rxtx-2.2pre2.jar.zip\"},{\"aggScore\":1574,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9350/t_c14588.html\",\"title\":\"axis-1.4_1.jar\"},{\"aggScore\":1536,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c96058.html\",\"title\":\"javax.ws.rs.jar.zip\"},{\"aggScore\":1505,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9383/t_c155077.html\",\"title\":\"spring-2.0-core.jar.zip\"},{\"aggScore\":1490,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9383/t_c155664.html\",\"title\":\"spring-webmvc-3.0.2.RELEASE.jar.zip\"},{\"aggScore\":1452,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c279309.html\",\"title\":\"js.jar\"},{\"aggScore\":1416,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c256886.html\",\"title\":\"运行navicat报出\\\"Missing required library libmysql_d.dll,126\\\"问题\"},{\"aggScore\":1398,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9383/t_c269466.html\",\"title\":\"spring-web-4.1.4.RELEASE.jar\"},{\"aggScore\":1394,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c267786.html\",\"title\":\"关于解决\\\"com.alibaba.fastjson.JSONException: not match : - =\\\"数组集合字符串转换对象的ArrayList异常问题\"},{\"aggScore\":1339,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9370/t_c42747.html\",\"title\":\"fastjson-1.1.2.jar.zip\"},{\"aggScore\":1332,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c96070.html\",\"title\":\"javax.xml.bind-2.0.jar.zip\"},{\"aggScore\":1327,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c266966.html\",\"title\":\"通过jedis客户端连接redis存储键值时报“JedisConnectionException: java.net.SocketException: Connection reset”异常\"},{\"aggScore\":1296,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c256206.html\",\"title\":\"解决URL传递中文时出现乱码问题（三种解决方法）\"},{\"aggScore\":1282,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9354/t_c34079.html\",\"title\":\"ehcache-core-2.4.5.jar.zip\"},{\"aggScore\":1272,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/t_c264488.html\",\"title\":\"《程序员的自我修养_链接_装载与库》PDF版本下载\"},{\"aggScore\":1255,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c267666.html\",\"title\":\"解决“redis.clients.jedis.exceptions.JedisDataException: ERR wrong number of arguments for set command”异常问题\"},{\"aggScore\":1228,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c276326.html\",\"title\":\"解决Git Gui客户端界面提示\\\"ssh: Could not resolve hostname http: Name or service not known\\\"Error:Command错误界面问题\"},{\"aggScore\":1179,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9351/t_c177306.html\",\"title\":\"backport-util-concurrent-3.1.jar.zip\"},{\"aggScore\":1170,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c261567.html\",\"title\":\"linux下安装nginx安装不了报出\\\"checking for sys/filio.h ... not found...O_PATH... not found...\\\"\"},{\"aggScore\":1139,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c266806.html\",\"title\":\"解决Kafka报出CommitFailedException异常“Commit cannot be..reducing the maximum size of batches returned in poll() with max.poll.records.”问题\"},{\"aggScore\":1110,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5874/t_c258886.html\",\"title\":\"使用navicat如何实现ndm格式数据模型备份迁移或同步还原？\"},{\"aggScore\":1107,\"ajaxUrlBytes\":{},\"pageUrl\":\"http://www.xwood.net/_site_domain_/_root/5870/5930/5932/9330/9374/t_c115247.html\",\"title\":\"jsoup-1.6.1.jar.zip\"}]";
        Object[] objects = mapper.readValue(jsons, Object[].class);
        JSONWrapper wrapper = new JSONWrapper(objects);
        Object out = wrapper.extract("[0].pageUrl");
        System.out.println(out);
    }
}