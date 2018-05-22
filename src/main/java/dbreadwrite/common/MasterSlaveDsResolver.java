package dbreadwrite.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by lin on 18-5-22.
 */
@Aspect
@Component
public class MasterSlaveDsResolver {

    @Value("${datasource.master.key}")
    private String dataSourceMasterKey;

    @Value("${datasource.slave.key}")
    private String dataSourceSlaveKey;

    @Pointcut("@within(dbreadwrite.common.MasterSlaveEnable)")
    private void dataSourceMasterSalvePct() {
    }

    @Before("dataSourceMasterSalvePct()")
    public void before(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        if(isMasterDataSource(method))
            DynamicDataSourceHolder.setDataSourceKey(dataSourceMasterKey);
        else
            DynamicDataSourceHolder.setDataSourceKey(dataSourceSlaveKey);

    }

    private boolean isMasterDataSource(String methodName) {
        return !methodName.toLowerCase().endsWith("readonly");
    }


}
