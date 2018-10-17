package io.berndruecker.demo;

import io.zeebe.client.ZeebeClient;

public class DeployWorkflowModel {

  public static void main(String[] args) {
    ZeebeClient zeebe = ZeebeClient.newClient();
    
    zeebe.workflowClient().newDeployCommand()
      .addResourceFromClasspath("play.bpmn")
      .send().join();
    
    System.out.println("deployed");
    
    zeebe.close();
  }

}
