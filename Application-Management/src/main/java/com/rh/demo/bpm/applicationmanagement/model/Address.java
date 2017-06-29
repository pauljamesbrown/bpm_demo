package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Address implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ADDRESS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "ADDRESS_ID_GENERATOR", sequenceName = "ADDRESS_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("AddressType")
   private java.lang.String addressType;

   @org.kie.api.definition.type.Label("AddressLine1")
   private java.lang.String addressLine1;

   @org.kie.api.definition.type.Label("AddressLine2")
   private java.lang.String addressLine2;

   @org.kie.api.definition.type.Label("AddressLine3")
   private java.lang.String addressLine3;

   @org.kie.api.definition.type.Label("AddressLine4")
   private java.lang.String addressLine4;

   @org.kie.api.definition.type.Label("CountryCode")
   private java.lang.String countryCode;

   public Address()
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

   public java.lang.String getAddressType()
   {
      return this.addressType;
   }

   public void setAddressType(java.lang.String addressType)
   {
      this.addressType = addressType;
   }

   public java.lang.String getAddressLine1()
   {
      return this.addressLine1;
   }

   public void setAddressLine1(java.lang.String addressLine1)
   {
      this.addressLine1 = addressLine1;
   }

   public java.lang.String getAddressLine2()
   {
      return this.addressLine2;
   }

   public void setAddressLine2(java.lang.String addressLine2)
   {
      this.addressLine1 = addressLine2;
   }

   public java.lang.String getAddressLine3()
   {
      return this.addressLine3;
   }

   public void setAddressLine3(java.lang.String addressLine3)
   {
      this.addressLine3 = addressLine3;
   }

   public java.lang.String getAddressLine4()
   {
      return this.addressLine4;
   }

   public void setAddressLine4(java.lang.String addressLine4)
   {
      this.addressLine4 = addressLine4;
   }

   public Address(java.lang.Long id, java.lang.String addressType,
         java.lang.String addressLine1)
   {
      this.id = id;
      this.addressType = addressType;
      this.addressLine1 = addressLine1;
      this.addressLine1 = addressLine2;
      this.addressLine1 = addressLine3;
      this.addressLine1 = addressLine4;
  

   }

   public java.lang.String getCountryCode()
   {
      return this.countryCode;
   }

   public void setCountryCode(java.lang.String countryCode)
   {
      this.countryCode = countryCode;
   }

   public Address(java.lang.Long id, java.lang.String addressType,
         java.lang.String addressLine1, java.lang.String addressLine2,
         java.lang.String addressLine3, java.lang.String addressLine4,
         java.lang.String countryCode)
   {
      this.id = id;
      this.addressType = addressType;
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.addressLine3 = addressLine3;
      this.addressLine4 = addressLine4;
      this.countryCode = countryCode;
   }

}