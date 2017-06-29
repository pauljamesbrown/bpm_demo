package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class CompanyDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "COMPANYDETAILS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "COMPANYDETAILS_ID_GENERATOR", sequenceName = "COMPANYDETAILS_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "CompanyName")
   private java.lang.String companyName;

   @org.kie.api.definition.type.Label(value = "TradingYears")
   private java.lang.Integer tradingYears;

   @org.kie.api.definition.type.Label(value = "DunsNumber")
   private java.lang.Integer dunsNumber;

   public CompanyDetails()
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

   public java.lang.String getCompanyName()
   {
      return this.companyName;
   }

   public void setCompanyName(java.lang.String companyName)
   {
      this.companyName = companyName;
   }

   public java.lang.Integer getTradingYears()
   {
      return this.tradingYears;
   }

   public void setTradingYears(java.lang.Integer tradingYears)
   {
      this.tradingYears = tradingYears;
   }

   public java.lang.Integer getDunsNumber()
   {
      return this.dunsNumber;
   }

   public void setDunsNumber(java.lang.Integer dunsNumber)
   {
      this.dunsNumber = dunsNumber;
   }

   public CompanyDetails(java.lang.Long id, java.lang.String companyName,
         java.lang.Integer tradingYears, java.lang.Integer dunsNumber)
   {
      this.id = id;
      this.companyName = companyName;
      this.tradingYears = tradingYears;
      this.dunsNumber = dunsNumber;
   }

}