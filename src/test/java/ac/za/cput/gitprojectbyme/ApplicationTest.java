/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.gitprojectbyme;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
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
    
    @Before
    public void setUpApplication()throws Exception
    {
        objectEquality = new ObjectEquality();
    }
    
    @Test
    public void testObjectEquality() throws Exception
    {
        //assert.assertEquals("Shiluva",objectEquality.displayName());
    }
}
