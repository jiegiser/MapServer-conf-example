package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public final class MS_IMAGEMODE {
  public final static MS_IMAGEMODE MS_IMAGEMODE_PC256 = new MS_IMAGEMODE("MS_IMAGEMODE_PC256");
  public final static MS_IMAGEMODE MS_IMAGEMODE_RGB = new MS_IMAGEMODE("MS_IMAGEMODE_RGB");
  public final static MS_IMAGEMODE MS_IMAGEMODE_RGBA = new MS_IMAGEMODE("MS_IMAGEMODE_RGBA");
  public final static MS_IMAGEMODE MS_IMAGEMODE_INT16 = new MS_IMAGEMODE("MS_IMAGEMODE_INT16");
  public final static MS_IMAGEMODE MS_IMAGEMODE_FLOAT32 = new MS_IMAGEMODE("MS_IMAGEMODE_FLOAT32");
  public final static MS_IMAGEMODE MS_IMAGEMODE_BYTE = new MS_IMAGEMODE("MS_IMAGEMODE_BYTE");
  public final static MS_IMAGEMODE MS_IMAGEMODE_FEATURE = new MS_IMAGEMODE("MS_IMAGEMODE_FEATURE");
  public final static MS_IMAGEMODE MS_IMAGEMODE_NULL = new MS_IMAGEMODE("MS_IMAGEMODE_NULL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_IMAGEMODE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_IMAGEMODE.class + " with value " + swigValue);
  }

  private MS_IMAGEMODE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_IMAGEMODE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue + 1;
  }

  private MS_IMAGEMODE(String swigName, MS_IMAGEMODE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue + 1;
  }

  private static MS_IMAGEMODE[] swigValues = { MS_IMAGEMODE_PC256, MS_IMAGEMODE_RGB, MS_IMAGEMODE_RGBA,
      MS_IMAGEMODE_INT16, MS_IMAGEMODE_FLOAT32, MS_IMAGEMODE_BYTE, MS_IMAGEMODE_FEATURE, MS_IMAGEMODE_NULL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
