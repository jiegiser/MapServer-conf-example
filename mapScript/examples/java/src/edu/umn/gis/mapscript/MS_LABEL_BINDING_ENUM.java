/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public final class MS_LABEL_BINDING_ENUM {
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_SIZE = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_SIZE");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_ANGLE = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_ANGLE");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_COLOR = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_COLOR");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_OUTLINECOLOR = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_OUTLINECOLOR");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_FONT = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_FONT");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_PRIORITY = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_PRIORITY");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_POSITION = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_POSITION");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_SHADOWSIZEX = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_SHADOWSIZEX");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_SHADOWSIZEY = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_SHADOWSIZEY");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_OFFSET_X = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_OFFSET_X");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_OFFSET_Y = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_OFFSET_Y");
  public final static MS_LABEL_BINDING_ENUM MS_LABEL_BINDING_ALIGN = new MS_LABEL_BINDING_ENUM("MS_LABEL_BINDING_ALIGN");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_LABEL_BINDING_ENUM swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_LABEL_BINDING_ENUM.class + " with value " + swigValue);
  }

  private MS_LABEL_BINDING_ENUM(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_LABEL_BINDING_ENUM(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MS_LABEL_BINDING_ENUM(String swigName, MS_LABEL_BINDING_ENUM swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MS_LABEL_BINDING_ENUM[] swigValues = { MS_LABEL_BINDING_SIZE, MS_LABEL_BINDING_ANGLE, MS_LABEL_BINDING_COLOR, MS_LABEL_BINDING_OUTLINECOLOR, MS_LABEL_BINDING_FONT, MS_LABEL_BINDING_PRIORITY, MS_LABEL_BINDING_POSITION, MS_LABEL_BINDING_SHADOWSIZEX, MS_LABEL_BINDING_SHADOWSIZEY, MS_LABEL_BINDING_OFFSET_X, MS_LABEL_BINDING_OFFSET_Y, MS_LABEL_BINDING_ALIGN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

