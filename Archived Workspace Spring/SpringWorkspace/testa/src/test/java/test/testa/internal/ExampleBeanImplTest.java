package test.testa.internal;

import junit.framework.TestCase;
import test.testa.ExampleBean;

public class ExampleBeanImplTest extends TestCase
{
    public void testBeanIsABean()
    {
        ExampleBean aBean = new ExampleBeanImpl();
        assertTrue( aBean.isABean() );
    }
}
