package processor;

import constants.Department;
import constants.ProcessType;

public class ProcessImpl implements Process{

    public String ownerName;

    @Override
    public void doPayment(ProcessType processType, Double payAmount) {
        PackingSlipGenerator packingSlipGenerator = null;
        Membership membership = null;

        switch (processType) {
            case BOOK:
                packingSlipGenerator = new PackingSlipGenerator(processType, payAmount);
                packingSlipGenerator.generatePackingSlip(Department.SHIPPING);
                packingSlipGenerator.generateCommissionPay(processType);
                packingSlipGenerator.generatePackingSlip(Department.ROYALTY);
                break;
            case PHYSICAL_PRODUCT:
                packingSlipGenerator = new PackingSlipGenerator(processType, payAmount);
                packingSlipGenerator.generatePackingSlip(Department.SHIPPING);
                packingSlipGenerator.generateCommissionPay(processType);
                break;
            case ACTIVATE_MEMBERSHIP:
                membership = new Membership(ownerName);
                membership.membershipPlan("ACTIVATED");
                EmailNotification.sendEmailNotification("ACTIVATED", ownerName);
                break;
            case UPDATE_MEMBERSHIP:
                membership = new Membership(ownerName);
                membership.membershipPlan("UPGRADED");
                EmailNotification.sendEmailNotification("UPGRADED", ownerName);
                break;
            case VIDEO:
                packingSlipGenerator = new PackingSlipGenerator(processType, payAmount);
                packingSlipGenerator.generatePackingSlip(Department.SHIPPING);
                packingSlipGenerator.addFreeVideo();
                break;
        }

    }
}
