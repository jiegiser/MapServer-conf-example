/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public final class MS_SHAPE_TYPE {
  public final static MS_SHAPE_TYPE MS_SHAPE_POINT = new MS_SHAPE_TYPE("MS_SHAPE_POINT");
  public final static MS_SHAPE_TYPE MS_SHAPE_LINE = new MS_SHAPE_TYPE("MS_SHAPE_LINE");
  public final static MS_SHAPE_TYPE MS_SHAPE_POLYGON = new MS_SHAPE_TYPE("MS_SHAPE_POLYGON");
  public final static MS_SHAPE_TYPE MS_SHAPE_NULL = new MS_SHAPE_TYPE("MS_SHAPE_NULL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_SHAPE_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_SHAPE_TYPE.class + " with value " + swigValue);
  }

  private MS_SHAPE_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_SHAPE_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MS_SHAPE_TYPE(String swigName, MS_SHAPE_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MS_SHAPE_TYPE[] swigValues = { MS_SHAPE_POINT, MS_SHAPE_LINE, MS_SHAPE_POLYGON, MS_SHAPE_NULL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

