package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class StatusList implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long id;

   private java.util.List<com.rh.demo.bpm.applicationmanagement.model.Status> status;

   public StatusList()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.util.List<com.rh.demo.bpm.applicationmanagement.model.Status> getStatus()
   {
      return this.status;
   }

   public void setStatus(
         java.util.List<com.rh.demo.bpm.applicationmanagement.model.Status> status)
   {
      this.status = status;
   }

   public StatusList(
         java.lang.Long id,
         java.util.List<com.rh.demo.bpm.applicationmanagement.model.Status> status)
   {
      this.id = id;
      this.status = status;
   }

}
