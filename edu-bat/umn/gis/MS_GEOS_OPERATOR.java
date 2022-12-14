package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public final class MS_GEOS_OPERATOR {
  public final static MS_GEOS_OPERATOR MS_GEOS_EQUALS = new MS_GEOS_OPERATOR("MS_GEOS_EQUALS");
  public final static MS_GEOS_OPERATOR MS_GEOS_DISJOINT = new MS_GEOS_OPERATOR("MS_GEOS_DISJOINT");
  public final static MS_GEOS_OPERATOR MS_GEOS_TOUCHES = new MS_GEOS_OPERATOR("MS_GEOS_TOUCHES");
  public final static MS_GEOS_OPERATOR MS_GEOS_OVERLAPS = new MS_GEOS_OPERATOR("MS_GEOS_OVERLAPS");
  public final static MS_GEOS_OPERATOR MS_GEOS_CROSSES = new MS_GEOS_OPERATOR("MS_GEOS_CROSSES");
  public final static MS_GEOS_OPERATOR MS_GEOS_INTERSECTS = new MS_GEOS_OPERATOR("MS_GEOS_INTERSECTS");
  public final static MS_GEOS_OPERATOR MS_GEOS_WITHIN = new MS_GEOS_OPERATOR("MS_GEOS_WITHIN");
  public final static MS_GEOS_OPERATOR MS_GEOS_CONTAINS = new MS_GEOS_OPERATOR("MS_GEOS_CONTAINS");
  public final static MS_GEOS_OPERATOR MS_GEOS_BEYOND = new MS_GEOS_OPERATOR("MS_GEOS_BEYOND");
  public final static MS_GEOS_OPERATOR MS_GEOS_DWITHIN = new MS_GEOS_OPERATOR("MS_GEOS_DWITHIN");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_GEOS_OPERATOR swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_GEOS_OPERATOR.class + " with value " + swigValue);
  }

  private MS_GEOS_OPERATOR(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_GEOS_OPERATOR(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue + 1;
  }

  private MS_GEOS_OPERATOR(String swigName, MS_GEOS_OPERATOR swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue + 1;
  }

  private static MS_GEOS_OPERATOR[] swigValues = { MS_GEOS_EQUALS, MS_GEOS_DISJOINT, MS_GEOS_TOUCHES, MS_GEOS_OVERLAPS,
      MS_GEOS_CROSSES, MS_GEOS_INTERSECTS, MS_GEOS_WITHIN, MS_GEOS_CONTAINS, MS_GEOS_BEYOND, MS_GEOS_DWITHIN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
