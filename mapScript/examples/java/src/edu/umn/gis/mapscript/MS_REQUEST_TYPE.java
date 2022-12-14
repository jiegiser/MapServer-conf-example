/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public final class MS_REQUEST_TYPE {
  public final static MS_REQUEST_TYPE MS_GET_REQUEST = new MS_REQUEST_TYPE("MS_GET_REQUEST");
  public final static MS_REQUEST_TYPE MS_POST_REQUEST = new MS_REQUEST_TYPE("MS_POST_REQUEST");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_REQUEST_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_REQUEST_TYPE.class + " with value " + swigValue);
  }

  private MS_REQUEST_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_REQUEST_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MS_REQUEST_TYPE(String swigName, MS_REQUEST_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MS_REQUEST_TYPE[] swigValues = { MS_GET_REQUEST, MS_POST_REQUEST };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

