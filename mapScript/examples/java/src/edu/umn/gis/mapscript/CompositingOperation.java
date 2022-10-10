/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public final class CompositingOperation {
  public final static CompositingOperation MS_COMPOP_CLEAR = new CompositingOperation("MS_COMPOP_CLEAR");
  public final static CompositingOperation MS_COMPOP_SRC = new CompositingOperation("MS_COMPOP_SRC");
  public final static CompositingOperation MS_COMPOP_DST = new CompositingOperation("MS_COMPOP_DST");
  public final static CompositingOperation MS_COMPOP_SRC_OVER = new CompositingOperation("MS_COMPOP_SRC_OVER");
  public final static CompositingOperation MS_COMPOP_DST_OVER = new CompositingOperation("MS_COMPOP_DST_OVER");
  public final static CompositingOperation MS_COMPOP_SRC_IN = new CompositingOperation("MS_COMPOP_SRC_IN");
  public final static CompositingOperation MS_COMPOP_DST_IN = new CompositingOperation("MS_COMPOP_DST_IN");
  public final static CompositingOperation MS_COMPOP_SRC_OUT = new CompositingOperation("MS_COMPOP_SRC_OUT");
  public final static CompositingOperation MS_COMPOP_DST_OUT = new CompositingOperation("MS_COMPOP_DST_OUT");
  public final static CompositingOperation MS_COMPOP_SRC_ATOP = new CompositingOperation("MS_COMPOP_SRC_ATOP");
  public final static CompositingOperation MS_COMPOP_DST_ATOP = new CompositingOperation("MS_COMPOP_DST_ATOP");
  public final static CompositingOperation MS_COMPOP_XOR = new CompositingOperation("MS_COMPOP_XOR");
  public final static CompositingOperation MS_COMPOP_PLUS = new CompositingOperation("MS_COMPOP_PLUS");
  public final static CompositingOperation MS_COMPOP_MINUS = new CompositingOperation("MS_COMPOP_MINUS");
  public final static CompositingOperation MS_COMPOP_MULTIPLY = new CompositingOperation("MS_COMPOP_MULTIPLY");
  public final static CompositingOperation MS_COMPOP_SCREEN = new CompositingOperation("MS_COMPOP_SCREEN");
  public final static CompositingOperation MS_COMPOP_OVERLAY = new CompositingOperation("MS_COMPOP_OVERLAY");
  public final static CompositingOperation MS_COMPOP_DARKEN = new CompositingOperation("MS_COMPOP_DARKEN");
  public final static CompositingOperation MS_COMPOP_LIGHTEN = new CompositingOperation("MS_COMPOP_LIGHTEN");
  public final static CompositingOperation MS_COMPOP_COLOR_DODGE = new CompositingOperation("MS_COMPOP_COLOR_DODGE");
  public final static CompositingOperation MS_COMPOP_COLOR_BURN = new CompositingOperation("MS_COMPOP_COLOR_BURN");
  public final static CompositingOperation MS_COMPOP_HARD_LIGHT = new CompositingOperation("MS_COMPOP_HARD_LIGHT");
  public final static CompositingOperation MS_COMPOP_SOFT_LIGHT = new CompositingOperation("MS_COMPOP_SOFT_LIGHT");
  public final static CompositingOperation MS_COMPOP_DIFFERENCE = new CompositingOperation("MS_COMPOP_DIFFERENCE");
  public final static CompositingOperation MS_COMPOP_EXCLUSION = new CompositingOperation("MS_COMPOP_EXCLUSION");
  public final static CompositingOperation MS_COMPOP_CONTRAST = new CompositingOperation("MS_COMPOP_CONTRAST");
  public final static CompositingOperation MS_COMPOP_INVERT = new CompositingOperation("MS_COMPOP_INVERT");
  public final static CompositingOperation MS_COMPOP_INVERT_RGB = new CompositingOperation("MS_COMPOP_INVERT_RGB");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CompositingOperation swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CompositingOperation.class + " with value " + swigValue);
  }

  private CompositingOperation(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CompositingOperation(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CompositingOperation(String swigName, CompositingOperation swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CompositingOperation[] swigValues = { MS_COMPOP_CLEAR, MS_COMPOP_SRC, MS_COMPOP_DST, MS_COMPOP_SRC_OVER, MS_COMPOP_DST_OVER, MS_COMPOP_SRC_IN, MS_COMPOP_DST_IN, MS_COMPOP_SRC_OUT, MS_COMPOP_DST_OUT, MS_COMPOP_SRC_ATOP, MS_COMPOP_DST_ATOP, MS_COMPOP_XOR, MS_COMPOP_PLUS, MS_COMPOP_MINUS, MS_COMPOP_MULTIPLY, MS_COMPOP_SCREEN, MS_COMPOP_OVERLAY, MS_COMPOP_DARKEN, MS_COMPOP_LIGHTEN, MS_COMPOP_COLOR_DODGE, MS_COMPOP_COLOR_BURN, MS_COMPOP_HARD_LIGHT, MS_COMPOP_SOFT_LIGHT, MS_COMPOP_DIFFERENCE, MS_COMPOP_EXCLUSION, MS_COMPOP_CONTRAST, MS_COMPOP_INVERT, MS_COMPOP_INVERT_RGB };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

