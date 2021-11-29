package processor;

import constants.Department;
import constants.ProcessType;

public class PackingSlipGenerator {

    private ProcessType processType;
    private Double payAmount;

    public PackingSlipGenerator(ProcessType processType, Double payAmount) {
        this.processType = processType;
        this.payAmount = payAmount;
    }

    public ProcessType getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessType processType) {
        this.processType = processType;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }


    public void generatePackingSlip(Department department) {
        String packingSlip = " Packing slip for " + department+ " of :" + this.processType + " with payment " + this.payAmount;
        System.out.println(packingSlip);
    }

    public void generateCommissionPay(ProcessType processType) {
        String commissionPay = "Commission pay has been generated for product type : " + processType;
        System.out.println(commissionPay);
    }

    public void addFreeVideo() {
        System.out.println("Free first AID has been added ");
    }

}
