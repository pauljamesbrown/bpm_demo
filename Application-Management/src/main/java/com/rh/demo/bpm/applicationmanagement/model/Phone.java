package com.rh.demo.bpm.applicationmanagement.model;

/**
 * This class was automatically generated by the data modeler tool.
 */


public class Phone implements java.io.Serializable
{

   static final long serialVersionUID = 1L;


   private java.lang.Long id;

   private java.lang.String phoneType;

   private java.lang.String phoneCountryCode;

   private java.lang.String areaCode;

   private java.lang.String phoneNumber;

   private java.lang.String extension;

   private java.lang.Boolean okToSMS;

   private java.lang.Boolean okToCall;

   public Phone()
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

   public java.lang.String getPhoneType()
   {
      return this.phoneType;
   }

   public void setPhoneType(java.lang.String phoneType)
   {
      this.phoneType = phoneType;
   }

   public java.lang.String getPhoneCountryCode()
   {
      return this.phoneCountryCode;
   }

   public void setPhoneCountryCode(java.lang.String phoneCountryCode)
   {
      this.phoneCountryCode = phoneCountryCode;
   }

   public java.lang.String getAreaCode()
   {
      return this.areaCode;
   }

   public void setAreaCode(java.lang.String areaCode)
   {
      this.areaCode = areaCode;
   }

   public java.lang.String getPhoneNumber()
   {
      return this.phoneNumber;
   }

   public void setPhoneNumber(java.lang.String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }

   public java.lang.String getExtension()
   {
      return this.extension;
   }

   public void setExtension(java.lang.String extension)
   {
      this.extension = extension;
   }

   public java.lang.Boolean getOkToSMS()
   {
      return this.okToSMS;
   }

   public void setOkToSMS(java.lang.Boolean okToSMS)
   {
      this.okToSMS = okToSMS;
   }

   public java.lang.Boolean getOkToCall()
   {
      return this.okToCall;
   }

   public void setOkToCall(java.lang.Boolean okToCall)
   {
      this.okToCall = okToCall;
   }

   public Phone(java.lang.Long id, java.lang.String phoneType,
         java.lang.String phoneCountryCode, java.lang.String areaCode,
         java.lang.String phoneNumber, java.lang.String extension,
         java.lang.Boolean okToSMS, java.lang.Boolean okToCall)
   {
      this.id = id;
      this.phoneType = phoneType;
      this.phoneCountryCode = phoneCountryCode;
      this.areaCode = areaCode;
      this.phoneNumber = phoneNumber;
      this.extension = extension;
      this.okToSMS = okToSMS;
      this.okToCall = okToCall;
   }

}
