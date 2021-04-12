package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/address/create")
public class AddressCreatePage extends AddressSelectPage {
  // Locators
  // -------------------------------------------------------------------------------------------------------------------
  public static By CREATE_AN_ADDRESS_TITLE = text("Add New Address");
  public static By COUNTRY_FIELD = css("div[id=address-form]>mat-form-field:nth-of-type(1)>div>div:nth-of-type(1)>div[class^=mat-form-field-infix]>input");
  public static By NAME_FIELD = css("div[id=address-form]>mat-form-field:nth-of-type(2)>div>div:nth-of-type(1)>div[class^=mat-form-field-infix]>input");
  public static By MOBILE_NUMBER_FIELD = css("div[id=address-form]>mat-form-field:nth-of-type(3)>div>div:nth-of-type(1)>div[class^=mat-form-field-infix]>input");
  public static By ZIP_CODE_FIELD = css("div[id=address-form]>mat-form-field:nth-of-type(4)>div>div:nth-of-type(1)>div[class^=mat-form-field-infix]>input");
  public static By ADDRESS_FIELD = css("div[id=address-form]>mat-form-field:nth-of-type(5)>div>div:nth-of-type(1)>div[class^=mat-form-field-infix]>textarea");
  public static By CITY_FIELD = css("div[id=address-form]>mat-form-field:nth-of-type(6)>div>div:nth-of-type(1)>div[class^=mat-form-field-infix]>input");
  public static By STATE_FIELD = css("div[id=address-form]>mat-form-field:nth-of-type(7)>div>div:nth-of-type(1)>div[class^=mat-form-field-infix]>input");
  // Public methods
  // -------------------------------------------------------------------------------------------------------------------
  public void waitForPageToLoad(){
    getElement(CREATE_AN_ADDRESS_TITLE).waitUntilVisible();
    logWeAreOnPage();
  }

  public void click(String elementName){
    super.click(snakify(elementName));
    if(snakify(elementName).equals("SUBMIT_BUTTON")) getElement(SELECT_AN_ADDRESS_TITLE).waitUntilVisible();
  }
}
