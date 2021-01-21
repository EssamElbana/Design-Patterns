package test;

import main.factory_method.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetPlanFactoryTest {
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

    @Test
    public void testingFactoryReturningCommercialPlanGivenCommercialPlanAsInput() {
        Plan plan = getPlanFactory.getPlan("CommercialPlan");
        assert plan instanceof CommercialPlan;
    }

    @Test
    public void testingFactoryReturningInstitutionalPlanGivenInstitutionalPlanAsInput() {
        Plan plan = getPlanFactory.getPlan("InstitutionalPlan");
        assert plan instanceof InstitutionalPlan;
    }

    @Test
    public void testingFactoryReturningNullGivenInvalidObjectNameAsInput() {
        Plan plan = getPlanFactory.getPlan("Nothing");
        assert plan == null;
    }


    @Test
    public void testingFactoryReturningNullGivenEmptyStringAsInput() {
        Plan plan = getPlanFactory.getPlan("");
        assert plan == null;
    }
}