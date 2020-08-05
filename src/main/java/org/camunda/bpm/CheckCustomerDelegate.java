package org.camunda.bpm;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.Random;

public class CheckCustomerDelegate implements JavaDelegate {
    
    public void execute(DelegateExecution execution) throws Exception {

        Random r = new Random();
        execution.setVariable("exists", r.nextBoolean());

    }
}