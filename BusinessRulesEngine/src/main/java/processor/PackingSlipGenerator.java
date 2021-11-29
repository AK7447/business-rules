package processor;

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

}
