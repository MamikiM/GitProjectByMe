/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.gitprojectbyme;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author CPUT
 */
public class ApplicationTest 
{
    ObjectEquality objectEquality;
    ObjectIdentity objectIdentity;
    ObjectIdentity objectIdentity2; 
    Failing fail;
    TimeOuts timeOutObject;
    Disabling disable = new Disabling();
    
    @Before
    public void setUpApplication()throws Exception
    {
        objectEquality = new ObjectEquality();
        objectIdentity = new ObjectIdentity();
        objectIdentity2 = new ObjectIdentity();
        fail = new Failing();
        timeOutObject = new TimeOuts();
    }
    
    @Test
    public void testObjectEquality() throws Exception
    {
        Assert.assertEquals("Shiluva",objectEquality.displayName());
    }
    
    @Test
    public void testObjectIdentity() throws Exception
    {
        Assert.assertNotSame(objectIdentity, objectIdentity2);
    }
   
    @Test
    public void testFailure() throws Exception
    {
        if(fail == null)
            Assert.fail(fail.printFailMessage());
    }
    
    @Test(timeout = 300)
    public void testTimeOuts() throws Exception
    {
        timeOutObject.countNumbers();
    }
    
    @Ignore
    @Test
    public void testDisabling() throws Exception
    {
        disable.disable();
    }
}
