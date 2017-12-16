import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.util.ClassUtils;

/**
 * Created by QIEGAO on 2017/10/23.
 */
public class Test {

@org.junit.Test
    public void beanFactoryTest(){
    ClassLoader loader = ClassUtils.class.getClassLoader();
    System.out.println(loader);
//    BeanFactory context = new FileSystemXmlApplicationContext("454353453453");
//    context.getBean("");
}


}
