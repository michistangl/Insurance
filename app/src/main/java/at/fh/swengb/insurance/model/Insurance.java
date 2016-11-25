package at.fh.swengb.insurance.model;

import java.io.Serializable;

/**
 * Created by Michaela on 24.11.2016.
 */

public class Insurance implements Serializable {

    private String policyholder;
    private int amount;
    private String periodFrom;
    private String periodTo;

    public Insurance() {
    }

    public Insurance(String policyholder, int amount, String periodFrom, String periodTo) {
        this.policyholder = policyholder;
        this.amount = amount;
        this.periodFrom = periodFrom;
        this.periodTo = periodTo;
    }

    public String getPolicyholder() {
        return policyholder;
    }

    public void setPolicyholder(String policyholder) {
        this.policyholder = policyholder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(String periodFrom) {
        this.periodFrom = periodFrom;
    }

    public String getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(String periodTo) {
        this.periodTo = periodTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Insurance insurance = (Insurance) o;

        if (amount != insurance.amount) return false;
        if (policyholder != null ? !policyholder.equals(insurance.policyholder) : insurance.policyholder != null)
            return false;
        if (periodFrom != null ? !periodFrom.equals(insurance.periodFrom) : insurance.periodFrom != null)
            return false;
        return periodTo != null ? periodTo.equals(insurance.periodTo) : insurance.periodTo == null;

    }

    @Override
    public int hashCode() {
        int result = policyholder != null ? policyholder.hashCode() : 0;
        result = 31 * result + amount;
        result = 31 * result + (periodFrom != null ? periodFrom.hashCode() : 0);
        result = 31 * result + (periodTo != null ? periodTo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "policyholder='" + policyholder + '\'' +
                ", amount=" + amount +
                ", periodFrom='" + periodFrom + '\'' +
                ", periodTo='" + periodTo + '\'' +
                '}';
    }
}
