package kata.temptest.basicprograms;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 4/30/14
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class PolicyCalculationHelper {

    public static void main(String... arg){

        List<Policy> policyWithSellValuesMap = setPolicyYearAndSellValue();

        for (Policy policy : policyWithSellValuesMap){
            Long totalSellValue =  policy.getPolicy().getTotalSellValue(policy);
            Long maximumSellValue =  policy.getPolicy().getMaximumSellValue(policy);
            Integer yearWithMaximumSellValue =  policy.getPolicy().YearWithMaximumSellValue(policy);

            System.out.println("The year with the maximum sell is "+yearWithMaximumSellValue+" with the total sell value of "+totalSellValue+" and maximum sell value of "+maximumSellValue);
        }
    }

    private static List<Policy> setPolicyYearAndSellValue(){
        List<Policy> listOfPolicies = Lists.newArrayList();
        ImmutableMap<Integer,Long> policyOneMap=ImmutableMap.<Integer,Long>builder()
                .put(2008,100l)
                .put(2009,99l)
                .put(2010,88l)
                .put(2011,77l)
                .put(2012,66l).build();

        Policy policyOne = new Policy();
        policyOne.setPolicy(PolicyType.POLICY_1);
        policyOne.setPolicyPerYear(policyOneMap);
        listOfPolicies.add(policyOne);
        ImmutableMap<Integer,Long> policyTwoMap=ImmutableMap.<Integer,Long>builder()
                .put(2008,10l)
                .put(2009,99l)
                .put(2010,88l)
                .put(2011,77l)
                .put(2012,66l).build();
        Policy policyTwo = new Policy();
        policyTwo.setPolicy(PolicyType.POLICY_2);
        policyTwo.setPolicyPerYear(policyTwoMap);
        listOfPolicies.add(policyTwo);

        ImmutableMap<Integer,Long> policyThreeMap=ImmutableMap.<Integer,Long>builder()
                .put(2008,10l)
                .put(2009,9l)
                .put(2010,88l)
                .put(2011,77l)
                .put(2012,66l).build();
        Policy policyThree = new Policy();
        policyThree.setPolicy(PolicyType.POLICY_3);
        policyThree.setPolicyPerYear(policyThreeMap);
        listOfPolicies.add(policyThree);

        ImmutableMap<Integer,Long> policyFourMap=ImmutableMap.<Integer,Long>builder()
                .put(2008,10l)
                .put(2009,9l)
                .put(2010,8l)
                .put(2011,77l)
                .put(2012,66l).build();
        Policy policyFour = new Policy();
        policyFour.setPolicy(PolicyType.POLICY_4);
        policyFour.setPolicyPerYear(policyFourMap);
        listOfPolicies.add(policyFour);

        ImmutableMap<Integer,Long> policyFiveMap=ImmutableMap.<Integer,Long>builder()
                .put(2008,10l)
                .put(2009,9l)
                .put(2010,8l)
                .put(2011,7l)
                .put(2012,66l).build();
        Policy policyFive = new Policy();
        policyFive.setPolicy(PolicyType.POLICY_5);
        policyFive.setPolicyPerYear(policyFiveMap);
        listOfPolicies.add(policyFive);

        return listOfPolicies;
    }

    public static class Policy {
        PolicyType policyType;
        Map<Integer,Long> policyPerYear;

        public PolicyType getPolicy() {
            return policyType;
        }

        public void setPolicy(PolicyType policyType) {
            this.policyType = policyType;
        }

        public Map<Integer, Long> getPolicyPerYear() {
            return policyPerYear;
        }

        public void setPolicyPerYear(Map<Integer, Long> policyPerYear) {
            this.policyPerYear = policyPerYear;
        }
    }

}
