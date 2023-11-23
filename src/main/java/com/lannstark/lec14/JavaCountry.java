package com.lannstark.lec14;

public enum JavaCountry {

  KOREA("KO"),
  AMERICA("US"),
  ;

  private final String code;

  JavaCountry(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  private static void handleCountry(JavaCountry country) {
    if (country == JavaCountry.KOREA) {
      // 로직처리
    }
    if (country == JavaCountry.AMERICA) {
      // 로직처리
    }
  }

}
