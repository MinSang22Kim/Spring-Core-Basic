package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.discount.DiscountPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextSameBeanFindText {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("타입으로 조회할 때 같은 타입이 둘 이상 있으면 중복 오류 발생")
    void findBeanByTypeDuplicate() {
        ac.getBean(DiscountPolicy.class);

    }
}
