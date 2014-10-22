package timelogger.control.operation;

import java.awt.Container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.domain.Fattura;
import timelogger.domain.FatturaParziale;
import timelogger.domain.FatturaParzialeFactory;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.admin.invoiceResumePanel;
import timelogger.utilities.Constants;
import timelogger.utilities.DateConverter;
import timelogger.domain.Progetto;

public class OperationCreateNewInvoice implements OperationFlyweight {

    public FatturaParziale getFp() {
        return fp;
    }

    private FatturaParziale fp;
    private DateConverter dc = new DateConverter();


    @Override
    public void doOp(ControlFacade controller, Container invoker) {
        System.out.println("--------------------------------------------------");
        System.out.println("OP::OperationCreateNewInvoice---> creating new Invoice for a Project");

        this.createNewInvoice();
        ConcurrentHashMap<String, Fattura> fMap = this.updateMap();
        Progetto p = (Progetto) ControlFacade.getInstance().getData("newProject");
        this.updateInvoicesFromMap(p, fMap);
        this.reInitializeList(p, fMap, invoker);
    }

    private void createNewInvoice() {
        this.fp = FatturaParzialeFactory.createFatturaParziale();

        ControlFacade.getInstance().getData("DataFatturaInserita");

        Date DataFinaleFattura = (Date) ControlFacade.getInstance().getData("DataFatturaInserita");
        this.fp.setDataFine(DataFinaleFattura);
        this.fp.setTotale(0);
    }

    private ConcurrentHashMap<String, Fattura> updateMap() {
        @SuppressWarnings("unchecked")
        ConcurrentHashMap<String, Fattura> fMap = (ConcurrentHashMap<String, Fattura>) ControlFacade.getInstance().getData("invoicesMap");
        fMap.put(String.valueOf(invoiceResumePanel.getCounter()), this.fp);
        return fMap;
    }

    @SuppressWarnings("unchecked")
    private void updateInvoicesFromMap(Progetto p, ConcurrentHashMap<String, Fattura> fMap) {
        ArrayList<Fattura> ordered = Collections.list(Collections.enumeration(fMap.values()));
        Collections.sort(ordered);
        p.fatture.clear();
        for (int i = 0; i < ordered.size(); i++)
            p.fatture.add(ordered.get(i));
    }

    private void reInitializeList(Progetto p, ConcurrentHashMap<String, Fattura> fMap, Container invoker) {
        UIFacade.getInstance().toGuiAction(Constants.getInstance().clearThisContainerCommand, invoker);

        invoiceResumePanel.setCounter(0);
        fMap.clear();

		/*
		 * 
		 * reinizializza mappa e gui
		 * 
		 * 
		 */

        for (int i = 0; i < p.fatture.size(); i++) {
            FatturaParziale f = (FatturaParziale) p.fatture.get(i);
            FatturaParziale fLast;

            if (i > 0) {
                fLast = (FatturaParziale) p.fatture.get(i - 1);
                f.setDataInizio(fLast.getDataFine());
            }

            fMap.put(String.valueOf(invoiceResumePanel.getCounter()), f);

            UIFacade.getInstance().setAData("DataFattura", f.getDataFine().toString());
            UIFacade.getInstance().toGuiAction(Constants.getInstance().invoiceResumeCommand, invoker);
        }
    }

}
