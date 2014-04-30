package kata.temptest.basicprograms;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 4/30/14
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */
public enum PolicyType {

    POLICY_1{
        @Override
        public Long getTotalSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                totalSellValue+=yearAndSellValueMap.getValue();
            }
            return totalSellValue;
        }

        @Override
        public Long getMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue < yearAndSellValueMap.getValue())
                    maximumSellValue=yearAndSellValueMap.getValue();
            }
            return maximumSellValue;
        }

        @Override
        public Integer YearWithMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue.equals(yearAndSellValueMap.getValue()))
                    yearWithMaximumSellValue=yearAndSellValueMap.getKey();
            }
            return yearWithMaximumSellValue;
        }
    },
    POLICY_2{
        @Override
        public Long getTotalSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                totalSellValue+=yearAndSellValueMap.getValue();
            }
            return totalSellValue;
        }

        @Override
        public Long getMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue < yearAndSellValueMap.getValue())
                    maximumSellValue=yearAndSellValueMap.getValue();
            }
            return maximumSellValue;
        }

        @Override
        public Integer YearWithMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue.equals(yearAndSellValueMap.getValue()))
                    yearWithMaximumSellValue=+yearAndSellValueMap.getKey();
            }
            return yearWithMaximumSellValue;
        }
    },
    POLICY_3{
        @Override
        public Long getTotalSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                totalSellValue+=yearAndSellValueMap.getValue();
            }
            return totalSellValue;
        }

        @Override
        public Long getMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue < yearAndSellValueMap.getValue())
                    maximumSellValue=yearAndSellValueMap.getValue();
            }
            return maximumSellValue;
        }

        @Override
        public Integer YearWithMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue.equals(yearAndSellValueMap.getValue()))
                    yearWithMaximumSellValue=yearAndSellValueMap.getKey();
            }
            return yearWithMaximumSellValue;
        }
    },
    POLICY_4{
        @Override
        public Long getTotalSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                totalSellValue+=yearAndSellValueMap.getValue();
            }
            return totalSellValue;
        }

        @Override
        public Long getMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue < yearAndSellValueMap.getValue())
                    maximumSellValue=yearAndSellValueMap.getValue();
            }
            return maximumSellValue;
        }

        @Override
        public Integer YearWithMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue.equals(yearAndSellValueMap.getValue()))
                    yearWithMaximumSellValue=yearAndSellValueMap.getKey();
            }
            return yearWithMaximumSellValue;
        }
    },
    POLICY_5{
        @Override
        public Long getTotalSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                totalSellValue+=yearAndSellValueMap.getValue();
            }
            return totalSellValue;
        }

        @Override
        public Long getMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue < yearAndSellValueMap.getValue())
                    maximumSellValue=yearAndSellValueMap.getValue();
            }
            return maximumSellValue;
        }

        @Override
        public Integer YearWithMaximumSellValue(PolicyCalculationHelper.Policy policy) {
            Map<Integer, Long> policyPerYearAndSellValue =  policy.getPolicyPerYear();
            for(Map.Entry<Integer,Long> yearAndSellValueMap :policyPerYearAndSellValue.entrySet()){
                if (maximumSellValue.equals(yearAndSellValueMap.getValue()))
                    yearWithMaximumSellValue=yearAndSellValueMap.getKey();
            }
            return yearWithMaximumSellValue;
        }
    };

    Long totalSellValue=Long.valueOf(0);
    Long maximumSellValue= Long.valueOf(0);
    Integer yearWithMaximumSellValue=Integer.valueOf(0);


    public abstract Long getTotalSellValue(PolicyCalculationHelper.Policy policy);
    public abstract Long getMaximumSellValue(PolicyCalculationHelper.Policy policy);
    public abstract Integer YearWithMaximumSellValue(PolicyCalculationHelper.Policy policy);
}