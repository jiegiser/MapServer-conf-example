/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class reprojectionObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected reprojectionObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(reprojectionObj obj) {
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
        mapscriptJNI.delete_reprojectionObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public reprojectionObj(projectionObj in, projectionObj out) {
    this(mapscriptJNI.new_reprojectionObj(projectionObj.getCPtr(in), in, projectionObj.getCPtr(out), out), true);
  }

}