package test.testa.internal;

import test.testa.ExampleBean;

/**
 * Internal implementation of our example Spring Bean
 */
public class ExampleBeanImpl
    implements ExampleBean
{
    public boolean isABean()
    {
        return true;
    }
}
