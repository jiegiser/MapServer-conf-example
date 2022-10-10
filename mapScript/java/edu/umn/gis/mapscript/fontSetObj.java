/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class fontSetObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected fontSetObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(fontSetObj obj) {
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
        mapscriptJNI.delete_fontSetObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getFilename() {
    return mapscriptJNI.fontSetObj_filename_get(swigCPtr, this);
  }

  public int getNumfonts() {
    return mapscriptJNI.fontSetObj_numfonts_get(swigCPtr, this);
  }

  public hashTableObj getFonts() {
    long cPtr = mapscriptJNI.fontSetObj_fonts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new hashTableObj(cPtr, false);
  }

  public fontSetObj() {
    this(mapscriptJNI.new_fontSetObj(), true);
  }

}