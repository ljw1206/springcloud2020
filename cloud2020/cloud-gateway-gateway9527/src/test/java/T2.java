import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-18 1:11
 * @Version: v1.0
 */
public class T2 {
        public static void main(String[] args) {
                ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
                ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
                System.out.println(zbj);
                System.out.println(zny);
        }
}
