package dbreadwrite.common;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by lin on 18-4-18.
 */
public class DynamicDataSourceHolder {

    private static final ThreadLocal<String> dataSourceKeyHolder = new ThreadLocal<>();

    public static String getDataSourceRouteKey() {
        return dataSourceKeyHolder.get();
    }

    public static void setDataSourceKey(String dataSourceKey) {
        dataSourceKeyHolder.set(dataSourceKey);
    }

}
