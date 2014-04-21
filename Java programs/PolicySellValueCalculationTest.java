package org.nthdimenzion;

import com.google.common.collect.Maps;

import java.util.Map;
/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 4/21/14
 * Time: 11:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class PolicySellValueCalculationTest {

    public static void main(String... arg){

        long totalSellValueForPolicyOne=0;
        long totalSellValueForPolicyTwo=0;
        long totalSellValueForPolicyThree=0;
        long totalSellValueForPolicyFour=0;
        long totalSellValueForPolicyFive=0;

        long maximumSellValueForPolicyOne=0;
        long maximumSellValueForPolicyTwo=0;
        long maximumSellValueForPolicyThree=0;
        long maximumSellValueForPolicyFour=0;
        long maximumSellValueForPolicyFive=0;


        Integer yearWithMaximumSellValueForPolicyOne= 0;
        Integer yearWithMaximumSellValueForPolicyTwo= 0;
        Integer yearWithMaximumSellValueForPolicyThree= 0;
        Integer yearWithMaximumSellValueForPolicyFour= 0;
        Integer yearWithMaximumSellValueForPolicyFive= 0;

        Map<String,Map<Integer,Map<String,Long>>> policyWithSellValuesMap = prepareTheData();
        for (Map.Entry<String,Map<Integer,Map<String,Long>>> policyYearWithSellValues : policyWithSellValuesMap.entrySet()){
            Map<Integer,Map<String,Long>> policyYearWithSellValuesMap =  policyYearWithSellValues.getValue();
            for (Map.Entry<Integer,Map<String,Long>> policyWithSellValues : policyYearWithSellValuesMap.entrySet()){
                Map<String,Long> policyWithSellValue =  policyWithSellValues.getValue();
                for (Map.Entry<String,Long> sellValue : policyWithSellValue.entrySet()){
                    String policyName = sellValue.getKey();
                    if (policyName.equals("policy 1")){
                        if (sellValue.getValue() > maximumSellValueForPolicyOne){
                            yearWithMaximumSellValueForPolicyOne = policyWithSellValues.getKey();
                            maximumSellValueForPolicyOne=sellValue.getValue();
                        }
                        totalSellValueForPolicyOne+=sellValue.getValue();
                    }
                    if (policyName.equals("policy 2")){
                        if (sellValue.getValue() > maximumSellValueForPolicyTwo){
                            yearWithMaximumSellValueForPolicyTwo = policyWithSellValues.getKey();
                            maximumSellValueForPolicyTwo=sellValue.getValue();
                        }
                        totalSellValueForPolicyTwo+=sellValue.getValue();
                    }
                    if (policyName.equals("policy 3")){
                        if (sellValue.getValue() > maximumSellValueForPolicyThree){
                            yearWithMaximumSellValueForPolicyThree = policyWithSellValues.getKey();
                            maximumSellValueForPolicyThree=sellValue.getValue();
                        }
                        totalSellValueForPolicyThree+=sellValue.getValue();
                    }
                    if (policyName.equals("policy 4")){
                        if (sellValue.getValue() > maximumSellValueForPolicyFour){
                            yearWithMaximumSellValueForPolicyFour = policyWithSellValues.getKey();
                            maximumSellValueForPolicyFour=sellValue.getValue();
                        }
                        totalSellValueForPolicyFour+=sellValue.getValue();
                    }
                    if (policyName.equals("policy 5")){
                        if (sellValue.getValue() > maximumSellValueForPolicyFive){
                            yearWithMaximumSellValueForPolicyFive = policyWithSellValues.getKey();
                            maximumSellValueForPolicyFive=sellValue.getValue();
                        }
                        totalSellValueForPolicyFive+=sellValue.getValue();
                    }
                }
            }
        }

        System.out.println("total sell value for policy one is "+totalSellValueForPolicyOne+" with the maximum sell value "+maximumSellValueForPolicyOne+" for the year "+yearWithMaximumSellValueForPolicyOne);
        System.out.println("total sell value for policy two is "+totalSellValueForPolicyTwo+" with the maximum sell value "+maximumSellValueForPolicyTwo+" for the year "+yearWithMaximumSellValueForPolicyTwo);
        System.out.println("total sell value for policy three is "+totalSellValueForPolicyThree+" with the maximum sell value "+maximumSellValueForPolicyThree+" for the year "+yearWithMaximumSellValueForPolicyThree);
        System.out.println("total sell value for policy four is "+totalSellValueForPolicyFour+" with the maximum sell value "+maximumSellValueForPolicyFour+" for the year "+yearWithMaximumSellValueForPolicyFour);
        System.out.println("total sell value for policy five is "+totalSellValueForPolicyFive+" with the maximum sell value "+maximumSellValueForPolicyFive+" for the year "+yearWithMaximumSellValueForPolicyFive);

    }

    private static Map<String,Map<Integer,Map<String,Long>>> prepareTheData(){
        Map<String,Map<Integer,Map<String,Long>>> policy = Maps.newLinkedHashMap();
        Map<Integer,Map<String,Long>>  policyPerYear = Maps.newLinkedHashMap();
        Map<String,Long> sellValuePerPolicyForYear2008 = Maps.newLinkedHashMap() ;

       /* for the year 2008 policy names and the sell values*/
        addSellValuesToThePolicy(sellValuePerPolicyForYear2008, "policy 1", 100l);
        addPolicySellValueToTheYear(policyPerYear, 2008, sellValuePerPolicyForYear2008);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2008, "policy 2", 43l);
        addPolicySellValueToTheYear(policyPerYear, 2008, sellValuePerPolicyForYear2008);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2008, "policy 3", 55l);
        addPolicySellValueToTheYear(policyPerYear, 2008, sellValuePerPolicyForYear2008);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2008, "policy 4", 43l);
        addPolicySellValueToTheYear(policyPerYear, 2008, sellValuePerPolicyForYear2008);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2008, "policy 5", 122l);
        addPolicySellValueToTheYear(policyPerYear, 2008, sellValuePerPolicyForYear2008);

        /* for the year 2009 policy names and the sell values*/
        Map<String,Long> sellValuePerPolicyForYear2009 = Maps.newLinkedHashMap() ;
        addSellValuesToThePolicy(sellValuePerPolicyForYear2009, "policy 1", 150l);
        addPolicySellValueToTheYear(policyPerYear, 2009, sellValuePerPolicyForYear2009);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2009, "policy 2", 12l);
        addPolicySellValueToTheYear(policyPerYear, 2009, sellValuePerPolicyForYear2009);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2009, "policy 3", 21l);
        addPolicySellValueToTheYear(policyPerYear, 2009, sellValuePerPolicyForYear2009);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2009, "policy 4", 234l);
        addPolicySellValueToTheYear(policyPerYear, 2009, sellValuePerPolicyForYear2009);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2009, "policy 5", 45l);
        addPolicySellValueToTheYear(policyPerYear, 2009, sellValuePerPolicyForYear2009);

        /* for the year 2010 policy names and the sell values*/
        Map<String,Long> sellValuePerPolicyForYear2010 = Maps.newLinkedHashMap() ;
        addSellValuesToThePolicy(sellValuePerPolicyForYear2010, "policy 1", 70l);
        addPolicySellValueToTheYear(policyPerYear, 2010, sellValuePerPolicyForYear2010);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2010, "policy 2", 66l);
        addPolicySellValueToTheYear(policyPerYear, 2010, sellValuePerPolicyForYear2010);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2010, "policy 3", 100l);
        addPolicySellValueToTheYear(policyPerYear, 2010, sellValuePerPolicyForYear2010);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2010, "policy 4", 100l);
        addPolicySellValueToTheYear(policyPerYear, 2010, sellValuePerPolicyForYear2010);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2010, "policy 5", 197l);
        addPolicySellValueToTheYear(policyPerYear, 2010, sellValuePerPolicyForYear2010);

        /* for the year 2011 policy names and the sell values*/
        Map<String,Long> sellValuePerPolicyForYear2011 = Maps.newLinkedHashMap() ;
        addSellValuesToThePolicy(sellValuePerPolicyForYear2011, "policy 1", 200l);
        addPolicySellValueToTheYear(policyPerYear, 2011, sellValuePerPolicyForYear2011);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2011, "policy 2", 100l);
        addPolicySellValueToTheYear(policyPerYear, 2011, sellValuePerPolicyForYear2011);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2011, "policy 3", 89l);
        addPolicySellValueToTheYear(policyPerYear, 2011, sellValuePerPolicyForYear2011);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2011, "policy 4", 67l);
        addPolicySellValueToTheYear(policyPerYear, 2011, sellValuePerPolicyForYear2011);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2011, "policy 5", 34l);
        addPolicySellValueToTheYear(policyPerYear, 2011, sellValuePerPolicyForYear2011);


        /* for the year 2012 policy names and the sell values*/
        Map<String,Long> sellValuePerPolicyForYear2012 = Maps.newLinkedHashMap() ;
        addSellValuesToThePolicy(sellValuePerPolicyForYear2012, "policy 1", 65l);
        addPolicySellValueToTheYear(policyPerYear, 2012, sellValuePerPolicyForYear2012);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2012, "policy 2", 20l);
        addPolicySellValueToTheYear(policyPerYear, 2012, sellValuePerPolicyForYear2012);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2012, "policy 3", 121l);
        addPolicySellValueToTheYear(policyPerYear, 2012, sellValuePerPolicyForYear2012);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2012, "policy 4", 98l);
        addPolicySellValueToTheYear(policyPerYear, 2012, sellValuePerPolicyForYear2012);

        addSellValuesToThePolicy(sellValuePerPolicyForYear2012, "policy 5", 12l);
        addPolicySellValueToTheYear(policyPerYear, 2012, sellValuePerPolicyForYear2012);

        policy.put("policyName",policyPerYear);

        return policy;
    }

    public static void addSellValuesToThePolicy(Map<String, Long> sellValuePerPolicy, String policyName, Long sellValue){
        sellValuePerPolicy.put(policyName,sellValue);
    }

    public static  void addPolicySellValueToTheYear(Map<Integer, Map<String, Long>> policyPerYear, Integer policyYear, Map<String, Long> addSellValuesToThePolicyPerYear){
        policyPerYear.put(policyYear,addSellValuesToThePolicyPerYear);
    }

}
