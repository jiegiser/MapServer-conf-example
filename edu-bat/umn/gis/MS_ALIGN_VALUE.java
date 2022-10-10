package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public final class MS_ALIGN_VALUE {
  public final static MS_ALIGN_VALUE MS_ALIGN_LEFT = new MS_ALIGN_VALUE("MS_ALIGN_LEFT");
  public final static MS_ALIGN_VALUE MS_ALIGN_CENTER = new MS_ALIGN_VALUE("MS_ALIGN_CENTER");
  public final static MS_ALIGN_VALUE MS_ALIGN_RIGHT = new MS_ALIGN_VALUE("MS_ALIGN_RIGHT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_ALIGN_VALUE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_ALIGN_VALUE.class + " with value " + swigValue);
  }

  private MS_ALIGN_VALUE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_ALIGN_VALUE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue + 1;
  }

  private MS_ALIGN_VALUE(String swigName, MS_ALIGN_VALUE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue + 1;
  }

  private static MS_ALIGN_VALUE[] swigValues = { MS_ALIGN_LEFT, MS_ALIGN_CENTER, MS_ALIGN_RIGHT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
