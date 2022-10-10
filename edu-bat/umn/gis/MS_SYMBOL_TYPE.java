package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public final class MS_SYMBOL_TYPE {
  public final static MS_SYMBOL_TYPE MS_SYMBOL_SIMPLE = new MS_SYMBOL_TYPE("MS_SYMBOL_SIMPLE",
      mapscriptJNI.MS_SYMBOL_SIMPLE_get());
  public final static MS_SYMBOL_TYPE MS_SYMBOL_VECTOR = new MS_SYMBOL_TYPE("MS_SYMBOL_VECTOR");
  public final static MS_SYMBOL_TYPE MS_SYMBOL_ELLIPSE = new MS_SYMBOL_TYPE("MS_SYMBOL_ELLIPSE");
  public final static MS_SYMBOL_TYPE MS_SYMBOL_PIXMAP = new MS_SYMBOL_TYPE("MS_SYMBOL_PIXMAP");
  public final static MS_SYMBOL_TYPE MS_SYMBOL_TRUETYPE = new MS_SYMBOL_TYPE("MS_SYMBOL_TRUETYPE");
  public final static MS_SYMBOL_TYPE MS_SYMBOL_HATCH = new MS_SYMBOL_TYPE("MS_SYMBOL_HATCH");
  public final static MS_SYMBOL_TYPE MS_SYMBOL_SVG = new MS_SYMBOL_TYPE("MS_SYMBOL_SVG");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_SYMBOL_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_SYMBOL_TYPE.class + " with value " + swigValue);
  }

  private MS_SYMBOL_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_SYMBOL_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue + 1;
  }

  private MS_SYMBOL_TYPE(String swigName, MS_SYMBOL_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue + 1;
  }

  private static MS_SYMBOL_TYPE[] swigValues = { MS_SYMBOL_SIMPLE, MS_SYMBOL_VECTOR, MS_SYMBOL_ELLIPSE,
      MS_SYMBOL_PIXMAP, MS_SYMBOL_TRUETYPE, MS_SYMBOL_HATCH, MS_SYMBOL_SVG };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
