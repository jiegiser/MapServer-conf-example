/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class labelCacheMemberObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected labelCacheMemberObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(labelCacheMemberObj obj) {
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
        mapscriptJNI.delete_labelCacheMemberObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getNumtextsymbols() {
    return mapscriptJNI.labelCacheMemberObj_numtextsymbols_get(swigCPtr, this);
  }

  public int getLayerindex() {
    return mapscriptJNI.labelCacheMemberObj_layerindex_get(swigCPtr, this);
  }

  public int getClassindex() {
    return mapscriptJNI.labelCacheMemberObj_classindex_get(swigCPtr, this);
  }

  public int getStatus() {
    return mapscriptJNI.labelCacheMemberObj_status_get(swigCPtr, this);
  }

  public int getMarkerid() {
    return mapscriptJNI.labelCacheMemberObj_markerid_get(swigCPtr, this);
  }

  public pointObj getPoint() {
    long cPtr = mapscriptJNI.labelCacheMemberObj_point_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pointObj(cPtr, false);
  }

  public rectObj getBbox() {
    long cPtr = mapscriptJNI.labelCacheMemberObj_bbox_get(swigCPtr, this);
    return (cPtr == 0) ? null : new rectObj(cPtr, false);
  }

  public lineObj getLeaderline() {
    long cPtr = mapscriptJNI.labelCacheMemberObj_leaderline_get(swigCPtr, this);
    return (cPtr == 0) ? null : new lineObj(cPtr, false);
  }

  public rectObj getLeaderbbox() {
    long cPtr = mapscriptJNI.labelCacheMemberObj_leaderbbox_get(swigCPtr, this);
    return (cPtr == 0) ? null : new rectObj(cPtr, false);
  }

  public labelCacheMemberObj() {
    this(mapscriptJNI.new_labelCacheMemberObj(), true);
  }

}
