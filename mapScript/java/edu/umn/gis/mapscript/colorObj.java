/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class colorObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected colorObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(colorObj obj) {
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
        mapscriptJNI.delete_colorObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRed(int value) {
    mapscriptJNI.colorObj_red_set(swigCPtr, this, value);
  }

  public int getRed() {
    return mapscriptJNI.colorObj_red_get(swigCPtr, this);
  }

  public void setGreen(int value) {
    mapscriptJNI.colorObj_green_set(swigCPtr, this, value);
  }

  public int getGreen() {
    return mapscriptJNI.colorObj_green_get(swigCPtr, this);
  }

  public void setBlue(int value) {
    mapscriptJNI.colorObj_blue_set(swigCPtr, this, value);
  }

  public int getBlue() {
    return mapscriptJNI.colorObj_blue_get(swigCPtr, this);
  }

  public void setAlpha(int value) {
    mapscriptJNI.colorObj_alpha_set(swigCPtr, this, value);
  }

  public int getAlpha() {
    return mapscriptJNI.colorObj_alpha_get(swigCPtr, this);
  }

  public colorObj(int red, int green, int blue, int alpha) {
    this(mapscriptJNI.new_colorObj(red, green, blue, alpha), true);
  }

  public int setRGB(int red, int green, int blue, int alpha) {
    return mapscriptJNI.colorObj_setRGB(swigCPtr, this, red, green, blue, alpha);
  }

  public int setHex(String psHexColor) {
    return mapscriptJNI.colorObj_setHex(swigCPtr, this, psHexColor);
  }

  public String toHex() {
    return mapscriptJNI.colorObj_toHex(swigCPtr, this);
  }

}
