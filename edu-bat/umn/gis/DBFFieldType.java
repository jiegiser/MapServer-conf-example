package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public final class DBFFieldType {
  public final static DBFFieldType FTString = new DBFFieldType("FTString");
  public final static DBFFieldType FTInteger = new DBFFieldType("FTInteger");
  public final static DBFFieldType FTDouble = new DBFFieldType("FTDouble");
  public final static DBFFieldType FTInvalid = new DBFFieldType("FTInvalid");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static DBFFieldType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + DBFFieldType.class + " with value " + swigValue);
  }

  private DBFFieldType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private DBFFieldType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue + 1;
  }

  private DBFFieldType(String swigName, DBFFieldType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue + 1;
  }

  private static DBFFieldType[] swigValues = { FTString, FTInteger, FTDouble, FTInvalid };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
