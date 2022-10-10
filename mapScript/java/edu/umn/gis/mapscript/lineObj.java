/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class lineObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected lineObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(lineObj obj) {
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
        mapscriptJNI.delete_lineObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getNumpoints() {
    return mapscriptJNI.lineObj_numpoints_get(swigCPtr, this);
  }

  public lineObj() {
    this(mapscriptJNI.new_lineObj(), true);
  }

  public int project(projectionObj projin, projectionObj projout) {
    return mapscriptJNI.lineObj_project__SWIG_0(swigCPtr, this, projectionObj.getCPtr(projin), projin, projectionObj.getCPtr(projout), projout);
  }

  public int project(reprojectionObj reprojector) {
    return mapscriptJNI.lineObj_project__SWIG_1(swigCPtr, this, reprojectionObj.getCPtr(reprojector), reprojector);
  }

  public pointObj get(int i) {
    long cPtr = mapscriptJNI.lineObj_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new pointObj(cPtr, false);
  }

  public int add(pointObj p) {
    return mapscriptJNI.lineObj_add(swigCPtr, this, pointObj.getCPtr(p), p);
  }

  public int set(int i, pointObj p) {
    return mapscriptJNI.lineObj_set(swigCPtr, this, i, pointObj.getCPtr(p), p);
  }

}