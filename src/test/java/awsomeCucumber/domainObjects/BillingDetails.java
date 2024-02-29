package awsomeCucumber.domainObjects;

public class BillingDetails {

    private String billingfirstName;
    private String billinglastName;
    private String billingaddressLine1;
    private String billingcity;
    private String billingstate;
    private String billingzip;
    private String billingemail;

    public BillingDetails(String billingfirstName, String billinglastName,
                          String billingaddressLine1, String billingcity,
                          String billingstate, String billingzip,
                          String billingemail) {
        this.billingfirstName = billingfirstName;
        this.billinglastName = billinglastName;
        this.billingaddressLine1 = billingaddressLine1;
        this.billingcity = billingcity;
        this.billingstate = billingstate;
        this.billingzip = billingzip;
        this.billingemail = billingemail;
    }

    public String getBillingfirstName() {
        return billingfirstName;
    }

    public void setBillingfirstName(String billingfirstName) {
        this.billingfirstName = billingfirstName;
    }

    public String getBillinglastName() {
        return billinglastName;
    }

    public void setBillinglastName(String billinglastName) {
        this.billinglastName = billinglastName;
    }

    public String getBillingaddressLine1() {
        return billingaddressLine1;
    }

    public void setBillingaddressLine1(String billingaddressLine1) {
        this.billingaddressLine1 = billingaddressLine1;
    }

    public String getBillingcity() {
        return billingcity;
    }

    public void setBillingcity(String billingcity) {
        this.billingcity = billingcity;
    }

    public String getBillingstate() {
        return billingstate;
    }

    public void setBillingstate(String billingstate) {
        this.billingstate = billingstate;
    }

    public String getBillingzip() {
        return billingzip;
    }

    public void setBillingzip(String billingzip) {
        this.billingzip = billingzip;
    }

    public String getBillingemail() {
        return billingemail;
    }

    public void setBillingemail(String billingemail) {
        this.billingemail = billingemail;
    }

}
