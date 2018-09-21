package com.imooc.myo2o.enums;

/**
 * @author luoly
 * @date 2018/9/21 10:37
 * @description
 */
public enum TestType {

    FIREWALL("firewall"),
    SECRET("secretMac"),
    BALANCE("f5");

    private String typeName;

    TestType(String typeName) {
        this.typeName = typeName;
    }

    public static TestType getTypeByName(String typeName) {
        for(TestType testType : TestType.values()) {
            if(typeName.equals(testType.getTypeName())) {
                return testType;
            }
        }

        return null;
    }

    public String getTypeName() {
        return typeName;
    }
}
