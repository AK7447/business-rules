package processor;


import constants.ProcessType;

public interface Process {

    public void doPayment(ProcessType processType, Double payAmount);
}
