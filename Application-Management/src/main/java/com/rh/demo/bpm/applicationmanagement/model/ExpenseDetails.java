package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ExpenseDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "EXPENSEDETAILS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "EXPENSEDETAILS_ID_GENERATOR", sequenceName = "EXPENSEDETAILS_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "ExpenseType")
   private java.lang.String expenseType;

   @org.kie.api.definition.type.Label(value = "ExpenseAmount")
   private java.math.BigDecimal expenseAmount;

   @org.kie.api.definition.type.Label(value = "Frequency")
   private java.lang.String frequency;

   public ExpenseDetails()
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

   public java.lang.String getExpenseType()
   {
      return this.expenseType;
   }

   public void setExpenseType(java.lang.String expenseType)
   {
      this.expenseType = expenseType;
   }

   public java.math.BigDecimal getExpenseAmount()
   {
      return this.expenseAmount;
   }

   public void setExpenseAmount(java.math.BigDecimal expenseAmount)
   {
      this.expenseAmount = expenseAmount;
   }

   public java.lang.String getFrequency()
   {
      return this.frequency;
   }

   public void setFrequency(java.lang.String frequency)
   {
      this.frequency = frequency;
   }

   public ExpenseDetails(java.lang.Long id, java.lang.String expenseType,
         java.math.BigDecimal expenseAmount, java.lang.String frequency)
   {
      this.id = id;
      this.expenseType = expenseType;
      this.expenseAmount = expenseAmount;
      this.frequency = frequency;
   }

}