package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

<<<<<<< HEAD

=======
>>>>>>> d30c2ec4f5e95f9624604f3f7704bbeaf9debb54
public class Status implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

<<<<<<< HEAD
=======
   @javax.persistence.GeneratedValue(generator = "STATUS_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "STATUS_ID_GENERATOR", sequenceName = "STATUS_ID_SEQ")
>>>>>>> d30c2ec4f5e95f9624604f3f7704bbeaf9debb54
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("status")
   private java.lang.String status;

   @org.kie.api.definition.type.Label("statusDate")
   private java.util.Date statusDate;

   public Status()
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

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.util.Date getStatusDate()
   {
      return this.statusDate;
   }

   public void setStatusDate(java.util.Date statusDate)
   {
      this.statusDate = statusDate;
   }

   public Status(java.lang.Long id, java.lang.String status,
         java.util.Date statusDate)
   {
      this.id = id;
      this.status = status;
      this.statusDate = statusDate;
   }

}