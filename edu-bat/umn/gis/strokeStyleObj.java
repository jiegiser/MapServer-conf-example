package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public class strokeStyleObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected strokeStyleObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(strokeStyleObj obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mapscriptJNI.delete_strokeStyleObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWidth(double value) {
    mapscriptJNI.strokeStyleObj_width_set(swigCPtr, this, value);
  }

  public double getWidth() {
    return mapscriptJNI.strokeStyleObj_width_get(swigCPtr, this);
  }

  public void setPatternlength(int value) {
    mapscriptJNI.strokeStyleObj_patternlength_set(swigCPtr, this, value);
  }

  public int getPatternlength() {
    return mapscriptJNI.strokeStyleObj_patternlength_get(swigCPtr, this);
  }

  public void setPattern(double[] value) {
    mapscriptJNI.strokeStyleObj_pattern_set(swigCPtr, this, value);
  }

  public double[] getPattern() {
    return mapscriptJNI.strokeStyleObj_pattern_get(swigCPtr, this);
  }

  public void setPatternoffset(double value) {
    mapscriptJNI.strokeStyleObj_patternoffset_set(swigCPtr, this, value);
  }

  public double getPatternoffset() {
    return mapscriptJNI.strokeStyleObj_patternoffset_get(swigCPtr, this);
  }

  public void setColor(colorObj value) {
    mapscriptJNI.strokeStyleObj_color_set(swigCPtr, this, colorObj.getCPtr(value), value);
  }

  public colorObj getColor() {
    long cPtr = mapscriptJNI.strokeStyleObj_color_get(swigCPtr, this);
    return (cPtr == 0) ? null : new colorObj(cPtr, false);
  }

  public void setLinecap(int value) {
    mapscriptJNI.strokeStyleObj_linecap_set(swigCPtr, this, value);
  }

  public int getLinecap() {
    return mapscriptJNI.strokeStyleObj_linecap_get(swigCPtr, this);
  }

  public void setLinejoin(int value) {
    mapscriptJNI.strokeStyleObj_linejoin_set(swigCPtr, this, value);
  }

  public int getLinejoin() {
    return mapscriptJNI.strokeStyleObj_linejoin_get(swigCPtr, this);
  }

  public void setLinejoinmaxsize(double value) {
    mapscriptJNI.strokeStyleObj_linejoinmaxsize_set(swigCPtr, this, value);
  }

  public double getLinejoinmaxsize() {
    return mapscriptJNI.strokeStyleObj_linejoinmaxsize_get(swigCPtr, this);
  }

  public strokeStyleObj() {
    this(mapscriptJNI.new_strokeStyleObj(), true);
  }

}
