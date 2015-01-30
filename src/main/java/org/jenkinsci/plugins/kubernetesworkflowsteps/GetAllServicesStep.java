package org.jenkinsci.plugins.kubernetesworkflowsteps;

import com.github.kubernetes.java.client.model.ServiceList;

import org.jenkinsci.plugins.workflow.steps.AbstractStepDescriptorImpl;
import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;

/**
 * TODO: Insert description here. (generated by elibixby)
 */
public class GetAllServicesStep extends KubeStep<Void, ServiceList> {
  @DataBoundConstructor
  public GetAllServicesStep() {
    super(null);
    // TODO(elibixby): Auto-generated constructor stub
  }
  public static class Execution extends KubeStepExecution<Void, ServiceList, GetAllServicesStep>{

    /* (non-Javadoc)
     * @see org.jenkinsci.plugins.workflow.steps.AbstractSynchronousStepExecution#run()
     */
    @Override
    protected ServiceList run() throws Exception {
      return this.getKubeClient().getAllServices();
      
    }
    
  }
  
  @Extension
  public static class DescriptorImpl extends AbstractStepDescriptorImpl{
    public DescriptorImpl() {
      super(Execution.class);
    }

    @Override public String getFunctionName() {
      return "kube_get_all_services";
    }

    @Override public String getDisplayName() {
      return "Get All Kubernetes Services";
    }
  }
  
}
