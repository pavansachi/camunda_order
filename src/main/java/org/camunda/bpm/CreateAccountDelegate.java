// package org.camunda.bpm;

// import org.camunda.bpm.engine.delegate.DelegateExecution;
// import org.camunda.bpm.engine.delegate.JavaDelegate;
// import java.util.Random;

// public class CreateAccountDelegate implements JavaDelegate {
    
//     public void execute(DelegateExecution execution) throws Exception {

//         String customer = execution.getVariable("customer");
//         Random r = new Random();
//         String account_id = String.format("zoom-%s-%s@zoom.aarnet.edu.au", customer);
//         execution.setVariable("account_id", account_id);
//         System.out.prinntln(account_id);
//     }
// }