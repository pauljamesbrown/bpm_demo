package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */


public class EmploymentDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;


   private java.lang.Long id;

   private java.lang.String employerName;

   private java.lang.String jobTitle;

    private java.lang.String employmentStatus;

   private java.lang.Integer employmentDurationInYears;

   public EmploymentDetails()
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

   public java.lang.String getEmployerName()
   {
      return this.employerName;
   }

   public void setEmployerName(java.lang.String employerName)
   {
      this.employerName = employerName;
   }

   public java.lang.String getJobTitle()
   {
      return this.jobTitle;
   }

   public void setJobTitle(java.lang.String jobTitle)
   {
      this.jobTitle = jobTitle;
   }

   public java.lang.String getEmploymentStatus()
   {
      return this.employmentStatus;
   }

   public void setEmploymentStatus(java.lang.String employmentStatus)
   {
      this.employmentStatus = employmentStatus;
   }

   public java.lang.Integer getEmploymentDurationInYears()
   {
      return this.employmentDurationInYears;
   }

   public void setEmploymentDurationInYears(
         java.lang.Integer employmentDurationInYears)
   {
      this.employmentDurationInYears = employmentDurationInYears;
   }

   public EmploymentDetails(java.lang.Long id, java.lang.String employerName,
         java.lang.String jobTitle, java.lang.String employmentStatus,
         java.lang.Integer employmentDurationInYears)
   {
      this.id = id;
      this.employerName = employerName;
      this.jobTitle = jobTitle;
      this.employmentStatus = employmentStatus;
      this.employmentDurationInYears = employmentDurationInYears;
   }

}
