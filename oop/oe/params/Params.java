package javase.oop.oe.params;

public class Params {

    private int paramId;
    private String paramName;
    private double paramValue;

    public Params(int paramId, String paramName, double paramValue) {
        this.paramId = paramId;
        this.paramName = paramName;
        this.paramValue = paramValue;
    }


    public void setParamId(int paramId) {
        this.paramId = paramId;
    }

    public int getParamId() {
        return paramId;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamValue(double paramValue) {
        this.paramValue = paramValue;
    }

    public double getParamValue() {
        return paramValue;
    }
}
