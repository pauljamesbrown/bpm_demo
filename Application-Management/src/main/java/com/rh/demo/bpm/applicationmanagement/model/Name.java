package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */


public class Name implements java.io.Serializable
{

   static final long serialVersionUID = 1L;


   private java.lang.Long id;

   private java.lang.String salutation;

   private String givenName;

   private java.lang.String middleName;

   private java.lang.String surname;

   private java.lang.String fullName;

   public Name()
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

   public java.lang.String getSalutation()
   {
      return this.salutation;
   }

   public void setSalutation(java.lang.String salutation)
   {
      this.salutation = salutation;
   }

   public java.lang.String getMiddleName()
   {
      return this.middleName;
   }

   public void setMiddleName(java.lang.String middleName)
   {
      this.middleName = middleName;
   }

   public java.lang.String getSurname()
   {
      return this.surname;
   }

   public void setSurname(java.lang.String surname)
   {
      this.surname = surname;
   }

   public java.lang.String getFullName()
   {
      return this.fullName;
   }

   public void setFullName(java.lang.String fullName)
   {
      this.fullName = fullName;
   }

   public java.lang.String getGivenName()
   {
      return this.givenName;
   }

   public void setGivenName(java.lang.String givenName)
   {
      this.givenName = givenName;
   }

   public Name(java.lang.Long id, java.lang.String salutation,
         java.lang.String givenName, java.lang.String middleName,
         java.lang.String surname, java.lang.String fullName)
   {
      this.id = id;
      this.salutation = salutation;
      this.givenName = givenName;
      this.middleName = middleName;
      this.surname = surname;
      this.fullName = fullName;
   }

}
