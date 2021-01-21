package factory_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class GetPlanFactoryTest {
    GetPlanFactory getPlanFactory;

    @Before
    public void setUp() {
        getPlanFactory = new GetPlanFactory();
    }

    @After
    public void clear() {
        getPlanFactory = null;
    }

    @Test
    public void testingFactoryReturningDomesticPlanGivenDomesticPlanAsInput() {
        Plan plan = getPlanFactory.getPlan("DOMESTICPLAN");
        assert plan instanceof DomesticPlan;
    }

}